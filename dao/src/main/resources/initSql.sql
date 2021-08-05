use seckill;

insert into t_role(role) values ('管理员');
insert into t_role(role) values ('顾客');

insert into t_user (user_name, password, phone, email, role_id, create_time) values ('admin','123456','15211111111','610101237@qq.com',1,now());
insert into t_user (user_name, password, phone, email, role_id, create_time) values ('tom','123456','15222222222','952885824@qq.com',1,now());

insert into t_item (name, code, stock, is_active, create_time) values ('泽东思想和中国特色社会主义理论体系概论第一版', 'book0001', 1000,1, '2021-05-18 21:11:23');
insert into t_item (name, code, stock, is_active, create_time) values ('高等数学第二版', 'book0002', 500,1, '2021-05-18 21:11:23');
insert into t_item (name, code, stock, is_active, create_time) values ('物理流体学第三版', 'book0003', 600,1, '2021-05-18 21:11:23');

insert into t_kill_item (item_id, total, start_time, end_time, is_avtive) VALUES (1,300,'2021-06-18 21:11:23','2021-07-18 21:11:23',1);
insert into t_kill_item (item_id, total, start_time, end_time, is_avtive) VALUES (2,200,'2021-08-01 21:11:23','2021-09-01 21:11:23',1);
insert into t_kill_item (item_id, total, start_time, end_time, is_avtive) VALUES (3,200,'2021-08-01 21:11:23','2021-09-01 21:11:23',1);
