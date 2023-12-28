-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_petsupermarket
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_petsupermarket
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_petsupermarket` DEFAULT CHARACTER SET utf8 ;
USE `db_petsupermarket` ;

-- -----------------------------------------------------
-- Table `db_petsupermarket`.`Rol`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`Rol` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`Usuario` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(70) NOT NULL,
  `direccion` VARCHAR(300) NOT NULL,
  `telefono` VARCHAR(30) NOT NULL,
  `email` VARCHAR(120) NOT NULL,
  `contraseña` VARCHAR(45) NOT NULL,
  `fechaNacimiento` TIMESTAMP NOT NULL,
  `ciudad` VARCHAR(45) NOT NULL,
  `cp` VARCHAR(10) NOT NULL,
  `Rol_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`, `Rol_id`),
  INDEX `fk_Usuario_Rol_idx` (`Rol_id` ASC) VISIBLE,
  CONSTRAINT `fk_Usuario_Rol`
    FOREIGN KEY (`Rol_id`)
    REFERENCES `db_petsupermarket`.`Rol` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`Categorias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`Categorias` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`Tipo_Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`Tipo_Producto` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `tipoProducto` VARCHAR(45) NOT NULL,
  `Categorias_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`, `Categorias_id`),
  INDEX `fk_Tipo_Producto_Categorias1_idx` (`Categorias_id` ASC) VISIBLE,
  CONSTRAINT `fk_Tipo_Producto_Categorias1`
    FOREIGN KEY (`Categorias_id`)
    REFERENCES `db_petsupermarket`.`Categorias` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`Producto` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(200) NOT NULL,
  `contenido` VARCHAR(45) NOT NULL,
  `precio` DECIMAL NOT NULL,
  `descuento` INT NOT NULL,
  `existencia` BIGINT NOT NULL,
  `imagen` VARCHAR(500) NOT NULL,
  `marca` VARCHAR(45) NOT NULL,
  `Tipo_Producto_id` BIGINT NOT NULL,
  `Tipo_Producto_Categorias_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`, `Tipo_Producto_id`, `Tipo_Producto_Categorias_id`),
  INDEX `fk_Producto_Tipo_Producto1_idx` (`Tipo_Producto_id` ASC, `Tipo_Producto_Categorias_id` ASC) VISIBLE,
  CONSTRAINT `fk_Producto_Tipo_Producto1`
    FOREIGN KEY (`Tipo_Producto_id` , `Tipo_Producto_Categorias_id`)
    REFERENCES `db_petsupermarket`.`Tipo_Producto` (`id` , `Categorias_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`Bolsa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`Bolsa` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `fecha_compra` TIMESTAMP NOT NULL,
  `Usuario_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`, `Usuario_id`),
  INDEX `fk_Bolsa_Usuario1_idx` (`Usuario_id` ASC) VISIBLE,
  CONSTRAINT `fk_Bolsa_Usuario1`
    FOREIGN KEY (`Usuario_id`)
    REFERENCES `db_petsupermarket`.`Usuario` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`Bolsa_has_productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`Bolsa_has_productos` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `cantidad` INT NOT NULL,
  `Bolsa_id` BIGINT NOT NULL,
  `Producto_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`, `Bolsa_id`, `Producto_id`),
  INDEX `fk_Bolsa_has_productos_Bolsa1_idx` (`Bolsa_id` ASC) VISIBLE,
  INDEX `fk_Bolsa_has_productos_Producto1_idx` (`Producto_id` ASC) VISIBLE,
  CONSTRAINT `fk_Bolsa_has_productos_Bolsa1`
    FOREIGN KEY (`Bolsa_id`)
    REFERENCES `db_petsupermarket`.`Bolsa` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Bolsa_has_productos_Producto1`
    FOREIGN KEY (`Producto_id`)
    REFERENCES `db_petsupermarket`.`Producto` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`Comentarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`Comentarios` (
  `id` BIGINT NOT NULL,
  `fecha` DATETIME NULL,
  `comentario` VARCHAR(100) NULL,
  `calificacion` INT NULL,
  `Usuario_id` BIGINT NOT NULL,
  `Producto_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Comentarios_Usuario1_idx` (`Usuario_id` ASC) VISIBLE,
  INDEX `fk_Comentarios_Producto1_idx` (`Producto_id` ASC) VISIBLE,
  CONSTRAINT `fk_Comentarios_Usuario1`
    FOREIGN KEY (`Usuario_id`)
    REFERENCES `db_petsupermarket`.`Usuario` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Comentarios_Producto1`
    FOREIGN KEY (`Producto_id`)
    REFERENCES `db_petsupermarket`.`Producto` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
