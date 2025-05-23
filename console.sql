create database session11;
use session11;

CREATE TABLE category (
    id INT AUTO_INCREMENT PRIMARY KEY,
    category_name VARCHAR(50) NOT NULL UNIQUE,
    status BIT DEFAULT 1
);

DELIMITER //
create procedure searchCatalogByName(
    name_in varchar(50)
)
begin
    select * from category where category_name = name_in;
end //
DELIMITER ;

DELIMITER //
create procedure addCatalog(
    name_in varchar(50),
    status_in bit
)
begin
    insert into category(category_name, status)
        values (name_in,status_in);
end //
DELIMITER ;

DELIMITER //
create procedure getAllCatalog()
begin
    select * from category;
end //
DELIMITER ;

DELIMITER //
create procedure updateCatalog(
    id_in int,
    name_in varchar(50),
    status_in bit
)
begin
    update category
        set category_name = name_in,
            status = status_in
    where id = id_in;
end //
DELIMITER ;

DELIMITER //
create procedure deleteCatalog(
    id_in int
)
begin
    delete from category where id = id_in;
end //
DELIMITER ;
DELIMITER //
create procedure getCataById(id_in int)
begin
    select * from category where id = id_in;
end //
DELIMITER ;