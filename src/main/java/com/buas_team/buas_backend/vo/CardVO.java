package com.buas_team.buas_backend.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class CardVO implements Serializable {
    private String area;
    private Integer amount;
}
