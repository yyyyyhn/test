package com.woniu.user.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.woniu.Util.Result;
import com.woniu.user.entity.People;
import com.woniu.user.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("people")
public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    @RequestMapping("/{id}")
    @HystrixCommand(fallbackMethod = "selectPeopleFallback",commandProperties
            = {@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="5000")})
    public Result selectPeople(HttpSession session, @PathVariable("id")Integer id)throws Exception{

//        Thread.sleep(6000);
        System.out.println("user:"+session.getId());
        System.out.println(session.getAttribute("user"));
        return new Result("success","0",null,peopleService.selectByPrimaryKey(id));
    }

    public Result selectPeopleFallback(HttpSession session, @PathVariable("id")Integer id)throws Exception{

        System.out.println("user:"+session.getId());
        System.out.println(session.getAttribute("user"));
        return new Result("error","0",null,null);
    }
    @RequestMapping("login")
    public Result login(HttpSession session){
        System.out.println("user:"+session.getId());
        System.out.println(session.getAttribute("user"));
        session.setAttribute("people",new People(1,"丁丁"));
        return new Result("success","0",null,null);
    }
}
