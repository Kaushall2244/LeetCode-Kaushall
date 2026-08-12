-- Last updated: 8/12/2026, 12:10:14 PM
# Write your MySQL query statement below
UPDATE Salary
SET sex =
CASE
    WHEN sex = 'm' THEN 'f'
    ELSE 'm'
END;