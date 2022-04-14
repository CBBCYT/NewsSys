/*
SQLyog Community v13.1.7 (64 bit)
MySQL - 8.0.27 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `sys_user` (
	`id` varchar (96),
	`nickname` varchar (765),
	`phone` varchar (96),
	`email` varchar (765),
	`password` varchar (96),
	`salt` varchar (96),
	`gmt_create` timestamp ,
	`gmt_update` timestamp 
); 
insert into `sys_user` (`id`, `nickname`, `phone`, `email`, `password`, `salt`, `gmt_create`, `gmt_update`) values('于雅倩','于雅倩','133333','1333333','123456','123','2022-04-04 17:30:51','2022-04-04 17:30:51');
