This is console based e-commerce application, which has three type of users - User, Admin, Guest.

Technologies used-

1 Java
2 MySQL
3 JDBC

Activities that User can perform-

1 User Registration.
2 User Login.
3 View Products.
4 Add product to cart.
5 View cart.
6 Purchase the product.(Bill will be displayed after purchase)

Activities that Admin can perform-(For now by default there is one Admin, to login as admin just enter password-> 'admin'.

1 Add new products in the products table.
2 Check available quantity of any product.
3 Check whether user is registered or not and fetch user details.
4 Check user order history.
5 Update quantity of any product.
6 generate bill and display to user.

Activities that a Guest can perform-

1 View available products.

Tables used-

1 products->

create table products(productId int, productName varchar(255) not null,
productDetails varchar(255),price float not null, quantity int,primary key(productId));

2 users->

create table users (firstName varchar(255) not null, lastName varchar(255)not null,username varchar(255) unique, 
password varchar(255), city varchar(255),mailId varchar(255), mobileNumber long);

3 cart->

create table cart(userId varchar(255) not null,productId int not null, 
productName varchar(255)not null,price float not null , quantity int not null);

4 orderHistory->

create table orderHistory(userId varchar(255) not null,productId int not null, 
productName varchar(255)not null,unitPrice float, quantity int not null);

SQL Commands used- select, insert,update,delete

If you are using this project, Some changes need to do in project-

1 Change the getConnection() parameters as per your pramanters. (package com.eCart.utility -> DatabaseConnector.DBConnection()).
2 Create database and create tables in your database. (I used MySQL DB).


Note- Validation not completed for "InputMismatchException" so enter the choices which application provides.

