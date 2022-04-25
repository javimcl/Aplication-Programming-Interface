-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: cuentabancaria
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `cliente_Id` int NOT NULL AUTO_INCREMENT,
  `contrasena` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  `nombre` varchar(80) NOT NULL,
  `genero` varchar(45) NOT NULL,
  `edad` int NOT NULL,
  `identificacion` varchar(45) NOT NULL,
  `direccion` text NOT NULL,
  `telefono` int NOT NULL,
  PRIMARY KEY (`cliente_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'12345','true','Javier Lucero','mascullino',20,'1720987453','Chillogallo',22435987);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuenta`
--

DROP TABLE IF EXISTS `cuenta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cuenta` (
  `id_cuenta` int NOT NULL AUTO_INCREMENT,
  `numero` int NOT NULL,
  `tipo_cuenta` varchar(45) NOT NULL,
  `saldo_inicial` decimal(20,0) NOT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `id_cliente` int DEFAULT NULL,
  PRIMARY KEY (`id_cuenta`),
  KEY `idCliente_idx` (`id_cliente`),
  CONSTRAINT `id_cliente_cuenta` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`cliente_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuenta`
--

LOCK TABLES `cuenta` WRITE;
/*!40000 ALTER TABLE `cuenta` DISABLE KEYS */;
INSERT INTO `cuenta` VALUES (1,2006789453,'Ahorro',625,'True',1);
/*!40000 ALTER TABLE `cuenta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimiento`
--

DROP TABLE IF EXISTS `movimiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movimiento` (
  `id_movimiento` int NOT NULL AUTO_INCREMENT,
  `saldo` decimal(10,0) NOT NULL,
  `tipo_movimiento` varchar(80) NOT NULL,
  `fecha` datetime NOT NULL,
  `id_cliente` int NOT NULL,
  `id_cuenta` int NOT NULL,
  `valor` decimal(10,0) NOT NULL,
  `saldo_anterior` decimal(10,0) NOT NULL,
  PRIMARY KEY (`id_movimiento`),
  KEY `idCliente_idx` (`id_cliente`),
  KEY `idCuenta_idx` (`id_cuenta`),
  CONSTRAINT `id_cliente_movimiento` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`cliente_Id`),
  CONSTRAINT `id_cuenta_movimiento` FOREIGN KEY (`id_cuenta`) REFERENCES `cuenta` (`id_cuenta`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimiento`
--

LOCK TABLES `movimiento` WRITE;
/*!40000 ALTER TABLE `movimiento` DISABLE KEYS */;
INSERT INTO `movimiento` VALUES (1,725,'credito','2022-04-24 22:33:02',1,1,600,125),(2,775,'credito','2022-04-24 22:33:10',1,1,50,725),(3,825,'credito','2022-04-24 22:33:13',1,1,50,775),(4,805,'debito','2022-04-24 22:33:22',1,1,20,825),(5,785,'debito','2022-04-24 22:33:24',1,1,20,805),(6,765,'debito','2022-04-24 22:33:27',1,1,20,785),(7,745,'debito','2022-04-24 22:33:28',1,1,20,765),(8,725,'debito','2022-04-24 22:33:28',1,1,20,745),(9,705,'debito','2022-04-24 22:33:29',1,1,20,725),(10,685,'debito','2022-04-24 22:33:30',1,1,20,705),(11,665,'debito','2022-04-24 22:33:31',1,1,20,685),(12,645,'debito','2022-04-24 22:33:32',1,1,20,665),(13,625,'debito','2022-04-25 00:23:08',1,1,-20,645);
/*!40000 ALTER TABLE `movimiento` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-25  0:30:19
