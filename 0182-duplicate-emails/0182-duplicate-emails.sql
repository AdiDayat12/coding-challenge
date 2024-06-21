# Write your MySQL query statement below
SELECT LOWER(email) AS Email
FROM Person
GROUP BY LOWER(email)
HAVING COUNT(*) > 1;
