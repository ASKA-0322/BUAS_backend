package com.buas_team.buas_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buas_team.buas_backend.vo.CardVO;
import com.buas_team.buas_backend.vo.PayPlaceVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AreaMapper {
    @Select("select consumption_area ,count(id) `amount` " +
            "from bankuser " +
            "group by consumption_area")
    List<PayPlaceVO> getPayPlace();
    @Select("select area,count(id) `amount` " +
            "from bankuser " +
            "group by area")
    List<CardVO> getHoldCard();
}
