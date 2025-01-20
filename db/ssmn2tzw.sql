-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmn2tzw
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `ssmn2tzw`
--

/*!40000 DROP DATABASE IF EXISTS `ssmn2tzw`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssmn2tzw` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssmn2tzw`;

--
-- Table structure for table `banfeitongzhi`
--

DROP TABLE IF EXISTS `banfeitongzhi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banfeitongzhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `banfei` float DEFAULT NULL COMMENT '班费',
  `shoujiaoyuanyin` longtext COMMENT '收缴原因',
  `banweizhanghao` varchar(200) DEFAULT NULL COMMENT '班委账号',
  `banweixingming` varchar(200) DEFAULT NULL COMMENT '班委姓名',
  `tongzhiriqi` date DEFAULT NULL COMMENT '通知日期',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1646834134872 DEFAULT CHARSET=utf8 COMMENT='班费通知';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banfeitongzhi`
--

LOCK TABLES `banfeitongzhi` WRITE;
/*!40000 ALTER TABLE `banfeitongzhi` DISABLE KEYS */;
INSERT INTO `banfeitongzhi` VALUES (91,'2022-03-09 13:40:42','学号1','姓名1','班级1',1,'收缴原因1','班委账号1','班委姓名1','2022-03-09','未支付'),(92,'2022-03-09 13:40:42','学号2','姓名2','班级2',2,'收缴原因2','班委账号2','班委姓名2','2022-03-09','未支付'),(93,'2022-03-09 13:40:42','学号3','姓名3','班级3',3,'收缴原因3','班委账号3','班委姓名3','2022-03-09','未支付'),(94,'2022-03-09 13:40:42','学号4','姓名4','班级4',4,'收缴原因4','班委账号4','班委姓名4','2022-03-09','未支付'),(95,'2022-03-09 13:40:42','学号5','姓名5','班级5',5,'收缴原因5','班委账号5','班委姓名5','2022-03-09','未支付'),(96,'2022-03-09 13:40:42','学号6','姓名6','班级6',6,'收缴原因6','班委账号6','班委姓名6','2022-03-09','未支付'),(1646834134871,'2022-03-09 13:55:34','11','时代','2班',33,'地方第三方时代发送到发多少','22','地方','2022-03-09','已支付');
/*!40000 ALTER TABLE `banfeitongzhi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banhuizuzhi`
--

DROP TABLE IF EXISTS `banhuizuzhi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banhuizuzhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zuzhibianhao` varchar(200) DEFAULT NULL COMMENT '组织编号',
  `zuzhimingcheng` varchar(200) DEFAULT NULL COMMENT '组织名称',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `chuangjianriqi` date DEFAULT NULL COMMENT '创建日期',
  `chuangjianren` varchar(200) DEFAULT NULL COMMENT '创建人',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `zuzhijieshao` longtext COMMENT '组织介绍',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zuzhibianhao` (`zuzhibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1646834210841 DEFAULT CHARSET=utf8 COMMENT='班会组织';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banhuizuzhi`
--

LOCK TABLES `banhuizuzhi` WRITE;
/*!40000 ALTER TABLE `banhuizuzhi` DISABLE KEYS */;
INSERT INTO `banhuizuzhi` VALUES (31,'2022-03-09 13:40:42','1111111111','组织名称1','upload/banhuizuzhi_fengmian1.jpg','2022-03-03','创建人1','联系电话1','邮箱1','<p>组织介绍1</p>',1,1,'2022-03-09 21:58:42',3),(32,'2022-03-09 13:40:42','2222222222','组织名称2','upload/banhuizuzhi_fengmian2.jpg','2022-03-09','创建人2','联系电话2','邮箱2','组织介绍2',2,2,'2022-03-09 21:40:42',2),(33,'2022-03-09 13:40:42','3333333333','组织名称3','upload/banhuizuzhi_fengmian3.jpg','2022-03-09','创建人3','联系电话3','邮箱3','组织介绍3',3,3,'2022-03-09 21:40:42',3),(34,'2022-03-09 13:40:42','4444444444','组织名称4','upload/banhuizuzhi_fengmian4.jpg','2022-03-09','创建人4','联系电话4','邮箱4','组织介绍4',4,4,'2022-03-09 21:58:44',5),(35,'2022-03-09 13:40:42','5555555555','组织名称5','upload/banhuizuzhi_fengmian5.jpg','2022-03-09','创建人5','联系电话5','邮箱5','组织介绍5',5,5,'2022-03-09 21:40:42',5),(36,'2022-03-09 13:40:42','6666666666','组织名称6','upload/banhuizuzhi_fengmian6.jpg','2022-03-09','创建人6','联系电话6','邮箱6','组织介绍6',6,6,'2022-03-09 21:40:42',6),(1646834210840,'2022-03-09 13:56:50','1646834195177','水电费时代','upload/1646834197819.jpg','2022-03-09','地方给对方','1112223333','33@qq.com','<p>水电费时代发送到发送到发送到发送到发送到发送到水电费时代发送到发送到发送到发送到发送到发送到水电费时代发送到发送到发送到发送到发送到发送到</p>',1,0,'2022-03-09 22:00:16',6);
/*!40000 ALTER TABLE `banhuizuzhi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banwei`
--

DROP TABLE IF EXISTS `banwei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banwei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `banweizhanghao` varchar(200) NOT NULL COMMENT '班委账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `banweixingming` varchar(200) NOT NULL COMMENT '班委姓名',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `banji` varchar(200) NOT NULL COMMENT '班级',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `banweizhanghao` (`banweizhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1646833997855 DEFAULT CHARSET=utf8 COMMENT='班委';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banwei`
--

LOCK TABLES `banwei` WRITE;
/*!40000 ALTER TABLE `banwei` DISABLE KEYS */;
INSERT INTO `banwei` VALUES (21,'2022-03-09 13:40:42','班委账号1','123456','班委姓名1',1,'男','13823888881','班级1','upload/banwei_zhaopian1.jpg'),(22,'2022-03-09 13:40:42','班委账号2','123456','班委姓名2',2,'男','13823888882','班级2','upload/banwei_zhaopian2.jpg'),(23,'2022-03-09 13:40:42','班委账号3','123456','班委姓名3',3,'男','13823888883','班级3','upload/banwei_zhaopian3.jpg'),(24,'2022-03-09 13:40:42','班委账号4','123456','班委姓名4',4,'男','13823888884','班级4','upload/banwei_zhaopian4.jpg'),(25,'2022-03-09 13:40:42','班委账号5','123456','班委姓名5',5,'男','13823888885','班级5','upload/banwei_zhaopian5.jpg'),(26,'2022-03-09 13:40:42','班委账号6','123456','班委姓名6',6,'男','13823888886','班级6','upload/banwei_zhaopian6.jpg'),(1646833997854,'2022-03-09 13:53:17','22','22','地方',22,'女','11122233334','2班','upload/1646834045852.jpg');
/*!40000 ALTER TABLE `banwei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/1646834300699.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dangyuanfazhan`
--

DROP TABLE IF EXISTS `dangyuanfazhan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dangyuanfazhan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `jianjie` longtext COMMENT '简介',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `neirong` longtext COMMENT '内容',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1646834233551 DEFAULT CHARSET=utf8 COMMENT='党员发展';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dangyuanfazhan`
--

LOCK TABLES `dangyuanfazhan` WRITE;
/*!40000 ALTER TABLE `dangyuanfazhan` DISABLE KEYS */;
INSERT INTO `dangyuanfazhan` VALUES (51,'2022-03-09 13:40:42','标题1','简介1','2022-03-09','upload/dangyuanfazhan_fengmian1.jpg','内容1',1,1,'2022-03-09 21:40:42',1),(52,'2022-03-09 13:40:42','标题2','简介2','2022-03-09','upload/dangyuanfazhan_fengmian2.jpg','内容2',2,2,'2022-03-09 21:59:06',4),(53,'2022-03-09 13:40:42','标题3','简介3','2022-03-09','upload/dangyuanfazhan_fengmian3.jpg','内容3',3,3,'2022-03-09 21:40:42',3),(54,'2022-03-09 13:40:42','标题4','简介4','2022-03-09','upload/dangyuanfazhan_fengmian4.jpg','内容4',4,4,'2022-03-09 21:40:42',4),(55,'2022-03-09 13:40:42','标题5','简介5','2022-03-09','upload/dangyuanfazhan_fengmian5.jpg','内容5',5,5,'2022-03-09 21:40:42',5),(56,'2022-03-09 13:40:42','标题6','简介6','2022-03-09','upload/dangyuanfazhan_fengmian6.jpg','内容6',6,6,'2022-03-09 21:40:42',6),(1646834233550,'2022-03-09 13:57:13','水电费时代','地方的鬼地方个的郭德纲地方给对方固定刚发的地方的鬼地方个的郭德纲地方给对方固定刚发的','2022-03-09','upload/1646834226362.jpeg','<p>地方的鬼地方个的郭德纲地方给对方固定刚发的地方的鬼地方个的郭德纲地方给对方固定刚发的地方的鬼地方个的郭德纲地方给对方固定刚发的地方的鬼地方个的郭德纲地方给对方固定刚发的地方的鬼地方个的郭德纲地方给对方固定刚发的地方的鬼地方个的郭德纲地方给对方固定刚发的地方的鬼地方个的郭德纲地方给对方固定刚发的</p>',0,0,'2022-03-09 21:59:12',2);
/*!40000 ALTER TABLE `dangyuanfazhan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dangyuanpeixun`
--

DROP TABLE IF EXISTS `dangyuanpeixun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dangyuanpeixun` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `peixunbiaoti` varchar(200) NOT NULL COMMENT '培训标题',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `peixunshijian` datetime DEFAULT NULL COMMENT '培训时间',
  `jieshushijian` datetime DEFAULT NULL COMMENT '结束时间',
  `peixuntianshu` int(11) DEFAULT NULL COMMENT '培训天数',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `peixunneirong` longtext COMMENT '培训内容',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='党员培训';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dangyuanpeixun`
--

LOCK TABLES `dangyuanpeixun` WRITE;
/*!40000 ALTER TABLE `dangyuanpeixun` DISABLE KEYS */;
INSERT INTO `dangyuanpeixun` VALUES (61,'2022-03-09 13:40:42','培训标题1','upload/dangyuanpeixun_tupian1.jpg','2022-03-09 21:40:42','2022-03-09 22:40:42',1,'2022-03-08','<p>培训内容1水电费时代发送到发多少发多少培训内容1水电费时代发送到发多少发多少培训内容1水电费时代发送到发多少发多少</p>',1,1,'2022-03-09 21:59:16',4),(62,'2022-03-09 13:40:42','培训标题2','upload/dangyuanpeixun_tupian2.jpg','2022-03-09 21:40:42','2022-03-09 21:40:42',2,'2022-03-09','培训内容2',2,2,'2022-03-09 21:40:42',2),(63,'2022-03-09 13:40:42','培训标题3','upload/dangyuanpeixun_tupian3.jpg','2022-03-09 21:40:42','2022-03-09 21:40:42',3,'2022-03-09','培训内容3',3,3,'2022-03-09 21:40:42',3),(64,'2022-03-09 13:40:42','培训标题4','upload/dangyuanpeixun_tupian4.jpg','2022-03-09 21:40:42','2022-03-09 21:40:42',4,'2022-03-09','培训内容4',4,4,'2022-03-09 21:40:42',4),(65,'2022-03-09 13:40:42','培训标题5','upload/dangyuanpeixun_tupian5.jpg','2022-03-09 21:40:42','2022-03-09 21:40:42',5,'2022-03-09','培训内容5',5,5,'2022-03-09 21:40:42',5),(66,'2022-03-09 13:40:42','培训标题6','upload/dangyuanpeixun_tupian6.jpg','2022-03-09 21:40:42','2022-03-09 21:40:42',6,'2022-03-09','培训内容6',6,6,'2022-03-09 21:40:42',6);
/*!40000 ALTER TABLE `dangyuanpeixun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussbanhuizuzhi`
--

DROP TABLE IF EXISTS `discussbanhuizuzhi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussbanhuizuzhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1646834339716 DEFAULT CHARSET=utf8 COMMENT='班会组织评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussbanhuizuzhi`
--

LOCK TABLES `discussbanhuizuzhi` WRITE;
/*!40000 ALTER TABLE `discussbanhuizuzhi` DISABLE KEYS */;
INSERT INTO `discussbanhuizuzhi` VALUES (131,'2022-03-09 13:40:42',1,1,'用户名1','评论内容1','回复内容1'),(132,'2022-03-09 13:40:42',2,2,'用户名2','评论内容2','回复内容2'),(133,'2022-03-09 13:40:42',3,3,'用户名3','评论内容3','回复内容3'),(134,'2022-03-09 13:40:42',4,4,'用户名4','评论内容4','回复内容4'),(135,'2022-03-09 13:40:42',5,5,'用户名5','评论内容5','回复内容5'),(136,'2022-03-09 13:40:42',6,6,'用户名6','评论内容6','回复内容6'),(1646834339715,'2022-03-09 13:58:58',1646834210840,1646833986396,'11','时代发送到','水电费时代');
/*!40000 ALTER TABLE `discussbanhuizuzhi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussdangyuanfazhan`
--

DROP TABLE IF EXISTS `discussdangyuanfazhan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussdangyuanfazhan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='党员发展评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussdangyuanfazhan`
--

LOCK TABLES `discussdangyuanfazhan` WRITE;
/*!40000 ALTER TABLE `discussdangyuanfazhan` DISABLE KEYS */;
INSERT INTO `discussdangyuanfazhan` VALUES (141,'2022-03-09 13:40:42',1,1,'用户名1','评论内容1','回复内容1'),(142,'2022-03-09 13:40:42',2,2,'用户名2','评论内容2','回复内容2'),(143,'2022-03-09 13:40:42',3,3,'用户名3','评论内容3','回复内容3'),(144,'2022-03-09 13:40:42',4,4,'用户名4','评论内容4','回复内容4'),(145,'2022-03-09 13:40:42',5,5,'用户名5','评论内容5','回复内容5'),(146,'2022-03-09 13:40:42',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussdangyuanfazhan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussdangyuanpeixun`
--

DROP TABLE IF EXISTS `discussdangyuanpeixun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussdangyuanpeixun` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8 COMMENT='党员培训评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussdangyuanpeixun`
--

LOCK TABLES `discussdangyuanpeixun` WRITE;
/*!40000 ALTER TABLE `discussdangyuanpeixun` DISABLE KEYS */;
INSERT INTO `discussdangyuanpeixun` VALUES (151,'2022-03-09 13:40:42',1,1,'用户名1','评论内容1','回复内容1'),(152,'2022-03-09 13:40:42',2,2,'用户名2','评论内容2','回复内容2'),(153,'2022-03-09 13:40:42',3,3,'用户名3','评论内容3','回复内容3'),(154,'2022-03-09 13:40:42',4,4,'用户名4','评论内容4','回复内容4'),(155,'2022-03-09 13:40:42',5,5,'用户名5','评论内容5','回复内容5'),(156,'2022-03-09 13:40:42',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussdangyuanpeixun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusshuodongxinxi`
--

DROP TABLE IF EXISTS `discusshuodongxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusshuodongxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='活动信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusshuodongxinxi`
--

LOCK TABLES `discusshuodongxinxi` WRITE;
/*!40000 ALTER TABLE `discusshuodongxinxi` DISABLE KEYS */;
INSERT INTO `discusshuodongxinxi` VALUES (161,'2022-03-09 13:40:42',1,1,'用户名1','评论内容1','回复内容1'),(162,'2022-03-09 13:40:42',2,2,'用户名2','评论内容2','回复内容2'),(163,'2022-03-09 13:40:42',3,3,'用户名3','评论内容3','回复内容3'),(164,'2022-03-09 13:40:42',4,4,'用户名4','评论内容4','回复内容4'),(165,'2022-03-09 13:40:42',5,5,'用户名5','评论内容5','回复内容5'),(166,'2022-03-09 13:40:42',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discusshuodongxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusswenhuaxuexi`
--

DROP TABLE IF EXISTS `discusswenhuaxuexi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusswenhuaxuexi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=177 DEFAULT CHARSET=utf8 COMMENT='文化学习评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusswenhuaxuexi`
--

LOCK TABLES `discusswenhuaxuexi` WRITE;
/*!40000 ALTER TABLE `discusswenhuaxuexi` DISABLE KEYS */;
INSERT INTO `discusswenhuaxuexi` VALUES (171,'2022-03-09 13:40:42',1,1,'用户名1','评论内容1','回复内容1'),(172,'2022-03-09 13:40:42',2,2,'用户名2','评论内容2','回复内容2'),(173,'2022-03-09 13:40:42',3,3,'用户名3','评论内容3','回复内容3'),(174,'2022-03-09 13:40:42',4,4,'用户名4','评论内容4','回复内容4'),(175,'2022-03-09 13:40:42',5,5,'用户名5','评论内容5','回复内容5'),(176,'2022-03-09 13:40:42',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discusswenhuaxuexi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huodongxinxi`
--

DROP TABLE IF EXISTS `huodongxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huodongxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huodongmingcheng` varchar(200) NOT NULL COMMENT '活动名称',
  `huodongleixing` varchar(200) NOT NULL COMMENT '活动类型',
  `kaishishijian` date DEFAULT NULL COMMENT '开始时间',
  `jieshushijian` date DEFAULT NULL COMMENT '结束时间',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `huodongxiangqing` longtext COMMENT '活动详情',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='活动信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huodongxinxi`
--

LOCK TABLES `huodongxinxi` WRITE;
/*!40000 ALTER TABLE `huodongxinxi` DISABLE KEYS */;
INSERT INTO `huodongxinxi` VALUES (81,'2022-03-09 13:40:42','活动名称1','班费收集','2022-03-09','2022-03-09','upload/huodongxinxi_fengmian1.jpg','<p>活动详情1水电费三房时代发送到发送到</p>',1,1,'2022-03-09 21:59:29',4),(82,'2022-03-09 13:40:42','活动名称2','学员党史','2022-03-09','2022-03-09','upload/huodongxinxi_fengmian2.jpg','活动详情2',2,2,'2022-03-09 21:40:42',2),(83,'2022-03-09 13:40:42','水电费时代发送到','学员党史','2022-03-09','2022-03-09','upload/huodongxinxi_fengmian3.jpg','<p>活动详情3水电费发送到发送到发送到</p>',3,3,'2022-03-09 21:57:54',4),(84,'2022-03-09 13:40:42','活动名称4','学员党史','2022-03-09','2022-03-09','upload/huodongxinxi_fengmian4.jpg','活动详情4',4,4,'2022-03-09 21:40:42',4),(85,'2022-03-09 13:40:42','活动名称5','学员党史','2022-03-09','2022-03-09','upload/huodongxinxi_fengmian5.jpg','活动详情5',5,5,'2022-03-09 21:40:42',5),(86,'2022-03-09 13:40:42','活动名称6','学员党史','2022-03-09','2022-03-09','upload/huodongxinxi_fengmian6.jpg','活动详情6',6,6,'2022-03-09 21:40:42',6);
/*!40000 ALTER TABLE `huodongxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiankangdangan`
--

DROP TABLE IF EXISTS `jiankangdangan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiankangdangan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `manxingjibing` varchar(200) DEFAULT NULL COMMENT '慢性急病',
  `jiazubingshi` varchar(200) DEFAULT NULL COMMENT '家族病史',
  `yaowuguomin` varchar(200) DEFAULT NULL COMMENT '药物过敏',
  `zhongdabingshi` varchar(200) DEFAULT NULL COMMENT '重大病史',
  `richangyinshi` longtext COMMENT '日常饮食',
  `beizhu` longtext COMMENT '备注',
  `dengjiriqi` date DEFAULT NULL COMMENT '登记日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1646834032330 DEFAULT CHARSET=utf8 COMMENT='健康档案';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiankangdangan`
--

LOCK TABLES `jiankangdangan` WRITE;
/*!40000 ALTER TABLE `jiankangdangan` DISABLE KEYS */;
INSERT INTO `jiankangdangan` VALUES (41,'2022-03-09 13:40:42','学号1','姓名1','年龄1','性别1','有','有','有','有','日常饮食1','备注1','2022-03-09'),(42,'2022-03-09 13:40:42','学号2','姓名2','年龄2','性别2','有','有','有','有','日常饮食2','备注2','2022-03-09'),(43,'2022-03-09 13:40:42','学号3','姓名3','年龄3','性别3','有','有','有','有','日常饮食3','备注3','2022-03-09'),(44,'2022-03-09 13:40:42','学号4','姓名4','年龄4','性别4','有','有','有','有','日常饮食4','备注4','2022-03-09'),(45,'2022-03-09 13:40:42','学号5','姓名5','年龄5','性别5','有','有','有','有','日常饮食5','备注5','2022-03-09'),(46,'2022-03-09 13:40:42','学号6','姓名6','年龄6','性别6','有','有','有','有','日常饮食6','备注6','2022-03-09'),(1646834032329,'2022-03-09 13:53:51','11','时代','11','女','无','无','无','无','蓄势待发时代发生发送到发送到发送到','水电费时代发送到发送到发送到发送到发送到发送到','2022-03-09');
/*!40000 ALTER TABLE `jiankangdangan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='通知公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (121,'2022-03-09 13:40:42','有梦想，就要努力去实现','不管你想要怎样的生活，你都要去努力争取，不多尝试一些事情怎么知道自己适合什么、不适合什么呢?你说你喜欢读书，让我给你列书单，你还问我哪里有那么多时间看书;你说自己梦想的职业是广告文案，问我如何成为一个文案，应该具备哪些素质;你说你计划晨跑，但总是因为学习、工作辛苦或者身体不舒服第二天起不了床;你说你一直梦想一个人去长途旅行，但是没钱，父母觉得危险。','upload/news_picture1.jpg','<p>不管你想要怎样的生活，你都要去努力争取，不多尝试一些事情怎么知道自己适合什么、不适合什么呢?</p><p>你说你喜欢读书，让我给你列书单，你还问我哪里有那么多时间看书;你说自己梦想的职业是广告文案，问我如何成为一个文案，应该具备哪些素质;你说你计划晨跑，但总是因为学习、工作辛苦或者身体不舒服第二天起不了床;你说你一直梦想一个人去长途旅行，但是没钱，父母觉得危险。其实，我已经厌倦了你这样说说而已的把戏，我觉得就算我告诉你如何去做，你也不会照做，因为你根本什么都不做。</p><p>真正有行动力的人不需要别人告诉他如何做，因为他已经在做了。就算碰到问题，他也会自己想办法，自己动手去解决或者主动寻求可以帮助他的人，而不是等着别人为自己解决问题。</p><p>首先要学习独立思考。花一点时间想一下自己喜欢什么，梦想是什么，不要别人说想环游世界，你就说你的梦想是环游世界。</p><p>很多人说现实束缚了自己，其实在这个世界上，我们一直都可以有很多选择，生活的决定权也—直都在自己手上，只是我们缺乏行动力而已。</p><p>如果你觉得安于现状是你想要的，那选择安于现状就会让你幸福和满足;如果你不甘平庸，选择一条改变、进取和奋斗的道路，在这个追求的过程中，你也一样会感到快乐。所谓的成功，即是按照自己想要的生活方式生活。最糟糕的状态，莫过于当你想要选择一条不甘平庸、改变、进取和奋斗的道路时，却以一种安于现状的方式生活，最后抱怨自己没有得到想要的人生。</p><p>因为喜欢，你不是在苦苦坚持，也因为喜欢，你愿意投入时间、精力，长久以往，获得成功就是自然而然的事情。</p><p><br></p><p><img src=\"http://localhost:8080/ssmn2tzw/upload/1646834311237.jpg\"></p>'),(122,'2022-03-09 13:40:42','又是一年毕业季','又是一年毕业季，感慨万千，还记的自己刚进学校那时候的情景，我拖着沉重的行李箱站在偌大的教学楼前面，感叹自己未来的日子即将在这个陌生的校园里度过，而如今斗转星移，浮光掠影，弹指之间，那些青葱岁月如同白驹过隙般悄然从指缝溜走。过去的种种在胸口交集纠结，像打翻的五味瓶，甜蜜，酸楚，苦涩，一并涌上心头。','upload/news_picture2.jpg','<p>又是一年毕业季，感慨万千，还记的自己刚进学校那时候的情景，我拖着沉重的行李箱站在偌大的教学楼前面，感叹自己未来的日子即将在这个陌生的校园里度过，而如今斗转星移，浮光掠影，弹指之间，那些青葱岁月如同白驹过隙般悄然从指缝溜走。</p><p>过去的种种在胸口交集纠结，像打翻的五味瓶，甜蜜，酸楚，苦涩，一并涌上心头。一直都是晚会的忠实参与者，无论是台前还是幕后，忽然间，角色转变，那种感觉确实难以用语言表达。</p><p>	过去的三年，总是默默地期盼着这个好雨时节，因为这时候，会有灿烂的阳光，会有满目的百花争艳，会有香甜的冰激凌，这是个毕业的季节，当时不经世事的我们会殷切地期待学校那一大堆的活动，期待穿上绚丽的演出服或者礼仪服，站在大礼堂镁光灯下尽情挥洒我们的澎拜的激情。</p><p>百感交集，隔岸观火与身临其境的感觉竟是如此不同。从来没想过一场晚会送走的是我们自己的时候会是怎样的感情，毕业就真的意味着结束吗?倔强的我们不愿意承认，谢谢学弟学妹们慷慨的将这次的主题定为“我们在这里”。我知道，这可能是他们对我们这些过来人的尊敬和施舍。</p><p>没有为这场晚会排练、奔波，没有为班级、学生会、文学院出点力，还真有点不习惯，百般无奈中，用“工作忙”个万能的借口来搪塞自己，欺骗别人。其实自己心里明白，那只是在逃避，只是不愿面对繁华落幕后的萧条和落寞。大四了，大家各奔东西，想凑齐班上的人真的是难上加难，敏燕从越南回来，刚落地就匆匆回了学校，那么恋家的人也启程回来了，睿睿学姐也是从家赶来跟我们团圆。大家—如既往的寒暄、打趣、调侃对方，似乎一切又回到了当初的单纯美好。</p><p>看着舞台上活泼可爱的学弟学妹们，如同一群机灵的小精灵，清澈的眼神，稚嫩的肢体，轻快地步伐，用他们那热情洋溢的舞姿渲染着在场的每一个人，我知道，我不应该羡慕嫉妒他们，不应该顾自怜惜逝去的青春，不应该感叹夕阳无限好，曾经，我们也拥有过，曾经，我们也年轻过，曾经，我们也灿烂过。我深深地告诉自己，人生的每个阶段都是美的，年轻有年轻的活力，成熟也有成熟的魅力。多—份稳重、淡然、优雅，也是漫漫时光掠影遗留下的.珍贵赏赐。</p>'),(123,'2022-03-09 13:40:42','挫折路上，坚持常在心间','回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。','upload/news_picture3.jpg','<p>回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?</p><p>清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。</p><p>是的，面对道途上那无情的嘲讽，面对步伐中那重复的摔跤，面对激流与硬石之间猛烈的碰撞，我们必须选择那富于阴雨，却最终见到彩虹的荆棘路。也许，经历了那暴风雨的洗礼，我们便会变得自信，幸福也随之而来。</p><p>司马迁屡遭羞辱，却依然在狱中撰写《史记》，作为一名史学家，不因王权而极度赞赏，也不因卑微而极度批判，然而他在坚持自己操守的同时，却依然要受统治阶级的阻碍，他似乎无权选择自己的本职。但是，他不顾于此，只是在面对道途的阻隔之时，他依然选择了走下去的信念。终于一部开山巨作《史记》诞生，为后人留下一份馈赠，也许在他完成毕生的杰作之时，他微微地笑了，没有什么比梦想实现更快乐的了......</p><p>	或许正如“长风破浪会有时，直挂云帆济沧海”一般，欣欣然地走向看似深渊的崎岖路，而在一番耕耘之后，便会发现这里另有一番天地。也许这就是困难与快乐的交融。</p><p>也许在形形色色的社会中，我们常能看到一份坚持，一份自信，但这里却还有一类人。这类人在暴风雨来临之际，只会闪躲，从未懂得这也是一种历炼，这何尝不是一份快乐。在阴暗的角落里，总是独自在哭，带着伤愁，看不到一点希望。</p><p>我们不能堕落于此，而要像海燕那般，在苍茫的大海上，高傲地飞翔，任何事物都无法阻挡，任何事都是幸福快乐的。</p>'),(124,'2022-03-09 13:40:42','挫折是另一个生命的开端','当遇到挫折或失败，你是看见失败还是看见机会?挫折是我们每个人成长的必经之路，它不是你想有就有，想没有就没有的。有句名言说的好，如果你想一生摆脱苦难，你就得是神或者是死尸。这句话形象地说明了挫折是伴随着人生的，是谁都逃不掉的。','upload/news_picture4.jpg','<p>当遇到挫折或失败，你是看见失败还是看见机会?</p><p>挫折是我们每个人成长的必经之路，它不是你想有就有，想没有就没有的。有句名言说的好，如果你想一生摆脱苦难，你就得是神或者是死尸。这句话形象地说明了挫折是伴随着人生的，是谁都逃不掉的。</p><p>人生在世，从古到今，不分天子平民，机遇虽有不同，但总不免有身陷困境或遭遇难题之处，这时候唯有通权达变，才能使人转危为安，甚至反败为胜。</p><p>大部分的人，一生当中，最痛苦的经验是失去所爱的人，其次是丢掉一份工作。其实，经得起考验的人，就算是被开除也不会惊慌，要学会面对。</p><p>	“塞翁失马，焉知非福。”人生的道路，并不是每一步都迈向成功，这就是追求的意义。我们还要认识到一点，挫折作为一种情绪状态和一种个人体验，各人的耐受性是大不相同的，有的人经历了一次次挫折，就能够坚忍不拔，百折不挠;有的人稍遇挫折便意志消沉，一蹶不振。所以，挫折感是一种主观感受，因为人的目的和需要不同，成功标准不同，所以同一种活动对于不同的人可能会造成不同的挫折感受。</p><p>凡事皆以平常心来看待，对于生命顺逆不要太执著。能够“破我执”是很高层的人生境界。</p><p>人事的艰难就是一种考验。就像—支剑要有磨刀来磨，剑才会利:一块璞玉要有粗石来磨，才会发出耀眼的光芒。我们能够做到的，只是如何减少、避免那些由于自身的原因所造成的挫折，而在遇到痛苦和挫折之后，则力求化解痛苦，争取幸福。我们要知道，痛苦和挫折是双重性的，它既是我们人生中难以完全避免的，也是我们在争取成功时，不可缺少的一种动力。因为我认为，推动我们奋斗的力量，不仅仅是对成功的渴望，还有为摆脱痛苦和挫折而进行的奋斗。</p>'),(125,'2022-03-09 13:40:42','你要去相信，没有到不了的明天','有梦想就去努力，因为在这一辈子里面，现在不去勇敢的努力，也许就再也没有机会了。你要去相信，一定要相信，没有到不了的明天。不要被命运打败，让自己变得更强大。不管你现在是一个人走在异乡的街道上始终没有找到一丝归属感，还是你在跟朋友们一起吃饭开心址笑着的时候闪过一丝落寞。','upload/news_picture5.jpg','<p>有梦想就去努力，因为在这一辈子里面，现在不去勇敢的努力，也许就再也没有机会了。你要去相信，一定要相信，没有到不了的明天。不要被命运打败，让自己变得更强大。</p><p>不管你现在是一个人走在异乡的街道上始终没有找到一丝归属感，还是你在跟朋友们一起吃饭开心址笑着的时候闪过一丝落寞。</p><p>	不管你现在是在图书馆里背着怎么也看不进去的英语单词，还是你现在迷茫地看不清未来的方向不知道要往哪走。</p><p>不管你现在是在努力着去实现梦想却没能拉近与梦想的距离，还是你已经慢慢地找不到自己的梦想了。</p><p>你都要去相信，没有到不了的明天。</p><p>	有的时候你的梦想太大，别人说你的梦想根本不可能实现;有的时候你的梦想又太小，又有人说你胸无大志;有的时候你对死党说着将来要去环游世界的梦想，却换来他的不屑一顾，于是你再也不提自己的梦想;有的时候你突然说起将来要开个小店的愿望，却发现你讲述的那个人，并没有听到你在说什么。</p><p>不过又能怎么样呢，未来始终是自己的，梦想始终是自己的，没有人会来帮你实现它。</p><p>也许很多时候我们只是需要朋友的一句鼓励，一句安慰，却也得不到。但是相信我，世界上还有很多人，只是想要和你说说话。</p><p>因为我们都一样。一样的被人说成固执，一样的在追逐他们眼里根本不在意的东西。</p><p>所以，又有什么关系呢，别人始终不是你、不能懂你的心情，你又何必多去解释呢。这个世界会来阻止你，困难也会接踵而至，其实真正关键的只有自己，有没有那个倔强。</p><p>这个世界上没有不带伤的人，真正能治愈自己的，只有自己。</p>'),(126,'2022-03-09 13:40:42','离开是一种痛苦，是一种勇气，但同样也是一个考验，是一个新的开端','无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。','upload/news_picture6.jpg','<p>无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。离别的确是一种痛苦，但同样也是我们走入社会，走向新环境、新领域的一个开端，希望大家在以后新的工作岗位上能够确定自己的新起点，坚持不懈，向着更新、更高的目标前进，因为人生最美好的东西永远都在最前方!</p><p>忆往昔峥嵘岁月，看今朝潮起潮落，望未来任重而道远。作为新时代的我们，就应在失败时，能拼搏奋起，去谱写人生的辉煌。在成功时，亦能居安思危，不沉湎于一时的荣耀、鲜花和掌声中，时时刻刻怀着一颗积极寻找自己新的奶酪的心，处变不惊、成败不渝，始终踏着自己坚实的步伐，从零开始，不断向前迈进，这样才能在这风起云涌、变幻莫测的社会大潮中成为真正的弄潮儿!</p>');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1646834377884 DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
INSERT INTO `storeup` VALUES (1646834332800,'2022-03-09 13:58:51',1646833986396,1646834210840,'banhuizuzhi','水电费时代','upload/1646834197819.jpg','1',NULL),(1646834335064,'2022-03-09 13:58:54',1646833986396,1646834210840,'banhuizuzhi','水电费时代','upload/1646834197819.jpg','21',NULL);
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1646833986396,'11','xuesheng','学生','owzzm9q08c49r3obpypyciq05stz1do2','2022-03-09 13:53:22','2022-03-09 15:00:16'),(2,1646833997854,'22','banwei','班委','w7b7dffr5soy2d28teg5e5ax9z3pexa4','2022-03-09 13:53:59','2022-03-09 15:00:23'),(3,1,'abo','users','管理员','vado10mi85khwkt0loep2xrrhfqfolzv','2022-03-09 13:56:01','2022-03-09 15:00:00');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-03-09 13:40:42');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wenhuaxuexi`
--

DROP TABLE IF EXISTS `wenhuaxuexi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wenhuaxuexi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `jianjie` longtext COMMENT '简介',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `neirong` longtext COMMENT '内容',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1646834293408 DEFAULT CHARSET=utf8 COMMENT='文化学习';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wenhuaxuexi`
--

LOCK TABLES `wenhuaxuexi` WRITE;
/*!40000 ALTER TABLE `wenhuaxuexi` DISABLE KEYS */;
INSERT INTO `wenhuaxuexi` VALUES (101,'2022-03-09 13:40:42','标题1','简介1','2022-03-09','upload/wenhuaxuexi_fengmian1.jpg','内容1',1,1,'2022-03-09 21:40:42',1),(102,'2022-03-09 13:40:42','标题2','简介2','2022-03-09','upload/wenhuaxuexi_fengmian2.jpg','内容2',2,2,'2022-03-09 21:40:42',2),(103,'2022-03-09 13:40:42','标题3','简介3','2022-03-09','upload/wenhuaxuexi_fengmian3.jpg','内容3',3,3,'2022-03-09 21:40:42',3),(104,'2022-03-09 13:40:42','标题4','简介4','2022-03-09','upload/wenhuaxuexi_fengmian4.jpg','内容4',4,4,'2022-03-09 21:40:42',4),(105,'2022-03-09 13:40:42','标题5','简介5','2022-03-09','upload/wenhuaxuexi_fengmian5.jpg','内容5',5,5,'2022-03-09 21:40:42',5),(106,'2022-03-09 13:40:42','标题6','简介6','2022-03-09','upload/wenhuaxuexi_fengmian6.jpg','内容6',6,6,'2022-03-09 21:40:42',6),(1646834293407,'2022-03-09 13:58:12','水电费时代','时代发多少发送到发送到发送到','2022-03-09','upload/1646834288628.jpeg','<p>时代发多少发多少发送到发送到发送到时代</p>',0,0,'2022-03-09 21:59:53',4);
/*!40000 ALTER TABLE `wenhuaxuexi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuesheng`
--

DROP TABLE IF EXISTS `xuesheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) NOT NULL COMMENT '学号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `banji` varchar(200) NOT NULL COMMENT '班级',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xuehao` (`xuehao`)
) ENGINE=InnoDB AUTO_INCREMENT=1646833986397 DEFAULT CHARSET=utf8 COMMENT='学生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuesheng`
--

LOCK TABLES `xuesheng` WRITE;
/*!40000 ALTER TABLE `xuesheng` DISABLE KEYS */;
INSERT INTO `xuesheng` VALUES (11,'2022-03-09 13:40:42','学号1','123456','姓名1',1,'男','13823888881','班级1','upload/xuesheng_zhaopian1.jpg'),(12,'2022-03-09 13:40:42','学号2','123456','姓名2',2,'男','13823888882','班级2','upload/xuesheng_zhaopian2.jpg'),(13,'2022-03-09 13:40:42','学号3','123456','姓名3',3,'男','13823888883','班级3','upload/xuesheng_zhaopian3.jpg'),(14,'2022-03-09 13:40:42','学号4','123456','姓名4',4,'男','13823888884','班级4','upload/xuesheng_zhaopian4.jpg'),(15,'2022-03-09 13:40:42','学号5','123456','姓名5',5,'男','13823888885','班级5','upload/xuesheng_zhaopian5.jpg'),(16,'2022-03-09 13:40:42','学号6','123456','姓名6',6,'男','13823888886','班级6','upload/xuesheng_zhaopian6.jpg'),(1646833986396,'2022-03-09 13:53:06','11','11','时代',11,'女','11122211111','2班','upload/1646834009640.jpg');
/*!40000 ALTER TABLE `xuesheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xueshengchengji`
--

DROP TABLE IF EXISTS `xueshengchengji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xueshengchengji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `chengji` varchar(200) DEFAULT NULL COMMENT '成绩',
  `pingyu` longtext COMMENT '评语',
  `dengjiriqi` date DEFAULT NULL COMMENT '登记日期',
  `banweizhanghao` varchar(200) DEFAULT NULL COMMENT '班委账号',
  `banweixingming` varchar(200) DEFAULT NULL COMMENT '班委姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1646834060992 DEFAULT CHARSET=utf8 COMMENT='学生成绩';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xueshengchengji`
--

LOCK TABLES `xueshengchengji` WRITE;
/*!40000 ALTER TABLE `xueshengchengji` DISABLE KEYS */;
INSERT INTO `xueshengchengji` VALUES (71,'2022-03-09 13:40:42','学号1','姓名1','班级1','成绩1','评语1','2022-03-09','班委账号1','班委姓名1'),(72,'2022-03-09 13:40:42','学号2','姓名2','班级2','成绩2','评语2','2022-03-09','班委账号2','班委姓名2'),(73,'2022-03-09 13:40:42','学号3','姓名3','班级3','成绩3','评语3','2022-03-09','班委账号3','班委姓名3'),(74,'2022-03-09 13:40:42','学号4','姓名4','班级4','成绩4','评语4','2022-03-09','班委账号4','班委姓名4'),(75,'2022-03-09 13:40:42','学号5','姓名5','班级5','成绩5','评语5','2022-03-09','班委账号5','班委姓名5'),(76,'2022-03-09 13:40:42','学号6','姓名6','班级6','成绩6','评语6','2022-03-09','班委账号6','班委姓名6'),(1646834060244,'2022-03-09 13:54:20','11','时代','2班','22','时代佛挡杀佛时代发送到发送到发送到发送到发送到','2022-03-09','22','地方');
/*!40000 ALTER TABLE `xueshengchengji` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-09 22:37:14
