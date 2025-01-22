create schema netology;

create table netology.customers(
id int primary key,
name varchar(255),
surname varchar(255),
age int,
phone_number int);


create table netology.orders(
id int primary key,
date Date,
product_name text,
amount int,
customer_id int,
foreign key(customer_id) references netology.customers (id)
);
