-- Write your PostgreSQL query statement below
SELECT Products.product_name, SUM(Orders.unit) AS unit
FROM Products
JOIN Orders ON Products.product_id = Orders.product_id
WHERE EXTRACT(MONTH FROM Orders.order_date) = 2 
AND EXTRACT(YEAR FROM Orders.order_date) = 2020
GROUP BY Products.product_name
HAVING SUM(Orders.unit) >= 100;