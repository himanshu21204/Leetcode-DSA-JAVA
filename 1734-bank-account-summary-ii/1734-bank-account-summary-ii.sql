SELECT 
    U.name,
    SUM(T.amount) AS balance
FROM 
    Users U
INNER JOIN 
    Transactions T
ON 
    T.account = U.account
GROUP BY
    U.account, U.name
HAVING
    balance > 10000;
