alter table assistant add superhero_id bigint;
alter table assistant add constraint superhero_fk_assistant FOREIGN KEY (superhero_id) REFERENCES superheroes (id);