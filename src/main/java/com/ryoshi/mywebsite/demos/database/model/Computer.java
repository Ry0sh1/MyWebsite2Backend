package com.ryoshi.mywebsite.demos.database.model;

import com.ryoshi.mywebsite.demos.database.model.assets.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    //General Information
    @NotEmpty
    private String name;
    @NotEmpty
    private String serial_number;
    @Enumerated(value = EnumType.STRING)
    private Status status = Status.UNKNOWN;
    @Enumerated(value = EnumType.STRING)
    private OperationalStatus operational_status = OperationalStatus.UNKNOWN;
    @Enumerated(value = EnumType.STRING)
    private OperationalImpact operational_impact = OperationalImpact.PERSON;
    //Owner
    private String organizational_unit;
    private int cost_centre;
    private String location;
    @ManyToOne
    private Owner owner;
    @Enumerated(value = EnumType.STRING)
    private Property property = Property.UNKNOWN;
    //Inventory
    private int inventory_number;
    private String inventory_item;
    private Date end_of_operation;
    //Domain Account
    private String domain;
    @Enumerated(value = EnumType.STRING)
    private AccountStatus account_status = AccountStatus.ACTIVE;
    //Network Information
    private String dns_name;
    private String dns_server;
    private String standard_gateway;
    private String ip_address;
    private String ip_v6_address;
    //Device data
    private String manufacturer;
    private String model;
    private Date year_of_manufacture;
    private String prozessor;
    @Enumerated(value = EnumType.STRING)
    private OperationSystem operation_system = OperationSystem.WINDOWS11;
}
