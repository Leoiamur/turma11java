create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria (
	id_cat integer primary key auto_increment,
    nome varchar(30),
    marca varchar(30)
);

create table tb_produto (
	id_prod integer primary key auto_increment,
    nome varchar(30),
    peso varchar(30),
    quantidade int,
    preco int,
    id_cat integer,
    constraint fk_categoria foreign key (id_cat) references tb_categoria (id_cat)
);

insert into tb_categoria values
	(default, "Civil", "Intelbras"),
	(default, "Civil", "Tramontina"),
	(default, "Civil", "Lorenzetti"),
	(default, "Hidráulica", "Laike"),
	(default, "Hidráulica", "Deca");
    
insert into tb_produto values
	(default, "Cimento", "1Kg", 10, 20, 1),
	(default, "Areia", "2Kg", 5, 70, 1),
	(default, "Cal", "3Kg", 20, 56, 2),
	(default, "Argamassa", "1Kg", 15, 20, 2),
	(default, "Concreto", "5Kg", 15, 52, 3),
	(default, "Pedra Brita", "3Kg", 8, 58, 3),
	(default, "Tubo", "1Kg", 30, 25, 4),
	(default, "Registro", "1Kg", 3, 48, 5);
    
select * from tb_categoria;
select * from tb_produto;

select * from tb_produto where preco > 50;
select * from tb_produto where preco >= 3 and preco <=60;
select * from tb_produto where nome like "%CI%";

select * from tb_categoria
inner join tb_produto
on tb_categoria.id_cat = tb_produto.id_cat;

select * from tb_categoria
inner join tb_produto
on tb_categoria.id_cat = tb_produto.id_cat where tb_categoria.nome = "Hidráulica";