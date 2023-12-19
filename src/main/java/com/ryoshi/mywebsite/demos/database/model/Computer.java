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
    @GeneratedValue
    private long id;
    //General Information
    @NotEmpty
    private String name;
    @NotEmpty
    private String serialNumber;
    @Enumerated(value = EnumType.STRING)
    private Status status = Status.UNKNOWN;
    @Enumerated(value = EnumType.STRING)
    private OperationalStatus operationalStatus = OperationalStatus.UNKNOWN;
    @Enumerated(value = EnumType.STRING)
    private OperationalImpact operationalImpact = OperationalImpact.PERSON;
    //Owner
    private String organizationalUnit;
    private int costCentre;
    private String location;
    @ManyToOne
    private Owner owner;
    @Enumerated(value = EnumType.STRING)
    private Property property = Property.UNKNOWN;
    //Inventory
    private int inventoryNumber;
    private String inventoryItem;
    private Date endOfOperation;
    //Domain Account
    private String domain;
    @Enumerated(value = EnumType.STRING)
    private AccountStatus accountStatus = AccountStatus.ACTIVE;
    //Network Information
    private String dnsName;
    private String dnsServer;
    private String standardGateway;
    private String ipAddress;
    private String ipV6Address;
    //Device data
    private String manufacturer;
    private String model;
    private Date yearOfManufacture;
    private String prozessor;
    @Enumerated(value = EnumType.STRING)
    private OperationSystem operationSystem = OperationSystem.WINDOWS11;
}
