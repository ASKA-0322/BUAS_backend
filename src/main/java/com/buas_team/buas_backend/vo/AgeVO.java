package com.buas_team.buas_backend.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class AgeVO implements Serializable {
    private String period;
    private Integer amount;
}
