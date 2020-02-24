package com.xpc.oauth2.config.service;

import com.xpc.oauth2.model.TbPermission;
import com.xpc.oauth2.model.TbUser;
import com.xpc.oauth2.service.TbPermissionService;
import com.xpc.oauth2.service.TbUserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private TbUserService tbUserService;
    @Autowired
    private TbPermissionService tbPermissionService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        TbUser tbUser = tbUserService.getUserByName(s);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if (Objects.nonNull(tbUser)) {
            List<TbPermission> permissions = tbPermissionService.getPermissionListByUserId(tbUser.getId());
            permissions.forEach(tbPermission -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                grantedAuthorities.add(grantedAuthority);
            });
        }
        return new User(tbUser.getUsername(), tbUser.getPassword(), grantedAuthorities);
    }
}
