CREATE TABLE IF NOT EXISTS owner
(
    id         BIGINT AUTO_INCREMENT,
    first_name TEXT,
    last_name  TEXT,
    street     TEXT,
    home       TEXT,
    district   TEXT,
    postal_code TEXT,
    number     TEXT,
    primary key (id)
);
CREATE TABLE IF NOT EXISTS computer (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    serial_number VARCHAR(255) NOT NULL,
    status VARCHAR(255),
    operational_status VARCHAR(255),
    operational_impact VARCHAR(255),
    organizational_unit VARCHAR(255),
    cost_centre INT,
    location VARCHAR(255),
    owner_id INT,
    property VARCHAR(255),
    inventory_number INT,
    inventory_item VARCHAR(255),
    end_of_operation DATE,
    domain VARCHAR(255),
    account_status VARCHAR(255),
    dns_name VARCHAR(255),
    dns_server VARCHAR(255),
    standard_gateway VARCHAR(255),
    ip_address VARCHAR(255),
    ip_v6_address VARCHAR(255),
    manufacturer VARCHAR(255),
    model VARCHAR(255),
    year_of_manufacture DATE,
    prozessor VARCHAR(255),
    operation_system VARCHAR(255)
);

ALTER TABLE computer ADD FOREIGN KEY (owner_id) REFERENCES owner(id)