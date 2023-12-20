create  schema da;
create sequence da.users_id_seq;
create table da.users (
id integer unique not null default nextval('da.users_id_seq'),
names varchar not null,
email varchar
);