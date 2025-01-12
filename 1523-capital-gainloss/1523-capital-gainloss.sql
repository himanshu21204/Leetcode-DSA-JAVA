SELECT stock_name , SUM(
CASE
WHEN operation = 'Buy' then -price
ELSE price
END) AS capital_gain_loss
FROM Stocks
GROUP BY stock_name