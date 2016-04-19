# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table columns (
  table_schema              varchar(255),
  table_name                varchar(255),
  column_name               varchar(255),
  column_comment            varchar(255),
  data_type                 varchar(255),
  CHARACTER_MAXIMUM_LENGTH  varchar(255))
;

create table cor_member (
  member_id                 bigint auto_increment not null,
  member_name               varchar(255),
  member_passwd             varchar(255),
  member_tel                varchar(255),
  constraint pk_cor_member primary key (member_id))
;

create table tables (
  table_schema              varchar(255),
  table_name                varchar(255),
  table_comment             varchar(255),
  create_time               datetime(6),
  update_time               datetime(6))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table columns;

drop table cor_member;

drop table tables;

SET FOREIGN_KEY_CHECKS=1;

