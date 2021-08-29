create memory table if not exists iternary(ID INT PRIMARY KEY AUTO_INCREMENT, CITY_NAME VARCHAR(255), ITERNARY_NAME VARCHAR(255), COUNTRY_CODE VARCHAR(255), TEMPERATURE VARCHAR(255), CLOUDS VARCHAR(255), TIME VARCHAR(255));
insert into iternary(city_name,iternary_name,country_code,temperature,clouds,time) values('SYDNEY','IT1', 'AU', '5C', 'CLOUDY', '2021-08-27T06:05:20Z');
