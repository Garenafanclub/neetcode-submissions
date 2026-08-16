-- Write your query below
Select c.name from customers c
Left join orders o
ON c.id = o.customer_id
where o.customer_id IS NULL;