# jfinal
jfinal框架的简单尝试

该项目的运行环境为jdk1.8,tomcat8.5,mysql8.0,mvn3.5;

需要在本地或者其他服务器上建一个mysql数据库，该项目的数据库名为test,使用的表名为ujfinal,建表语句如下：
CREATE TABLE `ujfinal` (
`id` INT ( 11 ) NOT NULL AUTO_INCREMENT,
`name` VARCHAR ( 10 ) DEFAULT NULL,
`account` VARCHAR ( 10 ) CHARACTER 
SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
`password` VARCHAR ( 10 ) DEFAULT NULL,
`sex` VARCHAR ( 10 ) DEFAULT NULL,
`mail` VARCHAR ( 10 ) DEFAULT NULL,
PRIMARY KEY ( `id` ) 
) ENGINE = INNODB AUTO_INCREMENT = 6 DEFAULT CHARSET = utf8;

后续可能会慢慢对该项目进行优化

