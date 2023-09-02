# [PatikaDev](https://academy.patika.dev/) SQL Course DVD Rental Sample Database Query Scenarios - Homework-5

This repository contains SQL queries for performing various scenarios on the `dvdrental` sample database.

## Query Scenarios

1. **List the 5 longest (length)** films in the `film` table whose `title` ends with the character 'n'.

    ```sql
    SELECT title, length
    FROM film
    WHERE title LIKE '%n'
    ORDER BY length DESC
    LIMIT 5;
    ```
   
2. **List the second 5 shortest (length) movies (6,7,8,9,10)** in the `film` table whose `title` ends with the character 'n'.

    ```sql
    SELECT title, length
    FROM film
    WHERE title LIKE '%n'
    ORDER BY length ASC
    OFFSET 5
    LIMIT 5;
    ```
3. **Sort the first 4 data** in descending order according to the `last_name` column in the `customer` table, provided that `store_id = 1`.

    ```sql
    SELECT store_id, first_name, last_name
    FROM customer
    WHERE store_id = 1
    ORDER BY last_name DESC
    LIMIT 4;
    ```

## Sample Database

The queries are performed on the `dvdrental` sample database. This database is used for practice and learning purposes.

## Usage

To execute these queries, you can use a SQL-compatible database management system (DBMS) and connect to the `dvdrental` database. Copy and paste the queries into your DBMS interface to see the results.

## Credits

Sample database provided by [PostgreSQL Tutorial](https://www.postgresqltutorial.com/).
