package com.user.pojo;

import lombok.Data;

@Data
public class User {


      /*`id` varchar(32) NOT NULL  COMMENT '用户ID',
      `nickname` varchar(255) NOT NULL  COMMENT '昵称',
      `phone` varchar(32) NOT NULL  COMMENT '手机号',
      email` varchar(255) NOT NULL  COMMENT '邮箱',
      `password` varchar(32) COMMENT '密码',
      `salt` varchar(32) COMMENT '盐值',
      `gmt_create` timestamp(0) NOT NULL  DEFAULT current_timestamp() COMMENT '创建时间',
      `gmt_update` timestamp(0) NOT NULL  DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
    */

    private String id;
    private String nickname;
    private String phone;
    private String email;
    private String password;
    private String salt;
    private String gmtCreate;
    private String gmtUpdate;
}
