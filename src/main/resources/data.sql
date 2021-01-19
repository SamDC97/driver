drop table if exists driver_entity CASCADE;
create table driver_entity (id bigint not null, age bigint, name varchar(255), nationality varchar(255), primary key (id));

insert into driver_entity (id, name, age, nationality) values
 (1, 'Lewis Hamilton', 35, 'England'),
 (2, 'Alex Albon', 26, 'Thailand'),
 (3, 'Antonio Giovinazzi', 27, 'Italy'),
 (4, 'Carlos Sainz Jr.', 26, 'Spain'),
 (5, 'Charles Leclerc', 23, 'Monaco'),
 (6, 'Daniel Ricciardo', 34, 'Australia'),
 (7, 'Daniil Kvyat', 26, 'Russia'),
 (8, 'Esteban Ocon', 24, 'France'),
 (9, 'George Russell', 22, 'England'),
 (10, 'Kevin Magnussen', 28, 'Denmark'),
 (11, 'Kimi Räikkönen', 41, 'Finland'),
 (12, 'Lance Stroll', 22, 'Canada'),
 (13, 'Lando Norris', 21, 'England'),
 (14, 'Max Verstappen', 23, 'The Netherlands'),
 (15, 'Nicholas Latifi', 25, 'Canada'),
 (16, 'Pierre Gasly', 24, 'France'),
 (17, 'Romain Grosjean', 34, 'France'),
 (18, 'Sebastian Vettel', 33, 'Germany'),
 (19, 'Sergio Perez', 30, 'Mexico'),
 (20, 'Valtteri Bottas', 31, 'Finland');