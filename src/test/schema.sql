create table pets(
                     name varchar(100) not null,
                     code long primary key,
                     animaltype varchar(100) not null,
                     fur varchar(100) not null,
                     origin varchar(100) not null
);
insert into pets(name, code, animaltype, fur, origin) values
                                                          ('Mustikas', 202211151535, 'Cat', 'Black', 'Estonia'),
                                                          ('Roy', 202211151536, 'Dog', 'Brown', 'Latvia'),
                                                          ('Charles', 202211151537, 'Horse', 'White','Norway');
