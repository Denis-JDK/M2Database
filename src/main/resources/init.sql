create schema account
create table account.address (
id integer unique not null,
country varchar,
region varchar,
street varchar,
home varchar,
primary key (id)
);
 insert into address (id, country, region, street, home) values (1, 'Russia', 'Krim', 'street1', 'MyHome');
 insert into address (id, country, region, street, home) values (2, 'Russia', 'Kamchatka', 'street1', 'BigHome');

create table account.users (
id integer unique not null,
names varchar not null,
email varchar,
address_id integer,
primary key (id),
foreign key (address_id) references address (id)
);

insert into users (id, names, email, address_id) values (2, 'Bobi', 'email@gogly.com', 1);



