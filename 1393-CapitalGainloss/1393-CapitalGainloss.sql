-- Last updated: 9/27/2026, 12:41:11 PM
SELECT stock_name, 
       SUM(CASE WHEN operation = 'Sell' THEN price ELSE -price END) AS capital_gain_loss
FROM Stocks
GROUP BY stock_name;