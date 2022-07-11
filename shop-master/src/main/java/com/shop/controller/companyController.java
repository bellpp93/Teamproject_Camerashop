package com.shop.controller;

import com.shop.dto.ItemFormDto;
import com.shop.dto.ItemSearchDto;
import com.shop.dto.MainItemDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;
import com.shop.dto.ItemDto;
import com.shop.service.ItemService;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;



@Controller
@RequiredArgsConstructor
@RequestMapping(value="/company")



public class companyController {

    private final ItemService itemService;

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
    public String canonPage(ItemSearchDto itemSearchDto, Optional<Integer> page, Model model){
        Pageable pageable = PageRequest.of(page.isPresent() ? page.get() : 0, 6);
        Page<MainItemDto> items = itemService.getMainItemPage(itemSearchDto, pageable);


        model.addAttribute("items", items);
        model.addAttribute("itemSearchDto", itemSearchDto);
        model.addAttribute("maxPage", 5);
        return "company/canonPage";}

    @GetMapping(value = "/fujifilm" )
    public String hujiPage(Model model){
        model.addAttribute("brand","fujifilm 페이지 입니다.");
        return "company/fujiPage";}
}
