# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table award (
  id                        bigint auto_increment not null,
  recipe_id                 bigint,
  eventname                 varchar(255),
  award_type_id             bigint,
  constraint pk_award primary key (id))
;

create table award_type (
  id                        bigint auto_increment not null,
  type                      varchar(255),
  constraint pk_award_type primary key (id))
;

create table club (
  id                        bigint auto_increment not null,
  fullname                  varchar(255),
  abbreviated_name          varchar(255),
  city                      varchar(255),
  state                     varchar(255),
  dues                      double,
  dues_per_year             integer,
  awards_count              integer,
  recipe_count              integer,
  member_count              integer,
  constraint pk_club primary key (id))
;

create table comment (
  id                        bigint auto_increment not null,
  created                   datetime,
  comment                   TEXT,
  user_email                varchar(255),
  recipe_id                 bigint,
  constraint pk_comment primary key (id))
;

create table due_order (
  id                        bigint auto_increment not null,
  member_id                 bigint,
  constraint pk_due_order primary key (id))
;

create table event (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  start_date                datetime,
  end_date                  datetime,
  club_id                   bigint,
  recurring                 tinyint(1) default 0,
  competition               tinyint(1) default 0,
  constraint pk_event primary key (id))
;

create table feedback (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  email                     varchar(255),
  message                   TEXT,
  location                  varchar(255),
  constraint pk_feedback primary key (id))
;

create table friendship (
  id                        bigint auto_increment not null,
  current_email             varchar(255),
  friend_email              varchar(255),
  constraint pk_friendship primary key (id))
;

create table member (
  id                        bigint auto_increment not null,
  user_email                varchar(255),
  life_member               tinyint(1) default 0,
  good_standing             tinyint(1) default 0,
  member_since              datetime,
  member_till               datetime,
  active                    tinyint(1) default 0,
  constraint pk_member primary key (id))
;

create table message (
  id                        bigint auto_increment not null,
  created                   datetime,
  message                   TEXT,
  message_stream_id         bigint,
  messenger_email           varchar(255),
  constraint pk_message primary key (id))
;

create table message_stream (
  id                        bigint auto_increment not null,
  public_id                 varchar(40),
  updated                   datetime,
  user_email                varchar(255),
  messagee_email            varchar(255),
  unread                    tinyint(1) default 0,
  constraint pk_message_stream primary key (id))
;

create table note (
  id                        bigint auto_increment not null,
  created                   datetime,
  criticism                 TEXT,
  score                     integer,
  recipe_id                 bigint,
  constraint pk_note primary key (id))
;

create table recipe (
  id                        bigint auto_increment not null,
  public_id                 varchar(40),
  name                      varchar(255),
  style                     varchar(255),
  link                      varchar(255),
  user_email                varchar(255),
  constraint uq_recipe_name unique (name),
  constraint pk_recipe primary key (id))
;

create table store (
  id                        bigint auto_increment not null,
  image                     varchar(255),
  link                      varchar(255),
  title                     varchar(255),
  price                     double,
  shipping                  double,
  sold_by                   varchar(255),
  store_type                varchar(255),
  ranking                   double,
  constraint pk_store primary key (id))
;

create table user (
  email                     varchar(255) not null,
  public_id                 varchar(40),
  password                  varchar(255),
  firstname                 varchar(255),
  lastname                  varchar(255),
  profile                   TEXT,
  location                  varchar(255),
  website                   varchar(255),
  title                     varchar(255),
  updates                   tinyint(1) default 0,
  reminders                 tinyint(1) default 0,
  active                    tinyint(1) default 0,
  rank                      varchar(255),
  email_verify              varchar(40),
  notifications             tinyint(1) default 0,
  awards_count              integer,
  recipe_count              integer,
  searchdata                varchar(255),
  constraint pk_user primary key (email))
;


create table club_member (
  club_id                        bigint not null,
  member_id                      bigint not null,
  constraint pk_club_member primary key (club_id, member_id))
;
alter table award add constraint fk_award_recipe_1 foreign key (recipe_id) references recipe (id) on delete restrict on update restrict;
create index ix_award_recipe_1 on award (recipe_id);
alter table award add constraint fk_award_awardType_2 foreign key (award_type_id) references award_type (id) on delete restrict on update restrict;
create index ix_award_awardType_2 on award (award_type_id);
alter table comment add constraint fk_comment_user_3 foreign key (user_email) references user (email) on delete restrict on update restrict;
create index ix_comment_user_3 on comment (user_email);
alter table comment add constraint fk_comment_recipe_4 foreign key (recipe_id) references recipe (id) on delete restrict on update restrict;
create index ix_comment_recipe_4 on comment (recipe_id);
alter table due_order add constraint fk_due_order_member_5 foreign key (member_id) references member (id) on delete restrict on update restrict;
create index ix_due_order_member_5 on due_order (member_id);
alter table event add constraint fk_event_club_6 foreign key (club_id) references club (id) on delete restrict on update restrict;
create index ix_event_club_6 on event (club_id);
alter table friendship add constraint fk_friendship_current_7 foreign key (current_email) references user (email) on delete restrict on update restrict;
create index ix_friendship_current_7 on friendship (current_email);
alter table friendship add constraint fk_friendship_friend_8 foreign key (friend_email) references user (email) on delete restrict on update restrict;
create index ix_friendship_friend_8 on friendship (friend_email);
alter table member add constraint fk_member_user_9 foreign key (user_email) references user (email) on delete restrict on update restrict;
create index ix_member_user_9 on member (user_email);
alter table message add constraint fk_message_messageStream_10 foreign key (message_stream_id) references message_stream (id) on delete restrict on update restrict;
create index ix_message_messageStream_10 on message (message_stream_id);
alter table message add constraint fk_message_messenger_11 foreign key (messenger_email) references user (email) on delete restrict on update restrict;
create index ix_message_messenger_11 on message (messenger_email);
alter table message_stream add constraint fk_message_stream_user_12 foreign key (user_email) references user (email) on delete restrict on update restrict;
create index ix_message_stream_user_12 on message_stream (user_email);
alter table message_stream add constraint fk_message_stream_messagee_13 foreign key (messagee_email) references user (email) on delete restrict on update restrict;
create index ix_message_stream_messagee_13 on message_stream (messagee_email);
alter table note add constraint fk_note_recipe_14 foreign key (recipe_id) references recipe (id) on delete restrict on update restrict;
create index ix_note_recipe_14 on note (recipe_id);
alter table recipe add constraint fk_recipe_user_15 foreign key (user_email) references user (email) on delete restrict on update restrict;
create index ix_recipe_user_15 on recipe (user_email);



alter table club_member add constraint fk_club_member_club_01 foreign key (club_id) references club (id) on delete restrict on update restrict;

alter table club_member add constraint fk_club_member_member_02 foreign key (member_id) references member (id) on delete restrict on update restrict;

# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table award;

drop table award_type;

drop table club;

drop table club_member;

drop table comment;

drop table due_order;

drop table event;

drop table feedback;

drop table friendship;

drop table member;

drop table message;

drop table message_stream;

drop table note;

drop table recipe;

drop table store;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

