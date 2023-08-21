# [PatikaDev](https://academy.patika.dev/) SQL Course DVD Rental Sample Database Query Scenarios - Homework-7

This repository contains SQL queries for performing various scenarios on the `dvdrental` sample database.

## Query Scenarios

1. **Group the movies** in the `film` table according to their `rating` values.

    ```sql
    SELECT rating, COUNT(*)
    FROM film
    GROUP BY rating;
    ```

2. When we group the movies in the `film` table according to the `replacement_cost` column, list the `replacement_cost` value and the corresponding **number of movies with more than 50 movies.**

    ```sql
    SELECT replacement_cost, COUNT(*)
    FROM film
    GROUP BY replacement_cost
    HAVING COUNT(*) > 50
    ORDER BY COUNT(*);
    ```

3. **What are the number of customers** corresponding to the `store_id` values in the `customer` table?

    ```sql
    SELECT store_id, COUNT(*)
    FROM customer
    GROUP BY store_id
    ORDER BY store_id;
    ```

4. After grouping the city data in the `city` table according to the `country_id` column, share the `country_id` information and the number of cities with the most cities.

    ```sql
    SELECT country_id, COUNT(*)
    FROM city
    GROUP BY country_id
    ORDER BY COUNT(*) DESC
    LIMIT 1;
    ```
## Sample Database

The queries are performed on the `dvdrental` sample database. This database is used for practice and learning purposes.

## Usage

To execute these queries, you can use a SQL-compatible database management system (DBMS) and connect to the `dvdrental` database. Copy and paste the queries into your DBMS interface to see the results.

## Credits

Sample database provided by [PostgreSQL Tutorial](https://www.postgresqltutorial.com/).
