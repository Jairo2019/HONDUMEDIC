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

-- Volcando datos para la tabla hondumedic.caja: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `caja` DISABLE KEYS */;
REPLACE INTO `caja` (`codigo`, `paciente`, `fecha`, `isv`, `total`, `estado_pago`, `estado`) VALUES
	(3, 'Lis', '22/03/2020', 15, 59, 'contado', 'Inactivo'),
	(4, 'Lis', '31/03/2020', 15, 0, 'Crédito', 'Activo'),
	(5, 'Lis', '31/03/2020', 15, 0, 'Crédito', 'Activo'),
	(6, 'Lis', '31/03/2020', 15, 0, 'Crédito', 'Activo'),
	(7, 'Lis', '31/03/2020', 15, 0, 'Crédito', 'Activo');
/*!40000 ALTER TABLE `caja` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.caja_laboratorio
CREATE TABLE IF NOT EXISTS `caja_laboratorio` (
  `idventa` varchar(20) NOT NULL DEFAULT '',
  `isv` varchar(20) NOT NULL,
  `paciente` varchar(20) NOT NULL,
  `fecha` varchar(50) NOT NULL,
  `estado_pago` varchar(20) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.caja_laboratorio: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `caja_laboratorio` DISABLE KEYS */;
REPLACE INTO `caja_laboratorio` (`idventa`, `isv`, `paciente`, `fecha`, `estado_pago`, `total`) VALUES
	('00000001', '18', 'jason class', '16/05/2020', 'Contado', 55.46),
	('00000002', '15', 'jonas cruz', '17/05/2020', 'Contado', 102.35),
	('00000003', '15', 'jason class', '17/05/2020', 'Contado', 26.45),
	('00000004', '15', 'jonas cruz', '17/05/2020', 'Crédito', 26.45),
	('00000005', '15', 'jason class', '17/05/2020', 'Contado', 13.8),
	('00000006', '15', 'Mosa Nayon', '18/05/2020', 'Crédito', 192.05),
	('00000007', '15', 'Mosa Nayon', '18/05/2020', 'Contado', 253),
	('00000008', '15', 'Mosa Nayon', '23/05/2020', 'Crédito', 128.8);
/*!40000 ALTER TABLE `caja_laboratorio` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.cirugia
CREATE TABLE IF NOT EXISTS `cirugia` (
  `codigo_cirugia` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `Precio` decimal(10,0) NOT NULL,
  PRIMARY KEY (`codigo_cirugia`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.cirugia: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cirugia` DISABLE KEYS */;
REPLACE INTO `cirugia` (`codigo_cirugia`, `nombre`, `descripcion`, `Precio`) VALUES
	(2, 'fd', 'dgd', 6552);
/*!40000 ALTER TABLE `cirugia` ENABLE KEYS */;

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

