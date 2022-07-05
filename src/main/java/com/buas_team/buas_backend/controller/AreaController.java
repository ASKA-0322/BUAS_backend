package com.buas_team.buas_backend.controller;

import com.buas_team.buas_backend.common.Result;
import com.buas_team.buas_backend.mapper.AreaMapper;
import com.buas_team.buas_backend.vo.CardVO;
import com.buas_team.buas_backend.vo.PayPlaceVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AreaController {
    @Resource
    private AreaMapper areaMapper;

    @GetMapping("/area/pay-place")
    public Result<?> getPayPlace(){
        List<PayPlaceVO> payPlaceVOList = areaMapper.getPayPlace();
        return Result.sucess(payPlaceVOList);
    }
    @GetMapping("/area/hold-card")
    public Result<?> getHoldCard(){
        List<CardVO> holdCardsList = areaMapper.getHoldCard();
        return Result.sucess(holdCardsList);
    }
}
