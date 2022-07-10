package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/customersvc")

public class customersvcController {

    @GetMapping(value = "/customerService")
    public String customerCenter(Model model){
        model.addAttribute("customercenter","고객센터 페이지 입니다.");
        return "customersvc/customerCenter";}

}
