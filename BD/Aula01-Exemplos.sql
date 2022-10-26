-- Usando o BD Movies -- 

use movies_db;
# mostrar todos os filmes
select * from movies;

# mostrar nome, sobrenome e classificaçao de todos os atores.
select first_name, last_name, rating
from actors;

#mostrar o titulo do filme que recebeu mais premios
select max(awards), title
from movies;

#mostrar o titulo de todas as series usando alias para que tanto o nome da tabela
#qnto o campo estejam em Portugues
select title as titulo
from series as serie;

#mostrar o nome e sobrenome dos atores cuja classificaçao é superior a 7,5
select first_name, last_name
from actors
where rating > 7.5;

#mostrar o titulo dos filmes, a classificaçao e os premios dos filmes com classificaçao acima de 7.5 e mais de 2 premios
select title, rating, awards
from movies
where rating >7.5 AND awards >2;

#mostrar o titulo dos filmes e a classificaçao ordenados por classificaçao em ordem crescente.
select title, rating
from movies
order by rating desc;

#mostrar os titulos dos tres primeiros filmes no banco de dados.
select title
from movies
limit 3;

#mostrar o titulo e a classificaçao de todos os filmes cujo titulo é Toy Story
select title, rating
from movies
where title like '%Toy%Story%';

#mostrar os atores cujo nome começa com Sam
select first_name, last_name
from actors
where first_name like "Sam%";

#mostrar o titulo dos filmes que sairam entre 2004 e 2008.
select title, release_date
from movies
where year (release_date) between 2004 and 2008;

#mostrar o titulo dos filmes com classificaçao superior a 3, com mais de 1 premio e com data de lançamento
#entre 1988 e 2009. Ordene os resultados por classificaçao
select title, rating, awards, release_date
from movies
where rating >3 and awards >1 and year (release_date) between 1988 and 2009
order by rating desc;

#inserir um novo registro no BD na tabela de actors
insert into actors values (null, null, null, "Daniel", "Santos", 8.7, 1);

























