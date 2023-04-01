create table receipt
(
    id bigint auto_increment,
    code varchar(30) null comment '业务单号',
    amount decimal(15,2) null comment '金额',
    start_time datetime null comment '开始时间',
    end_time datetime null comment '结束时间',
    term int null comment '存款期限（月份）',
    user_name varchar(30) null comment '用户姓名',
    constraint receipt_pk
        primary key (id)
);