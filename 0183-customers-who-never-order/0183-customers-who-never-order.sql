# Write your MySQL query statement below
select name as 'customers'
from customers
left join orders on
customers.id = orders.customerid
where orders.customerId is Null;
