--This SQL script creates a table named "Superheroes" with 4 columns: id, name, alias, and origin.
--The id column is set as the primary key, meaning it is unique and non-nullable.
--The other columns are varchar data types with a specified length.

create table if not exists Superheroes (
	id bigint primary key, 
	name varchar(50), 
	alias varchar(50),
	origin varchar(50)
);

-- This SQL script creates a table named "Assistant" with 2 columns: id and name.
-- The id column is set as the primary key, meaning it is unique and non-nullable.
-- The other column is a varchar data type with a specified length.
create table if not exists Assistant (
	id bigint primary key, 
	name varchar(50)
);
-- This SQL script creates a table named "Power" with 3 columns: id, name, and description.
-- The id column is set as the primary key, meaning it is unique and non-nullable.
-- The name column is a varchar data type with a specified length.
-- The description column is a text data type
create table if not exists Power (
	id bigint primary key, 
	name varchar(50),
	description text
)

