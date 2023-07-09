use `motorglaze`;
drop table if exists `transactions`;

create table `transactions`(
	`id` varchar(50) Not null primary key,
    `transaction_type` varchar(50) not null,
    `status` varchar(10) not null, 
    `amount` float,
	`user_id` varchar(50),
    `transaction_date` datetime not null Default now(),
    foreign key (`user_id`) references `users`(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1; 