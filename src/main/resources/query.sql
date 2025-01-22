select
	product_name
from
	netology.customers c
join netology.orders o
on
	o.customer_id = c.id
where
	name ilike :firstName;