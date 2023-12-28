package com.ryoshi.mywebsite.demos.database.model;

import com.ryoshi.mywebsite.demos.database.model.assets.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String organizational_unit = null;
    private int cost_centre = 0;
    private String location = null;
    @ManyToOne
    private Owner owner = null;
    @Enumerated(value = EnumType.STRING)
    private Property property = Property.UNKNOWN;
    //Inventory
    private int inventory_number = 0;
    private String inventory_item = null;
    private Date end_of_operation = null;
    //Domain Account
    private String domain = null;
    @Enumerated(value = EnumType.STRING)
    private AccountStatus account_status = AccountStatus.ACTIVE;
    //Network Information
    private String dns_name = null;
    private String dns_server = null;
    private String standard_gateway = null;
    private String ip_address = null;
    private String ip_v6_address = null;
    //Device data
    private String manufacturer = null;
    private String model = null;
    private Date year_of_manufacture = null;
    private String prozessor = null;
    @Enumerated(value = EnumType.STRING)
    private OperationSystem operation_system = OperationSystem.WINDOWS11;
}
