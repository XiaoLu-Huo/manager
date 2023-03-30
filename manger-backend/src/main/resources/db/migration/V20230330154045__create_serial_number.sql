create table serial_number
(
    id bigint auto_increment,
    type varchar(30) not null comment '业务类型',
    month int not null comment '月份',
    year int(30) not null comment '年份',
    serial_no varchar(30) null comment '业务单号',
    constraint user_info_pk
        primary key (id)
);