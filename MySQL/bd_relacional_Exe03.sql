create database db_curso_da_minha_vida;
use db_curso_da_minha_vida;

create table tb_categoria (
	ID_cat integer primary key auto_increment,
    Área varchar(30),
    Plataforma varchar(30)
);

create table tb_curso (
	ID_cur integer primary key auto_increment,
    Nome varchar(30),
    Carga varchar(30),
    Professor varchar(30),
    Valor int,
    ID_cat integer,
    constraint fk_categoria foreign key (ID_cat) references tb_categoria (ID_cat)
);

insert into tb_categoria values
	(default, "Programação", "Alura"),
	(default, "Programação", "Udemy"),
	(default, "Programação", "Treina Web"),
	(default, "Matemática", "École"),
	(default, "Matemática", "University of Pennsylvania");
    
insert into tb_curso values
	(default, "Java Básico", "23 Horas", "Loiane", 20, 1),
	(default, "Java Avançado", "28 Horas", "Ed", 70, 1),
	(default, "Banco de Dados", "18 Horas", "Luiza", 56, 2),
	(default, "JavaScript", "22 Horas", "Jéssica", 20, 2),
	(default, "HTML e CSS", "25 Horas", "Carlos", 52, 3),
	(default, "Python", "23 Horas", "Juliana", 58, 3),
	(default, "Álgebra Linear", "15 Horas", "Victor", 48, 4),
	(default, "Cálculo 1", "12 Horas", "Ricardo", 25, 5);
    
select * from tb_categoria;
select * from tb_curso;

select * from tb_curso where Valor > 50;
select * from tb_curso where Valor >= 3 and Valor <=60;
select * from tb_curso where Nome like "%JAV%";

select * from tb_categoria
inner join tb_curso
on tb_categoria.ID_cat = tb_curso.ID_cat;

select * from tb_categoria
inner join tb_curso
on tb_categoria.ID_cat = tb_curso.ID_cat where tb_categoria.Área = "Programação";