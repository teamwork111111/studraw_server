-- 取消外键约束
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- 9.Table structure for `feedback`
-- ----------------------------
DROP TABLE IF EXISTS `feedback`;
CREATE TABLE `feedback` (
  `id` varchar(255) NOT NULL,
  `sumid` varchar(255) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `userid` varchar(255) DEFAULT NULL,
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
  `id` varchar(255) NOT NULL,
  `userid` varchar(255) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
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
  `id` varchar(255) NOT NULL,
  `userid` varchar(255) DEFAULT NULL,
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
  `id` varchar(255) NOT NULL,
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
  `id` varchar(255) NOT NULL,
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
  `id` varchar(255) NOT NULL,
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
  `id` varchar(255) NOT NULL,
  `schid` varchar(255) DEFAULT NULL,
  `majid` varchar(255) DEFAULT NULL,
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
  `id` varchar(255) NOT NULL,
  `userid` varchar(255) DEFAULT '-1' COMMENT '0：本学校开放1：全部开放，-1否',
  `createtime` datetime DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `hide` tinyint(4) DEFAULT NULL,
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
  `id` varchar(255) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
	`userinfoid` varchar(255) NOT NULL,
  `roleid` varchar(255) NOT NULL,
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
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sex` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0：女，1：男',
  `desc` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `qq` varchar(255) DEFAULT NULL,
	`no` varchar(255) DEFAULT NULL,
	`schid` varchar(255) DEFAULT NULL,
	`majid` varchar(255) DEFAULT NULL,
	`remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
