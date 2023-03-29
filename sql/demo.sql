use demo;
drop table if EXISTS Fashionmnist;

create table Fashionmnist
(
    id int auto_increment,
    label int(3),
    imagedata mediumblob null,
    primary key (id)
);