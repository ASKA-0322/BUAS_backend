package com.buas_team.buas_backend.mapper;

import com.buas_team.buas_backend.vo.ConsumAreaVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ConsumAreaMapper {
    @Select("select consumption_area,sum(consumption_amount) `amount` " +
            "from bankuser " +
            "group by consumption_area")
    List<ConsumAreaVO> getConsumArea();
}
