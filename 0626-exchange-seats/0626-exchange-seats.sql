/* Write your T-SQL query statement below */
SELECT id,
    CASE 
        WHEN id % 2 = 1 AND id + 1 <= (SELECT MAX(id) FROM Seat) THEN
            (SELECT student FROM Seat WHERE id = s.id + 1)
        WHEN id % 2 = 0 THEN
            (SELECT student FROM Seat WHERE id = s.id - 1)
        ELSE 
            s.student
    END AS student
FROM Seat as s
ORDER BY id;