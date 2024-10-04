package com.bugbusters.swe_backend.dto;


import lombok.Getter;
import lombok.Setter;

// transfer guest data around between front and back end.

@Getter
@Setter
public class GuestDTO {
    private String fname;
    private String lname;
    private String email;
    private String phoneNumber;
}
