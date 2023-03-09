1 目的：
--------
    合并后端请求，任意组合后端接口。

2数据sql
--------
-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `account` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '账号',
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '姓名',
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '密码',
  `age` int(3) NULL DEFAULT NULL COMMENT '年龄',
  `city` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '城市',
  `create_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '创建人',
  `create_dept` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '创建人所属部门',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = 'user测试表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '管理员', 'admin', 30, '南京', '1', '1');
INSERT INTO `user` VALUES (2, 'superadmin', '超级管理员', 'superadmin', 35, '北京', '1', '2');
INSERT INTO `user` VALUES (3, 'salesman', '业务员', 'salesman', 22, '上海', '2', '2');
INSERT INTO `user` VALUES (4, 'driver', '司机', 'driver', 29, '杭州', '2', '1');
INSERT INTO `user` VALUES (5, 'finance', '财务', 'finance', 31, '徐州', '2', '1');
INSERT INTO `user` VALUES (6, 'test', '测试', 'test', 24, '扬州', '1', '2');
INSERT INTO `user` VALUES (7, 'develop', '开发', 'develop', 27, '无锡', '1', '3');

SET FOREIGN_KEY_CHECKS = 1;
