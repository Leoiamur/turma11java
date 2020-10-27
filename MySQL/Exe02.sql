create database db_RH2;
use db_RH2;

create table tb_cargo (
	id_cargo integer primary key auto_increment,
    nome varchar(20),
    setor varchar(20)
    );
    
create table tb_funcionario (
	id_funcionario integer primary key auto_increment,
    nome varchar(30),
    idade int,
    endereco varchar(30),
    sexo enum ("M", "F", "O"),
    salario int,
    id_cargo integer,
    constraint fk_cargo foreign key (id_cargo) references tb_cargo (id_cargo)
    );
    
insert into tb_cargo values
	(default, "Estagiário", "TI"),
    (default, "Dev Java Jr.", "TI"),
	(default, "Dev Java Pleno.", "TI"),
	(default, "Dev Java Senior.", "TI"),
	(default, "Tec Leader", "TI");
    
insert into tb_funcionario values
	(default, "Carlos", 19, "Rua da Aleluia", "M", 1200, 1),
	(default, "Rafaela", 21, "Rua da Alegria", "O", 1200, 1),
	(default, "Joana", 23, "Rua da Careta", "F", 1800, 2),
	(default, "Thiago", 22, "Rua da Contramão", "M", 1800, 2),
	(default, "Pedro", 25, "Rua do Alemão", "O", 1800, 2),
	(default, "Cecília", 26, "Rua do Peão", "F", 3000, 3),
	(default, "Priscila", 28, "Rua da Esperança", "F", 3000, 3),
	(default, "João", 27, "Rua da Emoção", "M", 3000, 3),
	(default, "Rafael", 30, "Rua da Fala", "O", 3000, 3),
	(default, "Flávia", 30, "Rua do Guri", "F", 3000, 3),
	(default, "Leandro", 32, "Rua do Leão", "M", 5000, 4),
	(default, "Carla", 31, "Rua do Mercado", "F", 5000, 4),
	(default, "Thaís", 34, "Rua da Travessia", "F", 5000, 4),
	(default, "Caroline", 26, "Rua da Fantasia", "F", 5000, 4),
	(default, "Leonardo", 27, "Rua do Dev", "M", 8000, 5);
    
select * from tb_funcionario;
select * from tb_cargo;

 select * from tb_funcionario where salario > 2000;
 select * from tb_funcionario where salario <= 2000 and salario >= 1000;
 select * from tb_funcionario where nome like "c%";