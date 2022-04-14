package com.news.pojo;

import lombok.Data;

@Data
public class SciNews {
    /*
    `id` VARCHAR(32) NOT NULL  COMMENT '新闻ID',
    `title` VARCHAR(255) NOT NULL  COMMENT '新闻标题',
	`type` VARCHAR(24) NOT NULL  COMMENT '新闻类型',
	`user_id` VARCHAR(32) NOT NULL  COMMENT '作者ID',
	`link` VARCHAR(255) COMMENT '新闻链接',
	`cover` VARCHAR(255) NOT NULL  COMMENT '新闻封面链接',
	`downloads` INTEGER(0) NOT NULL  COMMENT '下载量',
	`gmt_create` TIMESTAMP(0) NOT NULL  DEFAULT CURRENT_TIMESTAMP() COMMENT '创建时间',
	`create_by` VARCHAR(24) NOT NULL  COMMENT '创建操作人',
	`gmt_update` TIMESTAMP(0) NOT NULL  DEFAULT CURRENT_TIMESTAMP() ON UPDATE CURRENT_TIMESTAMP() COMMENT '更新时间',
	`update_by` VARCHAR(24) NOT NULL  COMMENT '更新操作人',
	PRIMARY KEY (`id`),
	UNIQUE KEY `news_title_index` (`title`)*/

    private Integer id;
    private String title;
    private String type;
    private String userId;
    private String link;
    private String cover;
    private Integer downloads;
    private String gmtCreate;
    private String createBy;
    private String gmtUpdate;
    private String updateBy;
    private User user;


}
