create database videotienda;
go
use videotienda;
go
create table articulo(
	codigo varchar(15) primary key,
	titulo varchar(50),
	genero varchar(15),
	precio float(10),
	cantidad int,
	tipo varchar(15)
)
go
create table Cliente(
	codigo varchar(15) primary key,
	nombre varchar(30),
	apellido varchar(30),
	edad int,
	dir varchar(30),
	telefono varchar(15)
)
go
create table empleado(
	codigo varchar(15) primary key,
	nombre varchar(30),
	apellido varchar(35),
	edad int,
	telefono varchar(15),
	fecha_nacimiento date,
	usuario varchar(30),
	contrasena varchar(30)
)
go
create table venta(
	cod_emp varchar(15) foreign key references empleado(codigo),
	cod_cli varchar(15) foreign key references cliente(codigo),
	cod_art varchar(15) foreign key references articulo(codigo),
	codigo int not null IDENTITY(1,1),
	cant int,
	valor float
)
go


create trigger descargo
on venta
after insert
AS
	
	declare @nCant int 
	declare @nID varchar(15) 
	SET @nCant = (select top 1 cant from venta order by codigo DESC);
	SET @nID = (select top 1 cod_art from venta order by codigo DESC);
	
	update articulo set cantidad = (select cantidad from articulo where codigo = @nID) - @nCant where codigo = @nID;
go

/*
Select * from empleado;
insert into empleado(codigo, nombre,apellido,edad,telefono,usuario,contrasena) values ('0101010', 'empleado1', 'algunofeo', 20, '9996542452', 'emp1','123456789');

select * from articulo;
insert into articulo values('05GOW','Dios de la guerra','Accion',15000,100,'videojuego');
insert into articulo values('01MAT','MATRIX 1999','Ficci�n',250000,5,'pelicula');

select * from cliente;
insert into cliente values('101', 'raquel','desca','cll 25b # 25 - 25','0000000');

select * from venta;
insert into venta values('0101010','101','05GOW',25,375000);
insert into venta values('0101010','101','01MAT',2,500000);
*/