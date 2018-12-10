CREATE USER user1 IDENTIFIED BY 'user1';

grant usage on *.* to 'user1';
grant all privileges on loinc.* to 'user1';