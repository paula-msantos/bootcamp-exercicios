-- Subconsultas --
use movies_db;

-- quais sao os filmes que nao é o filme preferido de nenhum ator
select title
from movies
where not exists
(select * from actors where favorite_movie_id = movies.id);
-- ou --
SELECT title FROM movies WHERE id NOT IN (SELECT favorite_movie_id FROM actors);

-- quais as 3 series commaior numero de temporadas
select series.title, count(*) as temporadas
from seasons inner join series on series.id = seasons.serie_id
group by series.id
order by temporadas desc
limit 3;

-- quais os nomes dos atores que trabalham em filmes com avaliaçao maior que 9.1
select first_name, last_name
from actors
where id in (
	select am.actor_id
	from movies m inner join actor_movie am on m.id = am.movie_id
    where rating > 9.1
) order by first_name;













 