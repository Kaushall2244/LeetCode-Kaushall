-- Last updated: 8/12/2026, 12:10:33 PM
# Write your MySQL query statement below
select max(num) as num
from (
    select num
    from MyNumbers
    group by num
    having count(*) = 1
) as single_numbers;