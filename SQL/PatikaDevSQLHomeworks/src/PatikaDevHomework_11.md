# [PatikaDev](https://academy.patika.dev/) SQL Course DVD Rental Sample Database Query Scenarios - Homework-11

This repository contains SQL queries for performing various scenarios on the `dvdrental` sample database.

## Query Scenarios

1. **Sort all data** for `first_name` columns in `actor` and `customer` tables.
    ```sql
    (SELECT first_name
    FROM actor)
    UNION ALL
    (SELECT first_name
    FROM customer);
    ```

2. **Sort the intersecting data** for `first_name` columns in `actor` and `customer` tables.
    ```sql
    (SELECT first_name
    FROM actor)
    INTERSECT
    (SELECT first_name
    FROM customer);
    ```

3. For the columns `first_name` in the tables `actor` and `customer`, sort the data **that are in the first table but not in the second table.**
    ```sql
    (SELECT first_name
    FROM actor)
    EXCEPT
    (SELECT first_name
    FROM customer);
    ```

## Sample Database

The queries are performed on the `dvdrental` sample database. This database is used for practice and learning purposes.

## Usage

To execute these queries, you can use a SQL-compatible database management system (DBMS) and connect to the `dvdrental` database. Copy and paste the queries into your DBMS interface to see the results.

## Credits

Sample database provided by [PostgreSQL Tutorial](https://www.postgresqltutorial.com/).