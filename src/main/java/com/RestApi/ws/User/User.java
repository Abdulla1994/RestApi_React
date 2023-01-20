package com.RestApi.ws.User;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;


@Data
//@Entity
//@Table(name="users")
public class User {

    private String username;
    private String displayName;

    private String password;


}
