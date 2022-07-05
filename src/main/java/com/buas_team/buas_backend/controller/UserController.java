package com.buas_team.buas_backend.controller;

import com.buas_team.buas_backend.common.Result;
import com.buas_team.buas_backend.entity.User;
import com.buas_team.buas_backend.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserMapper userMapper;

    @GetMapping("/user/get")
    public Result<?> getAll(){
        List<User> userList = userMapper.selectList(null);
        return Result.sucess(userList);
    }
    @PostMapping("/user/add")
    public Result<?> add(User user){
        int result = userMapper.add(user);
        if(result>0)
            return Result.sucess();
        return Result.error(400,"插入失败");
    }
}
