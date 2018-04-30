/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Version : 50720
 Source Host           : localhost
 Source Database       : app

 Target Server Version : 50720
 File Encoding         : utf-8

 Date: 05/01/2018 01:08:41 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `app`
-- ----------------------------
DROP TABLE IF EXISTS `app`;
CREATE TABLE `app` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `app`
-- ----------------------------
BEGIN;
INSERT INTO `app` VALUES ('1', 'weexplus');
COMMIT;

-- ----------------------------
--  Table structure for `hotupadte`
-- ----------------------------
DROP TABLE IF EXISTS `hotupadte`;
CREATE TABLE `hotupadte` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `url` varchar(500) NOT NULL,
  `js_version` int(11) NOT NULL,
  `native_version` int(11) NOT NULL,
  `mode` int(11) NOT NULL DEFAULT '0' COMMENT '0:静默更新；1.强制更新',
  `size` varchar(255) NOT NULL,
  `systemtype` int(11) NOT NULL DEFAULT '1',
  `app_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `hotupadte`
-- ----------------------------
BEGIN;
INSERT INTO `hotupadte` VALUES ('1', 'http://59.110.169.246/img/app.zip', '2', '1', '1', '2m', '0', '1');
COMMIT;

-- ----------------------------
--  Table structure for `version`
-- ----------------------------
DROP TABLE IF EXISTS `version`;
CREATE TABLE `version` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `version_name` varchar(255) DEFAULT NULL,
  `version_code` int(11) DEFAULT NULL,
  `system_type` int(11) DEFAULT NULL,
  `app_id` int(11) DEFAULT NULL,
  `desc` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `download_url` varchar(255) DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  `size` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `version`
-- ----------------------------
BEGIN;
INSERT INTO `version` VALUES ('1', 'erp', '2.0', '2', '1', '1', '新版本', 'http://59.110.169.246/img/app-debug.apk', null, '14.7M');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
