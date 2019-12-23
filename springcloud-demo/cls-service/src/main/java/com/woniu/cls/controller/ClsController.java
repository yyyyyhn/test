package com.woniu.cls.controller;

import com.woniu.Util.Result;
import com.woniu.cls.service.ClsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("cls")
public class ClsController {
    @Autowired
    private ClsService clsService;
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/{cno}")
    public Result getClsByCno(HttpSession session, @PathVariable("cno")Integer cno){
        System.out.println("sessionID:"+session.getId());
        return new Result("success","0",null,clsService.selectByPrimaryKey(cno));
    }
    @RequestMapping("people")
    public Result getPeople(HttpServletRequest req, HttpSession session)throws Exception{

        System.out.println("sessionID:"+session.getId());

        //创建Http头信息对象
        HttpHeaders headers = new HttpHeaders();

        //创建集合保存cookie信息
        List<String> cookies =new ArrayList<String>();
        //定义变量保存session的键
        String sessionkey=null;

        //遍历request中的cookies取出session键
        Cookie[] httpcookies = req.getCookies();
        for (Cookie cookie:httpcookies){
            if(cookie.getName().equals("SESSION")){
                sessionkey=cookie.getValue();
                break;
            }
        }

        //将session键保存到cookie中
        cookies.add("SESSION="+sessionkey+";Path=/; HttpOnly");
        //将cookie存入头部
        headers.put(HttpHeaders.COOKIE,cookies);
        //请求的参数
        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();

        //封装参数和cookie
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

        //发送请求
        return new Result("success","0",null,restTemplate.postForEntity(
                "http://user-service/people/1",request,String.class
        ));
    }

}
