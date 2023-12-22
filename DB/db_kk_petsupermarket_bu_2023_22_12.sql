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
  PRIMARY KEY (`id`),
  KEY `fk_Bolsa_Usuario1_idx` (`Usuario_id`),
  CONSTRAINT `fk_Bolsa_Usuario1` FOREIGN KEY (`Usuario_id`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bolsa`
--

LOCK TABLES `bolsa` WRITE;
/*!40000 ALTER TABLE `bolsa` DISABLE KEYS */;
INSERT INTO `bolsa` VALUES (1,'2023-01-01 06:00:00',1),(2,'2023-01-01 06:00:00',4);
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
  PRIMARY KEY (`id`),
  KEY `fk_Bolsa_has_productos_Bolsa1_idx` (`Bolsa_id`),
  KEY `fk_Bolsa_has_productos_Producto1_idx` (`Producto_id`),
  CONSTRAINT `fk_Bolsa_has_productos_Bolsa1` FOREIGN KEY (`Bolsa_id`) REFERENCES `bolsa` (`id`),
  CONSTRAINT `fk_Bolsa_has_productos_Producto1` FOREIGN KEY (`Producto_id`) REFERENCES `producto` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bolsa_has_productos`
--

LOCK TABLES `bolsa_has_productos` WRITE;
/*!40000 ALTER TABLE `bolsa_has_productos` DISABLE KEYS */;
INSERT INTO `bolsa_has_productos` VALUES (1,1,1,1),(2,2,2,2);
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'Perro'),(2,'Gato');
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
INSERT INTO `comentarios` VALUES (1,'2023-01-01 12:00:00','¡Mi perro ama este alimento!',5,2),(2,'2023-01-02 15:30:00','El mejor juguete para gatos que he comprado',4,2),(3,'2023-01-03 09:45:00','Excelente calidad en el accesorio para perros',5,2),(4,'2023-01-05 14:20:00','Mi gato disfruta mucho de este producto',4,2),(5,'2023-01-07 18:00:00','El collar es resistente y duradero',5,2),(6,'2023-01-10 10:30:00','Las croquetas son muy saludables para mi gato',4,2),(7,'2023-01-12 16:45:00','El dispensador automático de comida es muy práctico',5,2),(8,'2023-01-15 11:10:00','Este hueso masticable mantiene a mi perro ocupado por horas',4,2),(9,'2023-01-18 13:50:00','El rascador para gatos es robusto y resistente',5,2),(10,'2023-01-20 17:30:00','La correa retráctil es perfecta para paseos cómodos',4,2);
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
  `descripcion` varchar(120) NOT NULL,
  `contenido` varchar(45) NOT NULL,
  `precio` decimal(10,0) NOT NULL,
  `descuento` varchar(45) NOT NULL,
  `existencia` bigint NOT NULL,
  `imagen` varchar(500) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `Tipo_Producto_id` bigint NOT NULL,
  `Tipo_Producto_Categorias_id` bigint NOT NULL,
  PRIMARY KEY (`id`,`Tipo_Producto_id`,`Tipo_Producto_Categorias_id`),
  KEY `fk_Producto_Tipo_Producto1_idx` (`Tipo_Producto_id`,`Tipo_Producto_Categorias_id`),
  CONSTRAINT `fk_Producto_Tipo_Producto1` FOREIGN KEY (`Tipo_Producto_id`, `Tipo_Producto_Categorias_id`) REFERENCES `tipo_producto` (`id`, `Categorias_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Science Diet Alimento para Perros','Hill\'s Science Diet Alimento para Perros Adultos con Receta de Harina de Cordero y Arroz Integral','15 kg',2000,'0%',5,'https://www.amazon.com.mx/Hills-Science-Diet-Advanced-alimento/dp/B009IXOFOC/ref=lp_12478588011_1_4?pf_rd_p=2e6393f5-b0da-469a-bb10-dff5f616611a&pf_rd_r=Z5M2DX71D9HT8FJYSPYA&pd_rd_r=ab274ca2-87b1-41f2-8b94-800f9dd2dd8d&pd_rd_wg=jfCz9&pd_rd_i=B009IXOFOC&psc=1&th=1','Amazon',1,1),(2,'Royal Canin','Royal Canin Croquetas Para Razas Medianas, Medium Adult 25','13.6 Kg',1800,'10%',3,'https://www.amazon.com.mx/Royal-Croquetas-Medianas-Medium-empaque/dp/B00CITL9N8/ref=lp_12478588011_1_1?pf_rd_p=2e6393f5-b0da-469a-bb10-dff5f616611a&pf_rd_r=Z5M2DX71D9HT8FJYSPYA&pd_rd_r=ab274ca2-87b1-41f2-8b94-800f9dd2dd8d&pd_rd_wg=jfCz9&pd_rd_i=B00CITL9N8&psc=1&th=1','Amazon',1,1);
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
INSERT INTO `producto_has_comentario` VALUES (1,1),(2,2);
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
INSERT INTO `rol` VALUES (1,'admin','cliente'),(2,'usuario','integrantes_kk');
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_producto`
--

LOCK TABLES `tipo_producto` WRITE;
/*!40000 ALTER TABLE `tipo_producto` DISABLE KEYS */;
INSERT INTO `tipo_producto` VALUES (1,'Alimento',1),(2,'Accesorios',1),(3,'Juguetes',1),(4,'Alimento',2),(5,'Accesorios',2),(6,'Juguetes',2);
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
  `contraseña` varchar(45) NOT NULL,
  `fechaNacimiento` timestamp NOT NULL,
  `Rol_id` bigint NOT NULL,
  PRIMARY KEY (`id`,`Rol_id`),
  KEY `fk_Usuario_Rol_idx` (`Rol_id`),
  CONSTRAINT `fk_Usuario_Rol` FOREIGN KEY (`Rol_id`) REFERENCES `rol` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Olivia Rivas','Av. Insurgentes Sur 1234, Col. Del Valle, CDMX','123456789','olivia@gmail.com','contraseña1','2000-01-01 06:00:00',1),(2,'Cynthia Rosales','Av. Paseo de la Reforma 567, Col. Juárez, CDMX','123456780','cynthia@hotmail.com','contraseña2','1999-02-02 06:00:00',1),(3,'Brayan Hernández','Calle Durango 89, Col. Roma, CDMX','123456781','brayan@gmail.com','contraseña3','1998-03-03 06:00:00',1),(4,'Mario Mata','Av. Álvaro Obregón 456, Col. Condesa, CDMX','123456782','mario@hotmail.com','contraseña4','1997-04-04 06:00:00',1),(5,'Miguel Ortega','Calle Tamaulipas 678, Col. Hipódromo, CDMX','123456783','miguel@gmail.com','contraseña5','1996-05-05 06:00:00',1),(6,'Alejandro Flores','Av. Álvaro Obregón 789, Col. Roma Norte, CDMX','123456784','alejandro@hotmail.com','contraseña6','1995-06-06 06:00:00',1),(7,'María Pérez','Av. Insurgentes Sur 2468, Col. Del Valle, CDMX','123456785','maria@gmail.com','contraseña7','1994-07-07 06:00:00',1),(8,'Juan González','Av. Universidad 345, Col. Narvarte, CDMX','123456786','juan@hotmail.com','contraseña8','1993-08-08 06:00:00',2),(9,'Laura Martínez','Calle Guadalajara 567, Col. Roma, CDMX','123456787','laura@gmail.com','contraseña9','1992-09-09 06:00:00',2),(10,'Pedro Sánchez','Av. Cuauhtémoc 456, Col. Roma Norte, CDMX','123456788','pedro@hotmail.com','contraseña10','1991-10-10 06:00:00',2),(11,'Ana López','Av. Chapultepec 1234, Col. Condesa, CDMX','123456789','ana@gmail.com','contraseña11','1990-11-11 06:00:00',2),(12,'Diego Rodríguez','Av. Álvaro Obregón 567, Col. Roma Norte, CDMX','123456790','diego@hotmail.com','contraseña12','1989-12-12 06:00:00',2),(13,'Fernanda García','Av. Insurgentes Sur 2468, Col. Del Valle, CDMX','123456791','fernanda@gmail.com','contraseña13','1988-01-01 06:00:00',2),(14,'Carlos Martínez','Av. Universidad 345, Col. Narvarte, CDMX','123456792','carlos@hotmail.com','contraseña14','1987-02-02 06:00:00',2),(15,'Diana Rodríguez','Calle Guadalajara 567, Col. Roma, CDMX','123456793','diana@gmail.com','contraseña15','1986-03-03 06:00:00',2),(16,'Javier Sánchez','Av. Cuauhtémoc 789, Col. Doctores, CDMX','123456794','javier@hotmail.com','contraseña16','1985-04-04 06:00:00',2),(17,'Isabela Pérez','Av. Chapultepec 1234, Col. Condesa, CDMX','123456795','isabela@gmail.com','contraseña17','1984-05-05 06:00:00',2),(18,'Rodrigo García','Av. Álvaro Obregón 567, Col. Roma Norte, CDMX','123456796','rodrigo@hotmail.com','contraseña18','1983-06-06 06:00:00',2),(19,'Natalia Martínez','Calle Durango 890, Col. Roma, CDMX','123456797','natalia@gmail.com','contraseña19','1982-07-07 06:00:00',2),(20,'Sofía Hernández','Av. Paseo de la Reforma 456, Col. Juárez, CDMX','123456798','sofia@hotmail.com','contraseña20','1981-08-08 06:00:00',2);
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

-- Dump completed on 2023-12-22 14:05:22
