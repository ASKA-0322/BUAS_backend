package com.buas_team.buas_backend.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

@Data
public class PayCateVO implements Serializable {
    @TableField("commodity_category")
    private String commodityCategory;
    private Integer amount;
}
