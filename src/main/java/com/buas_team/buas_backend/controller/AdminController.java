package com.buas_team.buas_backend.controller;

import com.buas_team.buas_backend.common.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @PostMapping("/login")
    public Result<?> login(){
        return Result.sucess();
    }
}
