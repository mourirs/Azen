SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sp_account
-- ----------------------------
DROP TABLE IF EXISTS `sp_account`;
CREATE TABLE `sp_account`  (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `abalance` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `abankcard` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`aid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sp_account
-- ----------------------------
INSERT INTO `sp_account` VALUES (1, 1, 'test', 'test');
INSERT INTO `sp_account` VALUES (2, 2, '8630', '623333888888888888');
INSERT INTO `sp_account` VALUES (3, 2, '0', '623333888888888889');
INSERT INTO `sp_account` VALUES (8, 10, '1000', '537373273878373');
INSERT INTO `sp_account` VALUES (9, 11, '160640', '34573453453');
INSERT INTO `sp_account` VALUES (10, 12, '700', '1010104204724');

-- ----------------------------
-- Table structure for sp_address
-- ----------------------------
DROP TABLE IF EXISTS `sp_address`;
CREATE TABLE `sp_address`  (
  `arid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `area` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `detailedarea` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `postalcode` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `consignee` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `consigneephone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`arid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sp_address
-- ----------------------------
INSERT INTO `sp_address` VALUES (1, 1, 'test', 'test', 'test', 'test', 'test');
INSERT INTO `sp_address` VALUES (6, 2, '中国北京市市辖区西城区', '老北京人早上起来就是这一出', '000000', '老北京人', '18888888888');
INSERT INTO `sp_address` VALUES (7, 2, '中国北京市市辖区西城区', '老北京人早上起来就是这一', '000000', '老北京人', '18888888888');
INSERT INTO `sp_address` VALUES (8, 2, '中国北京市市辖区西城区', '老北京人早上起来就是这', '000000', '老北京人', '18888888888');
INSERT INTO `sp_address` VALUES (9, 2, '中国北京市市辖区西城区', '老北京人早上起来就是', '000000', '老北京人', '18888888888');
INSERT INTO `sp_address` VALUES (10, 2, '中国北京市市辖区西城区', '老北京人早上起来就', '000000', '老北京人', '18888888888');
INSERT INTO `sp_address` VALUES (11, 2, '中国北京市市辖区西城区', '老北京人早上起来', '000000', '老北京人', '18888888888');
INSERT INTO `sp_address` VALUES (12, 2, '中国北京市市辖区西城区', '老北京人早上起', '000000', '老北京人', '18888888888');
INSERT INTO `sp_address` VALUES (13, 2, '中国北京市市辖区西城区', '老北京人早上', '000000', '老北京人', '18888888888');
INSERT INTO `sp_address` VALUES (14, 2, '中国天津市市辖区和平区', '老北京人早', '111111', '老北京人', '18888888888');
INSERT INTO `sp_address` VALUES (17, 2, '中国河北省石家庄市长安区', '老北京', '555555', '老天津了', '16666666666');
INSERT INTO `sp_address` VALUES (18, 4, '中国山西省太原市小店区', '老山西人了', '000000', '老山西', '16547896321');
INSERT INTO `sp_address` VALUES (19, 12, '中国北京市市辖区西城区', '424534563', '450000', '245745345', '45345354');

-- ----------------------------
-- Table structure for sp_admin
-- ----------------------------
DROP TABLE IF EXISTS `sp_admin`;
CREATE TABLE `sp_admin`  (
  `adid` int(11) NOT NULL AUTO_INCREMENT,
  `adacct` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `adname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `adpawd` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ademail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `adtime` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`adid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sp_admin
-- ----------------------------
INSERT INTO `sp_admin` VALUES (1, 'root', 'Administrators', 'root', 'root@root.com', '2020-02-29');
INSERT INTO `sp_admin` VALUES (2, '100114578', '张三', 'zhangsan', 'zhangsan@qq.com', '2020-03-01 17:51');
INSERT INTO `sp_admin` VALUES (3, '100125896', '李四', 'lisi', 'lisi@qq.com', '2020-03-01 17:56');
INSERT INTO `sp_admin` VALUES (4, '100123984', '王五', 'wangwu', 'wangwu@qq.com', '2020-03-01 17:57');
INSERT INTO `sp_admin` VALUES (5, '100569874', '赵六', 'zhaoliu', 'zhaoliu@qq.com', ' 2020-03-01 18:00');
INSERT INTO `sp_admin` VALUES (6, '100996541', '巨魔战将', 'jumozhanjiang', 'jumozhanjiang@qq.com', ' 2020-03-01 18:02');
INSERT INTO `sp_admin` VALUES (7, '100995645', '老北京', 'laobeijing', 'laobeijing@qq,com', ' 2020-03-01 18:07');
INSERT INTO `sp_admin` VALUES (9, '100985415', 'giao哥', 'giaoge', 'giaoge@qq.com', ' 2020-03-01 18:33');

-- ----------------------------
-- Table structure for sp_aspiration
-- ----------------------------
DROP TABLE IF EXISTS `sp_aspiration`;
CREATE TABLE `sp_aspiration`  (
  `asid` int(11) NOT NULL AUTO_INCREMENT,
  `coid` int(11) NOT NULL,
  `uid` int(11) NOT NULL,
  PRIMARY KEY (`asid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sp_aspiration
-- ----------------------------
INSERT INTO `sp_aspiration` VALUES (1, 1, 1);
INSERT INTO `sp_aspiration` VALUES (2, 1, 2);
INSERT INTO `sp_aspiration` VALUES (3, 2, 2);
INSERT INTO `sp_aspiration` VALUES (4, 3, 2);
INSERT INTO `sp_aspiration` VALUES (5, 4, 2);
INSERT INTO `sp_aspiration` VALUES (6, 5, 2);
INSERT INTO `sp_aspiration` VALUES (7, 6, 2);
INSERT INTO `sp_aspiration` VALUES (9, 8, 2);
INSERT INTO `sp_aspiration` VALUES (10, 12, 2);
INSERT INTO `sp_aspiration` VALUES (11, 11, 2);
INSERT INTO `sp_aspiration` VALUES (12, 10, 2);

-- ----------------------------
-- Table structure for sp_car
-- ----------------------------
DROP TABLE IF EXISTS `sp_car`;
CREATE TABLE `sp_car`  (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `coid` int(11) NOT NULL,
  `cnum` int(11) NOT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sp_car
-- ----------------------------
INSERT INTO `sp_car` VALUES (1, 1, 1, 4);
INSERT INTO `sp_car` VALUES (23, 12, 2, 2);
INSERT INTO `sp_car` VALUES (24, 12, 3, 2);
INSERT INTO `sp_car` VALUES (25, 1, 2, 1);
INSERT INTO `sp_car` VALUES (26, 1, 3, 3);
INSERT INTO `sp_car` VALUES (27, 1, 4, 1);

-- ----------------------------
-- Table structure for sp_commodity
-- ----------------------------
DROP TABLE IF EXISTS `sp_commodity`;
CREATE TABLE `sp_commodity`  (
  `coid` int(11) NOT NULL AUTO_INCREMENT,
  `coname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `coprice` int(11) NOT NULL,
  `cogrounding` int(11) NOT NULL,
  `conum` int(11) NOT NULL,
  `cyid` int(11) NOT NULL,
  `coimage` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`coid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sp_commodity
-- ----------------------------
INSERT INTO `sp_commodity` VALUES (1, '迷彩服', 68, 1, 110, 1, 'images/product/Camo-Coat.jpg');
INSERT INTO `sp_commodity` VALUES (2, '灯芯绒连帽衫', 100, 1, 96, 1, 'images/product/Corduroy-Hoodie.jpg');
INSERT INTO `sp_commodity` VALUES (3, '飞行夹克', 60, 1, 100, 1, 'images/product/Flight-Jacket.jpg');
INSERT INTO `sp_commodity` VALUES (4, '休闲鞋', 60, 1, 100, 3, 'images/product/Hyper-shoe.jpg');
INSERT INTO `sp_commodity` VALUES (5, '连袜鞋', 60, 1, 98, 3, 'images/product/Hyper-v1.jpg');
INSERT INTO `sp_commodity` VALUES (6, '复古色橡皮底帆布鞋', 115, 1, 98, 3, 'images/product/sneaker.jpg');
INSERT INTO `sp_commodity` VALUES (7, '军绿色橡皮底帆布鞋', 115, 1, 98, 3, 'images/product/sneaker1.jpg');
INSERT INTO `sp_commodity` VALUES (8, '黑灰色橡皮底帆布鞋', 115, 1, 99, 3, 'images/product/sneaker2.jpg');
INSERT INTO `sp_commodity` VALUES (9, '紫白色橡皮底帆布鞋', 115, 1, 100, 3, 'images/product/sneaker3.jpg');
INSERT INTO `sp_commodity` VALUES (10, '灰白色橡皮底帆布鞋', 115, 1, 100, 3, 'images/product/sneaker4.jpg');
INSERT INTO `sp_commodity` VALUES (11, '银白色橡皮底帆布鞋', 115, 1, 100, 3, 'images/product/sneaker5.jpg');
INSERT INTO `sp_commodity` VALUES (12, '黑白点橡皮底帆布鞋', 115, 1, 100, 3, 'images/product/sneaker6.jpg');
INSERT INTO `sp_commodity` VALUES (13, '精神T恤', 40, 1, 100, 5, 'images/product/Lunatic-shirt.jpg');
INSERT INTO `sp_commodity` VALUES (14, '镜子T恤', 40, 1, 100, 5, 'images/product/Mirror-Tshirt.jpg');
INSERT INTO `sp_commodity` VALUES (15, '金钱T恤', 40, 1, 100, 5, 'images/product/Money-shirt.jpg');
INSERT INTO `sp_commodity` VALUES (16, '柔和慢跑裤', 60, 1, 100, 4, 'images/product/Pastel-Jogger.jpg');
INSERT INTO `sp_commodity` VALUES (17, '玫瑰短裤', 60, 1, 100, 4, 'images/product/Rose-short.jpg');
INSERT INTO `sp_commodity` VALUES (18, '红色毛衣', 40, 1, 100, 5, 'images/product/Red-Sweater-quickview.jpg');
INSERT INTO `sp_commodity` VALUES (19, '黄色帽子', 115, 1, 100, 2, 'images/product/product15.jpg');
INSERT INTO `sp_commodity` VALUES (20, '红色帽子', 115, 1, 100, 2, 'images/product/product16.jpg');
INSERT INTO `sp_commodity` VALUES (21, '老式滑板', 115, 1, 100, 6, 'images/product/Vintage-skateboard.jpg');
INSERT INTO `sp_commodity` VALUES (23, '阿馥奇朵', 160, 1, 159, 7, 'images/product/afqd.jpg');
INSERT INTO `sp_commodity` VALUES (24, '鸡肉卷', 14, 1, 100, 7, 'images/product/ksjrj.jpg');
INSERT INTO `sp_commodity` VALUES (25, '汉堡包', 16, 1, 15, 7, 'images/product/jrzxpnn.jpg');

-- ----------------------------
-- Table structure for sp_commoditycategory
-- ----------------------------
DROP TABLE IF EXISTS `sp_commoditycategory`;
CREATE TABLE `sp_commoditycategory`  (
  `cyid` int(11) NOT NULL AUTO_INCREMENT,
  `cytype` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`cyid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sp_commoditycategory
-- ----------------------------
INSERT INTO `sp_commoditycategory` VALUES (1, '外套');
INSERT INTO `sp_commoditycategory` VALUES (2, '帽子');
INSERT INTO `sp_commoditycategory` VALUES (3, '鞋子');
INSERT INTO `sp_commoditycategory` VALUES (4, '裤子');
INSERT INTO `sp_commoditycategory` VALUES (5, '上衣');
INSERT INTO `sp_commoditycategory` VALUES (6, '滑板');
INSERT INTO `sp_commoditycategory` VALUES (7, '其他');

-- ----------------------------
-- Table structure for sp_contact
-- ----------------------------
DROP TABLE IF EXISTS `sp_contact`;
CREATE TABLE `sp_contact`  (
  `ctid` int(11) NOT NULL AUTO_INCREMENT,
  `ctname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ctemail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ctmessage` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`ctid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sp_contact
-- ----------------------------
INSERT INTO `sp_contact` VALUES (1, 'test', 'test@qq.com', '123');
INSERT INTO `sp_contact` VALUES (2, '老北京人了', 'laobeijing@beijing.com', '我是老北京人了！');

-- ----------------------------
-- Table structure for sp_order
-- ----------------------------
DROP TABLE IF EXISTS `sp_order`;
CREATE TABLE `sp_order`  (
  `oid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `onumber` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ocratetime` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ogold` int(255) NOT NULL,
  `aid` int(11) NOT NULL,
  `oname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `oprice` int(11) NOT NULL,
  `onum` int(11) NOT NULL,
  `ostatue` int(11) NOT NULL,
  PRIMARY KEY (`oid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sp_order
-- ----------------------------
INSERT INTO `sp_order` VALUES (3, 2, '20200228233651', '2020-02-28 23:36:51', 900, 17, '灯芯绒连帽衫', 100, 9, 0);
INSERT INTO `sp_order` VALUES (4, 2, '20200228233651', '2020-02-28 23:36:51', 180, 17, '飞行夹克', 60, 3, 0);
INSERT INTO `sp_order` VALUES (5, 2, '20200228233651', '2020-02-28 23:36:51', 120, 17, '连袜鞋', 60, 2, 0);
INSERT INTO `sp_order` VALUES (7, 2, '20200228235809', '2020-02-28 23:58:09', 345, 12, '老式滑板', 115, 3, 1);
INSERT INTO `sp_order` VALUES (9, 2, '20200228235809', '2020-02-28 23:58:09', 100, 12, '灯芯绒连帽衫', 100, 1, 1);
INSERT INTO `sp_order` VALUES (10, 2, '20200228235809', '2020-02-28 23:58:09', 60, 12, '飞行夹克', 60, 1, 1);
INSERT INTO `sp_order` VALUES (11, 2, '20200228235809', '2020-02-28 23:58:09', 60, 12, '休闲鞋', 60, 1, 1);
INSERT INTO `sp_order` VALUES (12, 4, '20200229233039', '2020-02-29 23:30:40', 300, 18, '灯芯绒连帽衫', 100, 3, 0);
INSERT INTO `sp_order` VALUES (13, 2, '20200302142028', '2020-03-02 14:20:28', 115, 8, '黑灰色橡皮底帆布鞋', 115, 1, 1);
INSERT INTO `sp_order` VALUES (14, 2, '20200302142028', '2020-03-02 14:20:28', 230, 8, '军绿色橡皮底帆布鞋', 115, 2, 1);
INSERT INTO `sp_order` VALUES (15, 2, '20200302142028', '2020-03-02 14:20:28', 230, 8, '复古色橡皮底帆布鞋', 115, 2, 1);
INSERT INTO `sp_order` VALUES (16, 2, '20200302142028', '2020-03-02 14:20:28', 120, 8, '连袜鞋', 60, 2, 1);
INSERT INTO `sp_order` VALUES (17, 2, '20200302142028', '2020-03-02 14:20:28', 100, 8, '灯芯绒连帽衫', 100, 1, 1);
INSERT INTO `sp_order` VALUES (18, 2, '20200302142709', '2020-03-02 14:27:09', 115, 8, '黑灰色橡皮底帆布鞋', 115, 1, 1);
INSERT INTO `sp_order` VALUES (19, 2, '20200302142709', '2020-03-02 14:27:09', 230, 8, '军绿色橡皮底帆布鞋', 115, 2, 1);
INSERT INTO `sp_order` VALUES (20, 2, '20200302142709', '2020-03-02 14:27:09', 230, 8, '复古色橡皮底帆布鞋', 115, 2, 1);
INSERT INTO `sp_order` VALUES (21, 2, '20200302142709', '2020-03-02 14:27:09', 120, 8, '连袜鞋', 60, 2, 1);
INSERT INTO `sp_order` VALUES (22, 2, '20200302142709', '2020-03-02 14:27:09', 100, 8, '灯芯绒连帽衫', 100, 1, 1);
INSERT INTO `sp_order` VALUES (23, 2, '20200305123241', '2020-03-05 12:32:41', 160, 9, '阿馥奇朵', 160, 1, 1);

-- ----------------------------
-- Table structure for sp_user
-- ----------------------------
DROP TABLE IF EXISTS `sp_user`;
CREATE TABLE `sp_user`  (
  `uid` int(10) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `upwd` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `uphone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `uemail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ustatue` int(11) NOT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sp_user
-- ----------------------------
INSERT INTO `sp_user` VALUES (1, 'zhangsan', '123456', '18888888888', 'zhangsan@qq.com', 1);
INSERT INTO `sp_user` VALUES (2, 'zhangsan1', '123456', '18888888887', 'zhangsan1@qq.com', 1);
INSERT INTO `sp_user` VALUES (4, 'zhangsan2', '123456', NULL, 'zhangsan2@qq.com', 1);
INSERT INTO `sp_user` VALUES (5, 'wangwu', '123456', NULL, 'wangwu@qq.com', 1);
INSERT INTO `sp_user` VALUES (6, 'lisi', '123456', NULL, 'lisi@qq,com', 1);
INSERT INTO `sp_user` VALUES (7, 'zhaoliu', '123456', NULL, 'zhaoliu@qq.com', 1);
INSERT INTO `sp_user` VALUES (8, 'qiuba', '123456', NULL, 'qiuba@qq.com', 1);
INSERT INTO `sp_user` VALUES (9, 'lilaoba', 'lilaoba', NULL, 'lilaoba@qq.com', 1);
INSERT INTO `sp_user` VALUES (10, 'ligan', 'ligan', NULL, 'ligan@qq.com', 1);
INSERT INTO `sp_user` VALUES (11, 'jumo', 'jumo', NULL, 'jumo@qq.com', 1);
INSERT INTO `sp_user` VALUES (12, 'jumo2', 'jumo2', NULL, 'jumo2@qq.com', 1);

SET FOREIGN_KEY_CHECKS = 1;
