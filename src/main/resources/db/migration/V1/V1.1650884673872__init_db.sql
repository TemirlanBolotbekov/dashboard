create table if not exists employee
(
    id            bigserial primary key,
    created       timestamp without time zone,
    updated       timestamp without time zone,
    name          varchar(255),
    surname       varchar(255),
    patronymic    varchar(255),
    login         varchar(255),
    password      varchar(255),
    date_of_birth date
);

create table if not exists security_role
(
    id      bigserial primary key,
    created timestamp without time zone,
    updated timestamp without time zone,
    title   varchar not null,
    code    varchar not null
)
