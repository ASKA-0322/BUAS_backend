package com.buas_team.buas_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buas_team.buas_backend.vo.AgeVO;
import com.buas_team.buas_backend.vo.CardsVO;
import com.buas_team.buas_backend.vo.SexVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BaseAttrMapper{
    @Select("select sex,count(id) `amount` from bankuser " +
            "group by sex")
    List<SexVO> getSex();
    @Select("select t.period `period`,count(t.period) `amount` " +
            "from (select case when age<20 then '20以下' " +
            "when age>=20 and age<30 then '20-30' " +
            "when age>=30 and age<40 then '30-40' " +
            "when age>=40 and age<50 then '40-50' " +
            "when age>=50 then '50以上' end as period from bankuser) t " +
            "group by period")
    List<AgeVO> getAge();
    @Select("select t.cards `cards`,count(t.cards) `amount` " +
            "from (select " +
            "case when credit_cards=1 then '1张' " +
            "when credit_cards=2 then '2张' " +
            "when credit_cards=3 then '3张' " +
            "when credit_cards=4 then '4张' " +
            "when credit_cards=5 then '5张' " +
            "when credit_cards=6 then '6张' " +
            "when credit_cards=7 then '7张' " +
            "when credit_cards=8 then '8张' " +
            "when credit_cards=9 then '9张' " +
            "when credit_cards=10 then '10张' " +
            "when credit_cards=11 then '11张' " +
            "end as cards from bankuser)t " +
            "GROUP BY t.cards")
    List<CardsVO> getCards();
}
