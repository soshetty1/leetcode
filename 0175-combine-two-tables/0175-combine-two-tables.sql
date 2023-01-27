# Write your MySQL query statement below
select Person.lastname,Person.firstname,Address.city,Address.state 
from Person left join Address
on Person.personId= Address.personId;