package com.buas_team.buas_backend.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

@Data
public class ConsumAreaVO implements Serializable {
    @TableField("consumption_area")
    private String consumptionArea;
    private Integer amount;
}
