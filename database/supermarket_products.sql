CREATE DATABASE  IF NOT EXISTS `supermarket` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `supermarket`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: supermarket
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `id_product` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `price` double NOT NULL,
  `image` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id_product`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'Apple - 1 Kg',100,'https://res.cloudinary.com/baby9728/image/upload/c_scale,w_300/v1652666576/apple_xijmsi.png'),(2,'Banana - 1 Kg',200,'https://res.cloudinary.com/baby9728/image/upload/c_scale,w_300/v1652666569/banana_i3gyzi.png'),(3,'Tomato - 1 Kg',300,'https://res.cloudinary.com/baby9728/image/upload/c_scale,w_300/v1652666571/tomato_bypggj.png'),(4,'Avocado - 1 Kg',400,'https://res.cloudinary.com/baby9728/image/upload/c_scale,w_300/v1652666568/avocado_gaxucg.png'),(5,'Onion - 1 Kg',500,'https://res.cloudinary.com/baby9728/image/upload/c_scale,w_300/v1652666572/onion_tgjxpb.png'),(6,'Lettuce - 1 Kg',600,'https://res.cloudinary.com/baby9728/image/upload/c_scale,w_300/v1652666568/lettuce_qk2skp.png'),(7,'Beet - 1 Kg',700,'https://res.cloudinary.com/baby9728/image/upload/c_scale,w_300/v1652666568/beet_r1k3jp.png'),(8,'Cucumber - 1 Kg',800,'https://res.cloudinary.com/baby9728/image/upload/c_scale,w_300/v1652666569/cucumber_jhbusz.png'),(9,'Carrot - 1 Kg',900,'https://res.cloudinary.com/baby9728/image/upload/c_scale,w_300/v1652666568/carrot_zd7o9t.png'),(10,'Aubergine - 1 Kg',100,'https://res.cloudinary.com/baby9728/image/upload/c_scale,w_300/v1652666568/aubergine_bysdpy.png');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-16  1:36:25
