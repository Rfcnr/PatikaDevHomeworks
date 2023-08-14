# [PatikaDev](https://academy.patika.dev/) SQL Course DVD Rental Sample Database Query Scenarios - Homework-2

This repository contains SQL queries for performing various scenarios on the `dvdrental` sample database.

## Query Scenarios

1. **Sort Data in `film` Table Based on Replacement Cost Range:** Sorts the data in all columns in the `film` table with replacement cost greater than 12.99 and less than 16.99 using the `BETWEEN` - `AND` structure.

    ```sql
    SELECT *
    FROM film
    WHERE replacement_cost BETWEEN 12.99 AND 16.98;
    -- (16.99 > replacement_cost >= 12.99)
    ```

2. **Sort Data in `actor` Table Based on First Name List:** Sorts the data in the `first_name` and `last_name` columns in the `actor` table provided that `first_name` is 'Penelope', 'Nick', or 'Ed' using the `IN` operator.

    ```sql
    SELECT first_name, last_name
    FROM actor
    WHERE first_name IN ('Penelope', 'Nick', 'Ed');
    ```

3. **Sort Data in `film` Table Based on Multiple Conditions:** Sorts the data in all columns in the `film` table with the conditions `rental_rate` 0.99, 2.99, 4.99 and `replacement_cost` 12.99, 15.99, 28.99 using the `IN` operator.

    ```sql
    SELECT *
    FROM film
    WHERE rental_rate IN (0.99, 2.99, 4.99) AND replacement_cost IN (12.99, 15.99, 28.99);
    ```

## Sample Database

The queries are performed on the `dvdrental` sample database. This database is used for practice and learning purposes.

## Usage

To execute these queries, you can use a SQL-compatible database management system (DBMS) and connect to the `dvdrental` database. Copy and paste the queries into your DBMS interface to see the results.

## Credits

Sample database provided by [PostgreSQL Tutorial](https://www.postgresqltutorial.com/).
