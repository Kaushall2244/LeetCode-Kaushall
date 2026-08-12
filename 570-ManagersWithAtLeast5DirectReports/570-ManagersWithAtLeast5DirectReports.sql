-- Last updated: 8/12/2026, 12:16:35 PM
# Write your MySQL query statement below
SELECT e.name
FROM Employee e
JOIN Employee m
ON e.id = m.managerId
GROUP BY e.id, e.name
HAVING COUNT(*) >= 5;