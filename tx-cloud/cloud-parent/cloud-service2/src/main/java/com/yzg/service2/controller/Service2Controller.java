package com.yzg.service2.controller;
import com.yzg.service2.service.TdemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * @ClassName Service2Controller
 * @Description TODO
 * @Authoe weiyan
 * @Date 2019/12/4 11:40
 * @Version 1.0
 **/
@CrossOrigin
@RestController
public class Service2Controller {



    @Autowired
    private TdemoService tdemoService;

        @RequestMapping(value = "service2/{ex}", method = RequestMethod.GET)
        public String service1(@PathVariable("ex") String ex) {
/*             Boolean isflag = Stream.generate(() -> {
                return ex.equalsIgnoreCase("null");
            }).filter((flag) -> {
                if (Optional.ofNullable(flag).orElse(true)) {
                    return true;
                }
                return false;
            }).findAny().get();*/
            return   tdemoService.save(ex.equalsIgnoreCase("null") ? null : "");
    }
}