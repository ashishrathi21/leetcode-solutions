# Write your MySQL query statement below
select d.name as 'Department', e.name as 'Employee', e.salary as 'Salary'
from employee as e 
join department as d
on d.id = e.departmentId
JOIN (
    SELECT
        departmentId,
        MAX(salary) AS max_salary
    FROM Employee
    GROUP BY departmentId
) AS temp
    ON e.departmentId = temp.departmentId
    AND e.salary = temp.max_salary;

