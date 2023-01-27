# Write your MySQL query statement below
select lastname,firstname,city,state 
from Person left join Address
on Person.personId= Address.personId;