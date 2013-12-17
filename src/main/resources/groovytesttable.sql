/*
Navicat MySQL Data Transfer

Source Server         : ajianpc
Source Server Version : 50153
Source Host           : ajianpc:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50153
File Encoding         : 65001

Date: 2013-12-17 13:41:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `groovytesttable`
-- ----------------------------
DROP TABLE IF EXISTS `groovytesttable`;
CREATE TABLE `groovytesttable` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(20) DEFAULT NULL,
  `lastname` varchar(20) DEFAULT NULL,
  `location_id` int(11) DEFAULT NULL,
  `location_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of groovytesttable
-- ----------------------------
INSERT INTO `groovytesttable` VALUES ('1', '张大师', 'Strachan', '10', 'London');
INSERT INTO `groovytesttable` VALUES ('3', 'Sam', 'Pullara', '30', 'California');
INSERT INTO `groovytesttable` VALUES ('4', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('5', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('6', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('7', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('8', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('9', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('10', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('11', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('12', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('13', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('14', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('15', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('16', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('17', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('18', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('19', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('20', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('21', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('25', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
INSERT INTO `groovytesttable` VALUES ('26', 'random-1133938638', 'randomLN-1040059906', '1', '重庆渝中区和平路-1244746321号');
