# [PatikaDev](https://academy.patika.dev/) SQL Course DVD Rental Sample Database Query Scenarios

This repository contains SQL queries for performing various scenarios on the `dvdrental` sample database.

## Query Scenarios

1. **Sort Data in `film` Table:** Sorts the data in the `title` and `description` columns in the `film` table.

    ```sql
    SELECT title, description
    FROM film
    ORDER BY title, description;
    ```

2. **Sort Data with Conditions in `film` Table:** Sorts the data in all columns in the `film` table with the conditions that movie length is greater than 60 and less than 75.

    ```sql
    SELECT *
    FROM film
    WHERE length > 60 AND length < 75
    ORDER BY title;
    ```

3. **Sort Data with Multiple Conditions in `film` Table:** Sorts the data in all columns in the `film` table with `rental_rate` 0.99 and `replacement_cost` 12.99 or 28.99.

    ```sql
    SELECT *
    FROM film
    WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost = 28.99)
    ORDER BY title;
    ```

4. **Retrieve `last_name` Based on `first_name` in `customer` Table:** Retrieves the value in the `last_name` column for a customer whose value in the `first_name` column is 'Mary'.

    ```sql
    SELECT first_name, last_name
    FROM customer
    WHERE first_name = 'Mary';
    ```

5. **Sort Data with NOT Conditions in `film` Table:** Sorts the data in the `film` table whose length is NOT greater than 50 and whose `rental_rate` is NOT 2.99 or 4.99.

    ```sql
    SELECT *
    FROM film
    WHERE NOT length > 50 AND NOT rental_rate = 2.99 AND NOT rental_rate = 4.99
    ORDER BY title;
    ```

## Sample Database

The queries are performed on the `dvdrental` sample database. This database is used for practice and learning purposes.

## Usage

To execute these queries, you can use a SQL-compatible database management system (DBMS) and connect to the `dvdrental` database. Copy and paste the queries into your DBMS interface to see the results.

## Credits

Sample database provided by [PostgreSQL Tutorial](https://www.postgresqltutorial.com/).