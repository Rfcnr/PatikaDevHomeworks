# [PatikaDev](https://academy.patika.dev/) SQL Course `test` Sample Database Query Scenarios - Homework-8

This repository contains SQL queries for performing various scenarios on the `test` sample database.

## Query Scenarios

1. In your `test` database, **create a table named `employee`** with columns id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100).
      ```sql
      CREATE TABLE employee (
      id SERIAL PRIMARY KEY,
      name VARCHAR(50),
      birthday DATE,
      email VARCHAR(100)
      );
      ```
2. Let's add 50 data to the `employee` table **we created using the `Mockaroo` service.**
    ```sql
    INSERT INTO employee (name, birthday, email)
    VALUES
    ('Kelcey Leavesley', '1997-07-18', 'kleavesley0@guardian.co.uk'),
    ('Hedwig Springford', '1989-10-26', 'hspringford1@stumbleupon.com'),
    ('Cyrus Rakestraw', '1968-03-03', 'crakestraw2@deviantart.com'),
    ('Brewster Dawtrey', '1973-05-27', 'bdawtrey3@gnu.org'),
    ('Anett McOrkil', '1983-11-12', 'amcorkil4@stanford.edu'),
    ('Collin Bidgod', '1931-03-25', 'cbidgod5@unc.edu'),
    ('Jemie Grimble', null, 'jgrimble6@creativecommons.org'),
    ('Shara Sinclaire', '1934-11-18', 'ssinclaire7@yahoo.co.jp'),
    ('Nicky Akred', null, 'nakred8@scientificamerican.com'),
    ('Alikee Feare', '1946-07-04', 'afeare9@zdnet.com'),
    ('Archaimbaud Trevena', null, 'atrevenaa@liveinternet.ru'),
    ('Maureen Gurg', '1931-03-19', null),
    ('Elroy Schlag', '1966-07-30', 'eschlagc@t.co'),
    ('Ned Tenwick', '1951-09-30', 'ntenwickd@imageshack.us'),
    ('Salome Slyne', '1952-01-31', 'sslynee@mac.com'),
    ('Lesly Paulisch', null, null),
    ('Mikkel Crump', '1962-12-20', 'mcrumpg@techcrunch.com'),
    ('Wilmar O''Spillane', '1988-04-09', 'wospillaneh@guardian.co.uk'),
    ('Eveleen Etuck', null, null),
    ('Colene Simonitto', '1989-08-23', 'csimonittoj@google.com.br'),
    ('Kalvin Collman', '1963-12-04', 'kcollmank@cdc.gov'),
    ('Debora Rudeforth', '2000-06-06', 'drudeforthl@pen.io'),
    ('Emmy Fortoun', null, 'efortounm@surveymonkey.com'),
    ('Elinore Canet', null, 'ecanetn@yandex.ru'),
    ('Hubey Peddie', '1941-11-29', null),
    ('Joy Station', '1952-08-20', 'jstationp@arstechnica.com'),
    ('Imelda Harriman', null, 'iharrimanq@umich.edu'),
    ('Way Hartas', '1998-10-14', null),
    ('Rhona Wye', '1984-07-09', 'rwyes@engadget.com'),
    ('Shelagh Rigney', '1945-12-19', 'srigneyt@go.com'),
    ('Ashley McIlvaney', '1933-03-15', null),
    ('Osbourne Stuckford', '1950-07-30', 'ostuckfordv@unicef.org'),
    ('Lindie Aizikovitz', '1939-05-08', 'laizikovitzw@slideshare.net'),
    ('Alberta Whimper', '1968-09-05', 'awhimperx@google.co.uk'),
    ('Winny Luigi', '1934-11-24', 'wluigiy@webeden.co.uk'),
    ('Sharona Lambal', '1947-01-05', 'slambalz@timesonline.co.uk'),
    ('Annnora Reinert', '1965-10-22', 'areinert10@google.com.hk'),
    ('Reynolds Wix', '1997-01-02', 'rwix11@paginegialle.it'),
    ('Stace Slad', '1960-11-29', null),
    ('Krissy Symes', '1932-02-10', 'ksymes13@oracle.com'),
    ('Rozalie Pierro', '1925-09-23', 'rpierro14@lycos.com'),
    ('Stanly Brookz', '2001-07-17', 'sbrookz15@studiopress.com'),
    ('Cherri Banaszkiewicz', null, 'cbanaszkiewicz16@simplemachines.org'),
    ('Cirstoforo Collinson', '1944-07-29', 'ccollinson17@spiegel.de'),
    ('Neely Vernham', '1955-09-06', 'nvernham18@dmoz.org'),
    ('Von Riggulsford', '1964-06-07', 'vriggulsford19@ted.com'),
    ('Onfroi Beiderbeck', null, 'obeiderbeck1a@unesco.org'),
    ('Dunc Lindeberg', '1962-08-17', 'dlindeberg1b@cbslocal.com'),
    ('Saunderson Gravie', '1979-04-09', 'sgravie1c@cmu.edu'),
    ('Arlina Healey', '1985-08-04', 'ahealey1d@google.fr');
    ```

3. Let's do **5 UPDATE operations** that will update other columns according to each of the columns.
   * Update other columns based on the `id` column:
      ```sql
      UPDATE employee
      SET name = 'Jane Doe', birthday = '1990-11-02', email = 'jane@doe.com'
      WHERE id = 26;
      ```
   * Update other columns based on the `id` column:
      ```sql
      UPDATE employee
      SET name = 'John Doe', birthday = '1990-01-01', email = 'john@doe.com'
      WHERE id = 34;
      ```
   * Update other columns based on the `name` column:
      ```sql
      UPDATE employee
      SET name = 'Duncan Lindeberger', birthday = '1985-03-22', email = 'dunc@lindeberger.com'
      WHERE name = 'Dunc Lindeberg';
      ```
   * Update other columns based on the `name` column:
      ```sql
      UPDATE employee
      SET name = 'Brew Dawt', birthday = '1973-06-26', email = 'bdawtrey3@gnu.org'
      WHERE name = 'Brewster Dawtrey';
      ```
   * Update other columns based on the `email` column:
      ```sql
      UPDATE employee
      SET name = 'Collin Bid', email = 'cbid@unc.com'
      WHERE email = 'cbidgod5@unc.edu';
      ```

4. Let's do **5 DELETE operations** that will delete the corresponding row according to each of the columns.
      ```sql
      DELETE FROM employee
      WHERE id = 7;
      ```
      ```sql
      DELETE FROM employee
      WHERE id = 13;
      ```
      ```sql
      DELETE FROM employee
      WHERE name = 'Shelagh Rigney';
      ```
      ```sql
      DELETE FROM employee
      WHERE email = 'wluigiy@webeden.co.uk';
      ```
      ```sql
      DELETE FROM employee
      WHERE birthday = '1925-09-23';
      ```
## Credits
The sample database data was created with [mockaroo.com](https://www.mockaroo.com/).