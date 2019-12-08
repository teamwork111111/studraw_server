-- 取消外键约束
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- 9.Table structure for `feedback`
-- ----------------------------
DROP TABLE IF EXISTS `feedback`;
CREATE TABLE `feedback` (
  `id` int(11) auto_increment,
  `sumid` int(11) DEFAULT NULL,
  `createtime` datetime DEFAULT CURRENT_TIMESTAMP,
  `content` varchar(255) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Records of feedback
-- ----------------------------

-- ----------------------------
-- 10.Table structure for `label`
-- ----------------------------
DROP TABLE IF EXISTS `label`;
CREATE TABLE `label` (
  `id` int(11) auto_increment,
  `userid` int(11) DEFAULT NULL,
  `createtime` datetime DEFAULT CURRENT_TIMESTAMP,
  `labellist` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of label
-- ----------------------------

-- ----------------------------
-- 3.Table structure for `loger`
-- ----------------------------
DROP TABLE IF EXISTS `loger`;
CREATE TABLE `loger` (
  `id` int(11) auto_increment,
  `userid` int(11) DEFAULT NULL,
  `logtime` datetime DEFAULT NULL,
  `logip` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loger
-- ----------------------------

-- ----------------------------
-- 6.Table structure for `major`
-- ----------------------------
DROP TABLE IF EXISTS `major`;
CREATE TABLE `major` (
  `id` int(11) auto_increment,
  `majname` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of major
-- ----------------------------

-- ----------------------------
-- 2.Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) auto_increment,
  `rolename` varchar(255) DEFAULT NULL,
  `permition` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- 5.Table structure for `school`
-- ----------------------------
DROP TABLE IF EXISTS `school`;
CREATE TABLE `school` (
  `id` int(11) auto_increment,
  `schoolname` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of school
-- ----------------------------

-- ----------------------------
-- 7.Table structure for `schoolmajor`
-- ----------------------------
DROP TABLE IF EXISTS `schoolmajor`;
CREATE TABLE `schoolmajor` (
  `id` int(11) auto_increment,
  `schid` int(11) DEFAULT NULL,
  `majid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of schoolmajor
-- ----------------------------



-- ----------------------------
-- 8.Table structure for `summary`
-- ----------------------------
DROP TABLE IF EXISTS `summary`;
CREATE TABLE `summary` (
  `id` int(11) auto_increment,
  `userid` int(11) DEFAULT NULL,
  `createtime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `content` varchar(255) DEFAULT NULL,
  `hide` tinyint(4) DEFAULT -1 COMMENT '0：本学校开放1：全部开放，-1否',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of summary
-- ----------------------------



-- ----------------------------
-- 1.Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) auto_increment,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
	`userinfoid` int(11) DEFAULT NULL,
  `roleid` int(11) DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '0：正常，-1：异常',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- 4.Table structure for `userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `id` int(11) auto_increment,
  `name` varchar(255) DEFAULT NULL,
  `sex` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0：女，1：男',
  `desc` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `qq` varchar(255) DEFAULT NULL,
	`no` varchar(255) DEFAULT NULL,
	`schid` int(11) DEFAULT NULL,
	`majid` int(11) DEFAULT NULL,
	`remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
