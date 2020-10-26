create database db_empresa;
use db_empresa;

create table tb_funcionarios (
	id bigint auto_increment,
    nome varchar(30),
    idade int,
    cpf varchar(12),
    endereco varchar(40),
    salario bigint,
    primary key(id)
);

insert into tb_funcionarios(id, nome, idade, cpf, endereco, salario) Values (default, "Leonardo", 27, "00000000000", "Rua dos Devs", 4000);
insert into tb_funcionarios(id, nome, idade, cpf, endereco, salario) Values (default, "Júlio", 22, "11111111111", "Rua dos Animais", 1500);
insert into tb_funcionarios(id, nome, idade, cpf, endereco, salario) Values (default, "Cláudia", 33, "22222222222", "Rua das Margaridas", 6500);
insert into tb_funcionarios(id, nome, idade, cpf, endereco, salario) Values (default, "Rafaela", 19, "33333333333", "Rua dos Desesperados", 2200);
insert into tb_funcionarios(id, nome, idade, cpf, endereco, salario) Values (default, "Carlos", 51, "44444444444", "Rua dos Belos", 7000);

select * from tb_funcionarios;

select * from tb_funcionarios where salario > 2000;

select * from tb_funcionarios where salario < 2000;

update tb_funcionarios set endereco = "Rua do Carvalho" where id = 2;