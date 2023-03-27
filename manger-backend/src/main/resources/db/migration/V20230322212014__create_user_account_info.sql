create table user_info
(
    id bigint auto_increment,
    code varchar(30) null comment '用户编码',
    name varchar(30) null comment '姓名',
    phone_number varchar(30) null comment '电话号码',
    address varchar(100) null comment '住址',
    Id_card varchar(100) null comment '身份证号码',
    create_time datetime null comment '创建时间',
    create_by varchar(30) null comment '创建人',
    update_time datetime null comment '更新时间',
    update_by datetime null comment '更新人',
    delete_time datetime null comment '删除时间',
    deleted tinyint(1) default 0 null comment '逻辑删除，0表示未删除，1表示删除',
    constraint user_info_pk
        primary key (id)
);