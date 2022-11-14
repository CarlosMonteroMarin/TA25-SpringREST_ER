DROP TABLE IF EXISTS departamento;
DROP TABLE IF EXISTS empleado;

create table departamento(
codigo int auto_increment primary key,
nombre varchar(100),
presupuesto int);

create table empleado(
dni int not null primary key,
nombre varchar(100),
apellidos varchar(100),
departamento int,
foreign key (departamento)
references departamento (codigo)
ON DELETE CASCADE
ON UPDATE CASCADE);

insert into departamento (nombre, presupuesto) values ('marketing',3423);
insert into departamento (nombre, presupuesto) values ('comercial',344);
insert into departamento (nombre, presupuesto) values ('ventas',5443);
insert into departamento (nombre, presupuesto) values ('recursos',1312);

insert into empleado (dni, nombre, apellidos, departamento) values (1111, 'nombre1', 'apellido1',1);
insert into empleado (dni, nombre, apellidos, departamento) values (2222, 'nombre2', 'apellido2',2);
insert into empleado (dni, nombre, apellidos, departamento) values (3333, 'nombre', 'apellido3',3);
insert into empleado (dni, nombre, apellidos, departamento) values (4444, 'nombre4', 'apellido4',4);