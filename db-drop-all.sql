alter table cart drop foreign key fk_cart_customer_id;

alter table cart_entry drop foreign key fk_cart_entry_cart_id;
drop index ix_cart_entry_cart_id on cart_entry;

alter table order_entry drop foreign key fk_order_entry_product_id;
drop index ix_order_entry_product_id on order_entry;

alter table order_entry drop foreign key fk_order_entry_order_id;
drop index ix_order_entry_order_id on order_entry;

alter table orders drop foreign key fk_orders_customer_id;
drop index ix_orders_customer_id on orders;

alter table price drop foreign key fk_price_product_id;
drop index ix_price_product_id on price;

drop table if exists cart;

drop table if exists cart_entry;

drop table if exists customer;

drop table if exists order_entry;

drop table if exists orders;

drop table if exists price;

drop table if exists product;

