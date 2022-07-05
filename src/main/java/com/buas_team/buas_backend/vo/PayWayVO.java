package com.buas_team.buas_backend.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

@Data
public class PayWayVO implements Serializable {
    @TableField("pay_method")
    private String payMethod;
    private Integer amount;
}
