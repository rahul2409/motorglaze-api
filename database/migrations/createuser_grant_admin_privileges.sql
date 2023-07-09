#Create user name motorglaze
create user 'motorglaze'@'localhost' Identified by 'motorglaze';

# Grant access to Motorglaze user created on the local host. Access level - all
grant all privileges on *.* to 'motorsounds'@'localhost' with grant option;
