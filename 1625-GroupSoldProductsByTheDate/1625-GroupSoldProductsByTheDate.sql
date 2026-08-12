-- Last updated: 8/12/2026, 12:06:38 PM
# Write your MySQL query statement below
select
    sell_date,
    count(distinct product) as num_sold,
    group_concat(distinct product order by product separator ',') as products
from activities
group by sell_date
order by sell_date;