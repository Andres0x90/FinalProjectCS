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
	edad int not null,
	dir varchar(30),
	telefono varchar(15)
)
go
create table empleado(
	codigo varchar(15) primary key,
	nombre varchar(30),
	apellido varchar(35),
	edad int,
	fecha_nacimiento varchar(30),
	telefono varchar(15),
	usuario varchar(30),
	contrasena varchar(30)
)
go
create table venta(
	codigo int not null IDENTITY(1,1),
	cod_emp varchar(15) foreign key references empleado(codigo),
	cod_cli varchar(15) foreign key references cliente(codigo),
	cod_art varchar(15) foreign key references articulo(codigo),
	fecha varchar(30),
	hora varchar(10),
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
insert into empleado values ('0101010', 'empleado1', 'algunofeo', 20,'2001-08-08','9996542452', 'emp1','123456789');

select * from articulo;
insert into articulo values('05GOW','Dios de la guerra','Accion',15000,100,'videojuego');
insert into articulo values('01MAT','MATRIX 1999','Ficción',250000,5,'pelicula');

select * from cliente;
insert into cliente values('101', 'raquel','desca',25,'cll 25b # 25 - 25','0000000');
insert into cliente values('121', 'Anak','Zahard',24,'cll 15z # 2 - 25','15915912');

select * from venta;
insert into venta values('0101010','101','05GOW','05-05-2020','00:00',25,375000);
insert into venta values('0101010','101','01MAT','08-05-2020','02:00',2,500000);


select * from venta inner join empleado on venta.cod_emp = empleado.codigo join cliente on venta.cod_cli = cliente.codigo;

select * from empleado;
Select * from venta where cod_emp = (select codigo from empleado where codigo=@codigo_empleado);

Select * from empleado where codigo = (select cod_emp from venta where (cod_art = @cod_art and codigo = @codigo_venta));

Select * from empleado where codigo = (select cod_emp from venta where cod_art = '05GOW');

*/
