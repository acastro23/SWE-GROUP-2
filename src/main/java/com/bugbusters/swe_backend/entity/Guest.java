package com.bugbusters.swe_backend.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "guests")     // maps to our guest table in the database
@Getter
@Setter
public class Guest {

    /*
        In this file, we're just generating properties for the respective columns in our guest tables
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guestID;

    @Column(name = "fname", nullable = false)
    private String fName;

    @Column(name = "lname", nullable = false)
    private String lName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "phonenumber")
    private String phoneNumber;

}
