-----------------------------------------
-- Export file for user PP             --
-- Created by pp on 2018/6/26, 9:09:46 --
-----------------------------------------

set define off
spool bbb.log

prompt
prompt Creating sequence SEQ_SYS_AUTHORITY_ID
prompt ======================================
prompt
create sequence SEQ_SYS_AUTHORITY_ID
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_SYS_DEPARTMENT_ID
prompt =======================================
prompt
create sequence SEQ_SYS_DEPARTMENT_ID
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_SYS_MENU_ID
prompt =================================
prompt
create sequence SEQ_SYS_MENU_ID
minvalue 1
maxvalue 9999999999999999999999999999
start with 41
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_SYS_ROLE_ID
prompt =================================
prompt
create sequence SEQ_SYS_ROLE_ID
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_SYS_USER_ID
prompt =================================
prompt
create sequence SEQ_SYS_USER_ID
minvalue 1
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


spool off
