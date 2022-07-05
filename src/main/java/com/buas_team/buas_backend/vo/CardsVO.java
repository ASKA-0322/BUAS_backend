package com.buas_team.buas_backend.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class CardsVO implements Serializable {
    private String cards;
    private Integer amount;
}
