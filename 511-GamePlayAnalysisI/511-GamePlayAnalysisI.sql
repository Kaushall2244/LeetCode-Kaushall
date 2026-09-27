-- Last updated: 9/27/2026, 12:41:52 PM
# Write your MySQL query statement below
SELECT
    player_id,
    MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;