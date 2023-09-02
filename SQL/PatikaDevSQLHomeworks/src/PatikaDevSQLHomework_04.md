# [PatikaDev](https://academy.patika.dev/) SQL Course DVD Rental Sample Database Query Scenarios - Homework-4

This repository contains SQL queries for performing various scenarios on the `dvdrental` sample database.

## Query Scenarios

1. **Sort the different values** in the `replacement_cost` column in the `film` table.

    ```sql
    SELECT
    DISTINCT replacement_cost
    FROM film;
    ```
2. **How many different data** are in the `replacement_cost` column in the `film` table?

    ```sql
    SELECT
    COUNT(DISTINCT replacement_cost)
    FROM film;
    ```
   
3. **How many of the film** titles in the `film` table **begin with the character 'T'** and also have a `rating` **equal to 'G'**?

    ```sql
    SELECT
    COUNT(*)
    FROM film
    WHERE title LIKE 'T%'
    AND rating = 'G';
    ```

4. **How many of the country names** in the `country` table have 5 characters?

    ```sql
    SELECT
    COUNT(*)
    FROM country
    WHERE LENGTH (country) = 5;
    ```

5. **How many of the city names** in the `city` table end with the character **'R' or r**?

    ```sql
    SELECT
    COUNT(*)
    FROM city
    WHERE city ILIKE '%R';
    ```

## Sample Database

The queries are performed on the `dvdrental` sample database. This database is used for practice and learning purposes.

## Usage

To execute these queries, you can use a SQL-compatible database management system (DBMS) and connect to the `dvdrental` database. Copy and paste the queries into your DBMS interface to see the results.

## Credits

Sample database provided by [PostgreSQL Tutorial](https://www.postgresqltutorial.com/).
