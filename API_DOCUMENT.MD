| Path | Description | ReturnValue |
| ---- | ----------- | ----------- |
| /actor | Get a list contained all data of actors | [ {actor_id, <br/> first_name, <br/> last_name, <br/>  last_update}, ...] |
| /actor/{id} | Retrieve a actor data by id | {actor_id, first_name, last_name, last_update} |
| /film | Get a list contained all data of films | [{film_id, title, rental_rate, rating}, ...] |
| /film/{id} | Retrieve a film data by id | {film_id, title, description, release_year, language: {language_id, name}, rental_duration, rental_rate, length, replacement_cost, rating, last_udpate, special_fetaures, fulltext} |
| /lang | Get a list contained all data of languages | {language_id, name} |
| /lang/{id} | Get a languages data | {language_id, name, last_update, films: [{...film}, ...]}
