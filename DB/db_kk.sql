-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_petsupermarket
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `bolsa`
--

DROP TABLE IF EXISTS `bolsa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bolsa` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `fecha_compra` timestamp NOT NULL,
  `Usuario_id` bigint NOT NULL,
  PRIMARY KEY (`id`,`Usuario_id`),
  KEY `fk_Bolsa_Usuario1_idx` (`Usuario_id`),
  CONSTRAINT `fk_Bolsa_Usuario1` FOREIGN KEY (`Usuario_id`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bolsa`
--

LOCK TABLES `bolsa` WRITE;
/*!40000 ALTER TABLE `bolsa` DISABLE KEYS */;
/*!40000 ALTER TABLE `bolsa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bolsa_has_productos`
--

DROP TABLE IF EXISTS `bolsa_has_productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bolsa_has_productos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `cantidad` int NOT NULL,
  `Bolsa_id` bigint NOT NULL,
  `Producto_id` bigint NOT NULL,
  PRIMARY KEY (`id`,`Bolsa_id`,`Producto_id`),
  KEY `fk_Bolsa_has_productos_Bolsa1_idx` (`Bolsa_id`),
  KEY `fk_Bolsa_has_productos_Producto1_idx` (`Producto_id`),
  CONSTRAINT `fk_Bolsa_has_productos_Bolsa1` FOREIGN KEY (`Bolsa_id`) REFERENCES `bolsa` (`id`),
  CONSTRAINT `fk_Bolsa_has_productos_Producto1` FOREIGN KEY (`Producto_id`) REFERENCES `producto` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bolsa_has_productos`
--

LOCK TABLES `bolsa_has_productos` WRITE;
/*!40000 ALTER TABLE `bolsa_has_productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `bolsa_has_productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comentarios`
--

DROP TABLE IF EXISTS `comentarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comentarios` (
  `id` bigint NOT NULL,
  `fecha` datetime DEFAULT NULL,
  `comentario` varchar(100) DEFAULT NULL,
  `calificacion` int DEFAULT NULL,
  `Usuario_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Comentarios_Usuario1_idx` (`Usuario_id`),
  CONSTRAINT `fk_Comentarios_Usuario1` FOREIGN KEY (`Usuario_id`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comentarios`
--

LOCK TABLES `comentarios` WRITE;
/*!40000 ALTER TABLE `comentarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `comentarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `contenido` varchar(45) NOT NULL,
  `precio` decimal(10,0) NOT NULL,
  `descuento` varchar(45) NOT NULL,
  `existencia` bigint NOT NULL,
  `imagen` varchar(45) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `Tipo_Producto_id` bigint NOT NULL,
  `Tipo_Producto_Categorias_id` bigint NOT NULL,
  PRIMARY KEY (`id`,`Tipo_Producto_id`,`Tipo_Producto_Categorias_id`),
  KEY `fk_Producto_Tipo_Producto1_idx` (`Tipo_Producto_id`,`Tipo_Producto_Categorias_id`),
  CONSTRAINT `fk_Producto_Tipo_Producto1` FOREIGN KEY (`Tipo_Producto_id`, `Tipo_Producto_Categorias_id`) REFERENCES `tipo_producto` (`id`, `Categorias_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto_has_comentario`
--

DROP TABLE IF EXISTS `producto_has_comentario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto_has_comentario` (
  `Comentarios_id` bigint NOT NULL,
  `Producto_id` bigint NOT NULL,
  KEY `fk_Producto_has_comentario_Comentarios1_idx` (`Comentarios_id`),
  KEY `fk_Producto_has_comentario_Producto1_idx` (`Producto_id`),
  CONSTRAINT `fk_Producto_has_comentario_Comentarios1` FOREIGN KEY (`Comentarios_id`) REFERENCES `comentarios` (`id`),
  CONSTRAINT `fk_Producto_has_comentario_Producto1` FOREIGN KEY (`Producto_id`) REFERENCES `producto` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto_has_comentario`
--

LOCK TABLES `producto_has_comentario` WRITE;
/*!40000 ALTER TABLE `producto_has_comentario` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto_has_comentario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rol` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(10) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_producto`
--

DROP TABLE IF EXISTS `tipo_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_producto` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `tipoProducto` varchar(45) NOT NULL,
  `Categorias_id` bigint NOT NULL,
  PRIMARY KEY (`id`,`Categorias_id`),
  KEY `fk_Tipo_Producto_Categorias1_idx` (`Categorias_id`),
  CONSTRAINT `fk_Tipo_Producto_Categorias1` FOREIGN KEY (`Categorias_id`) REFERENCES `categorias` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_producto`
--

LOCK TABLES `tipo_producto` WRITE;
/*!40000 ALTER TABLE `tipo_producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(70) NOT NULL,
  `direccion` varchar(300) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `email` varchar(120) NOT NULL,
  `password` varchar(45) NOT NULL,
  `fechaNacimiento` timestamp NOT NULL,
  `Rol_id` bigint NOT NULL,
  PRIMARY KEY (`id`,`Rol_id`),
  KEY `fk_Usuario_Rol_idx` (`Rol_id`),
  CONSTRAINT `fk_Usuario_Rol` FOREIGN KEY (`Rol_id`) REFERENCES `rol` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-22 10:04:59
