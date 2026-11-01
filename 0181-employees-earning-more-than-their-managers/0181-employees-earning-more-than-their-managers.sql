# Write your MySQL query statement below
select e.name as 'Employee'
from employee as e
join employee as m
   ON e.managerId = m.id
WHERE e.salary > m.salary;