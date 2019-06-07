/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50722
Source Host           : 127.0.0.1:3306
Source Database       : adi

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-06-07 16:32:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `mid` int(11) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`aid`),
  KEY `fk_mid` (`mid`),
  CONSTRAINT `fk_mid` FOREIGN KEY (`mid`) REFERENCES `member` (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of address
-- ----------------------------

-- ----------------------------
-- Table structure for details
-- ----------------------------
DROP TABLE IF EXISTS `details`;
CREATE TABLE `details` (
  `odid` int(11) NOT NULL,
  `oid` varchar(255) DEFAULT NULL,
  `gid` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  PRIMARY KEY (`odid`),
  KEY `pk_oid` (`oid`),
  KEY `pk_gid` (`gid`),
  CONSTRAINT `pk_gid` FOREIGN KEY (`gid`) REFERENCES `goods` (`gid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `pk_oid` FOREIGN KEY (`oid`) REFERENCES `orders` (`oid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of details
-- ----------------------------

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `gid` int(11) NOT NULL,
  `ioid` int(11) DEFAULT NULL,
  `itid` int(11) DEFAULT NULL,
  `irid` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `regdate` date DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT '0',
  PRIMARY KEY (`gid`),
  KEY `fk_ioid` (`ioid`),
  KEY `fk_itid2` (`itid`),
  KEY `fk_irid2` (`irid`),
  CONSTRAINT `fk_ioid` FOREIGN KEY (`ioid`) REFERENCES `itemone` (`ioid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_irid2` FOREIGN KEY (`irid`) REFERENCES `itemtre` (`irid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_itid2` FOREIGN KEY (`itid`) REFERENCES `itemtwo` (`itid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------

-- ----------------------------
-- Table structure for itemone
-- ----------------------------
DROP TABLE IF EXISTS `itemone`;
CREATE TABLE `itemone` (
  `ioid` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ioid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of itemone
-- ----------------------------
INSERT INTO `itemone` VALUES ('1', '男子');
INSERT INTO `itemone` VALUES ('2', '女子');
INSERT INTO `itemone` VALUES ('3', '儿童');
INSERT INTO `itemone` VALUES ('4', '运动');

-- ----------------------------
-- Table structure for itemtre
-- ----------------------------
DROP TABLE IF EXISTS `itemtre`;
CREATE TABLE `itemtre` (
  `irid` int(11) NOT NULL AUTO_INCREMENT,
  `itid` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`irid`),
  KEY `fk_itid` (`itid`),
  CONSTRAINT `fk_itid` FOREIGN KEY (`itid`) REFERENCES `itemtwo` (`itid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of itemtre
-- ----------------------------
INSERT INTO `itemtre` VALUES ('1', '1', '全部男子折扣');
INSERT INTO `itemtre` VALUES ('2', '1', '最新上市');
INSERT INTO `itemtre` VALUES ('3', '1', '新品发售日历');
INSERT INTO `itemtre` VALUES ('4', '1', '限量售卖');
INSERT INTO `itemtre` VALUES ('5', '1', '本周热卖');
INSERT INTO `itemtre` VALUES ('6', '2', '跑步');
INSERT INTO `itemtre` VALUES ('7', '2', '帆布/滑鞋');
INSERT INTO `itemtre` VALUES ('8', '2', '拖鞋/凉鞋');
INSERT INTO `itemtre` VALUES ('9', '2', '复古/老爹鞋');
INSERT INTO `itemtre` VALUES ('10', '2', '篮球');
INSERT INTO `itemtre` VALUES ('11', '3', '短袖T桖');
INSERT INTO `itemtre` VALUES ('12', '3', '卫衣');
INSERT INTO `itemtre` VALUES ('13', '3', '夹克');
INSERT INTO `itemtre` VALUES ('14', '3', '短裤');
INSERT INTO `itemtre` VALUES ('15', '4', '包');
INSERT INTO `itemtre` VALUES ('16', '4', '袜子');
INSERT INTO `itemtre` VALUES ('17', '4', '帽子/手套/围巾');

-- ----------------------------
-- Table structure for itemtwo
-- ----------------------------
DROP TABLE IF EXISTS `itemtwo`;
CREATE TABLE `itemtwo` (
  `itid` int(11) NOT NULL AUTO_INCREMENT,
  `ioid` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`itid`),
  KEY `pk_ioid` (`ioid`),
  CONSTRAINT `pk_ioid` FOREIGN KEY (`ioid`) REFERENCES `itemone` (`ioid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of itemtwo
-- ----------------------------
INSERT INTO `itemtwo` VALUES ('1', '1', '精品推荐');
INSERT INTO `itemtwo` VALUES ('2', '1', '鞋类');
INSERT INTO `itemtwo` VALUES ('3', '1', '服饰类');
INSERT INTO `itemtwo` VALUES ('4', '1', '附配件类');
INSERT INTO `itemtwo` VALUES ('5', '2', '精品推荐');
INSERT INTO `itemtwo` VALUES ('6', '2', '鞋类');
INSERT INTO `itemtwo` VALUES ('7', '2', '服饰类');
INSERT INTO `itemtwo` VALUES ('8', '2', '附配件类');
INSERT INTO `itemtwo` VALUES ('9', '3', '精选推荐');
INSERT INTO `itemtwo` VALUES ('10', '3', '大童（8-14岁）');
INSERT INTO `itemtwo` VALUES ('11', '3', '小童（4-8岁）');
INSERT INTO `itemtwo` VALUES ('12', '3', '婴幼儿（0-4岁）');
INSERT INTO `itemtwo` VALUES ('13', '4', '跑步');
INSERT INTO `itemtwo` VALUES ('14', '4', '训练');
INSERT INTO `itemtwo` VALUES ('15', '4', '足球');
INSERT INTO `itemtwo` VALUES ('16', '4', '篮球');
INSERT INTO `itemtwo` VALUES ('17', '4', '户外');

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(32) NOT NULL,
  `telphone` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `level` int(11) DEFAULT '0',
  `isAdmin` int(11) DEFAULT '0',
  `intgral` int(11) DEFAULT '0',
  `status` int(11) DEFAULT '0',
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES ('1', 'unknown', 'd2f90af1b22cccca88c83c211a7631c6', null, null, null, '0', '0', '0', '0');
INSERT INTO `member` VALUES ('2', 'admin', 'dba52648347fd2c14dcbc1f4d6ffe557', null, null, null, '0', '0', '0', '0');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `oid` varchar(255) NOT NULL,
  `mid` int(11) DEFAULT NULL,
  `allpay` decimal(10,2) DEFAULT NULL,
  `aid` int(11) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`oid`),
  KEY `pk_mid2` (`mid`),
  KEY `pk_aid2` (`aid`),
  CONSTRAINT `pk_aid2` FOREIGN KEY (`aid`) REFERENCES `address` (`aid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `pk_mid2` FOREIGN KEY (`mid`) REFERENCES `member` (`mid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
