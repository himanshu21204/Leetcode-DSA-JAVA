SELECT DISTINCT num AS ConsecutiveNums FROM (
    SELECT id,num,LAG(num) OVER(ORDER BY id) AS before,LEAD(num) OVER(ORDER BY id) AS after FROM Logs
) AS Sub_Query
WHERE num=after AND after=before;