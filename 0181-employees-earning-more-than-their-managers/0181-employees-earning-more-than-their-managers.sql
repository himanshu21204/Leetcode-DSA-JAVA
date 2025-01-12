SELECT [name] AS Employee FROM Employee e1
where salary > (select salary from Employee where id=e1.managerId)

-- SELECT name AS Employee
-- FROM Employee e1
-- WHERE managerId IS NOT NULL
-- AND managerId IN (SELECT id FROM Employee)
-- and salary > (select salary from employee e2 where e1.managerId = e2.id);