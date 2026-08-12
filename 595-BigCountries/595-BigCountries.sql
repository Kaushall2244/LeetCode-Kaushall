-- Last updated: 8/12/2026, 12:16:02 PM
# Write your MySQL query statement below
SELECT name, population, area
FROM World
WHERE area >= 3000000
   OR population >= 25000000;