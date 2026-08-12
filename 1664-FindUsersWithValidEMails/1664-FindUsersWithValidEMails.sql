-- Last updated: 8/12/2026, 12:06:30 PM
SELECT *
FROM Users
WHERE REGEXP_LIKE(
    mail,
    '^[A-Za-z][A-Za-z0-9_.-]*@leetcode\\.com$',
    'c'
);