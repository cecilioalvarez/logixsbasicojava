drop table movil;
create table movil (numero int, modelo varchar(20), contrato varchar(20));
START TRANSACTION;
insert into movil (numero,modelo,contrato) values (606456543,"iphone","standard");
insert into movil (numero,modelo,contrato) values (606456544,"iphone2","standard");
insert into movil (numero,modelo,contrato) values (606456545,"iphone3","standard");
insert into movil (numero,modelo,contrato) values (606456546,"iphone5","standard");
insert into movil (numero,modelo,contrato) values (606456547,"iphone5","standard");


COMMIT