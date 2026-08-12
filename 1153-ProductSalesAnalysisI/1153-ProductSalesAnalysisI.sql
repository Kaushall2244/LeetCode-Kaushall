-- Last updated: 8/12/2026, 12:08:09 PM
# Write your MySQL query statement below
SELECT
    p.product_name,
    s.year,
    s.price
FROM Sales s
JOIN Product p
ON s.product_id = p.product_id;