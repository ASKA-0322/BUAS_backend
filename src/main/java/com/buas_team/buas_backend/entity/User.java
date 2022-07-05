package com.buas_team.buas_backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Data
@TableName("bankuser")
public class User implements Serializable {
    @TableId(type= IdType.AUTO)
    private String id;
    @NotBlank(message = "名字不能为空")
    @TableField("name")
    private String name;
    @NotBlank(message = "性别不能为空")
    @TableField("sex")
    private String sex;
    @NotBlank(message = "年龄不能为空")
    @TableField("age")
    private Integer age;
    @TableField("credit_cards")
    private Integer creditCards;
    @TableField("area")
    private String area;
    @TableField("consumption_area")
    private String consumptionArea;
    @TableField("consumption_amount")
    private Integer consumptionAmount;
    @TableField("pay_method")
    private String payMethod;
    @TableField("pay_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date payTime;
    @TableField("commodity_category")
    private String commodityCategory;
}
