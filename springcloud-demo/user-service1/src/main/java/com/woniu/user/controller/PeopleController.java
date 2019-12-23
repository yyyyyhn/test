package com.woniu.user.controller;

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

    @PostMapping("/{id}")
    public Result selectPeople(HttpSession session, @PathVariable("id")Integer id)throws Exception{

        System.out.println("user:"+session.getId());
        System.out.println(session.getAttribute("user"));
        return new Result("success","1",null,peopleService.selectByPrimaryKey(id));
    }
    @RequestMapping("login")
    public Result login(HttpSession session){
        session.setAttribute("people",new People(1,"丁丁"));
        return new Result("success","1",null,null);
    }
}
