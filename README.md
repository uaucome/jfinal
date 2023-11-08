# jfinal

1. 该项目的运行环境为jdk1.8,tomcat8.5,mysql8.0,mvn3.5;

2. 需要在本地或者其他服务器上建一个mysql数据库，该项目的数据库名为test,使用的表名为t_customer,建表语句如下：

      DROP TABLE IF EXISTS t_customer;
      CREATE TABLE t_customer (
        id int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
        account varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户账号',
        password varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户密码',
        nickname varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户昵称',
        sex varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户性别',
        age varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户年龄',
        mail varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户邮箱',
        photoaddress varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像地址',
        by varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
        PRIMARY KEY (id) USING BTREE
      ) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

      插入sql：
      INSERT INTO t_customer VALUES (1, '10086', '123456', '移动酱', '女', '18', '10086@yahoo.com', '', NULL);
      INSERT INTO t_customer VALUES (2, '10010', '184589', '联通桑', '男', '19', '10010@gmail.com', '', NULL);
      INSERT INTO t_customer VALUES (3, '10000', '240068', '电信桑', '男', '20', '10000@qq.com', NULL, NULL);
      INSERT INTO t_customer VALUES (4, '23333', '333332', 'B站娘', '女', '15', '23333@qq.com', NULL, NULL);
      INSERT INTO t_customer VALUES (5, '36666', '333888', 'D站妹', '女', '14', '77777@qq.com', NULL, NULL);
      INSERT INTO t_customer VALUES (6, '18888', '333339', 'A站姐', '女', '18', '18888@qq.com', NULL, NULL);
      
3. 后续可能会慢慢对该项目进行优化

