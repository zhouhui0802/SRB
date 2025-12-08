package com.zh.srb.core.controller.admin;

import com.zh.srb.core.pojo.entity.IntegralGrade;
import com.zh.srb.core.service.IntegralGradeService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "积分等级管理")
@CrossOrigin
@RestController
@RequestMapping("/admin/core/integralGrade")
@Slf4j
public class AdminIntegralGradeController {

    @Resource
    private IntegralGradeService integralGradeService;


    @GetMapping("/list")
    public List<IntegralGrade> listAll(){
        return integralGradeService.list();
    }

    @GetMapping("/test")
    public String listTest(){
        return "test";
    }



    @DeleteMapping("/remove/{id}")
    public boolean removeById(@PathVariable Long id){
        return integralGradeService.removeById(id);
    }
}
