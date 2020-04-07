/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2020-01-06 15:58:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `telephone` varchar(50) DEFAULT NULL,
  `fax` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `ctime` datetime DEFAULT CURRENT_TIMESTAMP,
  `gtime` datetime DEFAULT CURRENT_TIMESTAMP,
  `manager_id` bigint(20) DEFAULT NULL,
  `version` int(11) DEFAULT '1',
  `invalid` int(2) DEFAULT '0',
  `db_source` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'Jone', '18', null, null, 'test1@baomidou.com', '2019-11-26 10:41:50', '2019-12-10 15:36:34', null, '1', '0', 'test');
INSERT INTO `t_user` VALUES ('2', 'Jack', '20', '13556568977', '519-85125378', 'test2@baomidou.com', '2019-11-27 10:41:50', '2019-12-10 15:36:34', '1', '1', '0', 'test');
INSERT INTO `t_user` VALUES ('3', 'Tom', '28', null, null, 'test3@baomidou.com', '2019-11-28 10:41:50', '2019-12-10 15:36:34', '1', '1', '0', 'test');
INSERT INTO `t_user` VALUES ('4', 'Sandy', '21', null, null, 'test4@baomidou.com', '2019-11-29 10:41:50', '2019-12-10 15:36:34', '1', '1', '0', 'test');
INSERT INTO `t_user` VALUES ('5', 'Billie', '24', null, null, 'test5@baomidou.com', '2019-11-30 10:41:50', '2019-12-10 15:36:34', '1', '1', '0', 'test');
INSERT INTO `t_user` VALUES ('6', 'Peter', '25', null, null, 'test6@baomidou.com', '2019-12-01 10:41:50', '2019-12-10 15:36:34', '2', '1', '0', 'test');
INSERT INTO `t_user` VALUES ('7', 'David', '12', null, null, '3246465@qq.com', '2019-12-02 10:41:50', '2019-12-10 15:36:34', '2', '1', '0', 'test');
INSERT INTO `t_user` VALUES ('8', 'David2', '12', null, null, '3246465sf@qq.com', '2019-12-03 10:41:50', '2019-12-10 15:36:34', '2', '1', '0', 'test');
INSERT INTO `t_user` VALUES ('9', 'David3', '12', null, null, '324646gf5@qq.com', '2019-12-04 10:41:50', '2019-12-10 15:36:34', '2', '1', '0', 'test');
INSERT INTO `t_user` VALUES ('10', 'Ken2', '17', null, null, '4764576@qq.com', '2019-12-09 10:41:50', '2019-12-11 09:27:01', null, '2', '0', 'test');
INSERT INTO `t_user` VALUES ('11', 'Sue', '16', null, null, '32fd46fg465@qq.com', '2019-12-10 10:30:00', '2019-12-10 15:36:34', null, '1', '0', 'test');
INSERT INTO `t_user` VALUES ('12', 'Sue', '16', null, null, '32fd46fg465@qq.com', '2019-12-10 10:30:55', '2019-12-10 15:36:34', null, '1', '0', 'test');
INSERT INTO `t_user` VALUES ('13', 'Sue2', '16', null, null, '32fdf6fgg465@qq.com', '2019-12-10 10:32:28', '2019-12-10 15:36:34', null, '1', '0', 'test');
INSERT INTO `t_user` VALUES ('14', 'Tim', '20', '13556568989', '519-85125379', '235235@qq.com', '2019-12-13 10:54:16', '2019-12-13 10:54:16', null, '1', '0', 'test');
INSERT INTO `t_user` VALUES ('15', 'Tim', '20', '13556568989', '519-85125379', '235235@qq.com', '2019-12-13 10:55:09', '2019-12-13 10:55:09', null, '1', '0', 'test');
INSERT INTO `t_user` VALUES ('16', 'Tim2', '21', '13556568989', '519-85125379', '2352345@qq.com', '2019-12-13 10:58:38', '2019-12-13 10:58:38', null, '1', '0', 'test');
INSERT INTO `t_user` VALUES ('17', 'Tim2', '21', '13556568989', '519-85125379', '2352345@qq.com', '2019-12-13 11:01:39', '2019-12-13 11:01:39', '2', '1', '0', 'test');
INSERT INTO `t_user` VALUES ('18', 'Tim6', '21', '13556568980', '519-85125379', '2352345@qq.com', null, '2020-01-03 09:01:09', '2', '1', '0', 'test');
