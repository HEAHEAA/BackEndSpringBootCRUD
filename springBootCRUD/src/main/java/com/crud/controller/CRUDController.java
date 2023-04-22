package com.crud.controller;

import com.crud.model.CRUDvo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
//서브페이지 들어갈 Controller
public class CRUDController {

    // ------- 01 controller에서 view로 바로 보내주는 방식
    @GetMapping("/test") // localhost:8080/api/test //GET url 출력테스트
    public String test01(){
        return "Get Test";
        // ==> get hello 출력
    }


//    @GetMapping(path = "/test/getParam")// localhost:8080/api/test/getParam?id=test&name=김지희
//    // Request로  id 와 name 을 받고 데이터가 들어오면 id와 name 값을 보내준다.
//    public String getParams01(@RequestParam String id,
//                            @RequestParam String name){
//        return "아이디는 " + id  + "이고 제 이름은" + name + "입니다.";
//    ===> 리턴 값 아이디는 test이고 제 이름은myName입니다.
//    }




    // ------- 02 만약 컨트롤러에서 파라미터가 많아지면 하나하나 적어주기 힘들수도있고
    //파라미터값이 10개 이상이면 매번 RequestParam인자를 만들어줄수 없다.
    // 이럴경우 만드는 것이 Model객체를 사용하는것.

    @GetMapping(path = "/test/getParam")
    public String getParams02(CRUDvo cruDvo){
        return "Vo에서 가져온 아이디는 " + cruDvo.getId()  + "이고 제 이름은" +
                cruDvo.getName() + "입니다.";
    }





}
