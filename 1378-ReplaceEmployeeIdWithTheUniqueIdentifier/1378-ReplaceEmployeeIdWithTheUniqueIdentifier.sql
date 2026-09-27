-- Last updated: 9/27/2026, 12:41:14 PM
SELECT 
    EmployeeUNI.unique_id, 
    Employees.name
FROM 
    Employees
LEFT JOIN 
    EmployeeUNI ON Employees.id = EmployeeUNI.id;