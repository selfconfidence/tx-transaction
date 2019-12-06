package com.yzg.service1.controller;

import com.yzg.service1.entity.Tdemo;
import com.yzg.service1.service.TdemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName Service1Controller
 * @Description TODO
 * @Authoe weiyan
 * @Date 2019/12/4 11:39
 * @Version 1.0
 **/
@CrossOrigin
@RestController
public class Service1Controller {
    @Autowired
    private TdemoService tdemoService;
    @RequestMapping(value = "service1",method = RequestMethod.POST)
    public String service1(@RequestBody Tdemo tdemo){
        tdemoService.save(tdemo);
        return "SUCCESS";
    }

}