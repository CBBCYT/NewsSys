/*
SQLyog Community v13.1.7 (64 bit)
MySQL - 8.0.27 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `sci_news` (
	`id` varchar (96),
	`title` varchar (765),
	`type` varchar (72),
	`user_id` varchar (96),
	`link` varchar (765),
	`cover` varchar (765),
	`downloads` int (11),
	`gmt_create` timestamp ,
	`create_by` varchar (72),
	`gmt_update` timestamp ,
	`update_by` varchar (72)
); 
insert into `sci_news` (`id`, `title`, `type`, `user_id`, `link`, `cover`, `downloads`, `gmt_create`, `create_by`, `gmt_update`, `update_by`) values('1','军队抽组卫勤力量 2000 余人支援上海疫情防控工作','防疫','于雅倩','http://81.cn/yw/2022-04/03/content_10145832.htm','http://81.cn/','0','2022-04-03 22:48:00','manager','2022-04-04 16:03:05','manager');
insert into `sci_news` (`id`, `title`, `type`, `user_id`, `link`, `cover`, `downloads`, `gmt_create`, `create_by`, `gmt_update`, `update_by`) values('2','军队抽组卫勤力量 2000 余人支援上海疫情防控工作2','防疫','于雅倩','http://81.cn/yw/2022-04/03/content_10145832.htm','http://81.cn/','0','2022-04-03 22:48:00','manager','2022-04-04 16:03:05','manager');
insert into `sci_news` (`id`, `title`, `type`, `user_id`, `link`, `cover`, `downloads`, `gmt_create`, `create_by`, `gmt_update`, `update_by`) values('3','军队抽组卫勤力量 2000 余人支援上海疫情防控工作3','防疫','于雅倩','http://81.cn/yw/2022-04/03/content_10145832.htm','http://81.cn/','0','2022-04-03 22:48:00','manager','2022-04-04 16:03:05','manager');
