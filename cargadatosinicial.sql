drop table ordenador;
create table ordenador (numero int, modelo varchar(20), precio decimal);
START TRANSACTION;
insert into ordenador (numero,modelo,precio) values (1,"m1",500);
insert into ordenador (numero,modelo,precio) values (2,"intel",700);
insert into ordenador (numero,modelo,precio) values (3,"amd",800);
insert into ordenador (numero,modelo,precio) values (4,"lenovo",300);
insert into ordenador (numero,modelo,precio) values (5,"asus",700);
insert into ordenador (numero,modelo,precio) values (6,"toshiva",1000);
insert into ordenador (numero,modelo,precio) values (7,"toshiva",100);
insert into ordenador (numero,modelo,precio) values (8,"toshiva",150);
insert into ordenador (numero,modelo,precio) values (9,"asus",700);
insert into ordenador (numero,modelo,precio) values (10,"m1",2000);
insert into ordenador (numero,modelo,precio) values (11,"m2",2500);
insert into ordenador (numero,modelo,precio) values (12,"m3",1200);
COMMIT