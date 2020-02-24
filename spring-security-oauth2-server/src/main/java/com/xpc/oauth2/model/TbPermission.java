package com.xpc.oauth2.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;

@Data
public class TbPermission extends Model<TbPermission> {
    private Long id;
    private Long parentId;
    private String name;
    private String enname;
    private String url;
    private String description;
    private Date created;
    private Date updated;
}
