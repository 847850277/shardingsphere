create schema if not exists shardingsphere_test collate utf8mb4_general_ci;

create table if not exists t_order_1
(
    id bigint not null,
    serial varchar(64) null,
    amount decimal(10,2) null,
    constraint t_order_1_id_uindex
        unique (id)
);

alter table t_order_1
    add primary key (id);

create table if not exists t_order_2
(
    id bigint not null,
    serial varchar(64) null,
    amount decimal(10,2) null,
    constraint t_order_2_id_uindex
        unique (id)
);

alter table t_order_2
    add primary key (id);

create table if not exists t_udict
(
    id bigint auto_increment
        primary key,
    ustatus varchar(200) null,
    uvalue varchar(200) null
);

create table if not exists t_user
(
    id bigint auto_increment
        primary key,
    user_name varchar(200) null,
    user_status varchar(200) null
);



create schema if not exists shardingsphere_test_1 collate utf8mb4_general_ci;

create table if not exists t_udict
(
    id bigint auto_increment
        primary key,
    ustatus varchar(200) null,
    uvalue varchar(200) null
);

