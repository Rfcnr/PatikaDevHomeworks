# [PatikaDev](https://academy.patika.dev/) SQL Course DVD Rental Sample Database Query Scenarios - Homework-10

This repository contains SQL queries for performing various scenarios on the `dvdrental` sample database.

## Query Scenarios

1. **Write the LEFT JOIN query** that we can see the city `(city)` and country `(country)` names in the `city` table and `country` table together.
    ```sql
    SELECT city, country
    FROM city
    LEFT JOIN country ON country.country_id = city.country_id;
    ```

2. **Write the RIGHT JOIN query** where we can see the `customer` table and the `payment_id` in the `payment` table and the `first_name` and `last_name` names in the `customer` table together.
    ```sql
    SELECT payment_id, first_name, last_name
    FROM customer
    RIGHT JOIN payment ON customer.customer_id = payment.customer_id;
    ```

3. **Write the FULL JOIN query** where we can see the `customer` table and the `rental_id` in the `rental` table and the `first_name` and `last_name` names in the `customer` table together.
    ```sql
    SELECT rental_id, first_name, last_name
    FROM customer
    FULL JOIN rental ON customer.customer_id = rental.customer_id;
    ```

## Sample Database

The queries are performed on the `dvdrental` sample database. This database is used for practice and learning purposes.

## Usage

To execute these queries, you can use a SQL-compatible database management system (DBMS) and connect to the `dvdrental` database. Copy and paste the queries into your DBMS interface to see the results.

## Credits

Sample database provided by [PostgreSQL Tutorial](https://www.postgresqltutorial.com/).