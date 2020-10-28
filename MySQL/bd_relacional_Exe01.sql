create database db_cidade_das_carnes;
use db_cidade_das_carnes;

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
	(default, "Carne Bovina", "Sadia"),
	(default, "Frango", "Sadia"),
	(default, "Carne de Porco", "Sadia"),
	(default, "Carne Bovina", "Perdigão"),
	(default, "Carne de Porco", "Aurora");
    
insert into tb_produto values
	(default, "Contra-Filé", "1Kg", 10, 20, 1),
	(default, "Picanha", "500g", 5, 70, 1),
	(default, "Coxa", "2Kg", 20, 56, 2),
	(default, "Linguiça", "1Kg", 15, 20, 3),
	(default, "Contra-Filé", "1Kg", 15, 52, 4),
	(default, "Picanha", "500g", 8, 58, 4),
	(default, "Linguiça", "2Kg", 30, 25, 5),
	(default, "Costela", "1Kg", 3, 48, 5);
    
select * from tb_categoria;
select * from tb_produto;

select * from tb_produto where preco > 50;
select * from tb_produto where preco >= 3 and preco <=60;
select * from tb_produto where nome like "%CO%";

select * from tb_categoria
inner join tb_produto
on tb_categoria.id_cat = tb_produto.id_cat;

select * from tb_categoria
inner join tb_produto
on tb_categoria.id_cat = tb_produto.id_cat where tb_categoria.nome = "Carne Bovina";