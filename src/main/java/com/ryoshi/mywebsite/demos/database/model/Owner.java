package com.ryoshi.mywebsite.demos.database.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    private String first_name;
    @NotBlank
    private String last_name;
    @NotBlank
    private String street;
    @NotBlank
    private String home;
    private String district;
    private String postal_code;
    private String number;
    @OneToMany(mappedBy="id")
    private Set<Computer> computer;

}
