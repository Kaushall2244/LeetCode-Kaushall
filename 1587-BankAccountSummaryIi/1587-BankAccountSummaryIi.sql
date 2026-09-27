-- Last updated: 9/27/2026, 12:40:55 PM
# Write your MySQL query statement below
SELECT 
    u.name, 
    SUM(t.amount) AS balance
FROM 
    Users u
JOIN 
    Transactions t 
ON 
    u.account = t.account
GROUP BY 
    u.account, u.name
HAVING 
    SUM(t.amount) > 10000;