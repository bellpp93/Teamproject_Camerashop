package com.shop.entity;

import com.shop.constant.ItemDetails.*;
import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import com.shop.dto.ItemFormDto;
import com.shop.exception.OutOfStockException;

@Entity
@Table(name="item")
@Getter
@Setter
@ToString
public class Item extends BaseEntity {

    @Id
    @Column(name="item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;       //상품 코드

    @Column(nullable = false, length = 50)
    private String itemNm; //상품명

    @Column(name="price", nullable = false)
    private int price; //가격

    @Column(nullable = false)
    private int stockNumber; //재고수량

    @Column(nullable = false)
    private Integer pixels; //유효 화소수

   @Lob
    @Column(nullable = false)
    private String itemDetail; //상품 상세 설명

    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus; //상품 판매 상태

    @Enumerated(EnumType.STRING)
    private Company company;//제조회사

    @Enumerated(EnumType.STRING)
    private CameraDiv cameraDiv; //카메라 분류

    @Enumerated(EnumType.STRING)
    private SensorDiv sensorDiv; //센서 분류

    @Enumerated(EnumType.STRING)
    private Resolution resolution; //해상도

    @Enumerated(EnumType.STRING)
    private Popular_options popular_options; //기타 선택사항


    public void updateItem(ItemFormDto itemFormDto){
        this.itemNm = itemFormDto.getItemNm();
        this.price = itemFormDto.getPrice();
        this.stockNumber = itemFormDto.getStockNumber();
        this.company = itemFormDto.getCompany();
        this.cameraDiv = itemFormDto.getCameraDiv();
        this.sensorDiv = itemFormDto.getSensorDiv();
        this.pixels = itemFormDto.getPixels();
        this.resolution = itemFormDto.getResolution();
        this.popular_options = itemFormDto.getPopular_options();
        this.itemDetail = itemFormDto.getItemDetail();
        this.itemSellStatus = itemFormDto.getItemSellStatus();
    }

    public void removeStock(int stockNumber){
        int restStock = this.stockNumber - stockNumber;
        if(restStock<0){
            throw new OutOfStockException("상품의 재고가 부족 합니다. (현재 재고 수량: " + this.stockNumber + ")");
        }
        this.stockNumber = restStock;
    }

    public void addStock(int stockNumber){
        this.stockNumber += stockNumber;
    }



}