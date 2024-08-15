-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: cms
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `category` varchar(200) DEFAULT NULL,
  `price` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'himalsyan tea','tea','250'),(2,'kullad','tea','20'),(3,'green tea','tea','45'),(4,'peach ice tea','tea','25'),(5,'lemon ice tea','tea','30'),(6,'filter coffee','coffee','100'),(7,'cappuccino','coffee','150'),(8,'frappuccino','coffee','120'),(9,'espresso','coffee','180'),(10,'veg regular','pizza','200'),(11,'cheese burst','pizza','250'),(12,'loaded chicken pizza','pizza','350'),(13,'italian pizza','pizza','450'),(14,'margherita pizza','pizza','350'),(15,'chicken sousage pizza','pizza','500'),(16,'veg crispy burger','burger','100'),(17,'chicken burger','burger','145'),(18,'barbeque burger','burger','160'),(19,'veg maharaja burger','burger','350'),(20,'non-veg maharaja buger','burger','450'),(21,'choco lava cake','pastries','200'),(22,'red velvet','pastries','250'),(23,'vanilla cake','pastries','180'),(24,'chocolate cake','pastries','180'),(25,'blue-berry cake','pastries','180'),(26,'pineapple cake','pastries','150'),(27,'cheese cake ','pastries','210'),(28,'regular veg sandwich','sandwich','100'),(29,'toast sandwich','sandwich','120'),(30,'chocolate toast sandwich','sandwich','150'),(31,'checken toast sandwich','sandwich','180'),(32,'cheese sandwich','sandwich','160');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-13 14:52:51
