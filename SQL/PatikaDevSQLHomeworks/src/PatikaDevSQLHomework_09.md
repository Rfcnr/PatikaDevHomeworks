# [PatikaDev](https://academy.patika.dev/) SQL Course DVD Rental Sample Database Query Scenarios - Homework-9

This repository contains SQL queries for performing various scenarios on the `dvdrental` sample database.

## Query Scenarios

1. **Write the INNER JOIN query** that we can see the city `(city)` and country `(country)` names in the `city` table and `country` table together.
    ```sql
    SELECT city, country
    FROM city
    INNER JOIN country ON country.country_id = city.country_id;
    ```

2. **Write the INNER JOIN query** between `customer` table and `payment` table to see `payment_id` and `first_name` and `last_name` names in `customer` table together.

    ```sql
    SELECT payment_id, first_name, last_name
    FROM customer
    INNER JOIN payment ON payment.customer_id = customer.customer_id;
    ```

3. **Write the INNER JOIN query** where we can see the `customer` table and the `rental_id` in the `rental` table and the `first_name` and `last_name` names in the customer table together.
    ```sql
    SELECT rental_id, first_name, last_name
    FROM customer
    INNER JOIN rental ON rental.customer_id = customer.customer_id;
    ```

## Sample Database

The queries are performed on the `dvdrental` sample database. This database is used for practice and learning purposes.

## Usage

To execute these queries, you can use a SQL-compatible database management system (DBMS) and connect to the `dvdrental` database. Copy and paste the queries into your DBMS interface to see the results.

## Credits

Sample database provided by [PostgreSQL Tutorial](https://www.postgresqltutorial.com/).
