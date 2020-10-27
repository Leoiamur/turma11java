use relacional_db;

select * from carro;
select * from pessoa;

insert into pessoa values
	(1, "Julia"),
	(2, "Márcio");
    
insert into carro values (1, "Fiat", "2019", 1);

select * from carro 
inner join pessoa
where carro.Pessoa_id_pessoa = pessoa.id_pessoa;