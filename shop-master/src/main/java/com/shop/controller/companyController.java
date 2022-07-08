package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/company")

public class companyController {
    @GetMapping(value = "/nikon" )
    public String nikonPage(Model model){
        model.addAttribute("brand","nikon 페이지 입니다.");
        return "company/nikonPage";}

    @GetMapping(value = "/sony" )
    public String sonyPage(Model model){
        model.addAttribute("brand","sony 페이지 입니다.");
        return "company/sonyPage";}

    @GetMapping(value = "/olympus" )
    public String olymPage(Model model){
        model.addAttribute("brand","olympus 페이지 입니다.");
        return "company/olymPage";}

    @GetMapping(value = "/canon" )
    public String canonPage(Model model){
        model.addAttribute("brand","canon 페이지 입니다.");
        return "company/canonPage";}

    @GetMapping(value = "/fujifilm" )
    public String hujiPage(Model model){
        model.addAttribute("brand","fujifilm 페이지 입니다.");
        return "company/fujiPage";}
}
