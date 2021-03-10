DROP TABLE IF EXISTS `empleados`;
DROP table IF EXISTS `departamentos`;


CREATE TABLE `departamentos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `presupuesto` INT DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `empleados` (
  `dni` varchar(8) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `departamento` INT DEFAULT NULL,
  PRIMARY KEY (`dni`),
  CONSTRAINT `departamentos_fk` FOREIGN KEY (`departamento`) REFERENCES `departamentos` (`id`)
);


insert into departamentos (nombre,presupuesto)values('Dep 1',3000);
insert into departamentos (nombre,presupuesto)values('Dep 2',1000);
insert into departamentos (nombre,presupuesto)values('Dep 3',2000);
insert into departamentos (nombre,presupuesto)values('Dep 4',23000);
insert into departamentos (nombre,presupuesto)values('Dep 5',15000);

insert into empleados (dni, nombre, apellidos, departamento) values ('12345671','David','Lascorz Moreno',1);
insert into empleados (dni, nombre, apellidos, departamento) values ('12345672','Jose','Lopez',1);
insert into empleados (dni, nombre, apellidos, departamento) values ('12345673','Carlos','Ramirez',2);
insert into empleados (dni, nombre, apellidos, departamento) values ('12345674','Sandra','Sanchez',3);
insert into empleados (dni, nombre, apellidos, departamento) values ('12345675','Ingrid','Moreno',4);


