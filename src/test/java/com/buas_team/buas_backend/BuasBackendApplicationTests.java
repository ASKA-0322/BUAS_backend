package com.buas_team.buas_backend;

import com.buas_team.buas_backend.entity.User;
import com.buas_team.buas_backend.mapper.*;
import com.buas_team.buas_backend.vo.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@SpringBootTest
class BuasBackendApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Resource
    private BaseAttrMapper baseAttrMapper;
    @Resource
    private AreaMapper areaMapper;
    @Resource
    private PayPreferMapper payPreferMapper;
    @Resource
    private ConsumAreaMapper consumAreaMapper;

    @Test
    void contextLoads() {
        List<User> userList = userMapper.selectList(null);
        System.out.println(userList);
    }
    @Test
    void t(){
        User user = new User();
        user.setName("1");
        user.setAge(1);
        user.setSex("1");
        user.setCreditCards(1);
        user.setArea("1");
        user.setConsumptionArea("1");
        user.setConsumptionAmount(1);
        user.setPayMethod("1");
        user.setPayTime(new Date());
        user.setCommodityCategory("1");
        int result = userMapper.add(user);
    }
    @Test
    void t2(){
        List<SexVO> sexVOList =baseAttrMapper.getSex();
        System.out.println(sexVOList);
    }
    @Test
    void t3(){
        List<AgeVO> ageVOList = baseAttrMapper.getAge();
        System.out.println(ageVOList);
    }
    @Test
    void t4(){
        List<CardsVO> cardsVOList = baseAttrMapper.getCards();
        System.out.println(cardsVOList);
    }
    @Test
    void t5(){
        List<PayPlaceVO> payPlaceVOList = areaMapper.getPayPlace();
        System.out.println(payPlaceVOList);
    }
    @Test
    void t6(){
        List<CardVO> holdList = areaMapper.getHoldCard();
        System.out.println(holdList);
    }
    @Test
    void t7(){
        List<PayWayVO> payWayVOList = payPreferMapper.getPayWay();
        List<PayCateVO> payCateVOList = payPreferMapper.getPayCategory();
        List<ConsumAreaVO> consumAreaVOList = consumAreaMapper.getConsumArea();
        System.out.println(payWayVOList);
        System.out.println(payCateVOList);
        System.out.println(consumAreaVOList);
    }
}
