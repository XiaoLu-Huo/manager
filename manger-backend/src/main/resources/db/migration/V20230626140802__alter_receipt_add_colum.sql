alter table receipt
    add id_card varchar(100) null comment '身份证号';

alter table receipt
    add create_by varchar(30) null comment '创建人';

alter table receipt
    add create_time datetime null comment '创建时间';

alter table receipt
    add update_by varchar(30) null comment '更新人';

alter table receipt
    add update_time datetime null comment '更新时间';

alter table receipt
    add delete_time datetime null comment '删除时间';

alter table receipt
    add deleted tinyint(1) default 0 null comment '逻辑删除，0表示未删除，1表示删除';