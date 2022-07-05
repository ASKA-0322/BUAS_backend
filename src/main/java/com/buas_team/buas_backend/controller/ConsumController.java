package com.buas_team.buas_backend.controller;

import com.buas_team.buas_backend.common.Result;
import com.buas_team.buas_backend.mapper.ConsumAreaMapper;
import com.buas_team.buas_backend.vo.ConsumAreaVO;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ConsumController {
    @Resource
    private ConsumAreaMapper consumAreaMapper;

    public Result<?> getConsumArea(){
        List<ConsumAreaVO> consumAreaVOList = consumAreaMapper.getConsumArea();
        return Result.sucess(consumAreaVOList);
    }

}
