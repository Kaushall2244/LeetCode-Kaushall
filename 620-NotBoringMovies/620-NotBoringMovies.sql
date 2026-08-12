-- Last updated: 8/12/2026, 12:10:27 PM
# Write your MySQL query statement below
SELECT *
FROM Cinema
WHERE id % 2 = 1
    AND description <> 'boring'
ORDER BY rating DESC;