INSERT INTO 
    power (id, name, description)

    --Inserting values into the "power" table with columns id, name, and description
    --The values being inserted include the id, name, and description of the power
    --Inserting values into the "superhero_power" table with columns id, superhero_id, and power_id
    --The values being inserted include the id, the id of the superhero, and the id of the power associated with that superhero
VALUES
    (1,'Flying','Ninja can fly'),
    (2,'Mind Reading','Ninja can read the mind of all living beings'),
    (3,'Super-Human Strength','Ninja is having 10 senses');
	
INSERT INTO 
    superhero_power (id, superhero_id, power_id)
VALUES
    (1,1,1),
    (2,1,2),
    (3,1,3);