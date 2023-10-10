create table if not exists vehicles(
    id serial,
    model_name varchar(50) not null,
    assembler varchar(50) not null,
    manufacture_year integer not null,
    model_year integer not null,
    constraint pk_vehicles primary key (id)
)