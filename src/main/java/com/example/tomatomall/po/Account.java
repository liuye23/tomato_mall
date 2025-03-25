package com.example.tomatomall.po;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Account {
    private String username;
    private String password;
    private String role;
    private String email;
    private String phone;
    private String address;
    private String realName;
    private String idCard;
}
