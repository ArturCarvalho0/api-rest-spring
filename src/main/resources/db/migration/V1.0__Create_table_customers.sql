create table if not exists customers(
    id serial,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    city varchar(50) not null,
    constraint pk_customers primary key (id)
);

