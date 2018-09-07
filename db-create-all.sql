create table cart (
  id                            bigint auto_increment not null,
  cart_no                       integer,
  customer_id                   bigint,
  total_price                   decimal(38),
  version                       bigint not null,
  created_time                  datetime(6) not null,
  modified_time                 datetime(6) not null,
  constraint uq_cart_customer_id unique (customer_id),
  constraint pk_cart primary key (id)
);

create table cart_entry (
  id                            bigint auto_increment not null,
  entry_price                   decimal(38),
  quantity                      integer,
  cart_id                       bigint,
  version                       bigint not null,
  created_time                  datetime(6) not null,
  modified_time                 datetime(6) not null,
  constraint pk_cart_entry primary key (id)
);

create table customer (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  version                       bigint not null,
  created_time                  datetime(6) not null,
  modified_time                 datetime(6) not null,
  constraint pk_customer primary key (id)
);

create table order_entry (
  id                            bigint auto_increment not null,
  entry_price                   decimal(38),
  quantity                      integer,
  product_id                    bigint,
  order_id                      bigint,
  version                       bigint not null,
  created_time                  datetime(6) not null,
  modified_time                 datetime(6) not null,
  constraint pk_order_entry primary key (id)
);

create table orders (
  id                            bigint auto_increment not null,
  order_no                      integer,
  total_price                   decimal(38),
  customer_id                   bigint,
  version                       bigint not null,
  created_time                  datetime(6) not null,
  modified_time                 datetime(6) not null,
  constraint pk_orders primary key (id)
);

create table price (
  id                            bigint auto_increment not null,
  product_id                    bigint,
  price                         decimal(38),
  version                       bigint not null,
  created_time                  datetime(6) not null,
  modified_time                 datetime(6) not null,
  constraint pk_price primary key (id)
);

create table product (
  id                            bigint auto_increment not null,
  version                       bigint not null,
  created_time                  datetime(6) not null,
  modified_time                 datetime(6) not null,
  constraint pk_product primary key (id)
);

alter table cart add constraint fk_cart_customer_id foreign key (customer_id) references customer (id) on delete restrict on update restrict;

alter table cart_entry add constraint fk_cart_entry_cart_id foreign key (cart_id) references cart (id) on delete restrict on update restrict;
create index ix_cart_entry_cart_id on cart_entry (cart_id);

alter table order_entry add constraint fk_order_entry_product_id foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_order_entry_product_id on order_entry (product_id);

alter table order_entry add constraint fk_order_entry_order_id foreign key (order_id) references orders (id) on delete restrict on update restrict;
create index ix_order_entry_order_id on order_entry (order_id);

alter table orders add constraint fk_orders_customer_id foreign key (customer_id) references customer (id) on delete restrict on update restrict;
create index ix_orders_customer_id on orders (customer_id);

alter table price add constraint fk_price_product_id foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_price_product_id on price (product_id);

