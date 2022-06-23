package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ItemDto {

    private Long id;

    private String itemNm;

    private Integer price;

    private String itemDetail;

    private String sellStatCd;

    private String company;

    private String cameraDiv;

    private String sensorDiv;

    private Integer pixels;

    private String resolution;

    private String popular_options;

    private LocalDateTime regTime;

    private LocalDateTime updateTime;

}