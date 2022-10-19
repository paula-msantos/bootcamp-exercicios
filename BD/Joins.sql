-- Joins --
use movies_db;

select count(*) from genres; -- 12
select count(*) from movies; -- 21

-- join das tabelas 
select count(*)
from genres 
inner join movies on movies.genre_id = genres.id; -- 19

-- nao tem genero cadastrado --
select * from movies where genre_id is null;

insert into genres values (null, now(), null, "Novo genero", 20, 1);


select movies.title as filme, genres.name
from genres inner join movies 
on movies.genre_id = genres.id;

-- trazendo tudo de filme, mesmo aqueles sem generos
select movies.title as filme, genres.name
from genres right join movies 
on movies.genre_id = genres.id;

-- trazendo tudo de generos, mesmo aqueles sem filmes
select movies.title as filme, genres.name
from genres left join movies 
on movies.genre_id = genres.id;

-- OBS: o MySQL nao tem a opcao de full outer join --







