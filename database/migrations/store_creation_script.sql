use `motorglaze`;

create table `stores`(
	`id` varchar(50) Not null primary key,
    `location` varchar(50) not null,
    `type` varchar(20) not null, 
    `store_owner` varchar(50),
    `creation_date` datetime not null Default now(),
    foreign key (`store_owner`) references `users`(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1; 