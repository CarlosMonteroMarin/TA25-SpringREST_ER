DROP TABLE IF EXISTS almacen;
DROP TABLE IF EXISTS caja;

create table almacen(
codigo int auto_increment primary key,
lugar varchar(100),
capacidad int);

create table caja(
codigo int auto_increment primary key,
contenido varchar(100),
valor int,
almacen int,
foreign key (almacen)
references almacen (codigo)
ON DELETE CASCADE
ON UPDATE CASCADE);

insert into almacen (lugar, capacidad) values ('sdfdsgdfh',3423);
insert into almacen (lugar, capacidad) values ('fdfdgdfg',344);
insert into almacen (lugar, capacidad) values ('dfgfdg',5443);
insert into almacen (lugar, capacidad) values ('dfgdfg',1312);

insert into caja (contenido, valor, almacen) values ('cosas',336,1);
insert into caja (contenido, valor, almacen) values ('cosas',432,2);
insert into caja (contenido, valor, almacen) values ('cosas',7657,3);
insert into caja (contenido, valor, almacen) values ('cosas',7674,1);
