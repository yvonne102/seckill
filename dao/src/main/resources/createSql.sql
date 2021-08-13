use seckill;

drop table if exists t_role;
create table t_role(
    id int auto_increment ,
    role varchar(50) not null unique comment '角色',
    primary key (id)
)engine =innoDB default charset =utf8 comment ='角色权限表';

drop table if exists t_user;
create table t_user(
    id int auto_increment,
    user_name varchar(100) unique comment '用户名',
    password varchar(200) comment '密码',
    phone varchar(45) unique comment '手机号',
    email varchar(100) unique comment '邮箱地址',
    role_id int comment '角色',
    create_time datetime comment '注册日期',
    primary key (id),
    foreign key (role_id) references t_role(id)
)engine =innoDB default charset =utf8 comment ='用户表';

drop table if exists t_item;
create table t_item(
    id int auto_increment,
    name varchar(200) not null unique comment '商品名',
    code varchar(200) not null unique comment '商品编号',
    stock int not null comment '库存',
    is_active tinyint(1) not null comment '是否有效',
    create_time datetime comment '创建时间',
    primary key (id)
) engine =innoDB default charset =utf8 comment ='商品表';

drop table if exists t_kill_item;
create table t_kill_item(
    id int auto_increment,
    item_id int comment '商品id',
    total int not null comment '秒杀总数',
    start_time datetime not null comment '开始时间',
    end_time datetime not null comment '结束时间',
    is_avtive tinyint(1) not null comment '是否有效',
    primary key (id),
    foreign key (item_id) references t_item(id)
)engine =innoDB default charset =utf8 comment ='待秒杀商品表';

drop table if exists t_kill_order;
create table t_kill_order(
    id int auto_increment,
    code varchar(100) not null unique ,
    kill_id int comment '秒杀id',
    item_id int comment '商品id',
    user_id int comment '用户id',
    status int comment '状态',
    create_time datetime comment '创建日期',
    primary key (id),
    foreign key (kill_id) references t_kill_item(id),
    foreign key (item_id) references t_item(id),
    foreign key (user_id) references t_user(id)
)engine =innoDB default charset =utf8 comment ='秒杀订单表';

drop table if exists t_random_code;
create table t_random_code(
    id int auto_increment,
    code varchar(200) not null unique comment '随机订单编号',
    primary key (id)
)engine =innoDB default charset =utf8 comment ='随机订单号表';