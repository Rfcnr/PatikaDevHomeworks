# [PatikaDev](https://academy.patika.dev/) SQL Course DVD Rental Sample Database Query Scenarios - Homework-12

This repository contains SQL queries for performing various scenarios on the `dvdrental` sample database.

## Query Scenarios

1. In the table `film`, the length of a film is shown in the column `length`.
**How many films** have a length greater than the average film length?
    ```sql
    SELECT COUNT(*)
    FROM film
    WHERE length > (SELECT AVG(length) FROM film);
    ```

2. **How many films** in the `film` table have the highest `rental_rate`?
    ```sql
    SELECT COUNT(*)
    FROM film
    WHERE rental_rate = (SELECT MAX(rental_rate) FROM film);
    ```

3. List the films with **the lowest** `rental_rate` and **the lowest** `replacement_cost` in the `film` table.
    ```sql
    SELECT film_id, title
    FROM film
    WHERE
    rental_rate = (SELECT MIN(rental_rate) FROM film)
    AND
    replacement_cost = (SELECT MIN(replacement_cost) FROM film)
    ORDER BY film_id ASC;
    ```

4. In the table `payment`, list the customers `(customer)` with the highest number of purchases.
    ```sql
    SELECT payment.customer_id, COUNT(payment_id) AS purchases_count
    FROM payment
    GROUP BY payment.customer_id
    ORDER BY purchases_count DESC;
    ```
    **Alternative Query**
    ```sql
    SELECT customer.*, COUNT(payment.payment_id) AS purchases_count
    FROM customer
    LEFT JOIN payment ON customer.customer_id = payment.customer_id
    GROUP BY customer.customer_id, customer.first_name, customer.last_name
    ORDER BY purchases_count DESC;
    ```

## Sample Database

The queries are performed on the `dvdrental` sample database. This database is used for practice and learning purposes.

## Usage

To execute these queries, you can use a SQL-compatible database management system (DBMS) and connect to the `dvdrental` database. Copy and paste the queries into your DBMS interface to see the results.

## Credits

Sample database provided by [PostgreSQL Tutorial](https://www.postgresqltutorial.com/).