package com.buas_team.buas_backend.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Admin implements Serializable {
    private Integer id;
    private String username;
    private String password;
}
