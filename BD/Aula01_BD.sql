# Cria um novo Banco de Dados
create database bd_aula1_meli;

#Indica qual banco default (padrão)
use bd_aula1_meli;

#Cria as tabelas do BD
create table produto (
	id integer,
    nome varchar(100),
    preco double default 0,
    primary key (id)
);

#insere um registro na table de produtos
insert into produto values (1, 'Teclado', 150);
insert into produto values (2, 'Mouse', 50);
insert into produto values (1, null, 150);
insert into produto values (2, 'Mouse Gamer', 200);

#busque todos os campos de todos os registros da tabela de produtos
select * from produto;

#busque os nomes e preços dos produtos cadastrados
select nome, preco from produto;

#busque as informaçoes do produto com codigo 2
select * from produto where id = 2;

#busque todos os preços de mouses
select nome, preco 
from produto 
where nome like "%mouse%";

