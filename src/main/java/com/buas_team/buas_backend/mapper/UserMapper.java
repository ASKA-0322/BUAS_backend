package com.buas_team.buas_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buas_team.buas_backend.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    @Insert("insert into table bankuser(id,name,sex,age,credit_cards,area," +
            "consumption_area,consumption_amount,pay_method,pay_time," +
            "commodity_category) values(#{user.id},#{user.name},#{user.sex}," +
            "#{user.age},#{user.creditCards},#{user.area},#{user.consumptionArea}," +
            "#{user.consumptionAmount},#{user.payMethod},#{user.payTime},#{user.commodityCategory})")
    int add(@Param("user")User user);
}
