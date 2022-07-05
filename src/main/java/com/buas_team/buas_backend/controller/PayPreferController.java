package com.buas_team.buas_backend.controller;

import com.buas_team.buas_backend.common.Result;
import com.buas_team.buas_backend.mapper.PayPreferMapper;
import com.buas_team.buas_backend.vo.PayCateVO;
import com.buas_team.buas_backend.vo.PayWayVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PayPreferController {
    @Resource
    private PayPreferMapper payPreferMapper;

    @GetMapping("/pay-prefer/pay-way")
    public Result<?> getPayWay(){
        List<PayWayVO> payWayVOList = payPreferMapper.getPayWay();
        return Result.sucess(payWayVOList);
    }
    @GetMapping("/pay-prefer/pay-category")
    public Result<?> getPayCatefory(){
        List<PayCateVO> payCateVOList = payPreferMapper.getPayCategory();
        return Result.sucess(payCateVOList);
    }
}
