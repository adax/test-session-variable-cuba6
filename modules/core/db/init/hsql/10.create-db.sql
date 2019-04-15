-- begin TESTSESSIONVARIABLE_DEPARTMENT
create table TESTSESSIONVARIABLE_DEPARTMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end TESTSESSIONVARIABLE_DEPARTMENT
-- begin TESTSESSIONVARIABLE_ORDER
create table TESTSESSIONVARIABLE_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_DATE date,
    NOTES varchar(255),
    DEPARTMENT_ID varchar(36),
    --
    primary key (ID)
)^
-- end TESTSESSIONVARIABLE_ORDER
-- begin TESTSESSIONVARIABLE_ORDER_LINE
create table TESTSESSIONVARIABLE_ORDER_LINE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT varchar(255),
    QUANTITY decimal(19, 2),
    ORDER_ID varchar(36),
    --
    primary key (ID)
)^
-- end TESTSESSIONVARIABLE_ORDER_LINE
