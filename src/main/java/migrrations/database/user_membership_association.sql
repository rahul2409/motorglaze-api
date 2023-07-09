use `motorglaze`;
drop table if exists `users_membership_registrations`;

CREATE TABLE `users_membership_registrations` (
  `registration_id` int AUTO_INCREMENT PRIMARY KEY,
  `user_id` varchar(50) not null,
  `membership_id` varchar(50) not null,
  `store_id` varchar(50) not null,
  `washes_completed` INT default 0,
  `cleaning_completed` INT DEFAULT 0,
  `polishing_completed` INT DEFAULT 0,
  CONSTRAINT uc_user_membership UNIQUE (`user_id`, `membership_id`, `store_id`),
  FOREIGN KEY (`user_id`) REFERENCES `users`(`id`),
  FOREIGN KEY (`membership_id`) REFERENCES `memberships`(`id`), 
  `created_date` datetime not null Default now()
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

Alter table `users_membership_registrations` auto_increment = 100000;