CREATE TABLE `gestor_biblioteca`.`usuarios` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `dni` VARCHAR(8) NOT NULL,
  `apellidos` VARCHAR(50) NOT NULL,
  `direccion` VARCHAR(100) NULL,
  `telefono` VARCHAR(45) NULL,
  `email` VARCHAR(150) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `dni_UNIQUE` (`dni` ASC) VISIBLE);

ALTER TABLE `gestor_biblioteca`.`usuarios` MODIFY COLUMN id INT AUTO_INCREMENT;

CREATE TABLE `gestor_biblioteca`.`libros` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(100) NOT NULL,
  `fecha_publicacion` DATE NOT NULL,
  `autor` VARCHAR(100) NOT NULL,
  `disponibilidad` TINYINT NULL,
  `genero` VARCHAR(45) NOT NULL,
  `isbn` VARCHAR(45) NOT NULL,
  `paginas` INT(10) NOT NULL,
  PRIMARY KEY (`id`));

  CREATE TABLE `gestor_biblioteca`.`cds` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(100) NOT NULL,
  `autor` VARCHAR(100) NOT NULL,
  `fecha_publicacion` DATE NOT NULL,
  `disponibilidad` TINYINT NOT NULL,
  `genero` VARCHAR(45) NULL,
  `duracion` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

  CREATE TABLE `gestor_biblioteca`.`empleados` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `dni` VARCHAR(8) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(100) NOT NULL,
  `telefono` VARCHAR(45) NULL,
  `cargo` VARCHAR(45) NULL,
  `salario` FLOAT NULL,
  `idJefe` INT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `gestor_biblioteca`.`prestamos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `idUsuario` INT NULL,
  `idRegistrador` INT NULL,
  `idItem` INT NULL,
  `tipo` VARCHAR(45) NULL,
  `idDevolucion` INT NULL,
  `fecha` DATE NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `gestor_biblioteca`.`devoluciones` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `idUsuario` INT NULL,
  `idRegistrador` INT NULL,
  `idItem` INT NULL,
  `tipo` VARCHAR(45) NULL,
  `idPrestamo` INT NULL,
  `fecha` DATE NULL,
  PRIMARY KEY (`id`));

