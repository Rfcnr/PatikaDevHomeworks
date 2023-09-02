# [PatikaDev](https://academy.patika.dev/) SQL Course DVD Rental Sample Database Query Scenarios - Homework-3

This repository contains SQL queries for performing various scenarios on the `dvdrental` sample database.

## Query Scenarios

1. **Sort Country Names Starting with 'A' and Ending with 'a':** Sorts the country names in the `country` column of the `country` table starting with the character 'A' and ending with the character 'a'.

    ```sql
    SELECT country
    FROM country
    WHERE country LIKE 'A%a';
    ```

2. **List Country Names with at Least 6 Characters and Ending with 'n':** Lists the country names in the `country` column of the `country` table that have at least 6 characters and end with the character 'n'.

    ```sql
    SELECT country
    FROM country
    WHERE (LENGTH(country) >= 6) AND (country LIKE '%n');
    ```

3. **List Film Titles Containing 'T':** List all film titles in the `title` column of the `film` table that contain at least 4 uppercase or lowercase 'T' characters.

    ```sql
    SELECT title
    FROM film
    WHERE title
    ILIKE '%T%T%T%T';
    ```

4. **Sort Data in `film` Table Based on Conditions:** Sorts the data in all columns in the `film` table that start with the character 'C' in the `title`, have a `length` greater than 90, and a `rental_rate` of 2.99.

    ```sql
    SELECT *
    FROM film
    WHERE title LIKE 'C%'
    AND length > 90
    AND rental_rate = 2.99
    ORDER BY length;
    ```

## Sample Database

The queries are performed on the `dvdrental` sample database. This database is used for practice and learning purposes.

## Usage

To execute these queries, you can use a SQL-compatible database management system (DBMS) and connect to the `dvdrental` database. Copy and paste the queries into your DBMS interface to see the results.

## Credits

Sample database provided by [PostgreSQL Tutorial](https://www.postgresqltutorial.com/).