-- Volcando datos para la tabla hondumedic.detalle_laboratorio: ~11 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_laboratorio` DISABLE KEYS */;
REPLACE INTO `detalle_laboratorio` (`id_detalle`, `idventa`, `codigo`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(3, '00000001', 'SL0001', 'kgr', '23', '1', '23.0'),
	(4, '00000001', 'PL0002', 'pastillas', '12.0', '2', '24.0'),
	(5, '00000002', 'PL0002', 'pastillas', '12.0', '1', '12.0'),
	(6, '00000002', 'PL0001', 'guantes', '54.0', '1', '54.0'),
	(7, '00000002', 'SL0001', 'kgr', '23', '1', '23.0'),
	(8, '00000003', 'SL0001', 'kgr', '23', '1', '23.0'),
	(9, '00000004', 'SL0001', 'kgr', '23', '1', '23.0'),
	(10, '00000005', 'PL0002', 'pastillas', '12.0', '1', '12.0'),
	(11, '00000006', 'SL0001', 'kgr', '23', '1', '23.0'),
	(12, '00000006', 'PL0002', 'pastillas', '12.0', '12', '144.0'),
	(13, '00000007', 'SL0001', 'Muestra de Sangre', '100', '1', '100.0'),
	(14, '00000007', 'PL0002', 'pastillas', '12.0', '10', '120.0'),
	(15, '00000008', 'PL0002', 'pastillas', '12.0', '1', '12.0'),
	(16, '00000008', 'SL0001', 'Muestra de Sangre', '100', '1', '100.0');
/*!40000 ALTER TABLE `detalle_laboratorio` ENABLE KEYS */;

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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_laboratorio: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_laboratorio` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla hondumedic.detalle_test_rayosx: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_test_rayosx` DISABLE KEYS */;
REPLACE INTO `detalle_test_rayosx` (`id_detalle`, `idventa`, `codigo`, `p_s`, `precio`, `cantidad`, `importe`) VALUES
	(4, 'RX0001', 'SR0001', 'Localizar Lesiones', '200', '1', '200.0'),
	(5, 'RX0001', 'IR0001', 'rayo', '100.0', '2', '200.0');
/*!40000 ALTER TABLE `detalle_test_rayosx` ENABLE KEYS */;

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
	('1501199023154', 'Lauren', 'Cruz', 'Doctor (a)', '', 99631279, 'Permanente');
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
  `descripcion` varchar(50) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_ambulancia`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_ambulancia: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_ambulancia` DISABLE KEYS */;
REPLACE INTO `inventario_ambulancia` (`codigo_ambulancia`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	(2, 'ambulancia', 150000, 'hggggg', 50),
	(4, '541', 1000, '', 0),
	(5, 'bfd', 100, '', 3);
/*!40000 ALTER TABLE `inventario_ambulancia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.inventario_cirugia
CREATE TABLE IF NOT EXISTS `inventario_cirugia` (
  `codigo_cirugia` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_cirugia`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_cirugia: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_cirugia` DISABLE KEYS */;
REPLACE INTO `inventario_cirugia` (`codigo_cirugia`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	(2, 'Jairo', 1454.1, 'sf', 3);
/*!40000 ALTER TABLE `inventario_cirugia` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.inventario_emergencia
CREATE TABLE IF NOT EXISTS `inventario_emergencia` (
  `codigo_emergencia` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
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
  `descripcion` varchar(50) DEFAULT NULL,
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
  `descripcion` varchar(50) DEFAULT NULL,
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
  `descripcion` varchar(50) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_laboratorio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_laboratorio: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_laboratorio` DISABLE KEYS */;
REPLACE INTO `inventario_laboratorio` (`codigo_laboratorio`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	('PL0001', 'guantes', 54, 'fg', 4),
	('PL0002', 'pastillas', 12, '', 19);
/*!40000 ALTER TABLE `inventario_laboratorio` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.inventario_rayosx
CREATE TABLE IF NOT EXISTS `inventario_rayosx` (
  `codigo_rayosx` varchar(20) NOT NULL DEFAULT '',
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_rayosx`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_rayosx: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_rayosx` DISABLE KEYS */;
REPLACE INTO `inventario_rayosx` (`codigo_rayosx`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	('IR0001', 'rayo', 100, '', 8);
/*!40000 ALTER TABLE `inventario_rayosx` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.inventario_ultrasonido
CREATE TABLE IF NOT EXISTS `inventario_ultrasonido` (
  `codigo_ultrasonido` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`codigo_ultrasonido`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.inventario_ultrasonido: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `inventario_ultrasonido` DISABLE KEYS */;
REPLACE INTO `inventario_ultrasonido` (`codigo_ultrasonido`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	(2, 'fgfd', 2531, 'fdh', 0);
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
  `edad` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.paciente: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
REPLACE INTO `paciente` (`codigo_paciente`, `nombre`, `apellido`, `direccion`, `edad`) VALUES
	('1503200002610', 'jonas', 'cruz', 'smdf', 20),
	('1500003245856', 'jason', 'class', '', 60),
	('0121199805416', 'Mosa', 'Nayon', '', 45);
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;

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
  `descripcion` varchar(100) DEFAULT NULL,
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
  `descripcion` varchar(100) DEFAULT NULL,
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
  `descripcion` varchar(100) DEFAULT NULL,
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
  `descripcion` varchar(100) DEFAULT NULL,
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
  `descripcion` varchar(100) DEFAULT NULL,
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
  `descripcion` varchar(100) DEFAULT NULL,
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
  `codigo_ultrasonido` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `precio` decimal(10,0) NOT NULL DEFAULT 0,
  PRIMARY KEY (`codigo_ultrasonido`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hondumedic.servicio_ultrasonido: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `servicio_ultrasonido` DISABLE KEYS */;
REPLACE INTO `servicio_ultrasonido` (`codigo_ultrasonido`, `nombre`, `descripcion`, `precio`) VALUES
	(3, 'greicy', 'jkgfds', 500);
/*!40000 ALTER TABLE `servicio_ultrasonido` ENABLE KEYS */;

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

-- Volcando datos para la tabla hondumedic.test_hospitalizacion: ~2 rows (aproximadamente)
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
  `medico_3` varchar(20) NOT NULL,
  `num_habitacion` varchar(15) NOT NULL,
  `observaciones` varchar(150) DEFAULT NULL,
  `fecha` varchar(50) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla hondumedic.test_laboratorio: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `test_laboratorio` DISABLE KEYS */;
/*!40000 ALTER TABLE `test_laboratorio` ENABLE KEYS */;

-- Volcando estructura para tabla hondumedic.test_rayosx
CREATE TABLE IF NOT EXISTS `test_rayosx` (
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

-- Volcando datos para la tabla hondumedic.test_rayosx: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `test_rayosx` DISABLE KEYS */;
REPLACE INTO `test_rayosx` (`codigo`, `paciente`, `medico_1`, `medico_2`, `medico_3`, `num_habitacion`, `observaciones`, `fecha`, `total`) VALUES
	('RX0001', 'Mosa Nayon', 'Lauren Cruz', 'Lauren Cruz', 'Lauren Cruz', 'RX14', '', '31/05/2020 14:37:26', 400);
/*!40000 ALTER TABLE `test_rayosx` ENABLE KEYS */;

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
