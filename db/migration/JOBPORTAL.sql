
CREATE TABLE ADMINREGISTRATION
(
ID NUMBER(10) NOT NULL,
ADMIN_ID NUMBER(10) NOT NULL,
ADMIN_NAME VARCHAR2(50) NOT NULL,
EMAIL_ID VARCHAR2(55) NOT NULL,
PHONE_NUMBER NUMBER(10) NOT NULL,
PASSWORD VARCHAR2(20) NOT NULL,
CONSTRAINT  pk_cons_key PRIMARY KEY(ADMIN_NAME),
CONSTRAINT unique_cons_key UNIQUE(ID,ADMIN_ID,EMAIL_ID,PHONE_NUMBER)
);
create sequence adminregistration_idno_seq
start with 1
increment by 1;


create table register
(
ID NUMBER(5) NOT NULL,
NAME VARCHAR2(50) NOT NULL,
PHONE_NUMBER NUMBER(10) NOT NULL,
EMAIL VARCHAR2(55) NOT NULL,
PASSWORD VARCHAR2(20) NOT NULL,
DEPT_NAME VARCHAR2(55) NOT NULL,
JOB_EXPERIENCE NUMBER(2) NOT NULL,
CONSTRAINT primarykey_constraint PRIMARY KEY(NAME),
CONSTRAINT unique_constraint_key UNIQUE(ID,EMAIL)
);
CREATE SEQUENCE register_idno_seq
start with 1
increment by 1;

create table admin
(
ID NUMBER(5) NOT NULL,
VACANCY_DEPT VARCHAR2(50) NOT NULL,
VACANCY_DETAILS VARCHAR2(60) NOT NULL,
JOB_LOCATION VARCHAR2(30) NOT NULL,
COMPANY_NAME VARCHAR2(30) NOT NULL,
REFERENCE_NUMBER NUMBER(10) NOT NULL,
CONSTRAINT uk_const_key UNIQUE(ID)
);
create sequence admin_id_seq
start with 1
increment by 1;