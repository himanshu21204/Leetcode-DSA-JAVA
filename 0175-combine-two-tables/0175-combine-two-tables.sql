/* Write your T-SQL query statement below */
SELECT P.firstName,P.lastName,A.city,A.state FROM PERSON P
LEFT OUTER JOIN [ADDRESS] A
ON A.personId=P.personId;