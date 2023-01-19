CREATE TABLE superhero_power (
    id bigint PRIMARY KEY,
    superhero_id bigint NOT NULL,
    power_id bigint NOT NULL
);

alter table superhero_power add constraint superhero_fk_superhero_power FOREIGN KEY (superhero_id) REFERENCES superheroes (id);
alter table superhero_power add constraint power_fk_superhero_power FOREIGN KEY (power_id) REFERENCES power (id);