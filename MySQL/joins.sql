use db_estoque;

select * from tb_produtos
left join tb_marcas on tb_marcas.id = tb_produtos.marca_id
/*where tb_marcas.nome like "%Nike%"
and tb_produtos.preco < 50.00
and tb_produtos.nome = "Meias"*/
/*where tb_produtos.nome = "Meias"
or tb_produtos.nome = "Tênis"*/