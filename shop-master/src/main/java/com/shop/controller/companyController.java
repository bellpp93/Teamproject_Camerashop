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
    public String nikonPage(ItemSearchDto itemSearchDto, Optional<Integer> page, Model model){
        Pageable pageable = PageRequest.of(page.isPresent() ? page.get() : 0, 6);
        Page<MainItemDto> items = itemService.getMainItemPage(itemSearchDto, pageable);


        model.addAttribute("items", items);
        model.addAttribute("maxPage", 5);
        return "company/nikonPage";}



    @GetMapping(value = "/sony" )
    public String sonyPage(ItemSearchDto itemSearchDto, Optional<Integer> page, Model model){
        Pageable pageable = PageRequest.of(page.isPresent() ? page.get() : 0, 6);
        Page<MainItemDto> items = itemService.getMainItemPage(itemSearchDto, pageable);


        model.addAttribute("items", items);
        model.addAttribute("maxPage", 5);
        return "company/sonyPage";}

    @GetMapping(value = "/olympus" )
    public String olymPage(ItemSearchDto itemSearchDto, Optional<Integer> page, Model model){
        Pageable pageable = PageRequest.of(page.isPresent() ? page.get() : 0, 6);
        Page<MainItemDto> items = itemService.getMainItemPage(itemSearchDto, pageable);


        model.addAttribute("items", items);
        model.addAttribute("maxPage", 5);
        return "company/olymPage";}

    @GetMapping(value = "/canon" )
    public String canonPage(ItemSearchDto itemSearchDto, Optional<Integer> page, Model model){
        Pageable pageable = PageRequest.of(page.isPresent() ? page.get() : 0, 6);
        Page<MainItemDto> items = itemService.getMainItemPage(itemSearchDto, pageable);


        model.addAttribute("items", items);
        model.addAttribute("maxPage", 5);
        return "company/canonPage";}

    @GetMapping(value = "/fujifilm" )
    public String hujiPage(ItemSearchDto itemSearchDto, Optional<Integer> page, Model model){
        Pageable pageable = PageRequest.of(page.isPresent() ? page.get() : 0, 6);
        Page<MainItemDto> items = itemService.getMainItemPage(itemSearchDto, pageable);


        model.addAttribute("items", items);
        model.addAttribute("maxPage", 5);
        return "company/fujiPage";}
}
