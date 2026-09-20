-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: cl1121704
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
-- Current Database: `cl1121704`
--

/*!40000 DROP DATABASE IF EXISTS `cl1121704`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `cl1121704` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `cl1121704`;

--
-- Table structure for table `baogaoxinxi`
--

DROP TABLE IF EXISTS `baogaoxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `baogaoxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jianchaxiangmu` varchar(200) DEFAULT NULL COMMENT '检查项目',
  `jianchabaogao` longtext COMMENT '检查报告',
  `baogaojieguo` longtext COMMENT '报告结果',
  `baogaojianjie` varchar(200) DEFAULT NULL COMMENT '报告简介',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `yishengzhanghao` varchar(200) DEFAULT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) DEFAULT NULL COMMENT '医生姓名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=217 DEFAULT CHARSET=utf8 COMMENT='报告信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baogaoxinxi`
--

LOCK TABLES `baogaoxinxi` WRITE;
/*!40000 ALTER TABLE `baogaoxinxi` DISABLE KEYS */;
INSERT INTO `baogaoxinxi` VALUES (211,'2024-02-25 13:48:18','检查项目1','','报告结果1','报告简介1','用户账号1','用户姓名1','医生账号1','医生姓名1',1),(212,'2024-02-25 13:48:18','检查项目2','','报告结果2','报告简介2','用户账号2','用户姓名2','医生账号2','医生姓名2',2),(213,'2024-02-25 13:48:18','检查项目3','','报告结果3','报告简介3','用户账号3','用户姓名3','医生账号3','医生姓名3',3),(214,'2024-02-25 13:48:18','检查项目4','','报告结果4','报告简介4','用户账号4','用户姓名4','医生账号4','医生姓名4',4),(215,'2024-02-25 13:48:18','检查项目5','','报告结果5','报告简介5','用户账号5','用户姓名5','医生账号5','医生姓名5',5),(216,'2024-02-25 13:48:18','检查项目6','','报告结果6','报告简介6','用户账号6','用户姓名6','医生账号6','医生姓名6',6);
/*!40000 ALTER TABLE `baogaoxinxi` ENABLE KEYS */;
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
INSERT INTO `config` VALUES (1,'swiper1','file/swiperPicture1.jpg'),(2,'swiper2','file/swiperPicture2.jpg'),(3,'swiper3','file/swiperPicture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussyiliaozhishi`
--

DROP TABLE IF EXISTS `discussyiliaozhishi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussyiliaozhishi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COMMENT '头像',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='医疗知识评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussyiliaozhishi`
--

LOCK TABLES `discussyiliaozhishi` WRITE;
/*!40000 ALTER TABLE `discussyiliaozhishi` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussyiliaozhishi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guahao`
--

DROP TABLE IF EXISTS `guahao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guahao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) DEFAULT NULL COMMENT '预约编号',
  `yishengzhanghao` varchar(200) DEFAULT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) DEFAULT NULL COMMENT '医生姓名',
  `keshi` varchar(200) DEFAULT NULL COMMENT '科室',
  `guahaofei` double DEFAULT NULL COMMENT '挂号费',
  `shuliang` varchar(200) DEFAULT NULL COMMENT '挂号数量',
  `yuyueshijian` datetime DEFAULT NULL COMMENT '预约时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  `ispay` varchar(200) DEFAULT NULL COMMENT '是否支付',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuyuebianhao` (`yuyuebianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=177 DEFAULT CHARSET=utf8 COMMENT='挂号';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guahao`
--

LOCK TABLES `guahao` WRITE;
/*!40000 ALTER TABLE `guahao` DISABLE KEYS */;
INSERT INTO `guahao` VALUES (171,'2024-02-25 13:48:18','1111111111','医生账号1','医生姓名1','科室1',1,'挂号数量1','2024-02-25 21:48:18','用户账号1','用户姓名1','手机号码1','未支付'),(172,'2024-02-25 13:48:18','2222222222','医生账号2','医生姓名2','科室2',2,'挂号数量2','2024-02-25 21:48:18','用户账号2','用户姓名2','手机号码2','未支付'),(173,'2024-02-25 13:48:18','3333333333','医生账号3','医生姓名3','科室3',3,'挂号数量3','2024-02-25 21:48:18','用户账号3','用户姓名3','手机号码3','未支付'),(174,'2024-02-25 13:48:18','4444444444','医生账号4','医生姓名4','科室4',4,'挂号数量4','2024-02-25 21:48:18','用户账号4','用户姓名4','手机号码4','未支付'),(175,'2024-02-25 13:48:18','5555555555','医生账号5','医生姓名5','科室5',5,'挂号数量5','2024-02-25 21:48:18','用户账号5','用户姓名5','手机号码5','未支付'),(176,'2024-02-25 13:48:18','6666666666','医生账号6','医生姓名6','科室6',6,'挂号数量6','2024-02-25 21:48:18','用户账号6','用户姓名6','手机号码6','未支付');
/*!40000 ALTER TABLE `guahao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hpvyimiao`
--

DROP TABLE IF EXISTS `hpvyimiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hpvyimiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yimiaobianhao` varchar(200) NOT NULL COMMENT '疫苗编号',
  `yimiaomingcheng` varchar(200) DEFAULT NULL COMMENT '疫苗名称',
  `yimiaoleixing` varchar(200) DEFAULT NULL COMMENT '疫苗类型',
  `picihao` varchar(200) DEFAULT NULL COMMENT '批次号',
  `tupian` longtext COMMENT '图片',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `shengchanriqi` date DEFAULT NULL COMMENT '生产日期',
  `baozhiqi` varchar(200) DEFAULT NULL COMMENT '保质期',
  `shengchanchangshang` varchar(200) DEFAULT NULL COMMENT '生产厂商',
  `storeupnum` int(11) DEFAULT NULL COMMENT '收藏数量',
  `jiezhongliucheng` longtext COMMENT '接种流程',
  `fuzuoyong` longtext COMMENT '副作用',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yimiaobianhao` (`yimiaobianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='hpv疫苗';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hpvyimiao`
--

LOCK TABLES `hpvyimiao` WRITE;
/*!40000 ALTER TABLE `hpvyimiao` DISABLE KEYS */;
INSERT INTO `hpvyimiao` VALUES (51,'2024-02-25 13:48:17','1111111111','疫苗名称1','2阶','批次号1','file/hpvyimiaoTupian1.jpg,file/hpvyimiaoTupian2.jpg,file/hpvyimiaoTupian3.jpg',1,'2024-02-25','保质期1','生产厂商1',1,'接种流程1','副作用1'),(52,'2024-02-25 13:48:17','2222222222','疫苗名称2','2阶','批次号2','file/hpvyimiaoTupian2.jpg,file/hpvyimiaoTupian3.jpg,file/hpvyimiaoTupian4.jpg',2,'2024-02-25','保质期2','生产厂商2',2,'接种流程2','副作用2'),(53,'2024-02-25 13:48:17','3333333333','疫苗名称3','2阶','批次号3','file/hpvyimiaoTupian3.jpg,file/hpvyimiaoTupian4.jpg,file/hpvyimiaoTupian5.jpg',3,'2024-02-25','保质期3','生产厂商3',3,'接种流程3','副作用3'),(54,'2024-02-25 13:48:17','4444444444','疫苗名称4','2阶','批次号4','file/hpvyimiaoTupian4.jpg,file/hpvyimiaoTupian5.jpg,file/hpvyimiaoTupian6.jpg',4,'2024-02-25','保质期4','生产厂商4',4,'接种流程4','副作用4'),(55,'2024-02-25 13:48:17','5555555555','疫苗名称5','2阶','批次号5','file/hpvyimiaoTupian5.jpg,file/hpvyimiaoTupian6.jpg,file/hpvyimiaoTupian7.jpg',5,'2024-02-25','保质期5','生产厂商5',5,'接种流程5','副作用5'),(56,'2024-02-25 13:48:17','6666666666','疫苗名称6','2阶','批次号6','file/hpvyimiaoTupian6.jpg,file/hpvyimiaoTupian7.jpg,file/hpvyimiaoTupian8.jpg',6,'2024-02-25','保质期6','生产厂商6',6,'接种流程6','副作用6');
/*!40000 ALTER TABLE `hpvyimiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hpvyimiaoyuyue`
--

DROP TABLE IF EXISTS `hpvyimiaoyuyue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hpvyimiaoyuyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yimiaobianhao` varchar(200) DEFAULT NULL COMMENT '疫苗编号',
  `yimiaomingcheng` varchar(200) DEFAULT NULL COMMENT '疫苗名称',
  `yimiaoleixing` varchar(200) DEFAULT NULL COMMENT '疫苗类型',
  `picihao` varchar(200) DEFAULT NULL COMMENT '批次号',
  `shengchanriqi` varchar(200) DEFAULT NULL COMMENT '生产日期',
  `baozhiqi` varchar(200) DEFAULT NULL COMMENT '保质期',
  `shengchanchangshang` varchar(200) DEFAULT NULL COMMENT '生产厂商',
  `yuyueshijian` datetime DEFAULT NULL COMMENT '预约时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='hpv疫苗预约';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hpvyimiaoyuyue`
--

LOCK TABLES `hpvyimiaoyuyue` WRITE;
/*!40000 ALTER TABLE `hpvyimiaoyuyue` DISABLE KEYS */;
INSERT INTO `hpvyimiaoyuyue` VALUES (71,'2024-02-25 13:48:17','疫苗编号1','疫苗名称1','疫苗类型1','批次号1','生产日期1','保质期1','生产厂商1','2024-02-25 21:48:17','用户账号1','用户姓名1','性别1'),(72,'2024-02-25 13:48:17','疫苗编号2','疫苗名称2','疫苗类型2','批次号2','生产日期2','保质期2','生产厂商2','2024-02-25 21:48:17','用户账号2','用户姓名2','性别2'),(73,'2024-02-25 13:48:17','疫苗编号3','疫苗名称3','疫苗类型3','批次号3','生产日期3','保质期3','生产厂商3','2024-02-25 21:48:17','用户账号3','用户姓名3','性别3'),(74,'2024-02-25 13:48:17','疫苗编号4','疫苗名称4','疫苗类型4','批次号4','生产日期4','保质期4','生产厂商4','2024-02-25 21:48:17','用户账号4','用户姓名4','性别4'),(75,'2024-02-25 13:48:17','疫苗编号5','疫苗名称5','疫苗类型5','批次号5','生产日期5','保质期5','生产厂商5','2024-02-25 21:48:17','用户账号5','用户姓名5','性别5'),(76,'2024-02-25 13:48:17','疫苗编号6','疫苗名称6','疫苗类型6','批次号6','生产日期6','保质期6','生产厂商6','2024-02-25 21:48:17','用户账号6','用户姓名6','性别6');
/*!40000 ALTER TABLE `hpvyimiaoyuyue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiankangriji`
--

DROP TABLE IF EXISTS `jiankangriji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiankangriji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `neirong` longtext COMMENT '内容',
  `xiangqing` longtext COMMENT '详情',
  `jilushijian` datetime DEFAULT NULL COMMENT '记录时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=207 DEFAULT CHARSET=utf8 COMMENT='健康日记';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiankangriji`
--

LOCK TABLES `jiankangriji` WRITE;
/*!40000 ALTER TABLE `jiankangriji` DISABLE KEYS */;
INSERT INTO `jiankangriji` VALUES (201,'2024-02-25 13:48:18','标题1','内容1','详情1','2024-02-25 21:48:18','用户账号1','用户姓名1',1),(202,'2024-02-25 13:48:18','标题2','内容2','详情2','2024-02-25 21:48:18','用户账号2','用户姓名2',2),(203,'2024-02-25 13:48:18','标题3','内容3','详情3','2024-02-25 21:48:18','用户账号3','用户姓名3',3),(204,'2024-02-25 13:48:18','标题4','内容4','详情4','2024-02-25 21:48:18','用户账号4','用户姓名4',4),(205,'2024-02-25 13:48:18','标题5','内容5','详情5','2024-02-25 21:48:18','用户账号5','用户姓名5',5),(206,'2024-02-25 13:48:18','标题6','内容6','详情6','2024-02-25 21:48:18','用户账号6','用户姓名6',6);
/*!40000 ALTER TABLE `jiankangriji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiankangtijian`
--

DROP TABLE IF EXISTS `jiankangtijian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiankangtijian` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tijianxiangmu` varchar(200) DEFAULT NULL COMMENT '体检项目',
  `tijianfenlei` varchar(200) DEFAULT NULL COMMENT '体检分类',
  `tijiantupian` longtext COMMENT '体检图片',
  `tijiandidian` varchar(200) DEFAULT NULL COMMENT '体检地点',
  `tijianfeiyong` double DEFAULT NULL COMMENT '体检费用',
  `tijianliucheng` longtext COMMENT '体检流程',
  `yishengzhanghao` varchar(200) DEFAULT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) DEFAULT NULL COMMENT '医生姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='健康体检';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiankangtijian`
--

LOCK TABLES `jiankangtijian` WRITE;
/*!40000 ALTER TABLE `jiankangtijian` DISABLE KEYS */;
INSERT INTO `jiankangtijian` VALUES (91,'2024-02-25 13:48:18','体检项目1','体检分类1','file/jiankangtijianTijiantupian1.jpg,file/jiankangtijianTijiantupian2.jpg,file/jiankangtijianTijiantupian3.jpg','体检地点1',1,'体检流程1','医生账号1','医生姓名1'),(92,'2024-02-25 13:48:18','体检项目2','体检分类2','file/jiankangtijianTijiantupian2.jpg,file/jiankangtijianTijiantupian3.jpg,file/jiankangtijianTijiantupian4.jpg','体检地点2',2,'体检流程2','医生账号2','医生姓名2'),(93,'2024-02-25 13:48:18','体检项目3','体检分类3','file/jiankangtijianTijiantupian3.jpg,file/jiankangtijianTijiantupian4.jpg,file/jiankangtijianTijiantupian5.jpg','体检地点3',3,'体检流程3','医生账号3','医生姓名3'),(94,'2024-02-25 13:48:18','体检项目4','体检分类4','file/jiankangtijianTijiantupian4.jpg,file/jiankangtijianTijiantupian5.jpg,file/jiankangtijianTijiantupian6.jpg','体检地点4',4,'体检流程4','医生账号4','医生姓名4'),(95,'2024-02-25 13:48:18','体检项目5','体检分类5','file/jiankangtijianTijiantupian5.jpg,file/jiankangtijianTijiantupian6.jpg,file/jiankangtijianTijiantupian7.jpg','体检地点5',5,'体检流程5','医生账号5','医生姓名5'),(96,'2024-02-25 13:48:18','体检项目6','体检分类6','file/jiankangtijianTijiantupian6.jpg,file/jiankangtijianTijiantupian7.jpg,file/jiankangtijianTijiantupian8.jpg','体检地点6',6,'体检流程6','医生账号6','医生姓名6');
/*!40000 ALTER TABLE `jiankangtijian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `keshi`
--

DROP TABLE IF EXISTS `keshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `keshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `keshi` varchar(200) NOT NULL COMMENT '科室',
  PRIMARY KEY (`id`),
  UNIQUE KEY `keshi` (`keshi`)
) ENGINE=InnoDB AUTO_INCREMENT=187 DEFAULT CHARSET=utf8 COMMENT='科室';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `keshi`
--

LOCK TABLES `keshi` WRITE;
/*!40000 ALTER TABLE `keshi` DISABLE KEYS */;
INSERT INTO `keshi` VALUES (181,'2024-02-25 13:48:18','科室1'),(182,'2024-02-25 13:48:18','科室2'),(183,'2024-02-25 13:48:18','科室3'),(184,'2024-02-25 13:48:18','科室4'),(185,'2024-02-25 13:48:18','科室5'),(186,'2024-02-25 13:48:18','科室6');
/*!40000 ALTER TABLE `keshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `menujson` longtext COMMENT '菜单',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='菜单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (1,'2024-02-25 13:48:18','[{\"backMenu\":[{\"child\":[{\"appFrontIcon\":\"cuIcon-similar\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"科室\",\"menuJump\":\"列表\",\"tableName\":\"keshi\"},{\"appFrontIcon\":\"cuIcon-goodsnew\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\",\"挂号\"],\"menu\":\"预约挂号\",\"menuJump\":\"列表\",\"tableName\":\"yuyueguahao\"},{\"appFrontIcon\":\"cuIcon-newshot\",\"buttons\":[\"查看\",\"删除\"],\"menu\":\"挂号\",\"menuJump\":\"列表\",\"tableName\":\"guahao\"}],\"fontClass\":\"icon-common36\",\"menu\":\"预约挂号管理\",\"unicode\":\"&#xee9f;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-send\",\"buttons\":[\"查看\",\"删除\"],\"menu\":\"新冠疫苗预约\",\"menuJump\":\"列表\",\"tableName\":\"xinguanyimiaoyuyue\"},{\"appFrontIcon\":\"cuIcon-pay\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"新冠疫苗\",\"menuJump\":\"列表\",\"tableName\":\"xinguanyimiao\"}],\"fontClass\":\"icon-common23\",\"menu\":\"新冠疫苗管理\",\"unicode\":\"&#xee05;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-wenzi\",\"buttons\":[\"查看\",\"删除\"],\"menu\":\"在线交流\",\"menuJump\":\"列表\",\"tableName\":\"zaixianjiaoliu\"}],\"fontClass\":\"icon-common16\",\"menu\":\"在线交流管理\",\"unicode\":\"&#xedfd;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-newshot\",\"buttons\":[\"查看\",\"删除\"],\"menu\":\"健康体检\",\"menuJump\":\"列表\",\"tableName\":\"jiankangtijian\"},{\"appFrontIcon\":\"cuIcon-goodsnew\",\"buttons\":[\"查看\",\"删除\"],\"menu\":\"体检预约\",\"menuJump\":\"列表\",\"tableName\":\"tijianyuyue\"},{\"appFrontIcon\":\"cuIcon-attentionfavor\",\"buttons\":[\"查看\",\"删除\"],\"menu\":\"体检报告\",\"menuJump\":\"列表\",\"tableName\":\"tijianbaogao\"},{\"appFrontIcon\":\"cuIcon-vipcard\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"体检分类\",\"menuJump\":\"列表\",\"tableName\":\"tijianfenlei\"}],\"fontClass\":\"icon-common45\",\"menu\":\"健康体检管理\",\"unicode\":\"&#xef3b;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-vip\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"hpv疫苗\",\"menuJump\":\"列表\",\"tableName\":\"hpvyimiao\"},{\"appFrontIcon\":\"cuIcon-pay\",\"buttons\":[\"查看\",\"删除\"],\"menu\":\"hpv疫苗预约\",\"menuJump\":\"列表\",\"tableName\":\"hpvyimiaoyuyue\"}],\"fontClass\":\"icon-common18\",\"menu\":\"hpv疫苗管理\",\"unicode\":\"&#xedff;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-attentionfavor\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"轮播图\",\"menuJump\":\"列表\",\"tableName\":\"config\"}],\"fontClass\":\"icon-common35\",\"menu\":\"管理员管理\",\"unicode\":\"&#xee8c;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-time\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"知识类型\",\"menuJump\":\"列表\",\"tableName\":\"zhishileixing\"},{\"appFrontIcon\":\"cuIcon-goods\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\",\"查看评论\"],\"menu\":\"医疗知识\",\"menuJump\":\"列表\",\"tableName\":\"yiliaozhishi\"}],\"fontClass\":\"icon-common34\",\"menu\":\"医疗知识管理\",\"unicode\":\"&#xee85;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-paint\",\"buttons\":[\"查看\",\"删除\"],\"menu\":\"健康日记\",\"menuJump\":\"列表\",\"tableName\":\"jiankangriji\"}],\"fontClass\":\"icon-common18\",\"menu\":\"健康日记管理\",\"unicode\":\"&#xedff;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-qrcode\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"用户\",\"menuJump\":\"列表\",\"tableName\":\"yonghu\"},{\"appFrontIcon\":\"cuIcon-rank\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"医生\",\"menuJump\":\"列表\",\"tableName\":\"yisheng\"}],\"fontClass\":\"icon-user3\",\"menu\":\"用户管理\",\"unicode\":\"&#xef99;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-shop\",\"buttons\":[\"查看\",\"删除\"],\"menu\":\"报告信息\",\"menuJump\":\"列表\",\"tableName\":\"baogaoxinxi\"}],\"fontClass\":\"icon-common38\",\"menu\":\"报告信息管理\",\"unicode\":\"&#xeeb2;\"}],\"frontMenu\":[{\"child\":[{\"appFrontIcon\":\"cuIcon-time\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-common13\",\"menu\":\"报告信息\",\"menuJump\":\"列表\",\"tableName\":\"baogaoxinxi\",\"unicode\":\"&#xedf7;\"}],\"fontClass\":\"icon-common13\",\"menu\":\"报告信息\",\"unicode\":\"&#xedf7;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-pic\",\"buttons\":[\"预约\",\"查看\"],\"fontClass\":\"icon-common28\",\"menu\":\"新冠疫苗\",\"menuJump\":\"列表\",\"tableName\":\"xinguanyimiao\",\"unicode\":\"&#xee2d;\"}],\"fontClass\":\"icon-common28\",\"menu\":\"新冠疫苗预约\",\"unicode\":\"&#xee2d;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-medal\",\"buttons\":[\"查看\",\"预约\"],\"fontClass\":\"icon-common18\",\"menu\":\"hpv疫苗\",\"menuJump\":\"列表\",\"tableName\":\"hpvyimiao\",\"unicode\":\"&#xedff;\"}],\"fontClass\":\"icon-common18\",\"menu\":\"hpv疫苗预约\",\"unicode\":\"&#xedff;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-brand\",\"buttons\":[\"挂号\"],\"menu\":\"预约挂号\",\"menuJump\":\"列表\",\"tableName\":\"yuyueguahao\"}],\"menu\":\"挂号预约管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-shop\",\"buttons\":[\"查看\",\"预约\"],\"fontClass\":\"icon-common22\",\"menu\":\"健康体检\",\"menuJump\":\"列表\",\"tableName\":\"jiankangtijian\",\"unicode\":\"&#xee04;\"}],\"fontClass\":\"icon-common22\",\"menu\":\"健康体检\",\"unicode\":\"&#xee04;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-clothes\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-common28\",\"menu\":\"健康日记\",\"menuJump\":\"列表\",\"tableName\":\"jiankangriji\",\"unicode\":\"&#xee2d;\"}],\"fontClass\":\"icon-common28\",\"menu\":\"健康日记\",\"unicode\":\"&#xee2d;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-similar\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-common21\",\"menu\":\"在线交流\",\"menuJump\":\"列表\",\"tableName\":\"zaixianjiaoliu\",\"unicode\":\"&#xee03;\"}],\"fontClass\":\"icon-common21\",\"menu\":\"在线交流\",\"unicode\":\"&#xee03;\"}],\"hasBackLogin\":\"是\",\"hasBackRegister\":\"否\",\"hasFrontLogin\":\"否\",\"hasFrontRegister\":\"否\",\"roleName\":\"管理员\",\"tableName\":\"users\"},{\"backMenu\":[{\"child\":[{\"appFrontIcon\":\"cuIcon-newshot\",\"buttons\":[\"查看\",\"删除\",\"支付\"],\"menu\":\"挂号\",\"menuJump\":\"列表\",\"tableName\":\"guahao\"}],\"fontClass\":\"icon-common36\",\"menu\":\"预约挂号管理\",\"unicode\":\"&#xee9f;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-attentionfavor\",\"buttons\":[\"查看\",\"删除\"],\"menu\":\"体检报告\",\"menuJump\":\"列表\",\"tableName\":\"tijianbaogao\"},{\"appFrontIcon\":\"cuIcon-goodsnew\",\"buttons\":[\"查看\",\"删除\",\"支付\"],\"menu\":\"体检预约\",\"menuJump\":\"列表\",\"tableName\":\"tijianyuyue\"}],\"fontClass\":\"icon-common45\",\"menu\":\"健康体检管理\",\"unicode\":\"&#xef3b;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-explore\",\"buttons\":[\"查看\"],\"menu\":\"我的收藏\",\"menuJump\":\"1\",\"tableName\":\"storeup\"}],\"fontClass\":\"icon-common20\",\"menu\":\"我的收藏管理\",\"unicode\":\"&#xee02;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-paint\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"健康日记\",\"menuJump\":\"列表\",\"tableName\":\"jiankangriji\"}],\"fontClass\":\"icon-common18\",\"menu\":\"健康日记管理\",\"unicode\":\"&#xedff;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-wenzi\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"在线交流\",\"menuJump\":\"列表\",\"tableName\":\"zaixianjiaoliu\"}],\"fontClass\":\"icon-common16\",\"menu\":\"在线交流管理\",\"unicode\":\"&#xedfd;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-pay\",\"buttons\":[\"查看\",\"删除\"],\"menu\":\"hpv疫苗预约\",\"menuJump\":\"列表\",\"tableName\":\"hpvyimiaoyuyue\"}],\"fontClass\":\"icon-common18\",\"menu\":\"hpv疫苗管理\",\"unicode\":\"&#xedff;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-shop\",\"buttons\":[\"查看\",\"删除\"],\"menu\":\"报告信息\",\"menuJump\":\"列表\",\"tableName\":\"baogaoxinxi\"}],\"fontClass\":\"icon-common38\",\"menu\":\"报告信息管理\",\"unicode\":\"&#xeeb2;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-send\",\"buttons\":[\"查看\",\"删除\"],\"menu\":\"新冠疫苗预约\",\"menuJump\":\"列表\",\"tableName\":\"xinguanyimiaoyuyue\"}],\"fontClass\":\"icon-common23\",\"menu\":\"新冠疫苗管理\",\"unicode\":\"&#xee05;\"}],\"frontMenu\":[{\"child\":[{\"appFrontIcon\":\"cuIcon-time\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-common13\",\"menu\":\"报告信息\",\"menuJump\":\"列表\",\"tableName\":\"baogaoxinxi\",\"unicode\":\"&#xedf7;\"}],\"fontClass\":\"icon-common13\",\"menu\":\"报告信息\",\"unicode\":\"&#xedf7;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-pic\",\"buttons\":[\"预约\",\"查看\"],\"fontClass\":\"icon-common28\",\"menu\":\"新冠疫苗\",\"menuJump\":\"列表\",\"tableName\":\"xinguanyimiao\",\"unicode\":\"&#xee2d;\"}],\"fontClass\":\"icon-common28\",\"menu\":\"新冠疫苗预约\",\"unicode\":\"&#xee2d;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-medal\",\"buttons\":[\"查看\",\"预约\"],\"fontClass\":\"icon-common18\",\"menu\":\"hpv疫苗\",\"menuJump\":\"列表\",\"tableName\":\"hpvyimiao\",\"unicode\":\"&#xedff;\"}],\"fontClass\":\"icon-common18\",\"menu\":\"hpv疫苗预约\",\"unicode\":\"&#xedff;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-brand\",\"buttons\":[\"挂号\"],\"menu\":\"预约挂号\",\"menuJump\":\"列表\",\"tableName\":\"yuyueguahao\"}],\"menu\":\"挂号预约管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-shop\",\"buttons\":[\"查看\",\"预约\"],\"fontClass\":\"icon-common22\",\"menu\":\"健康体检\",\"menuJump\":\"列表\",\"tableName\":\"jiankangtijian\",\"unicode\":\"&#xee04;\"}],\"fontClass\":\"icon-common22\",\"menu\":\"健康体检\",\"unicode\":\"&#xee04;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-clothes\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-common28\",\"menu\":\"健康日记\",\"menuJump\":\"列表\",\"tableName\":\"jiankangriji\",\"unicode\":\"&#xee2d;\"}],\"fontClass\":\"icon-common28\",\"menu\":\"健康日记\",\"unicode\":\"&#xee2d;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-similar\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-common21\",\"menu\":\"在线交流\",\"menuJump\":\"列表\",\"tableName\":\"zaixianjiaoliu\",\"unicode\":\"&#xee03;\"}],\"fontClass\":\"icon-common21\",\"menu\":\"在线交流\",\"unicode\":\"&#xee03;\"}],\"hasBackLogin\":\"否\",\"hasBackRegister\":\"否\",\"hasFrontLogin\":\"是\",\"hasFrontRegister\":\"是\",\"roleName\":\"用户\",\"tableName\":\"yonghu\"},{\"backMenu\":[{\"child\":[{\"appFrontIcon\":\"cuIcon-shop\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"报告信息\",\"menuJump\":\"列表\",\"tableName\":\"baogaoxinxi\"}],\"fontClass\":\"icon-common38\",\"menu\":\"报告信息管理\",\"unicode\":\"&#xeeb2;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-wenzi\",\"buttons\":[\"查看\",\"审核\",\"删除\"],\"menu\":\"在线交流\",\"menuJump\":\"列表\",\"tableName\":\"zaixianjiaoliu\"}],\"fontClass\":\"icon-common16\",\"menu\":\"在线交流管理\",\"unicode\":\"&#xedfd;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-newshot\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"健康体检\",\"menuJump\":\"列表\",\"tableName\":\"jiankangtijian\"},{\"appFrontIcon\":\"cuIcon-goodsnew\",\"buttons\":[\"查看\",\"删除\",\"报告\"],\"menu\":\"体检预约\",\"menuJump\":\"列表\",\"tableName\":\"tijianyuyue\"},{\"appFrontIcon\":\"cuIcon-attentionfavor\",\"buttons\":[\"查看\",\"修改\",\"删除\"],\"menu\":\"体检报告\",\"menuJump\":\"列表\",\"tableName\":\"tijianbaogao\"}],\"fontClass\":\"icon-common45\",\"menu\":\"健康体检管理\",\"unicode\":\"&#xef3b;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-newshot\",\"buttons\":[\"查看\",\"删除\"],\"menu\":\"挂号\",\"menuJump\":\"列表\",\"tableName\":\"guahao\"},{\"appFrontIcon\":\"cuIcon-goodsnew\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"预约挂号\",\"menuJump\":\"列表\",\"tableName\":\"yuyueguahao\"}],\"fontClass\":\"icon-common36\",\"menu\":\"预约挂号管理\",\"unicode\":\"&#xee9f;\"}],\"frontMenu\":[{\"child\":[{\"appFrontIcon\":\"cuIcon-time\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-common13\",\"menu\":\"报告信息\",\"menuJump\":\"列表\",\"tableName\":\"baogaoxinxi\",\"unicode\":\"&#xedf7;\"}],\"fontClass\":\"icon-common13\",\"menu\":\"报告信息\",\"unicode\":\"&#xedf7;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-pic\",\"buttons\":[\"预约\",\"查看\"],\"fontClass\":\"icon-common28\",\"menu\":\"新冠疫苗\",\"menuJump\":\"列表\",\"tableName\":\"xinguanyimiao\",\"unicode\":\"&#xee2d;\"}],\"fontClass\":\"icon-common28\",\"menu\":\"新冠疫苗预约\",\"unicode\":\"&#xee2d;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-medal\",\"buttons\":[\"查看\",\"预约\"],\"fontClass\":\"icon-common18\",\"menu\":\"hpv疫苗\",\"menuJump\":\"列表\",\"tableName\":\"hpvyimiao\",\"unicode\":\"&#xedff;\"}],\"fontClass\":\"icon-common18\",\"menu\":\"hpv疫苗预约\",\"unicode\":\"&#xedff;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-brand\",\"buttons\":[\"挂号\"],\"menu\":\"预约挂号\",\"menuJump\":\"列表\",\"tableName\":\"yuyueguahao\"}],\"menu\":\"挂号预约管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-shop\",\"buttons\":[\"查看\",\"预约\"],\"fontClass\":\"icon-common22\",\"menu\":\"健康体检\",\"menuJump\":\"列表\",\"tableName\":\"jiankangtijian\",\"unicode\":\"&#xee04;\"}],\"fontClass\":\"icon-common22\",\"menu\":\"健康体检\",\"unicode\":\"&#xee04;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-clothes\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-common28\",\"menu\":\"健康日记\",\"menuJump\":\"列表\",\"tableName\":\"jiankangriji\",\"unicode\":\"&#xee2d;\"}],\"fontClass\":\"icon-common28\",\"menu\":\"健康日记\",\"unicode\":\"&#xee2d;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-similar\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-common21\",\"menu\":\"在线交流\",\"menuJump\":\"列表\",\"tableName\":\"zaixianjiaoliu\",\"unicode\":\"&#xee03;\"}],\"fontClass\":\"icon-common21\",\"menu\":\"在线交流\",\"unicode\":\"&#xee03;\"}],\"hasBackLogin\":\"是\",\"hasBackRegister\":\"是\",\"hasFrontLogin\":\"否\",\"hasFrontRegister\":\"否\",\"roleName\":\"医生\",\"tableName\":\"yisheng\"}]');
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
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
  `refid` bigint(20) DEFAULT NULL COMMENT 'refid',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` longtext NOT NULL COMMENT '图片',
  `type` varchar(200) DEFAULT NULL COMMENT '类型(1:收藏,21:赞,22:踩,31:竞拍参与,41:关注)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='我的收藏';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tijianbaogao`
--

DROP TABLE IF EXISTS `tijianbaogao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tijianbaogao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tijianxiangmu` varchar(200) DEFAULT NULL COMMENT '体检项目',
  `tijianfenlei` varchar(200) DEFAULT NULL COMMENT '体检分类',
  `tijianbaogao` longtext COMMENT '体检报告',
  `baogaoshijian` datetime DEFAULT NULL COMMENT '报告时间',
  `tijianshuoming` varchar(200) DEFAULT NULL COMMENT '体检说明',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `tijianjieguo` longtext COMMENT '体检结果',
  `yishengzhanghao` varchar(200) DEFAULT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) DEFAULT NULL COMMENT '医生姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='体检报告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tijianbaogao`
--

LOCK TABLES `tijianbaogao` WRITE;
/*!40000 ALTER TABLE `tijianbaogao` DISABLE KEYS */;
INSERT INTO `tijianbaogao` VALUES (111,'2024-02-25 13:48:18','体检项目1','体检分类1','','2024-02-25 21:48:18','体检说明1','用户账号1','用户姓名1','体检结果1','医生账号1','医生姓名1'),(112,'2024-02-25 13:48:18','体检项目2','体检分类2','','2024-02-25 21:48:18','体检说明2','用户账号2','用户姓名2','体检结果2','医生账号2','医生姓名2'),(113,'2024-02-25 13:48:18','体检项目3','体检分类3','','2024-02-25 21:48:18','体检说明3','用户账号3','用户姓名3','体检结果3','医生账号3','医生姓名3'),(114,'2024-02-25 13:48:18','体检项目4','体检分类4','','2024-02-25 21:48:18','体检说明4','用户账号4','用户姓名4','体检结果4','医生账号4','医生姓名4'),(115,'2024-02-25 13:48:18','体检项目5','体检分类5','','2024-02-25 21:48:18','体检说明5','用户账号5','用户姓名5','体检结果5','医生账号5','医生姓名5'),(116,'2024-02-25 13:48:18','体检项目6','体检分类6','','2024-02-25 21:48:18','体检说明6','用户账号6','用户姓名6','体检结果6','医生账号6','医生姓名6');
/*!40000 ALTER TABLE `tijianbaogao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tijianfenlei`
--

DROP TABLE IF EXISTS `tijianfenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tijianfenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tijianfenlei` varchar(200) NOT NULL COMMENT '体检分类',
  PRIMARY KEY (`id`),
  UNIQUE KEY `tijianfenlei` (`tijianfenlei`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='体检分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tijianfenlei`
--

LOCK TABLES `tijianfenlei` WRITE;
/*!40000 ALTER TABLE `tijianfenlei` DISABLE KEYS */;
INSERT INTO `tijianfenlei` VALUES (81,'2024-02-25 13:48:18','体检分类1'),(82,'2024-02-25 13:48:18','体检分类2'),(83,'2024-02-25 13:48:18','体检分类3'),(84,'2024-02-25 13:48:18','体检分类4'),(85,'2024-02-25 13:48:18','体检分类5'),(86,'2024-02-25 13:48:18','体检分类6');
/*!40000 ALTER TABLE `tijianfenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tijianyuyue`
--

DROP TABLE IF EXISTS `tijianyuyue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tijianyuyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tijianxiangmu` varchar(200) DEFAULT NULL COMMENT '体检项目',
  `tijianfenlei` varchar(200) DEFAULT NULL COMMENT '体检分类',
  `tijiandidian` varchar(200) DEFAULT NULL COMMENT '体检地点',
  `tijianfeiyong` double DEFAULT NULL COMMENT '体检费用',
  `yuyueshijian` datetime DEFAULT NULL COMMENT '预约时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `yishengzhanghao` varchar(200) DEFAULT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) DEFAULT NULL COMMENT '医生姓名',
  `ispay` varchar(200) DEFAULT NULL COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='体检预约';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tijianyuyue`
--

LOCK TABLES `tijianyuyue` WRITE;
/*!40000 ALTER TABLE `tijianyuyue` DISABLE KEYS */;
INSERT INTO `tijianyuyue` VALUES (101,'2024-02-25 13:48:18','体检项目1','体检分类1','体检地点1',1,'2024-02-25 21:48:18','用户账号1','用户姓名1','医生账号1','医生姓名1','未支付'),(102,'2024-02-25 13:48:18','体检项目2','体检分类2','体检地点2',2,'2024-02-25 21:48:18','用户账号2','用户姓名2','医生账号2','医生姓名2','未支付'),(103,'2024-02-25 13:48:18','体检项目3','体检分类3','体检地点3',3,'2024-02-25 21:48:18','用户账号3','用户姓名3','医生账号3','医生姓名3','未支付'),(104,'2024-02-25 13:48:18','体检项目4','体检分类4','体检地点4',4,'2024-02-25 21:48:18','用户账号4','用户姓名4','医生账号4','医生姓名4','未支付'),(105,'2024-02-25 13:48:18','体检项目5','体检分类5','体检地点5',5,'2024-02-25 21:48:18','用户账号5','用户姓名5','医生账号5','医生姓名5','未支付'),(106,'2024-02-25 13:48:18','体检项目6','体检分类6','体检地点6',6,'2024-02-25 21:48:18','用户账号6','用户姓名6','医生账号6','医生姓名6','未支付');
/*!40000 ALTER TABLE `tijianyuyue` ENABLE KEYS */;
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
INSERT INTO `token` VALUES (1,31,'用户账号1','yonghu','用户','rr8ofc79e686wrulfl2z7i3hf6hwtsiv','2024-02-25 13:55:01','2024-02-25 14:55:01'),(2,41,'医生账号1','yisheng','医生','thnmksh4dyegi78o0x0jbdl9d4gw3t71','2024-02-25 14:06:59','2024-02-25 15:06:59'),(3,1,'admin','users','管理员','3vbphizukm8qo9l5zc903aqidm371twu','2024-02-25 14:07:30','2024-02-25 15:07:31');
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
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `username` varchar(200) NOT NULL COMMENT '用户名',
  `password` varchar(200) NOT NULL COMMENT '密码',
  `role` varchar(200) DEFAULT NULL COMMENT '角色',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='管理员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'2024-02-25 13:48:18','admin','admin','管理员');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xinguanyimiao`
--

DROP TABLE IF EXISTS `xinguanyimiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xinguanyimiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yimiaobianhao` varchar(200) NOT NULL COMMENT '疫苗编号',
  `yimiaomingcheng` varchar(200) DEFAULT NULL COMMENT '疫苗名称',
  `picihao` varchar(200) DEFAULT NULL COMMENT '批次号',
  `tupian` longtext COMMENT '图片',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `shengchanriqi` date DEFAULT NULL COMMENT '生产日期',
  `baozhiqi` varchar(200) DEFAULT NULL COMMENT '保质期',
  `shengchanchangshang` varchar(200) DEFAULT NULL COMMENT '生产厂商',
  `storeupnum` int(11) DEFAULT NULL COMMENT '收藏数量',
  `jiezhongliucheng` longtext COMMENT '接种流程',
  `fuzuoyong` longtext COMMENT '副作用',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yimiaobianhao` (`yimiaobianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='新冠疫苗';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xinguanyimiao`
--

LOCK TABLES `xinguanyimiao` WRITE;
/*!40000 ALTER TABLE `xinguanyimiao` DISABLE KEYS */;
INSERT INTO `xinguanyimiao` VALUES (161,'2024-02-25 13:48:18','1111111111','疫苗名称1','批次号1','file/xinguanyimiaoTupian1.jpg,file/xinguanyimiaoTupian2.jpg,file/xinguanyimiaoTupian3.jpg',1,'2024-02-25','保质期1','生产厂商1',1,'接种流程1','副作用1'),(162,'2024-02-25 13:48:18','2222222222','疫苗名称2','批次号2','file/xinguanyimiaoTupian2.jpg,file/xinguanyimiaoTupian3.jpg,file/xinguanyimiaoTupian4.jpg',2,'2024-02-25','保质期2','生产厂商2',2,'接种流程2','副作用2'),(163,'2024-02-25 13:48:18','3333333333','疫苗名称3','批次号3','file/xinguanyimiaoTupian3.jpg,file/xinguanyimiaoTupian4.jpg,file/xinguanyimiaoTupian5.jpg',3,'2024-02-25','保质期3','生产厂商3',3,'接种流程3','副作用3'),(164,'2024-02-25 13:48:18','4444444444','疫苗名称4','批次号4','file/xinguanyimiaoTupian4.jpg,file/xinguanyimiaoTupian5.jpg,file/xinguanyimiaoTupian6.jpg',4,'2024-02-25','保质期4','生产厂商4',4,'接种流程4','副作用4'),(165,'2024-02-25 13:48:18','5555555555','疫苗名称5','批次号5','file/xinguanyimiaoTupian5.jpg,file/xinguanyimiaoTupian6.jpg,file/xinguanyimiaoTupian7.jpg',5,'2024-02-25','保质期5','生产厂商5',5,'接种流程5','副作用5'),(166,'2024-02-25 13:48:18','6666666666','疫苗名称6','批次号6','file/xinguanyimiaoTupian6.jpg,file/xinguanyimiaoTupian7.jpg,file/xinguanyimiaoTupian8.jpg',6,'2024-02-25','保质期6','生产厂商6',6,'接种流程6','副作用6');
/*!40000 ALTER TABLE `xinguanyimiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xinguanyimiaoyuyue`
--

DROP TABLE IF EXISTS `xinguanyimiaoyuyue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xinguanyimiaoyuyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yimiaobianhao` varchar(200) DEFAULT NULL COMMENT '疫苗编号',
  `yimiaomingcheng` varchar(200) DEFAULT NULL COMMENT '疫苗名称',
  `picihao` varchar(200) DEFAULT NULL COMMENT '批次号',
  `shengchanriqi` varchar(200) DEFAULT NULL COMMENT '生产日期',
  `baozhiqi` varchar(200) DEFAULT NULL COMMENT '保质期',
  `shengchanchangshang` varchar(200) DEFAULT NULL COMMENT '生产厂商',
  `yuyueshijian` datetime DEFAULT NULL COMMENT '预约时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8 COMMENT='新冠疫苗预约';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xinguanyimiaoyuyue`
--

LOCK TABLES `xinguanyimiaoyuyue` WRITE;
/*!40000 ALTER TABLE `xinguanyimiaoyuyue` DISABLE KEYS */;
INSERT INTO `xinguanyimiaoyuyue` VALUES (151,'2024-02-25 13:48:18','疫苗编号1','疫苗名称1','批次号1','生产日期1','保质期1','生产厂商1','2024-02-25 21:48:18','用户账号1','用户姓名1','性别1'),(152,'2024-02-25 13:48:18','疫苗编号2','疫苗名称2','批次号2','生产日期2','保质期2','生产厂商2','2024-02-25 21:48:18','用户账号2','用户姓名2','性别2'),(153,'2024-02-25 13:48:18','疫苗编号3','疫苗名称3','批次号3','生产日期3','保质期3','生产厂商3','2024-02-25 21:48:18','用户账号3','用户姓名3','性别3'),(154,'2024-02-25 13:48:18','疫苗编号4','疫苗名称4','批次号4','生产日期4','保质期4','生产厂商4','2024-02-25 21:48:18','用户账号4','用户姓名4','性别4'),(155,'2024-02-25 13:48:18','疫苗编号5','疫苗名称5','批次号5','生产日期5','保质期5','生产厂商5','2024-02-25 21:48:18','用户账号5','用户姓名5','性别5'),(156,'2024-02-25 13:48:18','疫苗编号6','疫苗名称6','批次号6','生产日期6','保质期6','生产厂商6','2024-02-25 21:48:18','用户账号6','用户姓名6','性别6');
/*!40000 ALTER TABLE `xinguanyimiaoyuyue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yiliaozhishi`
--

DROP TABLE IF EXISTS `yiliaozhishi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yiliaozhishi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhishibiaoti` varchar(200) DEFAULT NULL COMMENT '知识标题',
  `zhishileixing` varchar(200) DEFAULT NULL COMMENT '知识类型',
  `fengmian` longtext COMMENT '封面',
  `shipin` longtext COMMENT '视频',
  `zhishijianjie` longtext COMMENT '知识简介',
  `zhishineirong` longtext COMMENT '知识内容',
  `storeupnum` int(11) DEFAULT NULL COMMENT '收藏数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='医疗知识';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yiliaozhishi`
--

LOCK TABLES `yiliaozhishi` WRITE;
/*!40000 ALTER TABLE `yiliaozhishi` DISABLE KEYS */;
INSERT INTO `yiliaozhishi` VALUES (141,'2024-02-25 13:48:18','知识标题1','知识类型1','file/yiliaozhishiFengmian1.jpg,file/yiliaozhishiFengmian2.jpg,file/yiliaozhishiFengmian3.jpg','','知识简介1','知识内容1',1),(142,'2024-02-25 13:48:18','知识标题2','知识类型2','file/yiliaozhishiFengmian2.jpg,file/yiliaozhishiFengmian3.jpg,file/yiliaozhishiFengmian4.jpg','','知识简介2','知识内容2',2),(143,'2024-02-25 13:48:18','知识标题3','知识类型3','file/yiliaozhishiFengmian3.jpg,file/yiliaozhishiFengmian4.jpg,file/yiliaozhishiFengmian5.jpg','','知识简介3','知识内容3',3),(144,'2024-02-25 13:48:18','知识标题4','知识类型4','file/yiliaozhishiFengmian4.jpg,file/yiliaozhishiFengmian5.jpg,file/yiliaozhishiFengmian6.jpg','','知识简介4','知识内容4',4),(145,'2024-02-25 13:48:18','知识标题5','知识类型5','file/yiliaozhishiFengmian5.jpg,file/yiliaozhishiFengmian6.jpg,file/yiliaozhishiFengmian7.jpg','','知识简介5','知识内容5',5),(146,'2024-02-25 13:48:18','知识标题6','知识类型6','file/yiliaozhishiFengmian6.jpg,file/yiliaozhishiFengmian7.jpg,file/yiliaozhishiFengmian8.jpg','','知识简介6','知识内容6',6);
/*!40000 ALTER TABLE `yiliaozhishi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yisheng`
--

DROP TABLE IF EXISTS `yisheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yisheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yishengzhanghao` varchar(200) NOT NULL COMMENT '医生账号',
  `yishengmima` varchar(200) NOT NULL COMMENT '医生密码',
  `yishengxingming` varchar(200) NOT NULL COMMENT '医生姓名',
  `zhaopian` longtext COMMENT '照片',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `shanzhanglingyu` varchar(200) DEFAULT NULL COMMENT '擅长领域',
  `keshi` varchar(200) DEFAULT NULL COMMENT '科室',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yishengzhanghao` (`yishengzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='医生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yisheng`
--

LOCK TABLES `yisheng` WRITE;
/*!40000 ALTER TABLE `yisheng` DISABLE KEYS */;
INSERT INTO `yisheng` VALUES (41,'2024-02-25 13:48:17','医生账号1','123456','医生姓名1','file/yishengZhaopian1.jpg','男','19819881111','擅长领域1','科室1'),(42,'2024-02-25 13:48:17','医生账号2','123456','医生姓名2','file/yishengZhaopian2.jpg','男','19819881112','擅长领域2','科室2'),(43,'2024-02-25 13:48:17','医生账号3','123456','医生姓名3','file/yishengZhaopian3.jpg','男','19819881113','擅长领域3','科室3'),(44,'2024-02-25 13:48:17','医生账号4','123456','医生姓名4','file/yishengZhaopian4.jpg','男','19819881114','擅长领域4','科室4'),(45,'2024-02-25 13:48:17','医生账号5','123456','医生姓名5','file/yishengZhaopian5.jpg','男','19819881115','擅长领域5','科室5'),(46,'2024-02-25 13:48:17','医生账号6','123456','医生姓名6','file/yishengZhaopian6.jpg','男','19819881116','擅长领域6','科室6');
/*!40000 ALTER TABLE `yisheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `yonghumima` varchar(200) NOT NULL COMMENT '用户密码',
  `yonghuxingming` varchar(200) NOT NULL COMMENT '用户姓名',
  `touxiang` longtext COMMENT '头像',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuzhanghao` (`yonghuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (31,'2024-02-25 13:48:17','用户账号1','123456','用户姓名1','file/yonghuTouxiang1.jpg','男','19819881111'),(32,'2024-02-25 13:48:17','用户账号2','123456','用户姓名2','file/yonghuTouxiang2.jpg','男','19819881112'),(33,'2024-02-25 13:48:17','用户账号3','123456','用户姓名3','file/yonghuTouxiang3.jpg','男','19819881113'),(34,'2024-02-25 13:48:17','用户账号4','123456','用户姓名4','file/yonghuTouxiang4.jpg','男','19819881114'),(35,'2024-02-25 13:48:17','用户账号5','123456','用户姓名5','file/yonghuTouxiang5.jpg','男','19819881115'),(36,'2024-02-25 13:48:17','用户账号6','123456','用户姓名6','file/yonghuTouxiang6.jpg','男','19819881116');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuyueguahao`
--

DROP TABLE IF EXISTS `yuyueguahao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuyueguahao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yishengzhanghao` varchar(200) DEFAULT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) DEFAULT NULL COMMENT '医生姓名',
  `keshi` varchar(200) DEFAULT NULL COMMENT '科室',
  `tupian` longtext COMMENT '图片',
  `jiuzhenshijian` varchar(200) DEFAULT NULL COMMENT '就诊时间',
  `guahaofei` double DEFAULT NULL COMMENT '挂号费',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `yuyuexuzhi` varchar(200) DEFAULT NULL COMMENT '预约须知',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=197 DEFAULT CHARSET=utf8 COMMENT='预约挂号';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuyueguahao`
--

LOCK TABLES `yuyueguahao` WRITE;
/*!40000 ALTER TABLE `yuyueguahao` DISABLE KEYS */;
INSERT INTO `yuyueguahao` VALUES (191,'2024-02-25 13:48:18','医生账号1','医生姓名1','科室1','file/yuyueguahaoTupian1.jpg,file/yuyueguahaoTupian2.jpg,file/yuyueguahaoTupian3.jpg','就诊时间1',1,1,'预约须知1'),(192,'2024-02-25 13:48:18','医生账号2','医生姓名2','科室2','file/yuyueguahaoTupian2.jpg,file/yuyueguahaoTupian3.jpg,file/yuyueguahaoTupian4.jpg','就诊时间2',2,2,'预约须知2'),(193,'2024-02-25 13:48:18','医生账号3','医生姓名3','科室3','file/yuyueguahaoTupian3.jpg,file/yuyueguahaoTupian4.jpg,file/yuyueguahaoTupian5.jpg','就诊时间3',3,3,'预约须知3'),(194,'2024-02-25 13:48:18','医生账号4','医生姓名4','科室4','file/yuyueguahaoTupian4.jpg,file/yuyueguahaoTupian5.jpg,file/yuyueguahaoTupian6.jpg','就诊时间4',4,4,'预约须知4'),(195,'2024-02-25 13:48:18','医生账号5','医生姓名5','科室5','file/yuyueguahaoTupian5.jpg,file/yuyueguahaoTupian6.jpg,file/yuyueguahaoTupian7.jpg','就诊时间5',5,5,'预约须知5'),(196,'2024-02-25 13:48:18','医生账号6','医生姓名6','科室6','file/yuyueguahaoTupian6.jpg,file/yuyueguahaoTupian7.jpg,file/yuyueguahaoTupian8.jpg','就诊时间6',6,6,'预约须知6');
/*!40000 ALTER TABLE `yuyueguahao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zaixianjiaoliu`
--

DROP TABLE IF EXISTS `zaixianjiaoliu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zaixianjiaoliu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yishengzhanghao` varchar(200) DEFAULT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) DEFAULT NULL COMMENT '医生姓名',
  `zixunneirong` longtext NOT NULL COMMENT '咨询内容',
  `tupian` longtext COMMENT '图片',
  `zixunshijian` datetime DEFAULT NULL COMMENT '咨询时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `shhf` longtext COMMENT '回复内容',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='在线交流';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zaixianjiaoliu`
--

LOCK TABLES `zaixianjiaoliu` WRITE;
/*!40000 ALTER TABLE `zaixianjiaoliu` DISABLE KEYS */;
INSERT INTO `zaixianjiaoliu` VALUES (121,'2024-02-25 13:48:18','医生账号1','医生姓名1','咨询内容1','file/zaixianjiaoliuTupian1.jpg,file/zaixianjiaoliuTupian2.jpg,file/zaixianjiaoliuTupian3.jpg','2024-02-25 21:48:18','用户账号1','用户姓名1','',1),(122,'2024-02-25 13:48:18','医生账号2','医生姓名2','咨询内容2','file/zaixianjiaoliuTupian2.jpg,file/zaixianjiaoliuTupian3.jpg,file/zaixianjiaoliuTupian4.jpg','2024-02-25 21:48:18','用户账号2','用户姓名2','',2),(123,'2024-02-25 13:48:18','医生账号3','医生姓名3','咨询内容3','file/zaixianjiaoliuTupian3.jpg,file/zaixianjiaoliuTupian4.jpg,file/zaixianjiaoliuTupian5.jpg','2024-02-25 21:48:18','用户账号3','用户姓名3','',3),(124,'2024-02-25 13:48:18','医生账号4','医生姓名4','咨询内容4','file/zaixianjiaoliuTupian4.jpg,file/zaixianjiaoliuTupian5.jpg,file/zaixianjiaoliuTupian6.jpg','2024-02-25 21:48:18','用户账号4','用户姓名4','',4),(125,'2024-02-25 13:48:18','医生账号5','医生姓名5','咨询内容5','file/zaixianjiaoliuTupian5.jpg,file/zaixianjiaoliuTupian6.jpg,file/zaixianjiaoliuTupian7.jpg','2024-02-25 21:48:18','用户账号5','用户姓名5','',5),(126,'2024-02-25 13:48:18','医生账号6','医生姓名6','咨询内容6','file/zaixianjiaoliuTupian6.jpg,file/zaixianjiaoliuTupian7.jpg,file/zaixianjiaoliuTupian8.jpg','2024-02-25 21:48:18','用户账号6','用户姓名6','',6);
/*!40000 ALTER TABLE `zaixianjiaoliu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhishileixing`
--

DROP TABLE IF EXISTS `zhishileixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhishileixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhishileixing` varchar(200) NOT NULL COMMENT '知识类型',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhishileixing` (`zhishileixing`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='知识类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhishileixing`
--

LOCK TABLES `zhishileixing` WRITE;
/*!40000 ALTER TABLE `zhishileixing` DISABLE KEYS */;
INSERT INTO `zhishileixing` VALUES (131,'2024-02-25 13:48:18','知识类型1'),(132,'2024-02-25 13:48:18','知识类型2'),(133,'2024-02-25 13:48:18','知识类型3'),(134,'2024-02-25 13:48:18','知识类型4'),(135,'2024-02-25 13:48:18','知识类型5'),(136,'2024-02-25 13:48:18','知识类型6');
/*!40000 ALTER TABLE `zhishileixing` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-26 16:53:53
