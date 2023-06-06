/* 主数据库 */

CREATE DATABASE `test` 

USE `test`;

DROP TABLE IF EXISTS `user_test`;

CREATE TABLE `user_test` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;


/* 从数据库 */

CREATE DATABASE `test_other`;

USE `test_other`;

DROP TABLE IF EXISTS `user_other`;

CREATE TABLE `user_other` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nick_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
