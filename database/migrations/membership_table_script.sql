use `motorglaze`;
drop table if exists `memberships`;

create table `memberships`(
	`id` varchar(50) Not null primary key,
    `membership_type` varchar(50) not null,
    `washes_included` int default 0, 
    `cleaning_included` int default 0, 
    `polishes_included` int default 0,
    `duration` int default 1,
    `amount` float not null,
	`created_date` datetime not null Default now()
) ENGINE=InnoDB DEFAULT CHARSET=latin1; 

insert into `memberships` values(uuid(), 'Monthly', 4, 1, default, default, 2400, default);
insert into `memberships` values(uuid(), 'Annual', 48, 12, 2, 12, 24000, default);