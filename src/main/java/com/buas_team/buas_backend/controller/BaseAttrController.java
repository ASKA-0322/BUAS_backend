package com.buas_team.buas_backend.controller;


import com.buas_team.buas_backend.common.Result;
import com.buas_team.buas_backend.mapper.BaseAttrMapper;
import com.buas_team.buas_backend.vo.AgeVO;
import com.buas_team.buas_backend.vo.CardsVO;
import com.buas_team.buas_backend.vo.SexVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BaseAttrController {
    @Resource
    public BaseAttrMapper baseAttrMapper;

    @GetMapping("/base/sex")
    public Result<?> getSex(){
        List<SexVO> sexVOList = baseAttrMapper.getSex();
        return Result.sucess(sexVOList);
    }
    @GetMapping("/base/age")
    public Result<?> getAge(){
        List<AgeVO> ageVOList = baseAttrMapper.getAge();
        return Result.sucess(ageVOList);
    }
    @GetMapping("/base/cards")
    public Result<?> getCards(){
        List<CardsVO> cardsVOList = baseAttrMapper.getCards();
        return Result.sucess(cardsVOList);
    }
}
