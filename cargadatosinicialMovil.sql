drop table movil;
create table movil (numero int, modelo varchar(20), contrato varchar(20));
START TRANSACTION;
insert into movil (numero,modelo,contrato) values (606456543,"iphone","standard");
insert into ordenador (numero,modelo,precio) values (2,"intel",700);
COMMIT