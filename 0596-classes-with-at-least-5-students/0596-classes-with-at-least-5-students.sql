# Write your MySQL query statement below
SELECT DISTINCT class
FROM Courses
GROUP BY Class
HAVING COUNT(DISTINCT Student) >= 5;