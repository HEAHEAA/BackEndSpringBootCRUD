package com.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
//서브페이지 들어갈 Controller
public class CRUDController {

    @GetMapping("/test") // localhost:8080/api/test //GET url 출력테스트
    public String test01(){
        return "Get Test";
        // ==> get hello 출력
    }

    @GetMapping(path = "/test/getParam")// localhost:8080/api/test/getParam?id=test&name=김지희
    // Request로  id 와 name 을 받고 데이터가 들어오면 id와 name 값을 보내준다.
    public String getParams(@RequestParam String id, @RequestParam String name){
        return "아이디는 " + id  + "이고 제 이름은" + name + "입니다.";
    }


   // ------- controller에서 view로 바로 보내주는 방식


}
