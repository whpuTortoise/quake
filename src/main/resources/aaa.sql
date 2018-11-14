prompt PL/SQL Developer import file
prompt Created on 2018年6月26日 by pp
set feedback off
set define off
prompt Creating SYS_AUTHORITY...
create table SYS_AUTHORITY
(
  id        INTEGER not null,
  role_code VARCHAR2(20) not null,
  menu_code VARCHAR2(20) not null
)
tablespace DB_DATA
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SYS_AUTHORITY
  add constraint PK_SYS_AUTHORITY primary key (ID)
  using index 
  tablespace DB_DATA
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating SYS_DEPARTMENT...
create table SYS_DEPARTMENT
(
  id               INTEGER not null,
  department_name  VARCHAR2(100) not null,
  department_code  VARCHAR2(20) not null,
  department_level INTEGER not null,
  department_pid   INTEGER not null,
  create_id        VARCHAR2(20),
  create_time      TIMESTAMP(6),
  update_id        VARCHAR2(20),
  update_time      TIMESTAMP(6),
  is_deleted       INTEGER not null
)
tablespace DB_DATA
  pctfree 10
  initrans 1
  maxtrans 255;
alter table SYS_DEPARTMENT
  add constraint PK_SYS_DEPARTMENT primary key (ID)
  using index 
  tablespace DB_DATA
  pctfree 10
  initrans 2
  maxtrans 255;
alter table SYS_DEPARTMENT
  add constraint UQ_DEPARTMENT_CODE unique (DEPARTMENT_CODE)
  using index 
  tablespace DB_DATA
  pctfree 10
  initrans 2
  maxtrans 255;

prompt Creating SYS_MENU...
create table SYS_MENU
(
  id          INTEGER not null,
  menu_name   VARCHAR2(40) not null,
  menu_code   VARCHAR2(20) not null,
  menu_icon   VARCHAR2(20),
  target_url  VARCHAR2(100),
  menu_level  INTEGER default 1 not null,
  menu_pid    INTEGER default 0 not null,
  create_id   VARCHAR2(20),
  create_time TIMESTAMP(6),
  update_id   VARCHAR2(20),
  update_time TIMESTAMP(6),
  is_deleted  INTEGER default 0 not null
)
tablespace DB_DATA
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 8K
    minextents 1
    maxextents unlimited
  );
alter table SYS_MENU
  add constraint PK_SYS_MENU primary key (ID)
  using index 
  tablespace DB_DATA
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SYS_MENU
  add constraint UQ_MENU_MENUCODE unique (MENU_CODE)
  using index 
  tablespace DB_DATA
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating SYS_ROLE...
create table SYS_ROLE
(
  id          INTEGER not null,
  role_name   VARCHAR2(100) not null,
  role_code   VARCHAR2(20) not null,
  description VARCHAR2(100),
  create_id   VARCHAR2(20),
  create_time TIMESTAMP(6),
  update_id   VARCHAR2(20),
  update_time TIMESTAMP(6),
  is_deleted  INTEGER not null
)
tablespace DB_DATA
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SYS_ROLE
  add constraint PK_SYS_ROLE primary key (ID)
  using index 
  tablespace DB_DATA
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SYS_ROLE
  add constraint UQ_ROLE_CODE unique (ROLE_CODE)
  using index 
  tablespace DB_DATA
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating SYS_USER...
create table SYS_USER
(
  id          INTEGER not null,
  username    VARCHAR2(20) not null,
  password    VARCHAR2(32) not null,
  real_name   VARCHAR2(100) not null,
  age         VARCHAR2(10),
  tel         VARCHAR2(15),
  update_id   VARCHAR2(20),
  update_time TIMESTAMP(6),
  create_id   VARCHAR2(20),
  create_time TIMESTAMP(6),
  is_deleted  INTEGER not null
)
tablespace DB_DATA
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SYS_USER
  add constraint PK_SYS_USER primary key (ID)
  using index 
  tablespace DB_DATA
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SYS_USER
  add constraint UQ_USER_USERNAME unique (USERNAME)
  using index 
  tablespace DB_DATA
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Disabling triggers for SYS_AUTHORITY...
alter table SYS_AUTHORITY disable all triggers;
prompt Disabling triggers for SYS_DEPARTMENT...
alter table SYS_DEPARTMENT disable all triggers;
prompt Disabling triggers for SYS_MENU...
alter table SYS_MENU disable all triggers;
prompt Disabling triggers for SYS_ROLE...
alter table SYS_ROLE disable all triggers;
prompt Disabling triggers for SYS_USER...
alter table SYS_USER disable all triggers;
prompt Deleting SYS_USER...
delete from SYS_USER;
commit;
prompt Deleting SYS_ROLE...
delete from SYS_ROLE;
commit;
prompt Deleting SYS_MENU...
delete from SYS_MENU;
commit;
prompt Deleting SYS_DEPARTMENT...
delete from SYS_DEPARTMENT;
commit;
prompt Deleting SYS_AUTHORITY...
delete from SYS_AUTHORITY;
commit;
prompt Loading SYS_AUTHORITY...
insert into SYS_AUTHORITY (id, role_code, menu_code)
values (1, '1', '1');
commit;
prompt 1 records loaded
prompt Loading SYS_DEPARTMENT...
prompt Table is empty
prompt Loading SYS_MENU...
insert into SYS_MENU (id, menu_name, menu_code, menu_icon, target_url, menu_level, menu_pid, create_id, create_time, update_id, update_time, is_deleted)
values (1, '系统管理', 'manager', 'fa fa-columns', null, 1, 0, null, null, null, null, 0);
insert into SYS_MENU (id, menu_name, menu_code, menu_icon, target_url, menu_level, menu_pid, create_id, create_time, update_id, update_time, is_deleted)
values (24, '角色管理', 'rolemanager', 'fa fa-columns', 'role/manager', 2, 1, null, null, null, null, 0);
insert into SYS_MENU (id, menu_name, menu_code, menu_icon, target_url, menu_level, menu_pid, create_id, create_time, update_id, update_time, is_deleted)
values (2, '用户管理', 'usermanager', 'fa fa-columns', 'user/manager', 2, 1, null, null, null, null, 0);
insert into SYS_MENU (id, menu_name, menu_code, menu_icon, target_url, menu_level, menu_pid, create_id, create_time, update_id, update_time, is_deleted)
values (3, '菜单管理', 'menumanager', 'fa fa-columns', 'menu/manager', 2, 1, null, null, null, null, 0);
commit;
prompt 4 records loaded
prompt Loading SYS_ROLE...
insert into SYS_ROLE (id, role_name, role_code, description, create_id, create_time, update_id, update_time, is_deleted)
values (1, '超级管理员', '1', '超级管理员', null, null, null, null, 0);
commit;
prompt 1 records loaded
prompt Loading SYS_USER...
insert into SYS_USER (id, username, password, real_name, age, tel, update_id, update_time, create_id, create_time, is_deleted)
values (1, 'admin', '123', '管理员', '20', '110', null, null, null, null, 0);
commit;
prompt 1 records loaded
prompt Enabling triggers for SYS_AUTHORITY...
alter table SYS_AUTHORITY enable all triggers;
prompt Enabling triggers for SYS_DEPARTMENT...
alter table SYS_DEPARTMENT enable all triggers;
prompt Enabling triggers for SYS_MENU...
alter table SYS_MENU enable all triggers;
prompt Enabling triggers for SYS_ROLE...
alter table SYS_ROLE enable all triggers;
prompt Enabling triggers for SYS_USER...
alter table SYS_USER enable all triggers;
set feedback on
set define on
prompt Done.
