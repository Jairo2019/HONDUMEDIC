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

-- Volcando estructura para tabla hondumedic.activostangibles
CREATE TABLE IF NOT EXISTS `activostangibles` (
  `idactivot` int(11) NOT NULL AUTO_INCREMENT,
  `atnombre` text NOT NULL DEFAULT '',
  `atvalorini` float NOT NULL,
  `atdepreciacion` float DEFAULT NULL,
  `atvaloractual` float NOT NULL,
  `atfechaingreso` date NOT NULL DEFAULT '0000-00-00',
  `atfechacompra` date NOT NULL DEFAULT '0000-00-00',
  `atdescripcion` varchar(100) DEFAULT '',
  PRIMARY KEY (`idactivot`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.activostangibles: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `activostangibles` DISABLE KEYS */;
/*!40000 ALTER TABLE `activostangibles` ENABLE KEYS */;

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

-- Volcando estructura para tabla hondumedic.almacen
CREATE TABLE IF NOT EXISTS `almacen` (
  `codigo_almacen` varchar(20) NOT NULL DEFAULT '',
  `producto` varchar(50) NOT NULL,
  `proveedor` varchar(50) DEFAULT NULL,
  `precio_compra` float NOT NULL DEFAULT 0,
  `utilidad` int(11) NOT NULL DEFAULT 0,
  `precio_venta` decimal(10,0) NOT NULL DEFAULT 0,
  `cantidad` int(11) NOT NULL,
  `descripcion` text DEFAULT NULL,
  PRIMARY KEY (`codigo_almacen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.almacen: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `almacen` DISABLE KEYS */;
REPLACE INTO `almacen` (`codigo_almacen`, `producto`, `proveedor`, `precio_compra`, `utilidad`, `precio_venta`, `cantidad`, `descripcion`) VALUES
	('PA0001', 'holo', 'sdf', 20, 15, 23, 10, '16515'),
	('PA0002', 'mono', '', 150, 15, 173, 5, '');
/*!40000 ALTER TABLE `almacen` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.caja
CREATE TABLE IF NOT EXISTS `caja` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `paciente` varchar(50) NOT NULL,
  `fecha` varchar(50) NOT NULL,
  `isv` decimal(10,0) NOT NULL,
  `total` decimal(10,0) NOT NULL,
  `estado_pago` varchar(50) NOT NULL,
  `estado` varchar(50) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.caja: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `caja` DISABLE KEYS */;
/*!40000 ALTER TABLE `caja` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.caja_detalle_farmacia
CREATE TABLE IF NOT EXISTS `caja_detalle_farmacia` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `venta` varchar(100) NOT NULL,
  `producto` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.caja_detalle_farmacia: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `caja_detalle_farmacia` DISABLE KEYS */;
REPLACE INTO `caja_detalle_farmacia` (`id_detalle`, `venta`, `producto`, `precio`, `cantidad`, `importe`) VALUES
	(15, 'RF0001', ' BRONCOPULMIN GOTAS X 30 ML', '58', '2', '116.0');
/*!40000 ALTER TABLE `caja_detalle_farmacia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.caja_farmacia
CREATE TABLE IF NOT EXISTS `caja_farmacia` (
  `idventa` varchar(20) NOT NULL DEFAULT '',
  `medico` varchar(20) NOT NULL,
  `cliente` varchar(20) NOT NULL,
  `fecha` varchar(50) NOT NULL,
  `total` decimal(10,0) NOT NULL DEFAULT 0,
  PRIMARY KEY (`idventa`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.caja_farmacia: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `caja_farmacia` DISABLE KEYS */;
REPLACE INTO `caja_farmacia` (`idventa`, `medico`, `cliente`, `fecha`, `total`) VALUES
	('RF0001', 'Lauren Cruz', 'Edin Bonilla', '17/08/2020 09:13:22', 116);
/*!40000 ALTER TABLE `caja_farmacia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.caja_laboratorio
CREATE TABLE IF NOT EXISTS `caja_laboratorio` (
  `idventa` varchar(20) NOT NULL DEFAULT '',
  `codigo_examen` varchar(20) NOT NULL,
  `paciente` varchar(20) NOT NULL,
  `fecha` varchar(50) NOT NULL,
  `estado_pago` varchar(20) NOT NULL,
  `abonado` decimal(10,0) DEFAULT NULL,
  `pendiente` decimal(10,0) DEFAULT NULL,
  `total` decimal(10,0) NOT NULL DEFAULT 0,
  PRIMARY KEY (`idventa`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.caja_laboratorio: ~21 rows (aproximadamente)
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
	('00000020', 'EL0002', 'jason class', '19/06/2020', 'Contado', 100, 105, 205),
	('00000021', 'EL0001', 'Mosa Nayon', '10/07/2020', 'Contado', NULL, NULL, 143);
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
	('00000004', 'RX0001', 'Greicy Cruz', '19/06/2020', 'Contado', NULL, NULL, 400),
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
  `total` decimal(10,0) NOT NULL DEFAULT 0,
  PRIMARY KEY (`idventa`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.caja_servicios: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `caja_servicios` DISABLE KEYS */;
/*!40000 ALTER TABLE `caja_servicios` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.caja_servicios_apa
CREATE TABLE IF NOT EXISTS `caja_servicios_apa` (
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

-- Volcando datos para la tabla hondumedic.caja_servicios_apa: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `caja_servicios_apa` DISABLE KEYS */;
REPLACE INTO `caja_servicios_apa` (`idventa`, `codigo_examen`, `cod_servicio`, `paciente`, `fecha`, `estado_pago`, `abonado`, `pendiente`, `total`) VALUES
	('00000001', 'EH0001', 'H', 'Ximena Jaramillo', '12/08/2020', 'Contado', NULL, NULL, 200),
	('00000002', 'EE0001', 'E', 'Ximena Jaramillo', '12/08/2020', 'Contado', 50, 50, 100);
/*!40000 ALTER TABLE `caja_servicios_apa` ENABLE KEYS */;

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

-- Volcando estructura para tabla hondumedic.cotizaciones_apa
CREATE TABLE IF NOT EXISTS `cotizaciones_apa` (
  `codigo` varchar(20) NOT NULL DEFAULT '',
  `servicio` text NOT NULL DEFAULT '',
  `paciente` varchar(50) NOT NULL DEFAULT '0',
  `empleado` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.cotizaciones_apa: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `cotizaciones_apa` DISABLE KEYS */;
REPLACE INTO `cotizaciones_apa` (`codigo`, `servicio`, `paciente`, `empleado`) VALUES
	('00000002', 'Nebulización con salbutamo Cuidados de enfermería por día  ', 'Ximena Jaramillo', 'Rocio Paz');
/*!40000 ALTER TABLE `cotizaciones_apa` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.cotizaciones_general
CREATE TABLE IF NOT EXISTS `cotizaciones_general` (
  `codigo` varchar(20) NOT NULL DEFAULT '',
  `servicio` text NOT NULL DEFAULT '',
  `paciente` varchar(50) NOT NULL DEFAULT '0',
  `empleado` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.cotizaciones_general: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cotizaciones_general` DISABLE KEYS */;
REPLACE INTO `cotizaciones_general` (`codigo`, `servicio`, `paciente`, `empleado`) VALUES
	('00000001', 'De instalaciones de HONDUMEDIC a su domicilio. ', 'EMILIANO AGUILAR MALLQUI', 'Lauren Cruz');
/*!40000 ALTER TABLE `cotizaciones_general` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.cuentascobrar
CREATE TABLE IF NOT EXISTS `cuentascobrar` (
  `idccobrar` int(11) NOT NULL AUTO_INCREMENT,
  `ccnombre` varchar(50) NOT NULL DEFAULT '',
  `ccdescripcion` varchar(50) DEFAULT '',
  `ccmonto` float NOT NULL DEFAULT 1,
  `ccinteres` float NOT NULL,
  `cctotal` float NOT NULL DEFAULT 1,
  `ccfecha` date NOT NULL DEFAULT '0000-00-00',
  `ccplazo` float NOT NULL DEFAULT 0,
  `ccestado` int(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (`idccobrar`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.cuentascobrar: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cuentascobrar` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuentascobrar` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.cuentaspagar
CREATE TABLE IF NOT EXISTS `cuentaspagar` (
  `idcpagar` int(11) NOT NULL AUTO_INCREMENT,
  `ccnombre` varchar(50) NOT NULL DEFAULT '',
  `ccdescripcion` varchar(50) DEFAULT '',
  `ccmonto` float NOT NULL DEFAULT 1,
  `ccinteres` float NOT NULL,
  `cctotal` float NOT NULL DEFAULT 1,
  `ccfecha` date NOT NULL DEFAULT '0000-00-00',
  `ccplazo` float NOT NULL DEFAULT 0,
  `ccestado` int(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (`idcpagar`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.cuentaspagar: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cuentaspagar` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuentaspagar` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.depositos
CREATE TABLE IF NOT EXISTS `depositos` (
  `id` varchar(20) NOT NULL DEFAULT '',
  `paciente` varchar(20) NOT NULL,
  `valor` float NOT NULL,
  `fecha` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.depositos: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `depositos` DISABLE KEYS */;
/*!40000 ALTER TABLE `depositos` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_laboratorio
CREATE TABLE IF NOT EXISTS `detalle_laboratorio` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_laboratorio: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_laboratorio` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle_laboratorio` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_ambulancia
CREATE TABLE IF NOT EXISTS `detalle_test_ambulancia` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `id_paciente` varchar(100) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_ambulancia: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_ambulancia` DISABLE KEYS */;
REPLACE INTO `detalle_test_ambulancia` (`id_detalle`, `idventa`, `codigo`, `id_paciente`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(14, 'RA0002', 'SA0001', '1502032151465', 'De instalaciones de HONDUMEDIC a su domicilio.', '3000', '1', '3000.0');
/*!40000 ALTER TABLE `detalle_test_ambulancia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_cirugia
CREATE TABLE IF NOT EXISTS `detalle_test_cirugia` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `id_paciente` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_cirugia: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_cirugia` DISABLE KEYS */;
REPLACE INTO `detalle_test_cirugia` (`id_detalle`, `idventa`, `codigo`, `id_paciente`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(6, 'RC0001', 'SC0001', '1502032151465', 'Cierre de Herida ', '100', '1', '100.0');
/*!40000 ALTER TABLE `detalle_test_cirugia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_emergencia
CREATE TABLE IF NOT EXISTS `detalle_test_emergencia` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `id_paciente` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_emergencia: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_emergencia` DISABLE KEYS */;
REPLACE INTO `detalle_test_emergencia` (`id_detalle`, `idventa`, `codigo`, `id_paciente`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(22, 'EE0001', 'SM0001', '1502032151465', 'Nebulización con salbutamol', '100', '2', '200.0');
/*!40000 ALTER TABLE `detalle_test_emergencia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_emergencia_apa
CREATE TABLE IF NOT EXISTS `detalle_test_emergencia_apa` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_emergencia_apa: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_emergencia_apa` DISABLE KEYS */;
REPLACE INTO `detalle_test_emergencia_apa` (`id_detalle`, `idventa`, `codigo`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(11, 'EE0001', 'SE0001', 'Nebulización con salbutamo', '100', '1', '100.0'),
	(12, 'EE0001', 'PE0001', 'Guantes', '10.0', '2', '20.0');
/*!40000 ALTER TABLE `detalle_test_emergencia_apa` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_endoscopia
CREATE TABLE IF NOT EXISTS `detalle_test_endoscopia` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `id_paciente` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_endoscopia: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_endoscopia` DISABLE KEYS */;
REPLACE INTO `detalle_test_endoscopia` (`id_detalle`, `idventa`, `codigo`, `id_paciente`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(5, 'RE0001', 'SE0001', '15644153665', 'Endoscopia gástrica', '150', '1', '150.0');
/*!40000 ALTER TABLE `detalle_test_endoscopia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_hospitalizacion
CREATE TABLE IF NOT EXISTS `detalle_test_hospitalizacion` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `id_paciente` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_hospitalizacion: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_hospitalizacion` DISABLE KEYS */;
REPLACE INTO `detalle_test_hospitalizacion` (`id_detalle`, `idventa`, `codigo`, `id_paciente`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(12, 'EH0001', 'SH0001', '1502032151465', 'Cuidados de enfermería por día ', '75', '1', '75.0');
/*!40000 ALTER TABLE `detalle_test_hospitalizacion` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_hospitalizacion_apa
CREATE TABLE IF NOT EXISTS `detalle_test_hospitalizacion_apa` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_hospitalizacion_apa: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_hospitalizacion_apa` DISABLE KEYS */;
REPLACE INTO `detalle_test_hospitalizacion_apa` (`id_detalle`, `idventa`, `codigo`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(8, 'EH0001', 'SH0001', 'Cuidados de enfermería por día ', '200', '1', '200.0'),
	(9, 'EH0002', 'SH0001', 'Cuidados de enfermería por día ', '200', '1', '200.0'),
	(10, 'EH0002', 'IH0001', 'Curas', '10.0', '2', '20.0');
/*!40000 ALTER TABLE `detalle_test_hospitalizacion_apa` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_laboratorio
CREATE TABLE IF NOT EXISTS `detalle_test_laboratorio` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `id_paciente` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_laboratorio: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_laboratorio` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle_test_laboratorio` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_rayosx
CREATE TABLE IF NOT EXISTS `detalle_test_rayosx` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `id_paciente` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_rayosx: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_rayosx` DISABLE KEYS */;
REPLACE INTO `detalle_test_rayosx` (`id_detalle`, `idventa`, `codigo`, `id_paciente`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(6, 'RX0001', 'IR0001', '1502032151465', 'rayo', '100.0', '2', '200.0'),
	(7, 'RX0001', 'SR0001', '', 'Localizar Lesiones', '200', '1', '200.0'),
	(8, 'RX0001', 'IR0001', '', 'rayo', '100.0', '2', '200.0');
/*!40000 ALTER TABLE `detalle_test_rayosx` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.detalle_test_ultrasonido
CREATE TABLE IF NOT EXISTS `detalle_test_ultrasonido` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `idventa` varchar(50) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `id_paciente` varchar(50) NOT NULL,
  `p_s` varchar(100) NOT NULL,
  `precio` varchar(50) NOT NULL,
  `cantidad` varchar(50) NOT NULL,
  `importe` varchar(50) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_ultrasonido: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_ultrasonido` DISABLE KEYS */;
REPLACE INTO `detalle_test_ultrasonido` (`id_detalle`, `idventa`, `codigo`, `id_paciente`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(5, 'RU0001', 'IU0001', '', 'Guantes', '10.0', '1', '10.0'),
	(6, 'RU0001', 'SU0001', '', 'Ultrasonido Doppler', '500', '1', '500.0'),
	(7, 'RU0001', 'IU0001', '', 'Guantes', '10.0', '2', '20.0');
/*!40000 ALTER TABLE `detalle_test_ultrasonido` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.edificios
CREATE TABLE IF NOT EXISTS `edificios` (
  `idedificio` int(11) NOT NULL AUTO_INCREMENT,
  `ednombre` text NOT NULL DEFAULT '',
  `eddescripcion` varchar(100) DEFAULT '',
  `edvalorini` float NOT NULL,
  `eddepreciacion` float DEFAULT NULL,
  `edvaloractual` float NOT NULL,
  `edfechaingreso` date NOT NULL DEFAULT '0000-00-00',
  `edtotal` int(11) DEFAULT NULL,
  PRIMARY KEY (`idedificio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.edificios: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `edificios` DISABLE KEYS */;
/*!40000 ALTER TABLE `edificios` ENABLE KEYS */;

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

-- Volcando estructura para tabla hondumedic.equipomedico
CREATE TABLE IF NOT EXISTS `equipomedico` (
  `idequipo` int(11) NOT NULL AUTO_INCREMENT,
  `eqnombre` varchar(50) NOT NULL DEFAULT '',
  `eqdescripcion` varchar(100) DEFAULT '',
  `eqvalorini` float NOT NULL,
  `eqdepreciacion` float DEFAULT NULL,
  `eqvaloractual` float NOT NULL,
  `eqfechacompra` date NOT NULL DEFAULT '0000-00-00',
  `eqfechaingreso` date NOT NULL DEFAULT '0000-00-00',
  `eqtotal` float NOT NULL DEFAULT 0,
  PRIMARY KEY (`idequipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.equipomedico: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `equipomedico` DISABLE KEYS */;
/*!40000 ALTER TABLE `equipomedico` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.gastoadmon
CREATE TABLE IF NOT EXISTS `gastoadmon` (
  `idgadmon` int(11) NOT NULL AUTO_INCREMENT,
  `gadescripcion` text NOT NULL,
  `gavalor` double(10,2) NOT NULL,
  `gafecha` date NOT NULL DEFAULT '0000-00-00',
  `gatotal` float NOT NULL,
  PRIMARY KEY (`idgadmon`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.gastoadmon: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `gastoadmon` DISABLE KEYS */;
/*!40000 ALTER TABLE `gastoadmon` ENABLE KEYS */;

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
  `codigo_ambulancia` varchar(50) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_ambulancia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_ambulancia: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_ambulancia` DISABLE KEYS */;
REPLACE INTO `inventario_ambulancia` (`codigo_ambulancia`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	('IA0001', 'Venda', 150, '', 5);
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

-- Volcando datos para la tabla hondumedic.inventario_cirugia: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_cirugia` DISABLE KEYS */;
REPLACE INTO `inventario_cirugia` (`codigo_cirugia`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	('IC0001', 'Pinzas', 20, '', 1);
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
	('PE0001', 'Guantes', 10, '', 5),
	('PE0002', 'Mascarilla', 30, '', 4);
/*!40000 ALTER TABLE `inventario_emergencia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.inventario_emergencia_apa
CREATE TABLE IF NOT EXISTS `inventario_emergencia_apa` (
  `codigo_emergencia` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_emergencia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_emergencia_apa: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_emergencia_apa` DISABLE KEYS */;
REPLACE INTO `inventario_emergencia_apa` (`codigo_emergencia`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	('PE0001', 'Guantes', 10, '', 8);
/*!40000 ALTER TABLE `inventario_emergencia_apa` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.inventario_endoscopia
CREATE TABLE IF NOT EXISTS `inventario_endoscopia` (
  `codigo_endoscopia` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_endoscopia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_endoscopia: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_endoscopia` DISABLE KEYS */;
REPLACE INTO `inventario_endoscopia` (`codigo_endoscopia`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	('IE0001', 'Pinzas', 200, '', 2);
/*!40000 ALTER TABLE `inventario_endoscopia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.inventario_farmacia
CREATE TABLE IF NOT EXISTS `inventario_farmacia` (
  `codigo_farmacia` varchar(20) NOT NULL DEFAULT '',
  `codigo_barras` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `casa_farmaceutica` varchar(50) DEFAULT NULL,
  `precio_compra` float NOT NULL,
  `precio_venta` decimal(10,0) NOT NULL DEFAULT 0,
  `cantidad` int(11) NOT NULL,
  `isv` varchar(150) DEFAULT NULL,
  `descripcion` text DEFAULT NULL,
  PRIMARY KEY (`codigo_farmacia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_farmacia: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_farmacia` DISABLE KEYS */;
REPLACE INTO `inventario_farmacia` (`codigo_farmacia`, `codigo_barras`, `nombre`, `casa_farmaceutica`, `precio_compra`, `precio_venta`, `cantidad`, `isv`, `descripcion`) VALUES
	('PF0001', '12345678', 'BRONCOPULMIN GOTAS X 30 ML', '', 5, 6, 4, '15', ''),
	('PF0002', '', 'RHINOMER', 'Farmacias Kielsa', 500, 575, 2, '15', 'Nebulizador de agua de mar isotónica y estéril para la limpieza nasal. Fuerza 3 (ROJO) ha sido especialmente concebido para aquellos casos en que es necesario un gran lavado nasal en adultos y niños mayores de 6 años');
/*!40000 ALTER TABLE `inventario_farmacia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.inventario_hospitalizacion
CREATE TABLE IF NOT EXISTS `inventario_hospitalizacion` (
  `codigo_hospitalizacion` varchar(50) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_hospitalizacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_hospitalizacion: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_hospitalizacion` DISABLE KEYS */;
REPLACE INTO `inventario_hospitalizacion` (`codigo_hospitalizacion`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	('IH0001', 'Curas', 10, '', 42);
/*!40000 ALTER TABLE `inventario_hospitalizacion` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.inventario_hospitalizacion_apa
CREATE TABLE IF NOT EXISTS `inventario_hospitalizacion_apa` (
  `codigo_hospitalizacion` varchar(50) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_hospitalizacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_hospitalizacion_apa: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_hospitalizacion_apa` DISABLE KEYS */;
REPLACE INTO `inventario_hospitalizacion_apa` (`codigo_hospitalizacion`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	('IH0001', 'Curas', 10, '', 6);
/*!40000 ALTER TABLE `inventario_hospitalizacion_apa` ENABLE KEYS */;

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
	('PL0001', 'guantes', 54, 'fg', 2),
	('PL0002', 'pastillas', 12, '', 13);
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
	('IR0001', 'rayo', 100, '', 4),
	('PL0004', 'holo', 23, '16515', 1);
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
	('IU0001', 'Guantes', 10, '', 5),
	('PL0004', 'holo', 23, '16515', 1);
/*!40000 ALTER TABLE `inventario_ultrasonido` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.moviliarioequipo
CREATE TABLE IF NOT EXISTS `moviliarioequipo` (
  `idme` int(11) NOT NULL AUTO_INCREMENT,
  `menombre` text NOT NULL DEFAULT '',
  `medescripcion` varchar(100) DEFAULT '',
  `mevalorini` float NOT NULL,
  `medepreciacion` float DEFAULT NULL,
  `mevaloractual` float NOT NULL,
  `mefechacompra` date NOT NULL DEFAULT '0000-00-00',
  `mefechaingreso` date NOT NULL DEFAULT '0000-00-00',
  PRIMARY KEY (`idme`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.moviliarioequipo: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `moviliarioequipo` DISABLE KEYS */;
/*!40000 ALTER TABLE `moviliarioequipo` ENABLE KEYS */;

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
  `id_empleado` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `direccion` varchar(150) DEFAULT NULL,
  `edad` int(3) NOT NULL,
  `telefono` int(15) NOT NULL,
  `unidad` varchar(50) NOT NULL DEFAULT '',
  `unidad_referente` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`codigo_paciente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.paciente: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
REPLACE INTO `paciente` (`codigo_paciente`, `id_empleado`, `nombre`, `apellido`, `direccion`, `edad`, `telefono`, `unidad`, `unidad_referente`) VALUES
	('1502032151465', '0801995757955', 'Liz', 'Nilzen', '', 22, 879451032, 'APA', 'Emergencia');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.prestamos
CREATE TABLE IF NOT EXISTS `prestamos` (
  `idprestamo` int(11) NOT NULL AUTO_INCREMENT,
  `prebanco` varchar(50) NOT NULL DEFAULT '',
  `predescripcion` varchar(100) DEFAULT '',
  `premonto` float NOT NULL,
  `preinteres` float DEFAULT NULL,
  `prevalorpagado` float NOT NULL,
  `preplazo` int(11) NOT NULL DEFAULT 0,
  `prefechadjudicacion` date NOT NULL DEFAULT '0000-00-00',
  `prefechavencimiento` date NOT NULL DEFAULT '0000-00-00',
  `prefechaingreso` date NOT NULL DEFAULT '0000-00-00',
  `pretotal` float NOT NULL DEFAULT 0,
  PRIMARY KEY (`idprestamo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.prestamos: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `prestamos` DISABLE KEYS */;
