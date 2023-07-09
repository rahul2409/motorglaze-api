CREATE DATABASE  IF NOT EXISTS `motorglaze`;
USE `motorglaze`;

drop table if exists `users`;

create table `users`(
	`id` varchar(50) Not null primary key,
    `first_name` varchar(50) not null,
    `last_name` varchar(100) default null, 
    `email_address` varchar(200) default null, 
    `user_privilege` varchar(20) default 'Customer',
    `phone_number` varchar(15) not null,
	`created_date` datetime not null Default now()
) ENGINE=InnoDB DEFAULT CHARSET=latin1; 


insert into `users` values(uuid(), 'Rahul', 'Nandrajog', 'rahulnandrajog99@gmail.com', 'Admin', '+91-9619925240', default);
insert into `users` values(uuid(), 'Anjali', 'Nandrajog', 'rahulnandrajog94@gmail.com', default, '+91-9833707888', default);
insert into `users` values(uuid(), 'Motorglaze Mulund', default,  'info@motorglaze.in', 'Store Owner', '+91-9819641444', default);
insert into `users` values(uuid(), 'Ravi O', 'Nandrajog', 'motorsounds@gmail.com', 'Admin', '+91-9819641444', default);
insert into `users` values(uuid(), 'Walsh', 'Tony Fernandes',default, default, '+91-9757221040', default);

