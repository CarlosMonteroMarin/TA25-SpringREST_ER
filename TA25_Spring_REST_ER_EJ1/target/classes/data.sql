DROP TABLE IF EXISTS fabricantes;
DROP table IF EXISTS articulos;

CREATE TABLE fabricantes (
codigo int auto_increment primary key,
nombre varchar(100)
);

CREATE TABLE articulos (
codigo int auto_increment primary key,
nombre varchar (100),
precio int,
fabricante int,
foreign key (codigo) 
references fabricantes (fabricante));

insert into fabricantes (nombre) values ('audi');
insert into fabricantes (nombre) values ('bosh');
insert into fabricantes (nombre) values ('lg');
insert into fabricantes (nombre) values ('pcbox');
insert into fabricantes (nombre) values ('tesla');

insert into articulos (nombre, precio, fabricante) values ('rueda',5,1);
insert into articulos (nombre, precio, fabricante) values ('ventana',5,2);
insert into articulos (nombre, precio, fabricante) values ('puerta',5,3);
insert into articulos (nombre, precio, fabricante) values ('antena',5,3);
insert into articulos (nombre, precio, fabricante) values ('luz',5,2);