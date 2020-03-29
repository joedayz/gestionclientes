# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.28)
# Database: clientesdb
# Generation Time: 2020-03-29 22:18:57 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table calificacion
# ------------------------------------------------------------

DROP TABLE IF EXISTS `calificacion`;

CREATE TABLE `calificacion` (
  `codigo` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `calificacion` WRITE;
/*!40000 ALTER TABLE `calificacion` DISABLE KEYS */;

INSERT INTO `calificacion` (`codigo`, `descripcion`)
VALUES
	('CPP','CON PROBLEMAS DE PAGO'),
	('DEF','DEFICIENTE'),
	('DUD','DUDOSO'),
	('NOR','NORMAL'),
	('PER','PERDIDA');

/*!40000 ALTER TABLE `calificacion` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table calles
# ------------------------------------------------------------

DROP TABLE IF EXISTS `calles`;

CREATE TABLE `calles` (
  `codigo` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `calles` WRITE;
/*!40000 ALTER TABLE `calles` DISABLE KEYS */;

INSERT INTO `calles` (`codigo`, `descripcion`)
VALUES
	('AL','ALAMEDA'),
	('AV','AVENIDA'),
	('BJ','BAJADA'),
	('BL','BLOCK'),
	('BO','BOULEVARD'),
	('BR','BARRIO'),
	('CA','CASERIO'),
	('CL','CALLE'),
	('CR','CARRETERA'),
	('ED','EDIFICIO'),
	('FU','FUNDO'),
	('HA','HACIENDA'),
	('JR','JIRON'),
	('ML','MALECON'),
	('MZ','MANZANA'),
	('OV','OVALO'),
	('PL','PLAZUELA'),
	('PQ','PARQUE'),
	('PR','PROLONGACIÓN'),
	('PS','PASAJE'),
	('PU','PUENTE');

/*!40000 ALTER TABLE `calles` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table cargos
# ------------------------------------------------------------

DROP TABLE IF EXISTS `cargos`;

CREATE TABLE `cargos` (
  `codigo` smallint(6) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `cargos` WRITE;
/*!40000 ALTER TABLE `cargos` DISABLE KEYS */;

INSERT INTO `cargos` (`codigo`, `descripcion`)
VALUES
	(1,'ALCALDE'),
	(2,'ANALISTA'),
	(3,'APODERADO'),
	(4,'ASESOR / CONSULTOR'),
	(5,'ASISTENTE'),
	(6,'AUDITOR'),
	(7,'AUXILIAR / AYUDANTE'),
	(8,'CONGRESISTA'),
	(9,'CONTRALOR GENERAL'),
	(10,'DECANO'),
	(11,'DIPLOMATICO'),
	(12,'DIRECTIVO DE ASOCIACION DEPORTIVA'),
	(13,'DIRECTOR, SUBDIRECTOR, GERENTE, JEFE DEL SECTOR PRIVADO'),
	(14,'DOCENTE'),
	(15,'INSPECTOR'),
	(16,'INTENDENTE, DIRECTOR, GERENTE, JEFE DE LA ADMINISTRACIÓN PÚBLICA'),
	(17,'INTERVENTOR GENERAL DE ECONOMIA DE LA ADMINISTRACIÓ PÚBLICA'),
	(18,'JUEZ '),
	(19,'NOTARIO PÚBLICO'),
	(20,'PRACTICANTE'),
	(21,'PREFECTO'),
	(22,'PRESIDENTE DE GOBIERNO REGIONAL'),
	(23,'PRESIDENTE DE LA CORTE SUPREMA'),
	(24,'PRESIDENTE DE LA REPÚBLICA'),
	(25,'PRESIDENTE, TRIBUNAL DE JUSTICIA'),
	(26,'MINISTRO / VICEMINISTRO'),
	(27,'PROCURADOR'),
	(28,'PROCURADOR GENERAL'),
	(29,'RECTOR'),
	(30,'REGIDORES DE MUNICIPALIDADES'),
	(31,'SUB-PREFECTO'),
	(32,'SUPERINTENDENTE DE LA ADMINISTRACIÓN PÚBLICA'),
	(33,'VICEPRESIDENTE DE LA REPÚBLICA'),
	(34,'VOCAL DE LA CORTE SUPERIOR O SUPREMA'),
	(35,'OTROS (señalar)'),
	(36,'NO DECLARA');

/*!40000 ALTER TABLE `cargos` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table ciiu
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ciiu`;

CREATE TABLE `ciiu` (
  `codigo` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `ciiu` WRITE;
/*!40000 ALTER TABLE `ciiu` DISABLE KEYS */;

INSERT INTO `ciiu` (`codigo`, `descripcion`)
VALUES
	('1010','Extracción y aglomeración de carbon de piedra'),
	('1020','Extracción y aglomeración de lignito'),
	('1030','Extracción y aglomeración de lignito'),
	('111','Cultivo de cereales y otros cultivos n.c.p.'),
	('1110','Extracción de petróleo crudo y de gas natural'),
	('112','Cultivo de hortalizas y legumbres, especialidades horticolas y productos de vivero'),
	('1120','Actividades de servicios relaciónados con la extracción de petróleo y de gas, excepto las actividades de prospección'),
	('113','Cultivo de frutas, nueces, plantas cuyas hojas o frutas se utilizan para preparar bebidas y especias'),
	('1200','Extracción de minerales de uranio y torio'),
	('121','Cría de ganado vacuno y de ovejas, cabras, caballos, asnos, mulas y burdeganos; cría de ganado lechero'),
	('122','Cría de otros animales; elaboración de productos animales n.c.p.'),
	('130','Cultivo de productos agricolas en combinación con la cría de animales (explotación mixta)'),
	('1310','Extracción de minerales de hierro'),
	('1320','Extracción de minerales metaliferos no ferrosos, excepto minerales de uranio y torio'),
	('140','Actividades de servicios agricolas y ganaderos, excepto las actividades veterinarias'),
	('1410','Extracción de piedra, arena y arcilla'),
	('1421','Extracción de minerales para la fabricación de abonos y productos quimicos'),
	('1422','Extracción de sal'),
	('1429','Explotación de otras minas y canteras n.c.p.'),
	('150','Caza ordinaría y mediante trampas, y repoblación de animales de caza, incluso las actividades de servicios conexas'),
	('1511','Produccion, procesamiento y conservación de carne y de productos carnicos'),
	('1512','Elaboración y conservación de pescado y productos de pescado'),
	('1513','Elaboración y conservación de frutas, legumbres y hortalizas'),
	('1514','Elaboración de aceite y grasas de origen vegetal y animal'),
	('1515','Elaboración de aceite de pescado'),
	('1520','Elaboración de productos lácteos'),
	('1531','Elaboración de productos de molinería'),
	('1532','Elaboración de almidones y productos derivados del almidon'),
	('1533','Elaboración de alimentos preparados para animales'),
	('1541','Elaboración de productos de panadería'),
	('1542','Elaboración de azúcar'),
	('1543','Elaboración de cacao y chocolate y de productos de confitería'),
	('1544','Elaboración de macarrones, fideos, alcuzcuz y productos farinaceos similares'),
	('1549','Elaboración de otros productos alimenticios n.c.p.'),
	('1551','Destilacion, rectificación y mezcla de bebidas alcohólicas; producción de alcohol etílico a partir de sustancias fermentadas'),
	('1552','Elaboración de vinos'),
	('1553','Elaboración de bebidas malteadas y de malta'),
	('1554','Elaboración de bebidas no alcohólicas; producción de aguas minerales'),
	('1600','Elaboración de productos de tabaco'),
	('1711','Preparación e hilatura de fibras textiles; tejedura de productos textiles'),
	('1712','Acabado de productos textiles'),
	('1721','Fabricación de artículos confeccionados de materiales textiles, excepto prendas de vestir'),
	('1722','Fabricación de tapices y alfombras'),
	('1723','Fabricación de cuerdas, cordeles, bramantes y redes'),
	('1729','Fabricación de otros productos textiles n.c.p.'),
	('1730','Fabricación de tejidos y artículos de punto y ganchillo'),
	('1810','Fabricación de prendas de vestir; excepto prendas de piel'),
	('1820','Adobo y teñido de pieles; fabricación de artículos de piel'),
	('1911','Curtido y adobo de cueros'),
	('1912','Fabricación de maletas, bolsos de mano y artículos similares, y de artículos de talabartería y guarnicionería'),
	('1920','Fabricación de calzado'),
	('200','Silvicultura, extracción de madera y actividades de servicios conexas'),
	('2010','Aserrado y acepilladura de madera'),
	('2021','Fabricación de hojas de madera para enchapados; fabricación de tableros contrachapados, tableros laminados, tableros de particulas y otros tableros y paneles'),
	('2022','Fabricación de partes y piezas de carpintería para edificios y construcciones'),
	('2023','Fabricación de recipientes de madera'),
	('2029','Fabricación de otros productos de madera; fabricación de artículos de corcho, paja y materiales trenzables'),
	('2101','Fabricación de pasta de madera, papel y carton'),
	('2102','Fabricación de papel y carton ondulado y de envases de papel y carton'),
	('2109','Fabricación de otros artículos de papel y carton'),
	('2211','Edición de libros, folletos, partituras y otras publicaciones'),
	('2212','Edición de periodicos, revistas y publicaciones periodicas'),
	('2213','Edición de grabaciones'),
	('2219','Otras actividades de edición'),
	('2221','Actividades de impresión'),
	('2222','Actividades de servicios relacionados con la impresión'),
	('2230','Reproducción de grabaciones'),
	('2310','Fabricación de productos de hornos de coque'),
	('2320','Fabricación de productos de la refinación del petróleo'),
	('2330','Elaboración de combustible nuclear'),
	('2411','Fabricación de sustancias quimicas basicas, excepto abonos y compuestos de nitrogeno'),
	('2412','Fabricación de abonos y compuestos de nitrogeno'),
	('2413','Fabricación de plasticos en formas primarias y de caucho sintetico'),
	('2421','Fabricación de plagulcidas y otros productos quimicos de uso agropecuario'),
	('2422','Fabricación de pinturas, barnices y productos de revestimiento similares, tintas de imprenta y masillas'),
	('2423','Fabricación de productos farmaceuticos, sustancias quimicas medicinales y productos botanicos'),
	('2424','Fabricación de jabones y detergentes, preparados para limpiar y pulir, perfumes y preparados de tocador'),
	('2429','Fabricación de otros productos quimicos n.c.p.'),
	('2430','Fabricación de fibras manufacturadas'),
	('2511','Fabricación de cubiertas y camaras de caucho; recauchado y renovación de cubiertas de caucho'),
	('2519','Fabricación de otros productos de caucho'),
	('2520','Fabricación de productos de plástico'),
	('2610','Fabricación de vidrio y productos de vidrio'),
	('2691','Fabricación de productos de ceramica no refractaría para uso no estructural'),
	('2692','Fabricación de productos de ceramica refractaría '),
	('2693','Fabricación de productos de arcilla y ceramica no refractarias para uso estructural'),
	('2694','Fabricación de cemento, cal y yeso'),
	('2695','Fabricación de artículos de hormigon, cemento y yeso'),
	('2696','Corte, tallado y acabado de la piedra'),
	('2699','Fabricación de otros productos minerales no metalicos n.c.p.'),
	('2710','Industrias básicas de hierro y acero'),
	('2720','Fabricación de productos primarios de metales preciosos y metales no ferrosos'),
	('2731','Fundición de hierro y acero'),
	('2732','Fundición de metales no ferrosos'),
	('2811','Fabricación de productos metalicos para uso estructural'),
	('2812','Fabricación de tanques, depositos y recipientes de metal'),
	('2813','Fabricación de generadores de vapor, excepto calderas de agua caliente para calefacción central'),
	('2891','Forja, prensado, estampado y laminado de metales; pulvimetalurgia'),
	('2892','Tratamiento y revestimiento de metales; obras de ingeniería mecanica en general realizadas a cambio de una retribución o por contrata'),
	('2893','Fabricación de artículos de cuchilleria, herramientas de mano y artículos de ferretería'),
	('2899','Fabricación de otros productos elaborados de metal n.c.p.'),
	('2911','Fabricación de motores y turbinas,excepto motores para aeronaves, vehiculos automotres y motocicletas'),
	('2912','Fabricación de bombas, compresores, grifos y valvulas'),
	('2913','Fabricación de cojinetes, engranajes, trenes de engranajes y piezas de transmisión.'),
	('2914','Fabricación de hornos, hogares y quemadores'),
	('2915','Fabricación de equipo de elevación y manipulación'),
	('2919','Fabricación de otros tipos de maquinaria de uso general'),
	('2921','Fabricación de maquinaria agropecuaría y forestal'),
	('2922','Fabricación de maquinas herramienta'),
	('2923','Fabricación de maquinaria metalúrgica'),
	('2924','Fabricación de maquinaria para la explotación de minas y canteras y para obras de construcción'),
	('2925','Fabricación de maquinaria para la elaboración de alimentos, bebidas y tabaco'),
	('2926','Fabricación de maquinaria para la elaboración de productos textiles, prendas de vestir y cueros'),
	('2927','Fabricación de armas y municiones'),
	('2929','Fabricación de otros tipos de maquinaria de uso especial'),
	('2930','Fabricación de aparatos de uso domestico n.c.p.'),
	('3000','Fabricación de maquinaria de oficina, fabricación de maquinaria de oficina, contabilidad e informática'),
	('3110','Fabricación de motores, generadores y transformadores eléctricos'),
	('3120','Fabricación de aparatos de distribución y control de la energía eléctrica'),
	('3130','Fabricación de hilos y cables aislados'),
	('3140','Fabricación de acumuladores, de pilas y de baterías primarias'),
	('3150','Fabricación de lamparas eléctricas y equipo de iluminación'),
	('3190','Fabricación de otros tipos de equipo eléctrico n.c.p.'),
	('3210','Fabricación de tubos y válvulas electrónicas y de otros componentes electrónicos'),
	('3220','Fabricación de transmisores de radio y televisión y de aparatos para telefonía y telegrafía con hilos.'),
	('3230','Fabricación de receptores de radio y televisión, aparatos de grabación y reproducción de sonido y video, y productos conexos'),
	('3311','Fabricación de equipo medico y quirúrgico y de aparatos ortopédicos'),
	('3312','Fabricación de instrumentos y aparatos para medir, verificar, ensayar, navegar y otros fines, excepto el equipo de control de procesos industriales'),
	('3313','Fabricación de equipo de control de procesos industriales'),
	('3320','Fabricación de instrumentos de óptica y equipo fotográfico'),
	('3330','Fabricación de relojes'),
	('3410','Fabricación de vehículos automotores'),
	('3420','Fabricación de carrocerías para vehículos automotores; fabricación de remolques y semirremolques'),
	('3430','Fabricación de partes, piezas y accesorios para vehículos automotores y sus motores'),
	('3511','Construcción y reparación de buques '),
	('3512','Construcción y reparación de embarcaciones de recreo y de deporte'),
	('3520','Fabricación de locomotoras y de material rodante para ferrocarriles y tranvías'),
	('3530','Fabricación de aeronaves y naves espaciales'),
	('3591','Fabricación de motocicletas'),
	('3592','Fabricación de bicicletas y de sillones de ruedas para inválidos'),
	('3599','Fabricación de otros tipos de equipo de transporte n.c.p.'),
	('3610','Fabricación de muebles'),
	('3691','Fabricación de joyas y artículos conexos'),
	('3692','Fabricación de instrumentos de música'),
	('3693','Fabricación de artículos de deporte'),
	('3694','Fabricación de juegos y juguetes'),
	('3699','Otras industrias manufactureras n.c.p.'),
	('3710','Reciclamiento de desperdicios y desechos metálicos'),
	('3720','Reciclamiento de desperdicios y desechos no metálicos'),
	('4010','Generacion, captación y distribución de energía electrica'),
	('4020','Fabricación de gas; distribución de combustibles gaseosos por tuberias'),
	('4030','Suministro de vapor y agua caliente'),
	('4100','Captacion, depuración y distribución de agua'),
	('4510','Preparación del terreno'),
	('4520','Construcción de edificios completos y de partes de edificios; obras de ingeniería civil'),
	('4530','Acondicionamiento de edificios'),
	('4540','Terminación de edificios'),
	('4550','Alquiler de equipo de construcción y demolición dotado de operarios'),
	('500','Pesca, explotación de criaderos de peces y granjas pisciicolas; actividades de servicios relacionadas con la pesca'),
	('5010','Venta de vehiculos automotores'),
	('5020','Mantenimiento y reparación de vehiculos automotores'),
	('5030','Venta de partes, piezas y accesorios de vehiculos automotores'),
	('5040','En esta clase se incluyen la venta al por mayor y al por menor de motocicletas y trineos motorizados y la de sus parteas, piezas y accesorios. también se incluyen las actividades de mantenimiento y reparación.'),
	('5050','Venta al por menor de combustible para automotores'),
	('5110','Venta al por mayor a cambio de una retribución o por contrata'),
	('5121','Venta al por mayor de materias primas agropecuarias y de animales vivos'),
	('5122','Venta al por mayor de alimentos, bebidas y tabaco'),
	('5131','Venta al por mayor de productos textiles, prendas de vestir y calzado'),
	('5139','Venta al por mayor de otros enseres domesticos'),
	('5141','Venta al por mayor de combustibles solidos, liquidos y gaseosos y de productos conexos'),
	('5142','Venta al por mayor de metales y minerales metaliferos'),
	('5143','Venta al por mayor de materiales de contrucción, artículos de ferretería y equipo y materiales de fontanería y calefacción'),
	('5149','Venta al por mayor de otros productos intermedios, desperdicios y desechos'),
	('5150','Venta al por mayor de maquinaria, equipo y materiales'),
	('5190','Venta al por mayor de otros productos'),
	('5211','Venta al por menor en almacenes no especializados con surtido compuesto principalemente de alimentos, bebidas y tabaco'),
	('5219','Venta al por menor de otros productos en almacenes no especializados'),
	('5220','Venta al por menor de alimentos, bebidas y tabaco en almacenes especializados'),
	('5231','Venta al por menor de productos farmaceuticos y medicinales, cosmeticos y artículos de tocador'),
	('5232','Venta al por menor de productos textiles, prendas de vestir, calzado y artículos de cuero'),
	('5233','Venta al por menor de aparatos, artículos y equipo de uso domestico'),
	('5234','Venta al por menor de artículos de ferreteria, pinturas y productos de vidrio'),
	('5239','Venta al por menor de otros productos en almacenes especializados'),
	('5240','Venta al por menor en almacenes de artículos usados'),
	('5251','Venta al por menor de casas de venta por correo'),
	('5252','Venta al por menor en puestos de venta y mercados'),
	('5259','Otros tipos de venta al por menor no realizado en almacenes'),
	('5260','Reparación de efectos personales y enseres domesticos'),
	('5270','Venta al por menor no especificado'),
	('5510','Hoteles; campamentos y otros tipos de hospedaje temporal'),
	('5520','Restaurantes, bares y cantinas'),
	('6010','Transporte por vía férrea'),
	('6021','Otros tipos de transporte regular de pasajeros por vía terrestre '),
	('6022','Otros tipos de transporte no regular de pasajeros por vía terrestre'),
	('6023','Transporte de carga por carretera'),
	('6030','Transporte por tuberías'),
	('6110','Transporte marítimo y de cabotaje'),
	('6120','Transporte por vias de navegación interiores'),
	('6210','Transporte regular por vía aérea'),
	('6220','Transporte no regular por vía aérea'),
	('6301','Manipulación de la carga'),
	('6302','Almacenamiento y depósito'),
	('6303','Otras actividades de transportes complementarias'),
	('6304','Actividades de agencias de viajes y organizadores de viajes; actividades de asistencía a turistas n.c.p.'),
	('6309','Actividades de otras agencias de transporte'),
	('6411','Actividades postales nacionales'),
	('6412','Actividades de correo distintas de las actividades postales nacionales'),
	('6420','Telecomunicaciones'),
	('6511','Banca central'),
	('6519','Otros tipos de intermediación monetaria'),
	('6591','Arrendamiento financiero'),
	('6592','Otros tipos de crédito'),
	('6599','Otros tipos de intermediación financiera n.c.p.'),
	('6601','Planes de seguros de vida'),
	('6602','Planes de pensiones'),
	('6603','Planes de seguros generales'),
	('6711','Administración de mercados financieros'),
	('6712','Actividades bursátiles'),
	('6719','Actividades auxiliares de la intermediación financiera n.c.p.'),
	('6720','Actividades auxiliares de la financiación de planes de seguros y de pensiones'),
	('7010','Actividades inmobiliarias realizadas con bienes propios o arrendados'),
	('7020','Actividades inmobiliarias realizadas a cambio de una retribución o por contrata '),
	('7111','Alquiler de equipo de transporte por vía terrestre '),
	('7112','Alquiler de equipo de transporte por vía acuática'),
	('7113','Alquiler de equipo de transporte por vía aérea'),
	('7121','Alquiler de maquinaria y equipo agropecuario'),
	('7122','Alquiler de maquinaria y equipo de construcción e ingeniería civil'),
	('7123','Alquiler de maquinaria y equipo de oficina (incluso computadoras)'),
	('7129','Alquiler de otros tipos de maquinaria y equipo n.c.p.'),
	('7130','Alquiler de efectos personales y enseres domésticos n.c.p.'),
	('7210','Consultores en equipo de informática'),
	('7220','Consultores en programas de informática y suministros de programas de informática'),
	('7230','Procesamiento de datos'),
	('7240','Procesamiento de datos'),
	('7250','Mantenimiento y reparación de maquinaria de oficina, contabilidad e informática'),
	('7290','Otras actividades de informática'),
	('7310','Investigaciones y desarrollo experimental en el campo de las ciencias naturales y la ingeniería'),
	('7320','Investigaciones y desarrollo experimental en el campo de las ciencias sociales y las humanidades'),
	('7411','Actividades jurídicas'),
	('7412','Actividades de contabilidad, teneduría de libros y auditoría; asesoramiento en matería de impuestos'),
	('7413','Investigación de mercados y realización de encuestas de opinión pública'),
	('7414','Actividades de asesoramiento empresarial y en matería de gestión'),
	('7421','Actividades de arquitectura e ingeniería y actividades conexas de asesoramiento técnico'),
	('7422','Ensayos y análisis técnicos'),
	('7430','Publicidad'),
	('7491','Obtención y dotación de personal'),
	('7492','Actividades de investigación y seguridad'),
	('7493','Actividades de limpieza de edificios'),
	('7494','Actividades de fotografía'),
	('7495','Actividades de envase y empaque'),
	('7499','Otras actividades empresariales n.c.p.'),
	('7511','Actividades de la administración pública en general'),
	('7512','Regulación de las actividades de organismos que prestan servicios sanitarios, educativos, culturales y otros servicios sociales, excepto servicios de seguridad social.'),
	('7513','Regulación y facilitación de la actividad económica'),
	('7514','Actividades de servicios auxiliares para la administración pública en general'),
	('7521','Relaciones exteriores'),
	('7522','Actividades de defensa'),
	('7523','Actividades de mantenimiento del orden público y de seguridad '),
	('7530','Actividades de planes de seguridad social de afiliación obligatoria'),
	('8010','Enseñanza primaria'),
	('8021','Enseñanza secundaría de formación general'),
	('8022','Enseñanza secundaría de formación técnica y profesional'),
	('8030','Enseñanza superior'),
	('8090','Enseñanza de adultos y otros tipos de enseñanza'),
	('8511','Actividades de hospitales'),
	('8512','Actividades de médicos y odontólogos'),
	('8519','Otras actividades relacionadas con la salud humana'),
	('8520','Actividades veterinarias'),
	('8531','Servicios sociales con alojamiento'),
	('8532','Servicios sociales sin alojamiento'),
	('9000','Eliminación de desperdicios y aguas residuales, saneamiento y actividades similares'),
	('9111','Actividades de organización empresariales y de empleadores'),
	('9112','Actividades de organizaciones profesionales'),
	('9120','Actividades de sindicatos'),
	('9191','Actividades de organizaciones religiosas'),
	('9192','Actividades de organizaciones políticas'),
	('9199','Actividades de otras asociaciones n.c.p.'),
	('9211','Producción y distribución de filmes y videocintas'),
	('9212','Exhibición de filmes y videocintas'),
	('9213','Actividades de radio y televisión'),
	('9214','Actividades teatrales y musicales y otras actividades artísticas'),
	('9219','Otras actividades de entretenimiento n.c.p.'),
	('9220','Actividades de agencias de noticias'),
	('9231','Actividades de bibliotecas y archivos'),
	('9232','Actividades de museos y preservación de lugares y edificios históricos'),
	('9233','Actividades de jardines botánicos y zoológicos y de parques nacionales'),
	('9241','Actividades deportivas'),
	('9249','Otras actividades de esparcimiento'),
	('9301','Lavado y limpieza de prendas de tela y de piel, incluso la limpieza en seco '),
	('9302','Peluquería y otros tratamientos de belleza'),
	('9303','Pompas fúnebres y actividades conexas'),
	('9309','Otras actividades de servicios n.c.p.'),
	('9500','Hogares privados con servicio doméstico'),
	('9900','Organizaciones y órganos extraterritoriales'),
	('9999','Otras actividades no especificadas');

/*!40000 ALTER TABLE `ciiu` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table direcciones
# ------------------------------------------------------------

DROP TABLE IF EXISTS `direcciones`;

CREATE TABLE `direcciones` (
  `cod_direccion` int(11) NOT NULL AUTO_INCREMENT,
  `cod_distrito` varchar(255) DEFAULT NULL,
  `cod_dpto` varchar(255) DEFAULT NULL,
  `cod_provincia` varchar(255) DEFAULT NULL,
  `departamento` varchar(255) DEFAULT NULL,
  `dirección` varchar(255) DEFAULT NULL,
  `distrito` varchar(255) DEFAULT NULL,
  `fecha_modifica` date DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `hora_modifica` time DEFAULT NULL,
  `hora_registro` time DEFAULT NULL,
  `interior_dpto` varchar(255) DEFAULT NULL,
  `lote_dreccion` varchar(255) DEFAULT NULL,
  `lugar` varchar(255) DEFAULT NULL,
  `mz_direccion` varchar(255) DEFAULT NULL,
  `nombre_tipo_direccion` varchar(255) DEFAULT NULL,
  `nro_direccion` varchar(255) DEFAULT NULL,
  `provincia` varchar(255) DEFAULT NULL,
  `tipo_agrupacion` varchar(255) DEFAULT NULL,
  `tipo_calle` varchar(255) DEFAULT NULL,
  `tipo_direccion` varchar(255) NOT NULL,
  `usuario_modifica` varchar(255) DEFAULT NULL,
  `usuario_registro` varchar(255) DEFAULT NULL,
  `cod_socio` int(11) NOT NULL,
  PRIMARY KEY (`cod_direccion`),
  KEY `FKev18bp6fcxlm8jwo90cog0eon` (`cod_socio`),
  CONSTRAINT `FKev18bp6fcxlm8jwo90cog0eon` FOREIGN KEY (`cod_socio`) REFERENCES `socios` (`cod_socio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `direcciones` WRITE;
/*!40000 ALTER TABLE `direcciones` DISABLE KEYS */;

INSERT INTO `direcciones` (`cod_direccion`, `cod_distrito`, `cod_dpto`, `cod_provincia`, `departamento`, `dirección`, `distrito`, `fecha_modifica`, `fecha_registro`, `hora_modifica`, `hora_registro`, `interior_dpto`, `lote_dreccion`, `lugar`, `mz_direccion`, `nombre_tipo_direccion`, `nro_direccion`, `provincia`, `tipo_agrupacion`, `tipo_calle`, `tipo_direccion`, `usuario_modifica`, `usuario_registro`, `cod_socio`)
VALUES
	(1,'070106','070000','070100','Callao','URB. LOS PROCERES MZ P LT 29','Ventanilla',NULL,NULL,NULL,NULL,'201','29','SATELITE','P','DOMICILIARIA','201','Prov. Const. del Callao','UB','CL','D',NULL,NULL,1);

/*!40000 ALTER TABLE `direcciones` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table estado
# ------------------------------------------------------------

DROP TABLE IF EXISTS `estado`;

CREATE TABLE `estado` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `estado` WRITE;
/*!40000 ALTER TABLE `estado` DISABLE KEYS */;

INSERT INTO `estado` (`codigo`, `descripcion`)
VALUES
	(1,'ACTIVO'),
	(2,'INACTIVO');

/*!40000 ALTER TABLE `estado` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table estado_civil
# ------------------------------------------------------------

DROP TABLE IF EXISTS `estado_civil`;

CREATE TABLE `estado_civil` (
  `codigo` smallint(6) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `estado_civil` WRITE;
/*!40000 ALTER TABLE `estado_civil` DISABLE KEYS */;

INSERT INTO `estado_civil` (`codigo`, `descripcion`)
VALUES
	(1,'SOLTERO'),
	(2,'CASADO'),
	(3,'VIUDO'),
	(4,'CONVIVIENTE'),
	(5,'DIVORCIADO'),
	(6,'FALLECIDO');

/*!40000 ALTER TABLE `estado_civil` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table fuente_ingresos
# ------------------------------------------------------------

DROP TABLE IF EXISTS `fuente_ingresos`;

CREATE TABLE `fuente_ingresos` (
  `codigo` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `fuente_ingresos` WRITE;
/*!40000 ALTER TABLE `fuente_ingresos` DISABLE KEYS */;

INSERT INTO `fuente_ingresos` (`codigo`, `descripcion`)
VALUES
	('AMAC','AMA DE CASA'),
	('DEIF','DEPENDIENTE CON INGRESOS FIJOS'),
	('DEIV','DEPENDIENTE CON INGRESOS VARIABLES'),
	('DESE','DESEMPLEADO'),
	('DONA','DONACIONES'),
	('ESTD','ESTUDIANTE'),
	('INDE','INDEPENDIENTE'),
	('JUBI','JUBILADO'),
	('PENS','PENSIONISTA'),
	('PROI','PROFESIONAL INDEPENDIENTE'),
	('RENT','RENTISTA');

/*!40000 ALTER TABLE `fuente_ingresos` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table menus
# ------------------------------------------------------------

DROP TABLE IF EXISTS `menus`;

CREATE TABLE `menus` (
  `cod_menu` int(11) NOT NULL AUTO_INCREMENT,
  `activo` int(11) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `orden` int(11) DEFAULT NULL,
  `padre` int(11) DEFAULT NULL,
  PRIMARY KEY (`cod_menu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `menus` WRITE;
/*!40000 ALTER TABLE `menus` DISABLE KEYS */;

INSERT INTO `menus` (`cod_menu`, `activo`, `descripcion`, `orden`, `padre`)
VALUES
	(1,1,'Clientes',0,0),
	(2,1,'Mantenimientos',1,0),
	(3,1,'Reportes',2,0),
	(4,1,'Clientes',0,3);

/*!40000 ALTER TABLE `menus` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table nacionalidad
# ------------------------------------------------------------

DROP TABLE IF EXISTS `nacionalidad`;

CREATE TABLE `nacionalidad` (
  `codigo` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `nacionalidad` WRITE;
/*!40000 ALTER TABLE `nacionalidad` DISABLE KEYS */;

INSERT INTO `nacionalidad` (`codigo`, `descripcion`)
VALUES
	('9001','AFGANISTAN'),
	('9002','ALBANIA'),
	('9003','ALEMANIA'),
	('9004','ANDORRA'),
	('9005','ANGOLA'),
	('9006','ANGUILLA'),
	('9007','ANTIGUA Y BARBUDA'),
	('9008','ANTILLAS HOLANDESAS'),
	('9009','ARABIA SAUDI'),
	('9010','ARGELIA'),
	('9011','ARGENTINA'),
	('9012','ARMENIA'),
	('9013','ARUBA'),
	('9014','AUSTRALIA'),
	('9015','AUSTRIA'),
	('9016','AZERBAIYAN'),
	('9017','BAHAMAS'),
	('9018','BAHREIN'),
	('9019','BANGLADESH'),
	('9020','BARBADOS'),
	('9021','BELARUS'),
	('9022','BELGICA'),
	('9023','BELICE'),
	('9024','BENIN'),
	('9025','BERMUDAS'),
	('9026','BHUTÁN'),
	('9027','BOLIVIA'),
	('9028','BOSNIA Y HERZEGOVINA'),
	('9029','BOTSWANA'),
	('9030','BRASIL'),
	('9031','BRUNEI'),
	('9032','BULGARIA'),
	('9033','BURKINA FASO'),
	('9034','BURUNDI'),
	('9035','CABO VERDE'),
	('9036','CAMBOYA'),
	('9037','CAMERUN'),
	('9038','CANADA'),
	('9039','CHAD'),
	('9040','CHILE'),
	('9041','CHINA'),
	('9042','CHIPRE'),
	('9043','COLOMBIA'),
	('9044','COMORES'),
	('9045','CONGO'),
	('9046','COREA'),
	('9047','COREA DEL NORTE '),
	('9048','COSTA DE MARFIL'),
	('9049','COSTA RICA'),
	('9050','CROACIA'),
	('9051','CUBA'),
	('9052','DINAMARCA'),
	('9053','DJIBOUTI'),
	('9054','DOMINICA'),
	('9055','ECUADOR'),
	('9056','EGIPTO'),
	('9057','EL SALVADOR'),
	('9058','EMIRATOS ARABES UNIDOS'),
	('9059','ERITREA'),
	('9060','ESLOVENIA'),
	('9061','ESPAÑA'),
	('9062','ESTADOS UNIDOS DE AMERICA'),
	('9063','ESTONIA'),
	('9064','ETIOPIA'),
	('9065','FIJI'),
	('9066','FILIPINAS'),
	('9067','FINLANDIA'),
	('9068','FRANCIA'),
	('9069','GABON'),
	('9070','GAMBIA'),
	('9071','GEORGIA'),
	('9072','GHANA'),
	('9073','GIBRALTAR'),
	('9074','GRANADA'),
	('9075','GRECIA'),
	('9076','GROENLANDIA'),
	('9077','GUADALUPE'),
	('9078','GUAM'),
	('9079','GUATEMALA'),
	('9080','GUAYANA FRANCESA'),
	('9081','GUERNESEY'),
	('9082','GUINEA'),
	('9083','GUINEA ECUATORIAL'),
	('9084','GUINEA-BISSAU'),
	('9085','GUYANA'),
	('9086','HAITI'),
	('9087','HONDURAS'),
	('9088','HONG KONG'),
	('9089','HUNGRIA'),
	('9090','INDIA'),
	('9091','INDONESIA'),
	('9092','IRAN'),
	('9093','IRAQ'),
	('9094','IRLANDA'),
	('9095','ISLA DE MAN'),
	('9096','ISLA NORFOLK'),
	('9097','ISLANDIA'),
	('9098','ISLAS ALAND'),
	('9099','ISLAS CAIMÁN'),
	('9100','ISLAS COOK'),
	('9101','ISLAS DEL CANAL'),
	('9102','ISLAS FEROE'),
	('9103','ISLAS MALVINAS'),
	('9104','ISLAS MARIANAS DEL NORTE'),
	('9105','ISLAS MARSHALL'),
	('9106','ISLAS PITCAIRN'),
	('9107','ISLAS SALOMON'),
	('9108','ISLAS TURCAS Y CAICOS'),
	('9109','ISLAS VIRGENES BRITANICAS'),
	('9110','ISLAS VÍRGENES DE LOS ESTADOS UNIDOS'),
	('9111','ISRAEL'),
	('9112','ITALIA'),
	('9113','JAMAICA'),
	('9114','JAPON'),
	('9115','JERSEY'),
	('9116','JORDANIA'),
	('9117','KAZAJSTAN'),
	('9118','KENIA'),
	('9119','KIRGUISTAN'),
	('9120','KIRIBATI'),
	('9121','KUWAIT'),
	('9122','LAOS'),
	('9123','LESOTHO'),
	('9124','LETONIA'),
	('9125','LIBANO'),
	('9126','LIBERIA'),
	('9127','LIBIA'),
	('9128','LIECHTENSTEIN'),
	('9129','LITUANIA'),
	('9130','LUXEMBURGO'),
	('9131','MACAO'),
	('9132','MACEDONIA '),
	('9133','MADAGASCAR'),
	('9134','MALASIA'),
	('9135','MALAWI'),
	('9136','MALDIVAS'),
	('9137','MALI'),
	('9138','MALTA'),
	('9139','MARRUECOS'),
	('9140','MARTINICA'),
	('9141','MAURICIO'),
	('9142','MAURITANIA'),
	('9143','MAYOTTE'),
	('9144','MEXICO'),
	('9145','MICRONESIA'),
	('9146','MOLDAVIA'),
	('9147','MONACO'),
	('9148','MONGOLIA'),
	('9149','MONTENEGRO'),
	('9150','MONTSERRAT'),
	('9151','MOZAMBIQUE'),
	('9152','MYANMAR'),
	('9153','NAMIBIA'),
	('9154','NAURU'),
	('9155','NEPAL'),
	('9156','NICARAGUA'),
	('9157','NIGER'),
	('9158','NIGERIA'),
	('9159','NIUE'),
	('9160','NORUEGA'),
	('9161','NUEVA CALEDONIA'),
	('9162','NUEVA ZELANDA'),
	('9163','OMAN'),
	('9164','OTROS PAISES  O TERRITORIOS DE AMERICA DEL NORTE'),
	('9165','OTROS PAISES O TERRITORIOS  DE SUDAMERICA'),
	('9166','OTROS PAISES O TERRITORIOS DE AFRICA'),
	('9167','OTROS PAISES O TERRITORIOS DE ASIA'),
	('9168','OTROS PAISES O TERRITORIOS DE LA UNION EUROPEA'),
	('9169','OTROS PAISES O TERRITORIOS DE OCEANIA'),
	('9170','OTROS PAISES O TERRITORIOS DEL CARIBE Y AMERICA CENTRAL'),
	('9171','OTROS PAISES O TERRITORIOS DEL RESTO DE EUROPA'),
	('9172','PAISES BAJOS'),
	('9173','PAKISTAN'),
	('9174','PALAOS'),
	('9175','PALESTINA'),
	('9176','PANAMA'),
	('9177','PAPUA NUEVA GUINEA'),
	('9178','PARAGUAY'),
	('9179','PERU'),
	('9180','POLINESIA FRANCESA'),
	('9181','POLONIA'),
	('9182','PORTUGAL'),
	('9183','PUERTO RICO'),
	('9184','QATAR'),
	('9185','REINO UNIDO'),
	('9186','REP.DEMOCRATICA DEL CONGO'),
	('9187','REPUBLICA CENTROAFRICANA'),
	('9188','REPUBLICA CHECA'),
	('9189','REPUBLICA DOMINICANA'),
	('9190','REPUBLICA ESLOVACA'),
	('9191','REUNION'),
	('9192','RUANDA'),
	('9193','RUMANIA'),
	('9194','RUSIA'),
	('9195','SAHARA OCCIDENTAL'),
	('9196','SAMOA'),
	('9197','SAMOA AMERICANA'),
	('9198','SAN BARTOLOME'),
	('9199','SAN CRISTOBAL Y NIEVES'),
	('9200','SAN MARINO'),
	('9201','SAN MARTIN (PARTE FRANCESA)'),
	('9202','SAN PEDRO Y MIQUELON '),
	('9203','SAN VICENTE Y LAS GRANADINAS'),
	('9204','SANTA HELENA'),
	('9205','SANTA LUCIA'),
	('9206','SANTA SEDE'),
	('9207','SANTO TOME Y PRINCIPE'),
	('9208','SENEGAL'),
	('9209','SERBIA'),
	('9210','SEYCHELLES'),
	('9211','SIERRA LEONA'),
	('9212','SINGAPUR'),
	('9213','SIRIA'),
	('9214','SOMALIA'),
	('9215','SRI LANKA'),
	('9216','SUDAFRICA'),
	('9217','SUDAN'),
	('9218','SUECIA'),
	('9219','SUIZA'),
	('9220','SURINAM'),
	('9221','SVALBARD Y JAN MAYEN'),
	('9222','SWAZILANDIA'),
	('9223','TADYIKISTAN'),
	('9224','TAILANDIA'),
	('9225','TANZANIA'),
	('9226','TIMOR ORIENTAL'),
	('9227','TOGO'),
	('9228','TOKELAU'),
	('9229','TONGA'),
	('9230','TRINIDAD Y TOBAGO'),
	('9231','TUNEZ'),
	('9232','TURKMENISTAN'),
	('9233','TURQUIA'),
	('9234','TUVALU'),
	('9235','UCRANIA'),
	('9236','UGANDA'),
	('9237','URUGUAY'),
	('9238','UZBEKISTAN'),
	('9239','VANUATU'),
	('9240','VENEZUELA'),
	('9241','VIETNAM'),
	('9242','WALLIS Y FORTUNA'),
	('9243','YEMEN'),
	('9244','ZAMBIA'),
	('9245','ZIMBABWE');

/*!40000 ALTER TABLE `nacionalidad` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table nivel_educacion
# ------------------------------------------------------------

DROP TABLE IF EXISTS `nivel_educacion`;

CREATE TABLE `nivel_educacion` (
  `codigo` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `nivel_educacion` WRITE;
/*!40000 ALTER TABLE `nivel_educacion` DISABLE KEYS */;

INSERT INTO `nivel_educacion` (`codigo`, `descripcion`)
VALUES
	('BCH','BACHILLER'),
	('DOC','DOCTOR'),
	('LIC','LICENCIADO'),
	('MAS','DOCTORADO'),
	('OTH','OTROS'),
	('PGR','POST GRADO'),
	('PRM','PRIMARIA'),
	('SEC','SECUNDARIA'),
	('SUP','SUPERIOR'),
	('TEC','TECNICO');

/*!40000 ALTER TABLE `nivel_educacion` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table Permisos
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Permisos`;

CREATE TABLE `Permisos` (
  `Id` varchar(255) NOT NULL,
  `Permiso_Label` varchar(255) NOT NULL DEFAULT '',
  `Permiso_Value` varchar(255) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `Permisos` WRITE;
/*!40000 ALTER TABLE `Permisos` DISABLE KEYS */;

INSERT INTO `Permisos` (`Id`, `Permiso_Label`, `Permiso_Value`)
VALUES
	('OPERADOR','Operador','ROLE_OPERADOR'),
	('SUPERVISOR','Supervisor','ROLE_SUPERVISOR'),
	('ADMINISTRADOR','Administrador','ROLE_ADMINISTRADOR');

/*!40000 ALTER TABLE `Permisos` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table profesiones
# ------------------------------------------------------------

DROP TABLE IF EXISTS `profesiones`;

CREATE TABLE `profesiones` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `profesiones` WRITE;
/*!40000 ALTER TABLE `profesiones` DISABLE KEYS */;

INSERT INTO `profesiones` (`codigo`, `descripcion`)
VALUES
	(1,'ABOGADO'),
	(2,'ACTOR, ACTRIZ, ARTISTA, DIRECTOR DE ESPECTACULOS, COREOGRAFO, MODELO, MÚSICO, ESCENOGRAFO Y BAILARINES'),
	(3,'ACTUARIO'),
	(4,'ADMINISTRADOR'),
	(5,'ADUANERO/AGENTE DE ADUANAS/INSPECTORES DE FRONTERA'),
	(6,'AEROMOZO/ AZAFATA '),
	(7,'AGENTE / INTERMEDIARIO / CORREDOR INMOBILIARIO'),
	(8,'AGENTE DE BOLSA'),
	(9,'AGENTE DE INMIGRACIÓN/MIGRACIÓN'),
	(10,'AGENTE DE TURISMO/VIAJES'),
	(11,'AGENTE/INTERMEDIARIO/CORREDOR DE SEGUROS'),
	(12,'AGRICULTOR, AGRÓNOMO, AGRÓLOGO, ARBORICULTOR, AGRIMENSOR, TOPOGRAFO, GEOGRAFO'),
	(13,'ALBAÑIL, OBRERO DE CONSTRUCCIÓN'),
	(14,'AMA DE CASA'),
	(15,'ANALISTAS DE SISTEMA Y COMPUTACION'),
	(16,'ANTROPOLOGO, ARQUEOLOGO Y ETNOLOGO'),
	(17,'ARCHIVERO'),
	(18,'ARMADOR DE BARCO'),
	(19,'ARQUITECTO'),
	(20,'ARTESANO '),
	(21,'ASISTENTE SOCIAL'),
	(22,'AUTOR LITERARIO, ESCRITOR Y CRITICO'),
	(23,'AVICULTOR'),
	(24,'BACTERIOLOGO, FARMACOLOGO, BIOLOGO, CIENTIFICO'),
	(25,'BASURERO / BARRENDERO'),
	(26,'CAJERO'),
	(27,'CAMARERO / BARMAN / MESERO/ COCINERO / CHEF'),
	(28,'CAMBISTA, COMPRA/VENTA DE MONEDA'),
	(29,'CAMPESINO'),
	(30,'CAPATAZ'),
	(31,'CARGADOR'),
	(32,'CARPINTERO'),
	(33,'CARTERO'),
	(34,'CERRAJERO'),
	(35,'COBRADOR'),
	(36,'COMERCIANTE / VENDEDOR'),
	(37,'CONDUCTOR, CHOFER / TAXISTA'),
	(38,'CONSERJE / PORTERO/ GUARDIAN/ VIGILANTE'),
	(39,'CONSTRUCTOR'),
	(40,'CONTADOR'),
	(41,'CONTRATISTA'),
	(42,'CORTE Y CONFECCION DE ROPA/ FABRICANTE DE PRENDAS'),
	(43,'COSMETOLOGO, PELUQUERO Y BARBERO'),
	(44,'DECORADOR, DIBUJANTE, PUBLICISTA, DISEÑADOR DE PUBLICIDAD'),
	(45,'DENTISTA / ODONTOLOGO'),
	(46,'DEPORTISTA PROFESIONAL, ATLETA, ARBITRO, ENTRENADOR DEPORTIVO'),
	(47,'DISTRIBUIDOR'),
	(48,'DOCENTE'),
	(49,'ECONOMISTA'),
	(50,'ELECTRICISTA'),
	(51,'EMPLEADA (O) DEL HOGAR / NANA'),
	(52,'EMPRESARIO EXPORTADOR/ EMPRESARIO IMPORTADOR'),
	(53,'ENFERMERO'),
	(54,'ENSAMBLADOR'),
	(55,'ESCULTOR'),
	(56,'ESTUDIANTE'),
	(57,'FOTOGRAFO / OPERADORES CAMARA, CINE Y TV, LOCUTOR DE RADIO Y TV, GUIONISTA'),
	(58,'GANADERO'),
	(59,'GASFITERO'),
	(60,'HISTORIADOR'),
	(61,'INGENIERO'),
	(62,'INTERPRETE, TRADUCTOR'),
	(63,'JARDINERO'),
	(64,'JOCKEY'),
	(65,'JOYERO Y/O PLATERO / ORFEBRE'),
	(66,'JUBILADO / PENSIONISTA'),
	(67,'LABORATORISTA (TECNICO)'),
	(68,'LIQUIDADOR, RECLAMACIONES/SEGUROS'),
	(69,'MAQUINISTA / OPERADOR DE MAQUINARIA'),
	(70,'MARTILLERO / SUBASTADOR'),
	(71,'MAYORISTA, COMERCIO AL POR MAYOR'),
	(72,'MECANICO'),
	(73,'MEDICO / CIRUJANO'),
	(74,'METALURGISTA'),
	(75,'MIEMBRO DE LAS FUERZAS ARMADAS'),
	(76,'NUTRICIONISTA'),
	(77,'OBRERO / OPERADOR'),
	(78,'OBSTETRIZ'),
	(79,'ORGANIZADOR DE EVENTOS'),
	(80,'PANADERO / PASTELERO'),
	(81,'PARAMÉDICO'),
	(82,'PERIODISTA'),
	(83,'PERITO'),
	(84,'PESCADOR'),
	(85,'PILOTO '),
	(86,'PINTOR'),
	(87,'POLICIA MUNICIPAL'),
	(88,'POLICIA PNP'),
	(89,'PRODUCTOR DE CINE / RADIO / TELEVISION / TEATRO'),
	(90,'PRODUCTOR, CULTIVOS EXTENSIVOS'),
	(91,'PROGRAMADOR'),
	(92,'PSICOLOGO/ TERAPEUTA'),
	(93,'QUIROPRÁCTICO/ KINESITERAPEUTA (KINESIOLOGOS)'),
	(94,'RELACIONISTA PUBLICO E INDUSTRIAL'),
	(95,'RELOJERO'),
	(96,'REPARACION DE AUTOMOVILES,PINTOR RETOCADOR'),
	(97,'REPARADOR DE APARATOS ELECTRODOMESTICOS'),
	(98,'REPARTIDOR'),
	(99,'SACERDOTE / MONJA '),
	(100,'SECRETARIA, RECEPCIONISTA, TELEFONISTA'),
	(101,'SEGURIDAD / GUARDAESPALDA / GUARDIA DE SEGURIDAD'),
	(102,'SERVICIO DE ALMACENAMIENTO/ALMACENERO'),
	(103,'SERVICIO DE ALQUILER DE VEHICULOS'),
	(104,'SERVICIO DE ALQUILER DE VIDEOS, EQUIPOS DE SONIDO'),
	(105,'SOCIOLOGO'),
	(106,'TASADOR'),
	(107,'TECNICO'),
	(108,'TORERO'),
	(109,'TRAMITADOR'),
	(110,'TRANSPORTE DE CARGA Y/O MUDANZA'),
	(111,'TRANSPORTISTA'),
	(112,'VENDEDOR AMBULANTE'),
	(113,'VETERINARIO, ZOOLOGO, ZOOTECNICO'),
	(114,'VISITADOR MÉDICO'),
	(115,'ZAPATERO'),
	(116,'OTROS  (señalar)'),
	(117,'NO DECLARA');

/*!40000 ALTER TABLE `profesiones` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table representantes
# ------------------------------------------------------------

DROP TABLE IF EXISTS `representantes`;

CREATE TABLE `representantes` (
  `cod_representante` int(11) NOT NULL AUTO_INCREMENT,
  `ape_materno` varchar(255) DEFAULT NULL,
  `ape_paterno` varchar(255) DEFAULT NULL,
  `cargo` smallint(6) DEFAULT NULL,
  `fecha_cargo` date DEFAULT NULL,
  `fecha_modifica` date DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `hora_modifica` time DEFAULT NULL,
  `hora_registro` time DEFAULT NULL,
  `nom_cargo` varchar(255) DEFAULT NULL,
  `nombres` varchar(255) DEFAULT NULL,
  `nro_documento` varchar(255) NOT NULL,
  `tipo_documento` varchar(255) DEFAULT NULL,
  `usuario_modifica` varchar(255) DEFAULT NULL,
  `usuario_registro` varchar(255) DEFAULT NULL,
  `cod_socio` int(11) NOT NULL,
  PRIMARY KEY (`cod_representante`),
  KEY `FK8545jb03rpsf6a57edjcxdvs6` (`cod_socio`),
  CONSTRAINT `FK8545jb03rpsf6a57edjcxdvs6` FOREIGN KEY (`cod_socio`) REFERENCES `socios` (`cod_socio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table Role_Permisos
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Role_Permisos`;

CREATE TABLE `Role_Permisos` (
  `Id_Role` varchar(255) NOT NULL,
  `Id_Permiso` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `Role_Permisos` WRITE;
/*!40000 ALTER TABLE `Role_Permisos` DISABLE KEYS */;

INSERT INTO `Role_Permisos` (`Id_Role`, `Id_Permiso`)
VALUES
	('ADMINISTRADOR','ADMINISTRADOR'),
	('OPERADOR','OPERADOR'),
	('SUPERVISOR','SUPERVISOR');

/*!40000 ALTER TABLE `Role_Permisos` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table sexo
# ------------------------------------------------------------

DROP TABLE IF EXISTS `sexo`;

CREATE TABLE `sexo` (
  `codigo` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `sexo` WRITE;
/*!40000 ALTER TABLE `sexo` DISABLE KEYS */;

INSERT INTO `sexo` (`codigo`, `descripcion`)
VALUES
	('F','FEMENINO'),
	('M','MASCULINO');

/*!40000 ALTER TABLE `sexo` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table socios
# ------------------------------------------------------------

DROP TABLE IF EXISTS `socios`;

CREATE TABLE `socios` (
  `cod_socio` int(11) NOT NULL AUTO_INCREMENT,
  `activo` int(11) DEFAULT NULL,
  `ape_mat_conyuge` varchar(255) DEFAULT NULL,
  `ape_materno` varchar(255) DEFAULT NULL,
  `ape_pat_conyuge` varchar(255) DEFAULT NULL,
  `ape_paterno` varchar(255) DEFAULT NULL,
  `cal_externa` varchar(255) DEFAULT NULL,
  `cal_interna` varchar(255) DEFAULT NULL,
  `carga_familiar` int(11) DEFAULT NULL,
  `cargo` varchar(255) DEFAULT NULL,
  `centro_laboral` varchar(255) DEFAULT NULL,
  `ciiu` varchar(255) DEFAULT NULL,
  `condicion_laboral` varchar(255) DEFAULT NULL,
  `correo_electronico` varchar(255) DEFAULT NULL,
  `doc_conyuge` varchar(255) DEFAULT NULL,
  `educacion` varchar(255) DEFAULT NULL,
  `estado_civil` varchar(255) DEFAULT NULL,
  `fecha_apertura` date DEFAULT NULL,
  `fecha_constitucion` date DEFAULT NULL,
  `fecha_ingreso` date DEFAULT NULL,
  `fecha_modifica` date DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `hora_modifica` time DEFAULT NULL,
  `hora_registro` time DEFAULT NULL,
  `nacionalidad` varchar(255) DEFAULT NULL,
  `nom_completo` varchar(255) DEFAULT NULL,
  `nom_conyuge` varchar(255) DEFAULT NULL,
  `nom_tipo_documento` varchar(255) DEFAULT NULL,
  `nom_tipo_persona` varchar(255) DEFAULT NULL,
  `nombres` varchar(255) DEFAULT NULL,
  `nro_documento` varchar(255) DEFAULT NULL,
  `profesion` varchar(255) DEFAULT NULL,
  `razon_social` varchar(255) DEFAULT NULL,
  `rrpp` varchar(255) DEFAULT NULL,
  `ruc_laboral` varchar(255) DEFAULT NULL,
  `sexo` varchar(255) DEFAULT NULL,
  `tamano_empresa` int(11) DEFAULT NULL,
  `telefono_celular` varchar(255) DEFAULT NULL,
  `telefono_fijo` varchar(255) DEFAULT NULL,
  `telefono_laboral` varchar(255) DEFAULT NULL,
  `tip_doc_conyuge` varchar(255) DEFAULT NULL,
  `tipo_documento` varchar(255) DEFAULT NULL,
  `tipo_empresa` varchar(255) DEFAULT NULL,
  `tipo_persona` varchar(255) DEFAULT NULL,
  `tipo_vivienda` varchar(255) DEFAULT NULL,
  `usuario_modifica` varchar(255) DEFAULT NULL,
  `usuario_registro` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cod_socio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `socios` WRITE;
/*!40000 ALTER TABLE `socios` DISABLE KEYS */;

INSERT INTO `socios` (`cod_socio`, `activo`, `ape_mat_conyuge`, `ape_materno`, `ape_pat_conyuge`, `ape_paterno`, `cal_externa`, `cal_interna`, `carga_familiar`, `cargo`, `centro_laboral`, `ciiu`, `condicion_laboral`, `correo_electronico`, `doc_conyuge`, `educacion`, `estado_civil`, `fecha_apertura`, `fecha_constitucion`, `fecha_ingreso`, `fecha_modifica`, `fecha_nacimiento`, `fecha_registro`, `hora_modifica`, `hora_registro`, `nacionalidad`, `nom_completo`, `nom_conyuge`, `nom_tipo_documento`, `nom_tipo_persona`, `nombres`, `nro_documento`, `profesion`, `razon_social`, `rrpp`, `ruc_laboral`, `sexo`, `tamano_empresa`, `telefono_celular`, `telefono_fijo`, `telefono_laboral`, `tip_doc_conyuge`, `tipo_documento`, `tipo_empresa`, `tipo_persona`, `tipo_vivienda`, `usuario_modifica`, `usuario_registro`)
VALUES
	(1,NULL,'ORTEGA','DIAZ','MIRYAN','DIAZ','NOR','NOR',6,'13','JOEDAYZ','7220','DEIF','jamdiazdiaz@gmail.com','41191090','SUP','2','2020-03-29',NULL,'2020-03-29',NULL,'1974-11-06',NULL,NULL,NULL,'9179','DIAZ DIAZ JOSE','MIRYAN AMELIA','DNI','NATURAL','JOSE','25723527','61','','','10257235250','M',NULL,'977448524','5323380','5534206','DNI','DNI','1','2','1',NULL,NULL);

/*!40000 ALTER TABLE `socios` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table tamano_empresa
# ------------------------------------------------------------

DROP TABLE IF EXISTS `tamano_empresa`;

CREATE TABLE `tamano_empresa` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `tamano_empresa` WRITE;
/*!40000 ALTER TABLE `tamano_empresa` DISABLE KEYS */;

INSERT INTO `tamano_empresa` (`codigo`, `descripcion`)
VALUES
	(1,'MICRO EMPRESA'),
	(2,'PEQUEÑA EMPRESA'),
	(3,'MEDIANA EMPRESA'),
	(4,'GRAN EMPRESA');

/*!40000 ALTER TABLE `tamano_empresa` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table tipos_direccion
# ------------------------------------------------------------

DROP TABLE IF EXISTS `tipos_direccion`;

CREATE TABLE `tipos_direccion` (
  `codigo` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `tipos_direccion` WRITE;
/*!40000 ALTER TABLE `tipos_direccion` DISABLE KEYS */;

INSERT INTO `tipos_direccion` (`codigo`, `descripcion`)
VALUES
	('D','DOMICILIARIA'),
	('G','LEGAL'),
	('L','LABORAL');

/*!40000 ALTER TABLE `tipos_direccion` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table tipos_documento
# ------------------------------------------------------------

DROP TABLE IF EXISTS `tipos_documento`;

CREATE TABLE `tipos_documento` (
  `codigo` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `tipos_documento` WRITE;
/*!40000 ALTER TABLE `tipos_documento` DISABLE KEYS */;

INSERT INTO `tipos_documento` (`codigo`, `descripcion`)
VALUES
	('CE','Carnet Extranjería'),
	('CI','CI'),
	('DNI','DNI'),
	('PAS','Pasaporte'),
	('RUC','RUC'),
	('SFL','SFL');

/*!40000 ALTER TABLE `tipos_documento` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table tipos_empresa
# ------------------------------------------------------------

DROP TABLE IF EXISTS `tipos_empresa`;

CREATE TABLE `tipos_empresa` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `tipos_empresa` WRITE;
/*!40000 ALTER TABLE `tipos_empresa` DISABLE KEYS */;

INSERT INTO `tipos_empresa` (`codigo`, `descripcion`)
VALUES
	(1,'S.A.'),
	(2,'S.A.C.'),
	(3,'S.R.L.'),
	(4,'E.I.R.L.'),
	(5,'S.A.A.');

/*!40000 ALTER TABLE `tipos_empresa` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table tipos_persona
# ------------------------------------------------------------

DROP TABLE IF EXISTS `tipos_persona`;

CREATE TABLE `tipos_persona` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `tipos_persona` WRITE;
/*!40000 ALTER TABLE `tipos_persona` DISABLE KEYS */;

INSERT INTO `tipos_persona` (`codigo`, `descripcion`)
VALUES
	(1,'JURIDICA'),
	(2,'NATURAL');

/*!40000 ALTER TABLE `tipos_persona` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table Tipos_Usuario
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Tipos_Usuario`;

CREATE TABLE `Tipos_Usuario` (
  `Id` varchar(255) NOT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `Name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `Tipos_Usuario` WRITE;
/*!40000 ALTER TABLE `Tipos_Usuario` DISABLE KEYS */;

INSERT INTO `Tipos_Usuario` (`Id`, `Description`, `Name`)
VALUES
	('ADMINISTRADOR','Administrador','Administrador'),
	('OPERADOR','Operador','Operador'),
	('SUPERVISOR','Supervisor','Supervisor');

/*!40000 ALTER TABLE `Tipos_Usuario` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table tipos_vivienda
# ------------------------------------------------------------

DROP TABLE IF EXISTS `tipos_vivienda`;

CREATE TABLE `tipos_vivienda` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `tipos_vivienda` WRITE;
/*!40000 ALTER TABLE `tipos_vivienda` DISABLE KEYS */;

INSERT INTO `tipos_vivienda` (`codigo`, `descripcion`)
VALUES
	(1,'PROPIA'),
	(2,'ALQUILADA'),
	(3,'OTROS');

/*!40000 ALTER TABLE `tipos_vivienda` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table Ubigeo
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Ubigeo`;

CREATE TABLE `Ubigeo` (
  `Codigo` varchar(6) NOT NULL,
  `Cod_Dpto` varchar(2) DEFAULT NULL,
  `Cod_Provincia` varchar(2) DEFAULT NULL,
  `Cod_Distrito` varchar(2) DEFAULT NULL,
  `Descripcion` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`Codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `Ubigeo` WRITE;
/*!40000 ALTER TABLE `Ubigeo` DISABLE KEYS */;

INSERT INTO `Ubigeo` (`Codigo`, `Cod_Dpto`, `Cod_Provincia`, `Cod_Distrito`, `Descripcion`)
VALUES
	('010000','01','00','00','Amazonas'),
	('010100','01','01','00','Chachapoyas'),
	('010101','01','01','01','Chachapoyas'),
	('010102','01','01','02','Asuncion'),
	('010103','01','01','03','Balsas'),
	('010104','01','01','04','Cheto'),
	('010105','01','01','05','Chiliquin'),
	('010106','01','01','06','Chuquibamba'),
	('010107','01','01','07','Granada'),
	('010108','01','01','08','Huancas'),
	('010109','01','01','09','La Jalca'),
	('010110','01','01','10','Leimebamba'),
	('010111','01','01','11','Levanto'),
	('010112','01','01','12','Magdalena'),
	('010113','01','01','13','Mariscal Castilla'),
	('010114','01','01','14','Molinopampa'),
	('010115','01','01','15','Montevideo'),
	('010116','01','01','16','Olleros'),
	('010117','01','01','17','Quinjalca'),
	('010118','01','01','18','San Francisco de Daguas'),
	('010119','01','01','19','San Isidro de Maino'),
	('010120','01','01','20','Soloco'),
	('010121','01','01','21','Sonche'),
	('010200','01','02','00','Bagua'),
	('010201','01','02','01','Bagua'),
	('010202','01','02','02','Aramango'),
	('010203','01','02','03','Copallin'),
	('010204','01','02','04','El Parco'),
	('010205','01','02','05','Imaza'),
	('010206','01','02','06','La Peca'),
	('010300','01','03','00','Bongara'),
	('010301','01','03','01','Jumbilla'),
	('010302','01','03','02','Chisquilla'),
	('010303','01','03','03','Churuja'),
	('010304','01','03','04','Corosha'),
	('010305','01','03','05','Cuispes'),
	('010306','01','03','06','Florida'),
	('010307','01','03','07','Jazán'),
	('010308','01','03','08','Recta'),
	('010309','01','03','09','San Carlos'),
	('010310','01','03','10','Shipasbamba'),
	('010311','01','03','11','Valera'),
	('010312','01','03','12','Yambrasbamba'),
	('010400','01','04','00','Condorcanqui'),
	('010401','01','04','01','Nieva'),
	('010402','01','04','02','El Cenepa'),
	('010403','01','04','03','Rio Santiago'),
	('010500','01','05','00','Luya'),
	('010501','01','05','01','Lamud'),
	('010502','01','05','02','Camporredondo'),
	('010503','01','05','03','Cocabamba'),
	('010504','01','05','04','Colcamar'),
	('010505','01','05','05','Conila'),
	('010506','01','05','06','Inguilpata'),
	('010507','01','05','07','Longuita'),
	('010508','01','05','08','Lonya Chico'),
	('010509','01','05','09','Luya'),
	('010510','01','05','10','Luya Viejo'),
	('010511','01','05','11','Maria'),
	('010512','01','05','12','Ocalli'),
	('010513','01','05','13','Ocumal'),
	('010514','01','05','14','Pisuquia'),
	('010515','01','05','15','Providencia'),
	('010516','01','05','16','San Cristobal'),
	('010517','01','05','17','San Francisco del Yeso'),
	('010518','01','05','18','San Jeronimo'),
	('010519','01','05','19','San Juan de Lopecancha'),
	('010520','01','05','20','Santa Catalina'),
	('010521','01','05','21','Santo Tomas'),
	('010522','01','05','22','Tingo'),
	('010523','01','05','23','Trita'),
	('010600','01','06','00','Rodriguez de Mendoza'),
	('010601','01','06','01','San Nicolas'),
	('010602','01','06','02','Chirimoto'),
	('010603','01','06','03','Cochamal'),
	('010604','01','06','04','Huambo'),
	('010605','01','06','05','Limabamba'),
	('010606','01','06','06','Longar'),
	('010607','01','06','07','Mariscal Benavides'),
	('010608','01','06','08','Milpuc'),
	('010609','01','06','09','Omia'),
	('010610','01','06','10','Santa Rosa'),
	('010611','01','06','11','Totora'),
	('010612','01','06','12','Vista Alegre'),
	('010700','01','07','00','Utcubamba'),
	('010701','01','07','01','Bagua Grande'),
	('010702','01','07','02','Cajaruro'),
	('010703','01','07','03','Cumba'),
	('010704','01','07','04','El Milagro'),
	('010705','01','07','05','Jamalca'),
	('010706','01','07','06','Lonya Grande'),
	('010707','01','07','07','Yamon'),
	('020000','02','00','00','Ancash'),
	('020100','02','01','00','Huaraz'),
	('020101','02','01','01','Huaraz'),
	('020102','02','01','02','Cochabamba'),
	('020103','02','01','03','Colcabamba'),
	('020104','02','01','04','Huanchay'),
	('020105','02','01','05','Independencia'),
	('020106','02','01','06','Jangas'),
	('020107','02','01','07','La Libertad'),
	('020108','02','01','08','Olleros'),
	('020109','02','01','09','Pampas'),
	('020110','02','01','10','Pariacoto'),
	('020111','02','01','11','Pira'),
	('020112','02','01','12','Tarica'),
	('020200','02','02','00','Aija'),
	('020201','02','02','01','Aija'),
	('020202','02','02','02','Coris'),
	('020203','02','02','03','Huacllan'),
	('020204','02','02','04','La Merced'),
	('020205','02','02','05','Succha'),
	('020300','02','03','00','Antonio Raymondi'),
	('020301','02','03','01','Llamellin'),
	('020302','02','03','02','Aczo'),
	('020303','02','03','03','Chaccho'),
	('020304','02','03','04','Chingas'),
	('020305','02','03','05','Mirgas'),
	('020306','02','03','06','San Juan de Rontoy'),
	('020400','02','04','00','Asuncion'),
	('020401','02','04','01','Chacas'),
	('020402','02','04','02','Acochaca'),
	('020500','02','05','00','Bolognesi'),
	('020501','02','05','01','Chiquian'),
	('020502','02','05','02','Abelardo Pardo Lezameta'),
	('020503','02','05','03','Antonio Raymondi'),
	('020504','02','05','04','Aquia'),
	('020505','02','05','05','Cajacay'),
	('020506','02','05','06','Canis'),
	('020507','02','05','07','Colquioc'),
	('020508','02','05','08','Huallanca'),
	('020509','02','05','09','Huasta'),
	('020510','02','05','10','Huayllacayan'),
	('020511','02','05','11','La Primavera'),
	('020512','02','05','12','Mangas'),
	('020513','02','05','13','Pacllon'),
	('020514','02','05','14','San Miguel de Corpanqui'),
	('020515','02','05','15','Ticllos'),
	('020600','02','06','00','Carhuaz'),
	('020601','02','06','01','Carhuaz'),
	('020602','02','06','02','Acopampa'),
	('020603','02','06','03','Amashca'),
	('020604','02','06','04','Anta'),
	('020605','02','06','05','Ataquero'),
	('020606','02','06','06','Marcara'),
	('020607','02','06','07','Pariahuanca'),
	('020608','02','06','08','San Miguel de Aco'),
	('020609','02','06','09','Shilla'),
	('020610','02','06','10','Tinco'),
	('020611','02','06','11','Yungar'),
	('020700','02','07','00','Carlos Fermin Fitzcarrald'),
	('020701','02','07','01','San Luis'),
	('020702','02','07','02','San Nicolas'),
	('020703','02','07','03','Yauya'),
	('020800','02','08','00','Casma'),
	('020801','02','08','01','Casma'),
	('020802','02','08','02','Buena Vista Alta'),
	('020803','02','08','03','Comandante Noel'),
	('020804','02','08','04','Yautan'),
	('020900','02','09','00','Corongo'),
	('020901','02','09','01','Corongo'),
	('020902','02','09','02','Aco'),
	('020903','02','09','03','Bambas'),
	('020904','02','09','04','Cusca'),
	('020905','02','09','05','La Pampa'),
	('020906','02','09','06','Yanac'),
	('020907','02','09','07','Yupan'),
	('021000','02','10','00','Huari'),
	('021001','02','10','01','Huari'),
	('021002','02','10','02','Anra'),
	('021003','02','10','03','Cajay'),
	('021004','02','10','04','Chavin de Huantar'),
	('021005','02','10','05','Huacachi'),
	('021006','02','10','06','Huacchis'),
	('021007','02','10','07','Huachis'),
	('021008','02','10','08','Huantar'),
	('021009','02','10','09','Masin'),
	('021010','02','10','10','Paucas'),
	('021011','02','10','11','Ponto'),
	('021012','02','10','12','Rahuapampa'),
	('021013','02','10','13','Rapayan'),
	('021014','02','10','14','San Marcos'),
	('021015','02','10','15','San Pedro de Chana'),
	('021016','02','10','16','Uco'),
	('021100','02','11','00','Huarmey'),
	('021101','02','11','01','Huarmey'),
	('021102','02','11','02','Cochapeti'),
	('021103','02','11','03','Culebras'),
	('021104','02','11','04','Huayan'),
	('021105','02','11','05','Malvas'),
	('021200','02','12','00','Huaylas'),
	('021201','02','12','01','Caraz'),
	('021202','02','12','02','Huallanca'),
	('021203','02','12','03','Huata'),
	('021204','02','12','04','Huaylas'),
	('021205','02','12','05','Mato'),
	('021206','02','12','06','Pamparomas'),
	('021207','02','12','07','Pueblo Libre'),
	('021208','02','12','08','Santa Cruz'),
	('021209','02','12','09','Santo Toribio'),
	('021210','02','12','10','Yuracmarca'),
	('021300','02','13','00','Mariscal Luzuriaga'),
	('021301','02','13','01','Piscobamba'),
	('021302','02','13','02','Casca'),
	('021303','02','13','03','Eleazar Guzman Barron'),
	('021304','02','13','04','Fidel Olivas Escudero'),
	('021305','02','13','05','Llama'),
	('021306','02','13','06','Llumpa'),
	('021307','02','13','07','Lucma'),
	('021308','02','13','08','Musga'),
	('021400','02','14','00','Ocros'),
	('021401','02','14','01','Ocros'),
	('021402','02','14','02','Acas'),
	('021403','02','14','03','Cajamarquilla'),
	('021404','02','14','04','Carhuapampa'),
	('021405','02','14','05','Cochas'),
	('021406','02','14','06','Congas'),
	('021407','02','14','07','Llipa'),
	('021408','02','14','08','San Cristobal de Rajan'),
	('021409','02','14','09','San Pedro'),
	('021410','02','14','10','Santiago de Chilcas'),
	('021500','02','15','00','Pallasca'),
	('021501','02','15','01','Cabana'),
	('021502','02','15','02','Bolognesi'),
	('021503','02','15','03','Conchucos'),
	('021504','02','15','04','Huacaschuque'),
	('021505','02','15','05','Huandoval'),
	('021506','02','15','06','Lacabamba'),
	('021507','02','15','07','Llapo'),
	('021508','02','15','08','Pallasca'),
	('021509','02','15','09','Pampas'),
	('021510','02','15','10','Santa Rosa'),
	('021511','02','15','11','Tauca'),
	('021600','02','16','00','Pomabamba'),
	('021601','02','16','01','Pomabamba'),
	('021602','02','16','02','Huayllan'),
	('021603','02','16','03','Parobamba'),
	('021604','02','16','04','Quinuabamba'),
	('021700','02','17','00','Recuay'),
	('021701','02','17','01','Recuay'),
	('021702','02','17','02','Catac'),
	('021703','02','17','03','Cotaparaco'),
	('021704','02','17','04','Huayllapampa'),
	('021705','02','17','05','Llacllin'),
	('021706','02','17','06','Marca'),
	('021707','02','17','07','Pampas Chico'),
	('021708','02','17','08','Pararin'),
	('021709','02','17','09','Tapacocha'),
	('021710','02','17','10','Ticapampa'),
	('021800','02','18','00','Santa'),
	('021801','02','18','01','Chimbote'),
	('021802','02','18','02','Caceres del Peru'),
	('021803','02','18','03','Coishco'),
	('021804','02','18','04','Macate'),
	('021805','02','18','05','Moro'),
	('021806','02','18','06','Nepeña'),
	('021807','02','18','07','Samanco'),
	('021808','02','18','08','Santa'),
	('021809','02','18','09','Nuevo Chimbote'),
	('021900','02','19','00','Sihuas'),
	('021901','02','19','01','Sihuas'),
	('021902','02','19','02','Acobamba'),
	('021903','02','19','03','Alfonso Ugarte'),
	('021904','02','19','04','Cashapampa'),
	('021905','02','19','05','Chingalpo'),
	('021906','02','19','06','Huayllabamba'),
	('021907','02','19','07','Quiches'),
	('021908','02','19','08','Ragash'),
	('021909','02','19','09','San Juan'),
	('021910','02','19','10','Sicsibamba'),
	('022000','02','20','00','Yungay'),
	('022001','02','20','01','Yungay'),
	('022002','02','20','02','Cascapara'),
	('022003','02','20','03','Mancos'),
	('022004','02','20','04','Matacoto'),
	('022005','02','20','05','Quillo'),
	('022006','02','20','06','Ranrahirca'),
	('022007','02','20','07','Shupluy'),
	('022008','02','20','08','Yanama'),
	('030000','03','00','00','Apurimac'),
	('030100','03','01','00','Abancay'),
	('030101','03','01','01','Abancay'),
	('030102','03','01','02','Chacoche'),
	('030103','03','01','03','Circa'),
	('030104','03','01','04','Curahuasi'),
	('030105','03','01','05','Huanipaca'),
	('030106','03','01','06','Lambrama'),
	('030107','03','01','07','Pichirhua'),
	('030108','03','01','08','San Pedro de Cachora'),
	('030109','03','01','09','Tamburco'),
	('030200','03','02','00','Andahuaylas'),
	('030201','03','02','01','Andahuaylas'),
	('030202','03','02','02','Andarapa'),
	('030203','03','02','03','Chiara'),
	('030204','03','02','04','Huancarama'),
	('030205','03','02','05','Huancaray'),
	('030206','03','02','06','Huayana'),
	('030207','03','02','07','Kishuara'),
	('030208','03','02','08','Pacobamba'),
	('030209','03','02','09','Pacucha'),
	('030210','03','02','10','Pampachiri'),
	('030211','03','02','11','Pomacocha'),
	('030212','03','02','12','San Antonio de Cachi'),
	('030213','03','02','13','San Jeronimo'),
	('030214','03','02','14','San Miguel de Chaccrampa'),
	('030215','03','02','15','Santa Maria de Chicmo'),
	('030216','03','02','16','Talavera'),
	('030217','03','02','17','Tumay Huaraca'),
	('030218','03','02','18','Turpo'),
	('030219','03','02','19','Kaquiabamba'),
	('030300','03','03','00','Antabamba'),
	('030301','03','03','01','Antabamba'),
	('030302','03','03','02','El Oro'),
	('030303','03','03','03','Huaquirca'),
	('030304','03','03','04','Juan Espinoza Medrano'),
	('030305','03','03','05','Oropesa'),
	('030306','03','03','06','Pachaconas'),
	('030307','03','03','07','Sabaino'),
	('030400','03','04','00','Aymaraes'),
	('030401','03','04','01','Chalhuanca'),
	('030402','03','04','02','Capaya'),
	('030403','03','04','03','Caraybamba'),
	('030404','03','04','04','Chapimarca'),
	('030405','03','04','05','Colcabamba'),
	('030406','03','04','06','Cotaruse'),
	('030407','03','04','07','Huayllo'),
	('030408','03','04','08','Justo Apu Sahuaraura'),
	('030409','03','04','09','Lucre'),
	('030410','03','04','10','Pocohuanca'),
	('030411','03','04','11','San Juan de Chacña'),
	('030412','03','04','12','Sañayca'),
	('030413','03','04','13','Soraya'),
	('030414','03','04','14','Tapairihua'),
	('030415','03','04','15','Tintay'),
	('030416','03','04','16','Toraya'),
	('030417','03','04','17','Yanaca'),
	('030500','03','05','00','Cotabambas'),
	('030501','03','05','01','Tambobamba'),
	('030502','03','05','02','Cotabambas'),
	('030503','03','05','03','Coyllurqui'),
	('030504','03','05','04','Haquira'),
	('030505','03','05','05','Mara'),
	('030506','03','05','06','Challhuahuacho'),
	('030600','03','06','00','Chincheros'),
	('030601','03','06','01','Chincheros'),
	('030602','03','06','02','Anco-Huallo'),
	('030603','03','06','03','Cocharcas'),
	('030604','03','06','04','Huaccana'),
	('030605','03','06','05','Ocobamba'),
	('030606','03','06','06','Ongoy'),
	('030607','03','06','07','Uranmarca'),
	('030608','03','06','08','Ranracancha'),
	('030700','03','07','00','Grau'),
	('030701','03','07','01','Chuquibambilla'),
	('030702','03','07','02','Curpahuasi'),
	('030703','03','07','03','Gamarra'),
	('030704','03','07','04','Huayllati'),
	('030705','03','07','05','Mamara'),
	('030706','03','07','06','Micaela Bastidas'),
	('030707','03','07','07','Pataypampa'),
	('030708','03','07','08','Progreso'),
	('030709','03','07','09','San Antonio'),
	('030710','03','07','10','Santa Rosa'),
	('030711','03','07','11','Turpay'),
	('030712','03','07','12','Vilcabamba'),
	('030713','03','07','13','Virundo'),
	('030714','03','07','14','Curasco'),
	('040000','04','00','00','Arequipa'),
	('040100','04','01','00','Arequipa'),
	('040101','04','01','01','Arequipa'),
	('040102','04','01','02','Alto Selva Alegre'),
	('040103','04','01','03','Cayma'),
	('040104','04','01','04','Cerro Colorado'),
	('040105','04','01','05','Characato'),
	('040106','04','01','06','Chiguata'),
	('040107','04','01','07','Jacobo Hunter'),
	('040108','04','01','08','La Joya'),
	('040109','04','01','09','Mariano Melgar'),
	('040110','04','01','10','Miraflores'),
	('040111','04','01','11','Mollebaya'),
	('040112','04','01','12','Paucarpata'),
	('040113','04','01','13','Pocsi'),
	('040114','04','01','14','Polobaya'),
	('040115','04','01','15','Quequeña'),
	('040116','04','01','16','Sabandia'),
	('040117','04','01','17','Sachaca'),
	('040118','04','01','18','San Juan de Siguas'),
	('040119','04','01','19','San Juan de Tarucani'),
	('040120','04','01','20','Santa Isabel de Siguas'),
	('040121','04','01','21','Santa Rita de Siguas'),
	('040122','04','01','22','Socabaya'),
	('040123','04','01','23','Tiabaya'),
	('040124','04','01','24','Uchumayo'),
	('040125','04','01','25','Vitor'),
	('040126','04','01','26','Yanahuara'),
	('040127','04','01','27','Yarabamba'),
	('040128','04','01','28','Yura'),
	('040129','04','01','29','Jose Luis Bustamante y Rivero'),
	('040200','04','02','00','Camana'),
	('040201','04','02','01','Camana'),
	('040202','04','02','02','Jose Maria Quimper'),
	('040203','04','02','03','Mariano Nicolas Valcarcel'),
	('040204','04','02','04','Mariscal Caceres'),
	('040205','04','02','05','Nicolas de Pierola'),
	('040206','04','02','06','Ocoña'),
	('040207','04','02','07','Quilca'),
	('040208','04','02','08','Samuel Pastor'),
	('040300','04','03','00','Caraveli'),
	('040301','04','03','01','Caraveli'),
	('040302','04','03','02','Acari'),
	('040303','04','03','03','Atico'),
	('040304','04','03','04','Atiquipa'),
	('040305','04','03','05','Bella Union'),
	('040306','04','03','06','Cahuacho'),
	('040307','04','03','07','Chala'),
	('040308','04','03','08','Chaparra'),
	('040309','04','03','09','Huanuhuanu'),
	('040310','04','03','10','Jaqui'),
	('040311','04','03','11','Lomas'),
	('040312','04','03','12','Quicacha'),
	('040313','04','03','13','Yauca'),
	('040400','04','04','00','Castilla'),
	('040401','04','04','01','Aplao'),
	('040402','04','04','02','Andagua'),
	('040403','04','04','03','Ayo'),
	('040404','04','04','04','Chachas'),
	('040405','04','04','05','Chilcaymarca'),
	('040406','04','04','06','Choco'),
	('040407','04','04','07','Huancarqui'),
	('040408','04','04','08','Machaguay'),
	('040409','04','04','09','Orcopampa'),
	('040410','04','04','10','Pampacolca'),
	('040411','04','04','11','Tipan'),
	('040412','04','04','12','Uñon'),
	('040413','04','04','13','Uraca'),
	('040414','04','04','14','Viraco'),
	('040500','04','05','00','Caylloma'),
	('040501','04','05','01','Chivay'),
	('040502','04','05','02','Achoma'),
	('040503','04','05','03','Cabanaconde'),
	('040504','04','05','04','Callalli'),
	('040505','04','05','05','Caylloma'),
	('040506','04','05','06','Coporaque'),
	('040507','04','05','07','Huambo'),
	('040508','04','05','08','Huanca'),
	('040509','04','05','09','Ichupampa'),
	('040510','04','05','10','Lari'),
	('040511','04','05','11','Lluta'),
	('040512','04','05','12','Maca'),
	('040513','04','05','13','Madrigal'),
	('040514','04','05','14','San Antonio de Chuca'),
	('040515','04','05','15','Sibayo'),
	('040516','04','05','16','Tapay'),
	('040517','04','05','17','Tisco'),
	('040518','04','05','18','Tuti'),
	('040519','04','05','19','Yanque'),
	('040520','04','05','20','Majes'),
	('040600','04','06','00','Condesuyos'),
	('040601','04','06','01','Chuquibamba'),
	('040602','04','06','02','Andaray'),
	('040603','04','06','03','Cayarani'),
	('040604','04','06','04','Chichas'),
	('040605','04','06','05','Iray'),
	('040606','04','06','06','Rio Grande'),
	('040607','04','06','07','Salamanca'),
	('040608','04','06','08','Yanaquihua'),
	('040700','04','07','00','Islay'),
	('040701','04','07','01','Mollendo'),
	('040702','04','07','02','Cocachacra'),
	('040703','04','07','03','Dean Valdivia'),
	('040704','04','07','04','Islay'),
	('040705','04','07','05','Mejia'),
	('040706','04','07','06','Punta de Bombon'),
	('040800','04','08','00','La Union'),
	('040801','04','08','01','Cotahuasi'),
	('040802','04','08','02','Alca'),
	('040803','04','08','03','Charcana'),
	('040804','04','08','04','Huaynacotas'),
	('040805','04','08','05','Pampamarca'),
	('040806','04','08','06','Puyca'),
	('040807','04','08','07','Quechualla'),
	('040808','04','08','08','Sayla'),
	('040809','04','08','09','Tauria'),
	('040810','04','08','10','Tomepampa'),
	('040811','04','08','11','Toro'),
	('050000','05','00','00','Ayacucho'),
	('050100','05','01','00','Huamanga'),
	('050101','05','01','01','Ayacucho'),
	('050102','05','01','02','Acocro'),
	('050103','05','01','03','Acos Vinchos'),
	('050104','05','01','04','Carmen Alto'),
	('050105','05','01','05','Chiara'),
	('050106','05','01','06','Ocros'),
	('050107','05','01','07','Pacaycasa'),
	('050108','05','01','08','Quinua'),
	('050109','05','01','09','San Jose de Ticllas'),
	('050110','05','01','10','San Juan Bautista'),
	('050111','05','01','11','Santiago de Pischa'),
	('050112','05','01','12','Socos'),
	('050113','05','01','13','Tambillo'),
	('050114','05','01','14','Vinchos'),
	('050115','05','01','15','Jesús Nazareno'),
	('050116','05','01','16','Andrés Avelino Cáceres Dorregay'),
	('050200','05','02','00','Cangallo'),
	('050201','05','02','01','Cangallo'),
	('050202','05','02','02','Chuschi'),
	('050203','05','02','03','Los Morochucos'),
	('050204','05','02','04','Maria Parado de Bellido'),
	('050205','05','02','05','Paras'),
	('050206','05','02','06','Totos'),
	('050300','05','03','00','Huanca Sancos'),
	('050301','05','03','01','Sancos'),
	('050302','05','03','02','Carapo'),
	('050303','05','03','03','Sacsamarca'),
	('050304','05','03','04','Santiago de Lucanamarca'),
	('050400','05','04','00','Huanta'),
	('050401','05','04','01','Huanta'),
	('050402','05','04','02','Ayahuanco'),
	('050403','05','04','03','Huamanguilla'),
	('050404','05','04','04','Iguain'),
	('050405','05','04','05','Luricocha'),
	('050406','05','04','06','Santillana'),
	('050407','05','04','07','Sivia'),
	('050408','05','04','08','Llochegua'),
	('050409','05','04','09','Canayre'),
	('050410','05','04','10','Uchuraccay'),
	('050411','05','04','11','Pucacolpa'),
	('050500','05','05','00','La Mar'),
	('050501','05','05','01','San Miguel'),
	('050502','05','05','02','Anco'),
	('050503','05','05','03','Ayna'),
	('050504','05','05','04','Chilcas'),
	('050505','05','05','05','Chungui'),
	('050506','05','05','06','Luis Carranza'),
	('050507','05','05','07','Santa Rosa'),
	('050508','05','05','08','Tambo'),
	('050509','05','05','09','Samugari'),
	('050510','05','05','10','Anchihuay'),
	('050600','05','06','00','Lucanas'),
	('050601','05','06','01','Puquio'),
	('050602','05','06','02','Aucara'),
	('050603','05','06','03','Cabana'),
	('050604','05','06','04','Carmen Salcedo'),
	('050605','05','06','05','Chaviña'),
	('050606','05','06','06','Chipao'),
	('050607','05','06','07','Huac-Huas'),
	('050608','05','06','08','Laramate'),
	('050609','05','06','09','Leoncio Prado'),
	('050610','05','06','10','Llauta'),
	('050611','05','06','11','Lucanas'),
	('050612','05','06','12','Ocaña'),
	('050613','05','06','13','Otoca'),
	('050614','05','06','14','Saisa'),
	('050615','05','06','15','San Cristobal'),
	('050616','05','06','16','San Juan'),
	('050617','05','06','17','San Pedro'),
	('050618','05','06','18','San Pedro de Palco'),
	('050619','05','06','19','Sancos'),
	('050620','05','06','20','Santa Ana de Huaycahuacho'),
	('050621','05','06','21','Santa Lucia'),
	('050700','05','07','00','Parinacochas'),
	('050701','05','07','01','Coracora'),
	('050702','05','07','02','Chumpi'),
	('050703','05','07','03','Coronel Castañeda'),
	('050704','05','07','04','Pacapausa'),
	('050705','05','07','05','Pullo'),
	('050706','05','07','06','Puyusca'),
	('050707','05','07','07','San Francisco de Ravacayco'),
	('050708','05','07','08','Upahuacho'),
	('050800','05','08','00','Paucar del Sara Sara'),
	('050801','05','08','01','Pausa'),
	('050802','05','08','02','Colta'),
	('050803','05','08','03','Corculla'),
	('050804','05','08','04','Lampa'),
	('050805','05','08','05','Marcabamba'),
	('050806','05','08','06','Oyolo'),
	('050807','05','08','07','Pararca'),
	('050808','05','08','08','San Javier de Alpabamba'),
	('050809','05','08','09','San Jose de Ushua'),
	('050810','05','08','10','Sara Sara'),
	('050900','05','09','00','Sucre'),
	('050901','05','09','01','Querobamba'),
	('050902','05','09','02','Belen'),
	('050903','05','09','03','Chalcos'),
	('050904','05','09','04','Chilcayoc'),
	('050905','05','09','05','Huacaña'),
	('050906','05','09','06','Morcolla'),
	('050907','05','09','07','Paico'),
	('050908','05','09','08','San Pedro de Larcay'),
	('050909','05','09','09','San Salvador de Quije'),
	('050910','05','09','10','Santiago de Paucaray'),
	('050911','05','09','11','Soras'),
	('051000','05','10','00','Victor Fajardo'),
	('051001','05','10','01','Huancapi'),
	('051002','05','10','02','Alcamenca'),
	('051003','05','10','03','Apongo'),
	('051004','05','10','04','Asquipata'),
	('051005','05','10','05','Canaria'),
	('051006','05','10','06','Cayara'),
	('051007','05','10','07','Colca'),
	('051008','05','10','08','Huamanquiquia'),
	('051009','05','10','09','Huancaraylla'),
	('051010','05','10','10','Huaya'),
	('051011','05','10','11','Sarhua'),
	('051012','05','10','12','Vilcanchos'),
	('051100','05','11','00','Vilcas Huaman'),
	('051101','05','11','01','Vilcas Huaman'),
	('051102','05','11','02','Accomarca'),
	('051103','05','11','03','Carhuanca'),
	('051104','05','11','04','Concepcion'),
	('051105','05','11','05','Huambalpa'),
	('051106','05','11','06','Independencia'),
	('051107','05','11','07','Saurama'),
	('051108','05','11','08','Vischongo'),
	('060000','06','00','00','Cajamarca'),
	('060100','06','01','00','Cajamarca'),
	('060101','06','01','01','Cajamarca'),
	('060102','06','01','02','Asuncion'),
	('060103','06','01','03','Chetilla'),
	('060104','06','01','04','Cospan'),
	('060105','06','01','05','Encañada'),
	('060106','06','01','06','Jesus'),
	('060107','06','01','07','Llacanora'),
	('060108','06','01','08','Los Baños del Inca'),
	('060109','06','01','09','Magdalena'),
	('060110','06','01','10','Matara'),
	('060111','06','01','11','Namora'),
	('060112','06','01','12','San Juan'),
	('060200','06','02','00','Cajabamba'),
	('060201','06','02','01','Cajabamba'),
	('060202','06','02','02','Cachachi'),
	('060203','06','02','03','Condebamba'),
	('060204','06','02','04','Sitacocha'),
	('060300','06','03','00','Celendin'),
	('060301','06','03','01','Celendin'),
	('060302','06','03','02','Chumuch'),
	('060303','06','03','03','Cortegana'),
	('060304','06','03','04','Huasmin'),
	('060305','06','03','05','Jorge Chavez'),
	('060306','06','03','06','Jose Galvez'),
	('060307','06','03','07','Miguel Iglesias'),
	('060308','06','03','08','Oxamarca'),
	('060309','06','03','09','Sorochuco'),
	('060310','06','03','10','Sucre'),
	('060311','06','03','11','Utco'),
	('060312','06','03','12','La Libertad de Pallan'),
	('060400','06','04','00','Chota'),
	('060401','06','04','01','Chota'),
	('060402','06','04','02','Anguia'),
	('060403','06','04','03','Chadin'),
	('060404','06','04','04','Chiguirip'),
	('060405','06','04','05','Chimban'),
	('060406','06','04','06','Choropampa'),
	('060407','06','04','07','Cochabamba'),
	('060408','06','04','08','Conchan'),
	('060409','06','04','09','Huambos'),
	('060410','06','04','10','Lajas'),
	('060411','06','04','11','Llama'),
	('060412','06','04','12','Miracosta'),
	('060413','06','04','13','Paccha'),
	('060414','06','04','14','Pion'),
	('060415','06','04','15','Querocoto'),
	('060416','06','04','16','San Juan de Licupis'),
	('060417','06','04','17','Tacabamba'),
	('060418','06','04','18','Tocmoche'),
	('060419','06','04','19','Chalamarca'),
	('060500','06','05','00','Contumaza'),
	('060501','06','05','01','Contumaza'),
	('060502','06','05','02','Chilete'),
	('060503','06','05','03','Cupisnique'),
	('060504','06','05','04','Guzmango'),
	('060505','06','05','05','San Benito'),
	('060506','06','05','06','Santa Cruz de Toled'),
	('060507','06','05','07','Tantarica'),
	('060508','06','05','08','Yonan'),
	('060600','06','06','00','Cutervo'),
	('060601','06','06','01','Cutervo'),
	('060602','06','06','02','Callayuc'),
	('060603','06','06','03','Choros'),
	('060604','06','06','04','Cujillo'),
	('060605','06','06','05','La Ramada'),
	('060606','06','06','06','Pimpingos'),
	('060607','06','06','07','Querocotillo'),
	('060608','06','06','08','San Andres de Cutervo'),
	('060609','06','06','09','San Juan de Cutervo'),
	('060610','06','06','10','San Luis de Lucma'),
	('060611','06','06','11','Santa Cruz'),
	('060612','06','06','12','Santo Domingo de la Capilla'),
	('060613','06','06','13','Santo Tomas'),
	('060614','06','06','14','Socota'),
	('060615','06','06','15','Toribio Casanova'),
	('060700','06','07','00','Hualgayoc'),
	('060701','06','07','01','Bambamarca'),
	('060702','06','07','02','Chugur'),
	('060703','06','07','03','Hualgayoc'),
	('060800','06','08','00','Jaen'),
	('060801','06','08','01','Jaen'),
	('060802','06','08','02','Bellavista'),
	('060803','06','08','03','Chontali'),
	('060804','06','08','04','Colasay'),
	('060805','06','08','05','Huabal'),
	('060806','06','08','06','Las Pirias'),
	('060807','06','08','07','Pomahuaca'),
	('060808','06','08','08','Pucara'),
	('060809','06','08','09','Sallique'),
	('060810','06','08','10','San Felipe'),
	('060811','06','08','11','San Jose del Alto'),
	('060812','06','08','12','Santa Rosa'),
	('060900','06','09','00','San Ignacio'),
	('060901','06','09','01','San Ignacio'),
	('060902','06','09','02','Chirinos'),
	('060903','06','09','03','Huarango'),
	('060904','06','09','04','La Coipa'),
	('060905','06','09','05','Namballe'),
	('060906','06','09','06','San Jose de Lourdes'),
	('060907','06','09','07','Tabaconas'),
	('061000','06','10','00','San Marcos'),
	('061001','06','10','01','Pedro Galvez'),
	('061002','06','10','02','Chancay'),
	('061003','06','10','03','Eduardo Villanueva'),
	('061004','06','10','04','Gregorio Pita'),
	('061005','06','10','05','Ichocan'),
	('061006','06','10','06','Jose Manuel Quiroz'),
	('061007','06','10','07','Jose Sabogal'),
	('061100','06','11','00','San Miguel'),
	('061101','06','11','01','San Miguel'),
	('061102','06','11','02','Bolivar'),
	('061103','06','11','03','Calquis'),
	('061104','06','11','04','Catilluc'),
	('061105','06','11','05','El Prado'),
	('061106','06','11','06','La Florida'),
	('061107','06','11','07','Llapa'),
	('061108','06','11','08','Nanchoc'),
	('061109','06','11','09','Niepos'),
	('061110','06','11','10','San Gregorio'),
	('061111','06','11','11','San Silvestre de Cochan'),
	('061112','06','11','12','Tongod'),
	('061113','06','11','13','Union Agua Blanca'),
	('061200','06','12','00','San Pablo'),
	('061201','06','12','01','San Pablo'),
	('061202','06','12','02','San Bernardino'),
	('061203','06','12','03','San Luis'),
	('061204','06','12','04','Tumbaden'),
	('061300','06','13','00','Santa Cruz'),
	('061301','06','13','01','Santa Cruz'),
	('061302','06','13','02','Andabamba'),
	('061303','06','13','03','Catache'),
	('061304','06','13','04','Chancaybaños'),
	('061305','06','13','05','La Esperanza'),
	('061306','06','13','06','Ninabamba'),
	('061307','06','13','07','Pulan'),
	('061308','06','13','08','Saucepampa'),
	('061309','06','13','09','Sexi'),
	('061310','06','13','10','Uticyacu'),
	('061311','06','13','11','Yauyucan'),
	('070000','07','00','00','Callao'),
	('070100','07','01','00','Prov. Const. del Callao'),
	('070101','07','01','01','Callao'),
	('070102','07','01','02','Bellavista'),
	('070103','07','01','03','Carmen de la Legua Reynoso'),
	('070104','07','01','04','La Perla'),
	('070105','07','01','05','La Punta'),
	('070106','07','01','06','Ventanilla'),
	('070107','07','01','07','Mi Perú'),
	('080000','08','00','00','Cusco'),
	('080100','08','01','00','Cusco'),
	('080101','08','01','01','Cusco'),
	('080102','08','01','02','Ccorca'),
	('080103','08','01','03','Poroy'),
	('080104','08','01','04','San Jeronimo'),
	('080105','08','01','05','San Sebastian'),
	('080106','08','01','06','Santiago'),
	('080107','08','01','07','Saylla'),
	('080108','08','01','08','Wanchaq'),
	('080200','08','02','00','Acomayo'),
	('080201','08','02','01','Acomayo'),
	('080202','08','02','02','Acopia'),
	('080203','08','02','03','Acos'),
	('080204','08','02','04','Mosoc Llacta'),
	('080205','08','02','05','Pomacanchi'),
	('080206','08','02','06','Rondocan'),
	('080207','08','02','07','Sangarara'),
	('080300','08','03','00','Anta'),
	('080301','08','03','01','Anta'),
	('080302','08','03','02','Ancahuasi'),
	('080303','08','03','03','Cachimayo'),
	('080304','08','03','04','Chinchaypujio'),
	('080305','08','03','05','Huarocondo'),
	('080306','08','03','06','Limatambo'),
	('080307','08','03','07','Mollepata'),
	('080308','08','03','08','Pucyura'),
	('080309','08','03','09','Zurite'),
	('080400','08','04','00','Calca'),
	('080401','08','04','01','Calca'),
	('080402','08','04','02','Coya'),
	('080403','08','04','03','Lamay'),
	('080404','08','04','04','Lares'),
	('080405','08','04','05','Pisac'),
	('080406','08','04','06','San Salvador'),
	('080407','08','04','07','Taray'),
	('080408','08','04','08','Yanatile'),
	('080500','08','05','00','Canas'),
	('080501','08','05','01','Yanaoca'),
	('080502','08','05','02','Checca'),
	('080503','08','05','03','Kunturkanki'),
	('080504','08','05','04','Langui'),
	('080505','08','05','05','Layo'),
	('080506','08','05','06','Pampamarca'),
	('080507','08','05','07','Quehue'),
	('080508','08','05','08','Tupac Amaru'),
	('080600','08','06','00','Canchis'),
	('080601','08','06','01','Sicuani'),
	('080602','08','06','02','Checacupe'),
	('080603','08','06','03','Combapata'),
	('080604','08','06','04','Marangani'),
	('080605','08','06','05','Pitumarca'),
	('080606','08','06','06','San Pablo'),
	('080607','08','06','07','San Pedro'),
	('080608','08','06','08','Tinta'),
	('080700','08','07','00','Chumbivilcas'),
	('080701','08','07','01','Santo Tomas'),
	('080702','08','07','02','Capacmarca'),
	('080703','08','07','03','Chamaca'),
	('080704','08','07','04','Colquemarca'),
	('080705','08','07','05','Livitaca'),
	('080706','08','07','06','Llusco'),
	('080707','08','07','07','Quiñota'),
	('080708','08','07','08','Velille'),
	('080800','08','08','00','Espinar'),
	('080801','08','08','01','Espinar'),
	('080802','08','08','02','Condoroma'),
	('080803','08','08','03','Coporaque'),
	('080804','08','08','04','Ocoruro'),
	('080805','08','08','05','Pallpata'),
	('080806','08','08','06','Pichigua'),
	('080807','08','08','07','Suyckutambo'),
	('080808','08','08','08','Alto Pichigua'),
	('080900','08','09','00','La Convencion'),
	('080901','08','09','01','Santa Ana'),
	('080902','08','09','02','Echarate'),
	('080903','08','09','03','Huayopata'),
	('080904','08','09','04','Maranura'),
	('080905','08','09','05','Ocobamba'),
	('080906','08','09','06','Quellouno'),
	('080907','08','09','07','Kimbiri'),
	('080908','08','09','08','Santa Teresa'),
	('080909','08','09','09','Vilcabamba'),
	('080910','08','09','10','Pichari'),
	('080911','08','09','11','Inkawasi'),
	('080912','08','09','12','Villa Virgen'),
	('081000','08','10','00','Paruro'),
	('081001','08','10','01','Paruro'),
	('081002','08','10','02','Accha'),
	('081003','08','10','03','Ccapi'),
	('081004','08','10','04','Colcha'),
	('081005','08','10','05','Huanoquite'),
	('081006','08','10','06','Omacha'),
	('081007','08','10','07','Paccaritambo'),
	('081008','08','10','08','Pillpinto'),
	('081009','08','10','09','Yaurisque'),
	('081100','08','11','00','Paucartambo'),
	('081101','08','11','01','Paucartambo'),
	('081102','08','11','02','Caicay'),
	('081103','08','11','03','Challabamba'),
	('081104','08','11','04','Colquepata'),
	('081105','08','11','05','Huancarani'),
	('081106','08','11','06','Kosñipata'),
	('081200','08','12','00','Quispicanchi'),
	('081201','08','12','01','Urcos'),
	('081202','08','12','02','Andahuaylillas'),
	('081203','08','12','03','Camanti'),
	('081204','08','12','04','Ccarhuayo'),
	('081205','08','12','05','Ccatca'),
	('081206','08','12','06','Cusipata'),
	('081207','08','12','07','Huaro'),
	('081208','08','12','08','Lucre'),
	('081209','08','12','09','Marcapata'),
	('081210','08','12','10','Ocongate'),
	('081211','08','12','11','Oropesa'),
	('081212','08','12','12','Quiquijana'),
	('081300','08','13','00','Urubamba'),
	('081301','08','13','01','Urubamba'),
	('081302','08','13','02','Chinchero'),
	('081303','08','13','03','Huayllabamba'),
	('081304','08','13','04','Machupicchu'),
	('081305','08','13','05','Maras'),
	('081306','08','13','06','Ollantaytambo'),
	('081307','08','13','07','Yucay'),
	('090000','09','00','00','Huancavelica'),
	('090100','09','01','00','Huancavelica'),
	('090101','09','01','01','Huancavelica'),
	('090102','09','01','02','Acobambilla'),
	('090103','09','01','03','Acoria'),
	('090104','09','01','04','Conayca'),
	('090105','09','01','05','Cuenca'),
	('090106','09','01','06','Huachocolpa'),
	('090107','09','01','07','Huayllahuara'),
	('090108','09','01','08','Izcuchaca'),
	('090109','09','01','09','Laria'),
	('090110','09','01','10','Manta'),
	('090111','09','01','11','Mariscal Caceres'),
	('090112','09','01','12','Moya'),
	('090113','09','01','13','Nuevo Occoro'),
	('090114','09','01','14','Palca'),
	('090115','09','01','15','Pilchaca'),
	('090116','09','01','16','Vilca'),
	('090117','09','01','17','Yauli'),
	('090118','09','01','18','Ascensión'),
	('090119','09','01','19','Huando'),
	('090200','09','02','00','Acobamba'),
	('090201','09','02','01','Acobamba'),
	('090202','09','02','02','Andabamba'),
	('090203','09','02','03','Anta'),
	('090204','09','02','04','Caja'),
	('090205','09','02','05','Marcas'),
	('090206','09','02','06','Paucara'),
	('090207','09','02','07','Pomacocha'),
	('090208','09','02','08','Rosario'),
	('090300','09','03','00','Angaraes'),
	('090301','09','03','01','Lircay'),
	('090302','09','03','02','Anchonga'),
	('090303','09','03','03','Callanmarca'),
	('090304','09','03','04','Ccochaccasa'),
	('090305','09','03','05','Chincho'),
	('090306','09','03','06','Congalla'),
	('090307','09','03','07','Huanca-Huanca'),
	('090308','09','03','08','Huayllay Grande'),
	('090309','09','03','09','Julcamarca'),
	('090310','09','03','10','San Antonio de Antaparco'),
	('090311','09','03','11','Santo Tomas de Pata'),
	('090312','09','03','12','Secclla'),
	('090400','09','04','00','Castrovirreyna'),
	('090401','09','04','01','Castrovirreyna'),
	('090402','09','04','02','Arma'),
	('090403','09','04','03','Aurahua'),
	('090404','09','04','04','Capillas'),
	('090405','09','04','05','Chupamarca'),
	('090406','09','04','06','Cocas'),
	('090407','09','04','07','Huachos'),
	('090408','09','04','08','Huamatambo'),
	('090409','09','04','09','Mollepampa'),
	('090410','09','04','10','San Juan'),
	('090411','09','04','11','Santa Ana'),
	('090412','09','04','12','Tantara'),
	('090413','09','04','13','Ticrapo'),
	('090500','09','05','00','Churcampa'),
	('090501','09','05','01','Churcampa'),
	('090502','09','05','02','Anco'),
	('090503','09','05','03','Chinchihuasi'),
	('090504','09','05','04','El Carmen'),
	('090505','09','05','05','La Merced'),
	('090506','09','05','06','Locroja'),
	('090507','09','05','07','Paucarbamba'),
	('090508','09','05','08','San Miguel de Mayocc'),
	('090509','09','05','09','San Pedro de Coris'),
	('090510','09','05','10','Pachamarca'),
	('090511','09','05','11','Cosme'),
	('090600','09','06','00','Huaytara'),
	('090601','09','06','01','Huaytara'),
	('090602','09','06','02','Ayavi'),
	('090603','09','06','03','Cordova'),
	('090604','09','06','04','Huayacundo Arma'),
	('090605','09','06','05','Laramarca'),
	('090606','09','06','06','Ocoyo'),
	('090607','09','06','07','Pilpichaca'),
	('090608','09','06','08','Querco'),
	('090609','09','06','09','Quito-Arma'),
	('090610','09','06','10','San Antonio de Cusicancha'),
	('090611','09','06','11','San Francisco de Sangayaico'),
	('090612','09','06','12','San Isidro'),
	('090613','09','06','13','Santiago de Chocorvos'),
	('090614','09','06','14','Santiago de Quirahuara'),
	('090615','09','06','15','Santo Domingo de Capillas'),
	('090616','09','06','16','Tambo'),
	('090700','09','07','00','Tayacaja'),
	('090701','09','07','01','Pampas'),
	('090702','09','07','02','Acostambo'),
	('090703','09','07','03','Acraquia'),
	('090704','09','07','04','Ahuaycha'),
	('090705','09','07','05','Colcabamba'),
	('090706','09','07','06','Daniel Hernandez'),
	('090707','09','07','07','Huachocolpa'),
	('090709','09','07','09','Huaribamba'),
	('090710','09','07','10','Ñahuimpuquio'),
	('090711','09','07','11','Pazos'),
	('090713','09','07','13','Quishuar'),
	('090714','09','07','14','Salcabamba'),
	('090715','09','07','15','Salcahuasi'),
	('090716','09','07','16','San Marcos de Rocchac'),
	('090717','09','07','17','Surcubamba'),
	('090718','09','07','18','Tintay Puncu'),
	('100000','10','00','00','Huanuco'),
	('100100','10','01','00','Huanuco'),
	('100101','10','01','01','Huanuco'),
	('100102','10','01','02','Amarilis'),
	('100103','10','01','03','Chinchao'),
	('100104','10','01','04','Churubamba'),
	('100105','10','01','05','Margos'),
	('100106','10','01','06','Quisqui'),
	('100107','10','01','07','San Francisco de Cayran');

/*!40000 ALTER TABLE `Ubigeo` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table urbanizacion
# ------------------------------------------------------------

DROP TABLE IF EXISTS `urbanizacion`;

CREATE TABLE `urbanizacion` (
  `codigo` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `urbanizacion` WRITE;
/*!40000 ALTER TABLE `urbanizacion` DISABLE KEYS */;

INSERT INTO `urbanizacion` (`codigo`, `descripcion`)
VALUES
	('AG','AGRUPACIÓN'),
	('AH','ASENTAMIENTO HUMANO'),
	('AM','AMPLIACIÓN'),
	('AN','ANEXO'),
	('AS','ASOCIACIÓN'),
	('AU','AUTOPISTA'),
	('BA','BALNEARIO'),
	('CC','COMUNIDAD CAMPESINA'),
	('CD','CONDOMINIO'),
	('CH','CONJUNTO HABITACIONAL'),
	('CM','COMITÉ'),
	('CN','COMUNIDAD NATIVA'),
	('CO','COOPERATIVA'),
	('CP','CENTRO POBLADO'),
	('CR','CONJUNTO RESIDENCIAL'),
	('GR','GRUPO'),
	('PJ','PUEBLO JOVEN'),
	('PR','PARCELA'),
	('RE','RESIDENCIAL'),
	('UA','UNIDAD AGROPECUARIA'),
	('UB','URBANIZACIÓN'),
	('UV','UNIDAD VECINAL');

/*!40000 ALTER TABLE `urbanizacion` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table usuarios
# ------------------------------------------------------------

DROP TABLE IF EXISTS `usuarios`;

CREATE TABLE `usuarios` (
  `cod_usuario` varchar(255) NOT NULL,
  `active` bit(1) NOT NULL,
  `fecha_ingreso` date DEFAULT NULL,
  `grupo_menus` varchar(255) DEFAULT NULL,
  `id_role` varchar(255) NOT NULL,
  `menu_inicial` int(11) DEFAULT NULL,
  `nom_usuario` varchar(255) DEFAULT NULL,
  `password_usuario` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cod_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;

INSERT INTO `usuarios` (`cod_usuario`, `active`, `fecha_ingreso`, `grupo_menus`, `id_role`, `menu_inicial`, `nom_usuario`, `password_usuario`)
VALUES
	('joe',b'1','2020-02-01','1, 3, 4','ADMINISTRADOR',1,'Jose Diaz','$2a$10$wT/obdcvI07jSor8roN3NeuWhEdlarvunJ14ZOAFdo1g/lZ1uHbGe'),
	('miryan',b'1','2020-02-01','1, 2, 3, 4','OPERADOR',1,'Miryan Ramirez','$2a$10$wT/obdcvI07jSor8roN3NeuWhEdlarvunJ14ZOAFdo1g/lZ1uHbGe');

/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
