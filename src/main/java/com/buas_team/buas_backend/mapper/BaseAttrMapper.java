package com.buas_team.buas_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buas_team.buas_backend.vo.AgeVO;
import com.buas_team.buas_backend.vo.SexVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BaseAttrMapper extends BaseMapper<SexVO> {
    @Select("select sex,count(id) `amount` from bankuser " +
            "group by sex")
    List<SexVO> getSex();
    @Select("select t.period,count(t.period) `amount` " +
            "from (select case when age<20 then '20以下' " +
            "when age>=20 and age<30 then '20-30' " +
            "when age>=30 and age<40 then '30-40' " +
            "when age>=40 and age<50 then '40-50' " +
            "when age>=50 then '50以上' end as period from bankuser) t " +
            "group by period")
    List<AgeVO> getAge();
}
