create database db_chaves;
use db_chaves;

CREATE TABLE Pessoas (
	ID_Pessoa integer PRIMARY KEY AUTO_INCREMENT,
	Nome varchar(255));

CREATE TABLE Carro(
	ID_Carro integer PRIMARY KEY AUTO_INCREMENT,
    Nome varchar(255),
    Marca varchar(255),
    ID_Pessoa integer,
    constraint fk_Pessoas foreign key (ID_Pessoa) references Pessoas (ID_Pessoa));
    
    insert into Pessoas (Nome) values
    ('Juliana'),
    ('Julio'),
    ('Márcio');  

	insert into Carro (Nome, Marca, Id_Pessoa) values 
    ('Gol', 'Wolks',2 ), 
    ('Palio', 'Fiat', 3);