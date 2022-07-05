package com.buas_team.buas_backend.mapper;

import com.buas_team.buas_backend.vo.PayCateVO;
import com.buas_team.buas_backend.vo.PayWayVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PayPreferMapper {
    @Select("select pay_method,count(id) `amount` " +
            "from bankuser " +
            "group by pay_method")
    List<PayWayVO> getPayWay();
    @Select("select commodity_category,count(id) `amount` " +
            "from bankuser " +
            "group by commodity_category")
    List<PayCateVO> getPayCategory();
}
