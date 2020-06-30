-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.5.0-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para hondumedic
CREATE DATABASE IF NOT EXISTS `hondumedic` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `hondumedic`;

-- Volcando estructura para tabla hondumedic.alimentos
CREATE TABLE IF NOT EXISTS `alimentos` (
  `codigo_al` varchar(20) NOT NULL DEFAULT '',
  `tipo_al` varchar(50) DEFAULT NULL,
  `nombre_al` varchar(50) DEFAULT NULL,
  `precio_al` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`codigo_al`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.alimentos: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `alimentos` DISABLE KEYS */;
REPLACE INTO `alimentos` (`codigo_al`, `tipo_al`, `nombre_al`, `precio_al`) VALUES
	('AL0001', 'BEBIDAS', 'AGUA', 3.00),
	('AL0002', 'TIPO ALIMENTO', 'ALMUERZO', 60.00),
	('AL0003', 'BEBIDAS', 'JUGO', 50.00);
/*!40000 ALTER TABLE `alimentos` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.caja_laboratorio
CREATE TABLE IF NOT EXISTS `caja_laboratorio` (
  `idventa` varchar(20) NOT NULL DEFAULT '',
  `codigo_examen` varchar(20) NOT NULL,
  `paciente` varchar(20) NOT NULL,
  `fecha` varchar(50) NOT NULL,
  `estado_pago` varchar(20) NOT NULL,
  `abonado` decimal(10,0) DEFAULT NULL,
  `pendiente` decimal(10,0) DEFAULT NULL,
  `total` decimal(10,0) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.caja_laboratorio: ~17 rows (aproximadamente)
/*!40000 ALTER TABLE `caja_laboratorio` DISABLE KEYS */;
REPLACE INTO `caja_laboratorio` (`idventa`, `codigo_examen`, `paciente`, `fecha`, `estado_pago`, `abonado`, `pendiente`, `total`) VALUES
	('00000001', 'EL0001', 'Mosa Nayon', '16/06/2020', 'Contado', 0, NULL, 124),
	('00000002', 'EL0001', 'Mosa Nayon', '17/06/2020', 'Crédito', 100, 43, 143),
	('00000003', 'EL0001', 'Mosa Nayon', '17/06/2020', 'Crédito', 50, 74, 124),
	('00000004', 'EL0001', 'Mosa Nayon', '17/06/2020', 'Contado', 75, 68, 143),
	('00000005', 'EL0001', 'Mosa Nayon', '17/06/2020', 'Contado', 84, 40, 124),
	('00000006', 'EL0001', 'Mosa Nayon', '17/06/2020', 'Contado', NULL, NULL, 143),
	('00000007', 'EL0001', 'Mosa Nayon', '17/06/2020', 'Contado', NULL, NULL, 124),
	('00000008', 'EL0001', 'Mosa Nayon', '17/06/2020', 'Contado', NULL, NULL, 124),
	('00000009', 'EL0001', 'Mosa Nayon', '17/06/2020', 'Contado', NULL, NULL, 143),
	('00000010', 'EL0001', 'Mosa Nayon', '17/06/2020', 'Contado', 120, 4, 124),
	('00000011', 'EL0001', 'Mosa Nayon', '17/06/2020', 'Contado', NULL, NULL, 124),
	('00000012', 'EL0001', 'Mosa Nayon', '17/06/2020', 'Contado', NULL, NULL, 143),
	('00000013', 'EL0001', 'Mosa Nayon', '17/06/2020', 'Contado', NULL, NULL, 124),
	('00000014', 'EL0001', 'Mosa Nayon', '17/06/2020', 'Contado', NULL, NULL, 124),
	('00000015', 'EL0001', 'Mosa Nayon', '17/06/2020', 'Contado', NULL, NULL, 124),
	('00000016', 'EL0001', 'Mosa Nayon', '17/06/2020', 'Contado', NULL, NULL, 124),
	('00000017', 'EL0001', 'Mosa Nayon', '17/06/2020', 'Crédito', 125, 18, 143),
	('00000018', 'EL0001', 'Mosa Nayon', '19/06/2020', 'Contado', NULL, NULL, 143),
	('00000019', 'EL0001', 'Mosa Nayon', '19/06/2020', 'Crédito', 21, 124, 145),
	('00000020', 'EL0002', 'jason class', '19/06/2020', 'Contado', 100, 105, 205);
/*!40000 ALTER TABLE `caja_laboratorio` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.caja_rayosx
CREATE TABLE IF NOT EXISTS `caja_rayosx` (
  `idventa` varchar(20) NOT NULL DEFAULT '',
  `codigo_examen` varchar(20) NOT NULL,
  `paciente` varchar(20) NOT NULL,
  `fecha` varchar(50) NOT NULL,
  `estado_pago` varchar(20) NOT NULL,
  `abonado` decimal(10,0) DEFAULT NULL,
  `pendiente` decimal(10,0) DEFAULT NULL,
  `total` decimal(10,0) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.caja_rayosx: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `caja_rayosx` DISABLE KEYS */;
REPLACE INTO `caja_rayosx` (`idventa`, `codigo_examen`, `paciente`, `fecha`, `estado_pago`, `abonado`, `pendiente`, `total`) VALUES
	('00000001', 'RX0001', 'jonas cruz', '19/06/2020', 'Contado', 200, 200, 400),
	('00000002', 'RX0001', 'jonas cruz', '19/06/2020', 'Contado', NULL, NULL, 460),
	('00000003', 'RX0001', 'jonas cruz', '19/06/2020', 'Contado', NULL, NULL, 464),
	('00000004', 'RX0001', 'jonas cruz', '19/06/2020', 'Contado', NULL, NULL, 400),
	('00000005', 'RX0001', 'jonas cruz', '19/06/2020', 'Contado', NULL, NULL, 460),
	('00000006', 'RX0001', 'jonas cruz', '19/06/2020', 'Contado', NULL, NULL, 400),
	('00000007', 'RX0001', 'jonas cruz', '19/06/2020', 'Contado', 400, 60, 460);
/*!40000 ALTER TABLE `caja_rayosx` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.caja_servicios
CREATE TABLE IF NOT EXISTS `caja_servicios` (
  `idventa` varchar(20) NOT NULL DEFAULT '',
  `codigo_examen` varchar(20) NOT NULL,
  `cod_servicio` varchar(20) NOT NULL DEFAULT '',
  `paciente` varchar(20) NOT NULL,
  `fecha` varchar(50) NOT NULL,
  `estado_pago` varchar(20) NOT NULL,
  `abonado` decimal(10,0) DEFAULT NULL,
  `pendiente` decimal(10,0) DEFAULT NULL,
  `total` decimal(10,0) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.caja_servicios: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `caja_servicios` DISABLE KEYS */;
REPLACE INTO `caja_servicios` (`idventa`, `codigo_examen`, `cod_servicio`, `paciente`, `fecha`, `estado_pago`, `abonado`, `pendiente`, `total`) VALUES
	('00000001', 'RE0001', 'EN', 'jonas cruz', '27/06/2020', 'Contado', NULL, NULL, 575),
	('00000002', 'RU0001', 'U', 'Liz Nilzen', '30/06/2020', 'Crédito', 200, 310, 510),
	('00000003', 'RU0001', 'U', 'Liz Nilzen', '30/06/2020', 'Contado', NULL, NULL, 587),
	('00000004', 'EE0002', 'E', 'jason class', '30/06/2020', 'Crédito', 100, 38, 138);
/*!40000 ALTER TABLE `caja_servicios` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.cirugia
CREATE TABLE IF NOT EXISTS `cirugia` (
  `codigo_cirugia` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `Precio` decimal(10,0) NOT NULL,
  PRIMARY KEY (`codigo_cirugia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.cirugia: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `cirugia` DISABLE KEYS */;
REPLACE INTO `cirugia` (`codigo_cirugia`, `nombre`, `descripcion`, `Precio`) VALUES
	('SC0001', 'Cierre de Herida ', '', 100);
/*!40000 ALTER TABLE `cirugia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_ambulancia
CREATE TABLE IF NOT EXISTS `detalle_test_ambulancia` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_ambulancia: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_ambulancia` DISABLE KEYS */;
REPLACE INTO `detalle_test_ambulancia` (`id_detalle`, `idventa`, `codigo`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(8, 'RA0001', '3', '014s', '151', '1', '151.0'),
	(9, 'RA0001', '5', 'bfd', '100.0', '1', '100.0');
/*!40000 ALTER TABLE `detalle_test_ambulancia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_cirugia
CREATE TABLE IF NOT EXISTS `detalle_test_cirugia` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_cirugia: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_cirugia` DISABLE KEYS */;
REPLACE INTO `detalle_test_cirugia` (`id_detalle`, `idventa`, `codigo`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(1, 'RC0001', 'IC0001', 'Pinzas', '20.0', '2', '40.0'),
	(2, 'RC0001', 'SC0001', 'Cirugía Ortopédica', '600', '1', '600.0');
/*!40000 ALTER TABLE `detalle_test_cirugia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_emergencia
CREATE TABLE IF NOT EXISTS `detalle_test_emergencia` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_emergencia: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_emergencia` DISABLE KEYS */;
REPLACE INTO `detalle_test_emergencia` (`id_detalle`, `idventa`, `codigo`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(7, 'EE0001', 'PE0002', 'Mascarilla', '30.0', '5', '150.0'),
	(8, 'EE0001', 'SE0001', 'Nebulización con salbutamol', '100', '1', '100.0'),
	(9, 'EE0002', 'PE0001', 'Guantes', '10.0', '2', '20.0'),
	(10, 'EE0002', 'SE0001', 'Nebulización con salbutamol', '100', '1', '100.0');
/*!40000 ALTER TABLE `detalle_test_emergencia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_endoscopia
CREATE TABLE IF NOT EXISTS `detalle_test_endoscopia` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_endoscopia: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_endoscopia` DISABLE KEYS */;
REPLACE INTO `detalle_test_endoscopia` (`id_detalle`, `idventa`, `codigo`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(1, 'RE0001', 'IE0001', 'Pinzas', '200.0', '1', '200.0'),
	(2, 'RE0001', 'SE0002', 'Endoscopia colónica ', '300', '1', '300.0');
/*!40000 ALTER TABLE `detalle_test_endoscopia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_hospitalizacion
CREATE TABLE IF NOT EXISTS `detalle_test_hospitalizacion` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_hospitalizacion: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_hospitalizacion` DISABLE KEYS */;
REPLACE INTO `detalle_test_hospitalizacion` (`id_detalle`, `idventa`, `codigo`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(4, 'EH0001', 'IH0001', 'Camilla', '500.0', '1', '500.0'),
	(5, 'EH0001', 'SH0001', 'Cuidados de enfermería por día ', '75', '1', '75.0'),
	(6, 'EH0002', 'IH0001', 'Camilla', '500.0', '1', '500.0'),
	(7, 'EH0002', 'SH0001', 'Cuidados de enfermería por día ', '75', '1', '75.0');
/*!40000 ALTER TABLE `detalle_test_hospitalizacion` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_laboratorio
CREATE TABLE IF NOT EXISTS `detalle_test_laboratorio` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_laboratorio: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_laboratorio` DISABLE KEYS */;
REPLACE INTO `detalle_test_laboratorio` (`id_detalle`, `idventa`, `codigo`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(7, 'EL0001', 'PL0002', 'pastillas', '12.0', '2', '24.0'),
	(8, 'EL0001', 'SL0001', 'Muestra de Sangre', '100', '1', '100.0'),
	(9, 'EL0002', 'PL0002', 'pastillas', '12.0', '2', '24.0'),
	(10, 'EL0002', 'SL0001', 'Muestra de Sangre', '100', '1', '100.0'),
	(11, 'EL0002', 'PL0001', 'guantes', '54.0', '1', '54.0');
/*!40000 ALTER TABLE `detalle_test_laboratorio` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_rayosx
CREATE TABLE IF NOT EXISTS `detalle_test_rayosx` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_rayosx: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_rayosx` DISABLE KEYS */;
REPLACE INTO `detalle_test_rayosx` (`id_detalle`, `idventa`, `codigo`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(6, 'RX0001', 'IR0001', 'rayo', '100.0', '2', '200.0'),
	(7, 'RX0001', 'SR0001', 'Localizar Lesiones', '200', '1', '200.0');
/*!40000 ALTER TABLE `detalle_test_rayosx` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_ultrasonido
CREATE TABLE IF NOT EXISTS `detalle_test_ultrasonido` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_ultrasonido: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_ultrasonido` DISABLE KEYS */;
REPLACE INTO `detalle_test_ultrasonido` (`id_detalle`, `idventa`, `codigo`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(5, 'RU0001', 'IU0001', 'Guantes', '10.0', '1', '10.0'),
	(6, 'RU0001', 'SU0001', 'Ultrasonido Doppler', '500', '1', '500.0');
/*!40000 ALTER TABLE `detalle_test_ultrasonido` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.empleado
CREATE TABLE IF NOT EXISTS `empleado` (
  `codigo_empleado` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `rol` varchar(20) NOT NULL,
  `direccion` varchar(150) DEFAULT NULL,
  `telefono` int(3) NOT NULL,
  `tipo_empleado` varchar(20) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.empleado: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
REPLACE INTO `empleado` (`codigo_empleado`, `nombre`, `apellido`, `rol`, `direccion`, `telefono`, `tipo_empleado`) VALUES
	('1501198054120', 'Cristian', 'Antunez', 'Conductor', 'Barrio la olla', 98974586, 'Temporal'),
	('1501199023154', 'Lauren', 'Cruz', 'Doctor (a)', '', 99631279, 'Permanente'),
	('0801995757955', 'Rocio', 'Paz', 'Enfermera (o)', '', 85847896, 'Permanente');
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.gastos
CREATE TABLE IF NOT EXISTS `gastos` (
  `idgasto` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` text NOT NULL,
  `gastado` double(10,2) NOT NULL,
  `fecha_gasto` varchar(50) NOT NULL,
  PRIMARY KEY (`idgasto`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.gastos: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `gastos` DISABLE KEYS */;
REPLACE INTO `gastos` (`idgasto`, `descripcion`, `gastado`, `fecha_gasto`) VALUES
	(19, '-COMPRA DE MATERIAL DE LIMPIEZA\n-GOLOSINAS', 1000.00, '03/05/2020');
/*!40000 ALTER TABLE `gastos` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.inventario_ambulancia
CREATE TABLE IF NOT EXISTS `inventario_ambulancia` (
  `codigo_ambulancia` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_ambulancia`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_ambulancia: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_ambulancia` DISABLE KEYS */;
REPLACE INTO `inventario_ambulancia` (`codigo_ambulancia`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	(2, 'ambulancia', 150000, 'hggggg', 50),
	(4, '541', 1000, '', 0),
	(5, 'bfd', 100, '', 2);
/*!40000 ALTER TABLE `inventario_ambulancia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.inventario_cirugia
CREATE TABLE IF NOT EXISTS `inventario_cirugia` (
  `codigo_cirugia` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_cirugia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_cirugia: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_cirugia` DISABLE KEYS */;
REPLACE INTO `inventario_cirugia` (`codigo_cirugia`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	('IC0001', 'Pinzas', 20, '', 2);
/*!40000 ALTER TABLE `inventario_cirugia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.inventario_emergencia
CREATE TABLE IF NOT EXISTS `inventario_emergencia` (
  `codigo_emergencia` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_emergencia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_emergencia: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_emergencia` DISABLE KEYS */;
REPLACE INTO `inventario_emergencia` (`codigo_emergencia`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	('PE0001', 'Guantes', 10, '', 9),
	('PE0002', 'Mascarilla', 30, '', 5);
/*!40000 ALTER TABLE `inventario_emergencia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.inventario_endoscopia
CREATE TABLE IF NOT EXISTS `inventario_endoscopia` (
  `codigo_endoscopia` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_endoscopia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_endoscopia: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_endoscopia` DISABLE KEYS */;
REPLACE INTO `inventario_endoscopia` (`codigo_endoscopia`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	('IE0001', 'Pinzas', 200, '', 3);
/*!40000 ALTER TABLE `inventario_endoscopia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.inventario_hospitalizacion
CREATE TABLE IF NOT EXISTS `inventario_hospitalizacion` (
  `codigo_hospitalizacion` varchar(50) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_hospitalizacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_hospitalizacion: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_hospitalizacion` DISABLE KEYS */;
REPLACE INTO `inventario_hospitalizacion` (`codigo_hospitalizacion`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	('IH0001', 'Camilla', 500, '', 1);
/*!40000 ALTER TABLE `inventario_hospitalizacion` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.inventario_laboratorio
CREATE TABLE IF NOT EXISTS `inventario_laboratorio` (
  `codigo_laboratorio` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_laboratorio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_laboratorio: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_laboratorio` DISABLE KEYS */;
REPLACE INTO `inventario_laboratorio` (`codigo_laboratorio`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	('PL0001', 'guantes', 54, 'fg', 3),
	('PL0002', 'pastillas', 12, '', 15);
/*!40000 ALTER TABLE `inventario_laboratorio` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.inventario_rayosx
CREATE TABLE IF NOT EXISTS `inventario_rayosx` (
  `codigo_rayosx` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_rayosx`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_rayosx: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_rayosx` DISABLE KEYS */;
REPLACE INTO `inventario_rayosx` (`codigo_rayosx`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	('IR0001', 'rayo', 100, '', 6);
/*!40000 ALTER TABLE `inventario_rayosx` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.inventario_ultrasonido
CREATE TABLE IF NOT EXISTS `inventario_ultrasonido` (
  `codigo_ultrasonido` varchar(20) NOT NULL DEFAULT '0',
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_ultrasonido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_ultrasonido: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_ultrasonido` DISABLE KEYS */;
REPLACE INTO `inventario_ultrasonido` (`codigo_ultrasonido`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	('IU0001', 'Guantes', 10, '', 7);
/*!40000 ALTER TABLE `inventario_ultrasonido` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.nfactura
CREATE TABLE IF NOT EXISTS `nfactura` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `val` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.nfactura: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `nfactura` DISABLE KEYS */;
REPLACE INTO `nfactura` (`id`, `val`) VALUES
	(1, '1');
/*!40000 ALTER TABLE `nfactura` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.paciente
CREATE TABLE IF NOT EXISTS `paciente` (
  `codigo_paciente` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `direccion` varchar(150) DEFAULT NULL,
  `edad` int(3) NOT NULL,
  `telefono` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.paciente: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
REPLACE INTO `paciente` (`codigo_paciente`, `nombre`, `apellido`, `direccion`, `edad`, `telefono`) VALUES
	('1503200002610', 'jonas', 'cruz', 'smdf', 20, 0),
	('1500003245856', 'jason', 'class', '', 60, 0),
	('0121199805416', 'Mosa', 'Nayon', '', 45, 98754895),
	('0801199502154', 'Ximena', 'Jaramillo', 'jk', 45, 89745814),
	('1502032151465', 'Liz', 'Nilzen', '', 22, 879451032);
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.registrar_ambulancia
CREATE TABLE IF NOT EXISTS `registrar_ambulancia` (
  `codigo_ambulancia` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `marca` varchar(50) DEFAULT NULL,
  `year` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`codigo_ambulancia`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.registrar_ambulancia: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `registrar_ambulancia` DISABLE KEYS */;
REPLACE INTO `registrar_ambulancia` (`codigo_ambulancia`, `nombre`, `marca`, `year`) VALUES
	(2, 'Ambulancia Individual. ', 'Toyota', 19998),
	(3, 'Ambulancia Colectiva', 'Toyota', 2000);
/*!40000 ALTER TABLE `registrar_ambulancia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.registro_venta
CREATE TABLE IF NOT EXISTS `registro_venta` (
  `numero` varchar(20) NOT NULL DEFAULT '',
  `total` decimal(10,2) DEFAULT NULL,
  `fecha` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.registro_venta: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `registro_venta` DISABLE KEYS */;
REPLACE INTO `registro_venta` (`numero`, `total`, `fecha`) VALUES
	('00000001', 300.00, '25/04/2020'),
	('00000002', 63.00, '27/04/2020');
/*!40000 ALTER TABLE `registro_venta` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.servicio_ambulancia
CREATE TABLE IF NOT EXISTS `servicio_ambulancia` (
  `codigo_ambulancia` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `precio` decimal(10,0) NOT NULL DEFAULT 0,
  PRIMARY KEY (`codigo_ambulancia`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.servicio_ambulancia: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `servicio_ambulancia` DISABLE KEYS */;
REPLACE INTO `servicio_ambulancia` (`codigo_ambulancia`, `nombre`, `descripcion`, `precio`) VALUES
	(3, '014s', 'fsafs', 151);
/*!40000 ALTER TABLE `servicio_ambulancia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.servicio_emergencia
CREATE TABLE IF NOT EXISTS `servicio_emergencia` (
  `codigo_emergencia` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `precio` decimal(10,0) NOT NULL,
  PRIMARY KEY (`codigo_emergencia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.servicio_emergencia: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `servicio_emergencia` DISABLE KEYS */;
REPLACE INTO `servicio_emergencia` (`codigo_emergencia`, `nombre`, `descripcion`, `precio`) VALUES
	('SE0001', 'Nebulización con salbutamol', 'Descripción', 100);
/*!40000 ALTER TABLE `servicio_emergencia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.servicio_endoscopia
CREATE TABLE IF NOT EXISTS `servicio_endoscopia` (
  `codigo_endoscopia` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `precio` decimal(10,0) NOT NULL DEFAULT 0,
  PRIMARY KEY (`codigo_endoscopia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.servicio_endoscopia: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `servicio_endoscopia` DISABLE KEYS */;
REPLACE INTO `servicio_endoscopia` (`codigo_endoscopia`, `nombre`, `descripcion`, `precio`) VALUES
	('SE0001', 'Endoscopia gástrica', '', 150),
	('SE0002', 'Endoscopia colónica ', '', 300);
/*!40000 ALTER TABLE `servicio_endoscopia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.servicio_hospitalizacion
CREATE TABLE IF NOT EXISTS `servicio_hospitalizacion` (
  `codigo_hospitalizacion` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `precio` decimal(10,0) NOT NULL,
  PRIMARY KEY (`codigo_hospitalizacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.servicio_hospitalizacion: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `servicio_hospitalizacion` DISABLE KEYS */;
REPLACE INTO `servicio_hospitalizacion` (`codigo_hospitalizacion`, `nombre`, `descripcion`, `precio`) VALUES
	('SH0001', 'Cuidados de enfermería por día ', '', 75);
/*!40000 ALTER TABLE `servicio_hospitalizacion` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.servicio_laboratorio
CREATE TABLE IF NOT EXISTS `servicio_laboratorio` (
  `codigo_laboratorio` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `precio` decimal(10,0) NOT NULL DEFAULT 0,
  PRIMARY KEY (`codigo_laboratorio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.servicio_laboratorio: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `servicio_laboratorio` DISABLE KEYS */;
REPLACE INTO `servicio_laboratorio` (`codigo_laboratorio`, `nombre`, `descripcion`, `precio`) VALUES
	('SL0001', 'Muestra de Sangre', 'dmfv', 100);
/*!40000 ALTER TABLE `servicio_laboratorio` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.servicio_rayosx
CREATE TABLE IF NOT EXISTS `servicio_rayosx` (
  `codigo_rayosx` varchar(20) NOT NULL DEFAULT 'AUTO_INCREMENT',
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `precio` decimal(10,0) NOT NULL DEFAULT 0,
  PRIMARY KEY (`codigo_rayosx`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.servicio_rayosx: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `servicio_rayosx` DISABLE KEYS */;
REPLACE INTO `servicio_rayosx` (`codigo_rayosx`, `nombre`, `descripcion`, `precio`) VALUES
	('SR0001', 'Localizar Lesiones', '', 200);
/*!40000 ALTER TABLE `servicio_rayosx` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.servicio_ultrasonido
CREATE TABLE IF NOT EXISTS `servicio_ultrasonido` (
  `codigo_ultrasonido` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `precio` decimal(10,0) NOT NULL DEFAULT 0,
  PRIMARY KEY (`codigo_ultrasonido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.servicio_ultrasonido: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `servicio_ultrasonido` DISABLE KEYS */;
REPLACE INTO `servicio_ultrasonido` (`codigo_ultrasonido`, `nombre`, `descripcion`, `precio`) VALUES
	('SU0001', 'Ultrasonido Doppler', 'Permite estudiar el cordón umbilical, la circulación cerebral y cardiaca fetal, así como la circulación uterina.', 500);
/*!40000 ALTER TABLE `servicio_ultrasonido` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.test_ambulancia
CREATE TABLE IF NOT EXISTS `test_ambulancia` (
  `codigo` varchar(20) NOT NULL DEFAULT '',
  `paciente` varchar(20) NOT NULL,
  `medico_1` varchar(20) NOT NULL,
  `conductor` varchar(20) NOT NULL,
  `ambulancia` varchar(15) NOT NULL,
  `origen` varchar(150) DEFAULT NULL,
  `destino` varchar(50) NOT NULL,
  `km` varchar(50) NOT NULL,
  `fecha` varchar(50) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.test_ambulancia: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `test_ambulancia` DISABLE KEYS */;
REPLACE INTO `test_ambulancia` (`codigo`, `paciente`, `medico_1`, `conductor`, `ambulancia`, `origen`, `destino`, `km`, `fecha`, `total`) VALUES
	('RA0001', 'Ximena Jaramillo', 'Rocio Paz', 'Cristian Antunez', 'amulanciaMedic', 'Catacamas', 'Juticalpa', '90', '20/06/2020 22:22:26', 251);
/*!40000 ALTER TABLE `test_ambulancia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.test_cirugia
CREATE TABLE IF NOT EXISTS `test_cirugia` (
  `codigo` varchar(20) NOT NULL DEFAULT '',
  `paciente` varchar(20) NOT NULL,
  `medico_1` varchar(20) NOT NULL,
  `medico_2` varchar(20) NOT NULL,
  `num_habitacion` varchar(15) NOT NULL,
  `observaciones` varchar(150) DEFAULT NULL,
  `fecha` varchar(50) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.test_cirugia: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `test_cirugia` DISABLE KEYS */;
REPLACE INTO `test_cirugia` (`codigo`, `paciente`, `medico_1`, `medico_2`, `num_habitacion`, `observaciones`, `fecha`, `total`) VALUES
	('RC0001', 'Liz Nilzen', 'Lauren Cruz', 'Rocio Paz', '0027', '', '25/06/2020 16:50:42', 640);
/*!40000 ALTER TABLE `test_cirugia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.test_emergencia
CREATE TABLE IF NOT EXISTS `test_emergencia` (
  `codigo` varchar(20) NOT NULL DEFAULT '',
  `paciente` varchar(20) NOT NULL,
  `medico_1` varchar(20) NOT NULL,
  `medico_2` varchar(20) NOT NULL,
  `medico_3` varchar(20) NOT NULL,
  `num_habitacion` varchar(15) NOT NULL,
  `observaciones` varchar(150) DEFAULT NULL,
  `fecha` varchar(50) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.test_emergencia: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `test_emergencia` DISABLE KEYS */;
REPLACE INTO `test_emergencia` (`codigo`, `paciente`, `medico_1`, `medico_2`, `medico_3`, `num_habitacion`, `observaciones`, `fecha`, `total`) VALUES
	('EE0001', 'jonas cruz', 'Lauren Cruz', 'Cristian Antunez', 'Cristian Antunez', 'EM101', '', '31/05/2020 09:08:46', 250),
	('EE0002', 'jason class', 'Cristian Antunez', 'Lauren Cruz', 'Lauren Cruz', 'EM225', '', '31/05/2020 09:19:25', 120);
/*!40000 ALTER TABLE `test_emergencia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.test_endoscopia
CREATE TABLE IF NOT EXISTS `test_endoscopia` (
  `codigo` varchar(20) NOT NULL DEFAULT '',
  `paciente` varchar(20) NOT NULL,
  `medico_1` varchar(20) NOT NULL,
  `medico_2` varchar(20) NOT NULL,
  `medico_3` varchar(20) NOT NULL,
  `num_habitacion` varchar(15) NOT NULL,
  `observaciones` varchar(150) DEFAULT NULL,
  `fecha` varchar(50) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.test_endoscopia: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `test_endoscopia` DISABLE KEYS */;
REPLACE INTO `test_endoscopia` (`codigo`, `paciente`, `medico_1`, `medico_2`, `medico_3`, `num_habitacion`, `observaciones`, `fecha`, `total`) VALUES
	('RE0001', 'jonas cruz', 'Lauren Cruz', 'Lauren Cruz', 'Lauren Cruz', 'ENDOS105', '', '05/06/2020 14:28:01', 500);
/*!40000 ALTER TABLE `test_endoscopia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.test_hospitalizacion
CREATE TABLE IF NOT EXISTS `test_hospitalizacion` (
  `codigo` varchar(20) NOT NULL DEFAULT '',
  `paciente` varchar(20) NOT NULL,
  `medico_1` varchar(20) NOT NULL,
  `medico_2` varchar(20) DEFAULT NULL,
  `medico_3` varchar(20) DEFAULT NULL,
  `num_habitacion` varchar(15) DEFAULT NULL,
  `observaciones` varchar(150) DEFAULT NULL,
  `fecha` varchar(50) NOT NULL,
  `total` double DEFAULT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.test_hospitalizacion: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `test_hospitalizacion` DISABLE KEYS */;
REPLACE INTO `test_hospitalizacion` (`codigo`, `paciente`, `medico_1`, `medico_2`, `medico_3`, `num_habitacion`, `observaciones`, `fecha`, `total`, `estado`) VALUES
	('EH0001', 'jonas cruz', 'Lauren Cruz', 'Lauren Cruz', 'Lauren Cruz', '014', 'Disparo', '07/06/2020 15:26:29', 575, 0),
	('EH0002', 'Mosa Nayon', 'Lauren Cruz', 'Cristian Antunez', 'Lauren Cruz', 'EH102', 'Herida de Arma blanca', '07/06/2020 15:17:54', 575, 1);
/*!40000 ALTER TABLE `test_hospitalizacion` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.test_laboratorio
CREATE TABLE IF NOT EXISTS `test_laboratorio` (
  `codigo` varchar(20) NOT NULL DEFAULT '',
  `paciente` varchar(20) NOT NULL,
  `medico_1` varchar(20) NOT NULL,
  `medico_2` varchar(20) NOT NULL,
  `num_habitacion` varchar(15) NOT NULL,
  `observaciones` varchar(150) DEFAULT NULL,
  `fecha` varchar(50) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.test_laboratorio: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `test_laboratorio` DISABLE KEYS */;
REPLACE INTO `test_laboratorio` (`codigo`, `paciente`, `medico_1`, `medico_2`, `num_habitacion`, `observaciones`, `fecha`, `total`) VALUES
	('EL0001', 'Mosa Nayon', 'Lauren Cruz', 'Lauren Cruz', 'LBH84', '', '08/06/2020 16:09:01', 124),
	('EL0002', 'jason class', 'Lauren Cruz', 'Lauren Cruz', '125', '', '19/06/2020 13:16:31', 178);
/*!40000 ALTER TABLE `test_laboratorio` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.test_rayosx
CREATE TABLE IF NOT EXISTS `test_rayosx` (
  `codigo` varchar(20) NOT NULL DEFAULT '',
  `paciente` varchar(20) NOT NULL,
  `medico_1` varchar(20) NOT NULL,
  `medico_2` varchar(20) NOT NULL,
  `num_habitacion` varchar(15) NOT NULL,
  `observaciones` varchar(150) DEFAULT NULL,
  `fecha` varchar(50) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.test_rayosx: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `test_rayosx` DISABLE KEYS */;
REPLACE INTO `test_rayosx` (`codigo`, `paciente`, `medico_1`, `medico_2`, `num_habitacion`, `observaciones`, `fecha`, `total`) VALUES
	('RX0001', 'jonas cruz', 'Lauren Cruz', 'Lauren Cruz', '23', '', '19/06/2020 15:03:53', 400);
/*!40000 ALTER TABLE `test_rayosx` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.test_ultrasonido
CREATE TABLE IF NOT EXISTS `test_ultrasonido` (
  `codigo` varchar(20) NOT NULL DEFAULT '',
  `paciente` varchar(20) NOT NULL,
  `medico_1` varchar(20) NOT NULL,
  `medico_2` varchar(20) NOT NULL,
  `medico_3` varchar(20) NOT NULL,
  `num_habitacion` varchar(15) NOT NULL,
  `observaciones` varchar(150) DEFAULT NULL,
  `fecha` varchar(50) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.test_ultrasonido: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `test_ultrasonido` DISABLE KEYS */;
REPLACE INTO `test_ultrasonido` (`codigo`, `paciente`, `medico_1`, `medico_2`, `medico_3`, `num_habitacion`, `observaciones`, `fecha`, `total`) VALUES
	('RU0001', 'Liz Nilzen', 'Lauren Cruz', 'Lauren Cruz', 'Lauren Cruz', '0021', '', '27/06/2020 15:05:59', 510);
/*!40000 ALTER TABLE `test_ultrasonido` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.unidad_apa
CREATE TABLE IF NOT EXISTS `unidad_apa` (
  `codigo_unidad_apa` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `precio` decimal(10,0) NOT NULL,
  PRIMARY KEY (`codigo_unidad_apa`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.unidad_apa: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `unidad_apa` DISABLE KEYS */;
REPLACE INTO `unidad_apa` (`codigo_unidad_apa`, `nombre`, `descripcion`, `precio`) VALUES
	(2, 're', 'er', 568);
/*!40000 ALTER TABLE `unidad_apa` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.usuarios
CREATE TABLE IF NOT EXISTS `usuarios` (
  `codigo` int(100) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `fecha_nacimiento` varchar(50) NOT NULL DEFAULT '',
  `sexo` varchar(1) NOT NULL,
  `telefono` int(11),
  `correo` varchar(50) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `unidad` varchar(50) NOT NULL,
  `rol` varchar(20) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.usuarios: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
REPLACE INTO `usuarios` (`codigo`, `nombre`, `apellido`, `fecha_nacimiento`, `sexo`, `telefono`, `correo`, `direccion`, `unidad`, `rol`, `usuario`, `password`) VALUES
	(1, 'Enmanuel', 'Admin', '01/06/2020', 'M', 504123255, '', '', 'Ambulancia', 'Administrador', 'admin', 'admin'),
	(3, 'Obelsy', 'Rodriguez', '09/01/1998', 'F', 98968694, 'obelsy@gmail.com', 'El culebrero', 'Ambulancia', 'Administrador', 'Administrador', 'Administrador');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
