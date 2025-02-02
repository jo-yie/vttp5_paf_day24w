-- drop database if exists 
DROP DATABASE IF EXISTS day24w; 

-- create databse 
CREATE DATABASE day24w; 

-- select database
USE day24w;

-- create orders table
CREATE TABLE orders (
    order_id int auto_increment,
    order_date date not null, 
    customer_name varchar(128) not null, 
    ship_address varchar(128) not null, 
    notes text not null, 
    tax decimal(2,2) default 0.05,
    constraint pk_order_id primary key(order_id)
);

-- create order_details table
CREATE TABLE order_details (
    id int auto_increment, 
    product varchar(64) not null, 
    unit_price decimal(3,2) not null, 
    discount decimal(3,2) default 1.0,
    quantity int not null, 
    order_id int not null, -- foreign key 
    constraint pk_id primary key(id),
    constraint fk_order_id foreign key(order_id)
        references orders(order_id)
);

-- create user day24w
DROP USER IF EXISTS 'day24w'@'%';
CREATE USER 'day24w'@'%' IDENTIFIED BY 'password'; 
FLUSH PRIVILEGES;

GRANT ALL PRIVILEGES ON day24w.* TO 'day24w'@'%';
FLUSH PRIVILEGES; 