USE pubs;

-- 4.1
SELECT * FROM publishers;

-- 4.2

SELECT AU_FNAME AS 'FIRST NAME', AU_LNAME AS 'LAST NAME' FROM authors
ORDER BY AU_LNAME;

-- 4.3.1

SELECT AU_FNAME AS 'FIRST NAME', AU_LNAME AS 'LAST NAME' FROM authors
WHERE state = 'CA'
ORDER BY AU_LNAME;

-- 4.3.2
SELECT STOR_NAME AS 'STORE NAME'
FROM stores AS s
         INNER JOIN discounts AS d ON s.STOR_ID = d.STOR_ID
WHERE d.discount = 5;

-- 4.3.3
SELECT title AS 'Title', YTD_SALE
FROM titles
WHERE YTD_SALE > 3000;

-- 4.4.1
SELECT AU_FNAME AS 'First name', AU_LNAME AS 'Last Name', AU_ID AS 'Author id'
FROM authors
WHERE AU_FNAME = 'Ann'
   OR AU_FNAME = 'Anne';

-- 4.4.2
SELECT title, type, advance
FROM titles
WHERE (type = 'Business'
    OR type = 'psychology'
    )
  AND advance < 5500;

-- 4.5.1
SELECT AU_LNAME AS 'Last name', city AS 'City', state AS 'State', phone AS 'Telephone number'
FROM authors
WHERE phone LIKE '415%';

-- 4.5.2
SELECT AU_ID FROM authors
WHERE address LIKE '%Broadway%'
  AND city = 'San Francisco';

-- 4.5.3
SELECT SUM(qty)
FROM sales
where ORD_DATE NOT LIKE '%1994%';

-- 4.5.4
SELECT AU_FNAME AS 'First name', AU_LNAME AS 'Last name'
FROM authors
WHERE state NOT IN ('CA', 'FL');

-- 4.6.1
SELECT PUB_ID AS 'publisher', type AS 'category', COUNT(TITLE_ID) AS 'amount'
FROM titles
GROUP BY PUB_ID, type
ORDER BY PUB_ID;

-- 4.6.4
SELECT PUB_ID AS 'publisher', sum(advance) AS 'Total advance', avg(price) AS 'Average price'
FROM titles
WHERE price > 5
  AND PUB_ID > '0800'
GROUP BY PUB_ID
HAVING SUM(advance) > 15000
   AND AVG(price) < 20
ORDER BY PUB_ID;

-- 6.1.2
SELECT AU_FNAME, AU_LNAME, city
FROM authors
WHERE city in (
    SELECT city
    FROM publishers
    WHERE PUB_NAME = 'Algodata Infosystems'
);

-- 6.1.3
SELECT title AS 'title', price AS 'price'
FROM titles
WHERE price * 1.25  >= (
    SELECT AVG(price)
    FROM titles
);

-- 6.2.1
SELECT AU_FNAME AS 'First name', AU_LNAME AS 'Last name', city
from authors as a1
where exists(
              SELECT AU_FNAME
              FROM authors AS a2
              WHERE a1.city = a2.city
                AND a1.AU_ID <> a2.AU_ID
          )
ORDER BY city;

-- 7.1.1
INSERT INTO publishers VALUE ('9911', 'New York City', null, 'Time Warner International', 'NY');

-- 7.1.4
DROP TABLE IF EXISTS publ_authors;

CREATE TABLE publ_authors
(NAME VARCHAR(60));

INSERT INTO publ_authors (NAME)
SELECT AU_LNAME
FROM authors;

-- 7.2.2
DELETE
FROM roysched
WHERE TITLE_ID = (
    SELECT TITLE_ID
    FROM titles
    WHERE title = 'Life Without Fear');

-- 7.3.3
UPDATE authors
SET address = '411 Highlands Ave.',
    phone = '436 908-8982'
WHERE AU_FNAME = 'Sylvia'
  AND AU_LNAME = 'Panteley';