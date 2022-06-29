package com.shop.constant.ItemDetails;

import lombok.Getter;

@Getter
public enum Company {
    SONY("소니"), NIKON("니콘"), OLIMPUSE("올림푸스"), CANON("캐논"), HUJIFILM("후지필름");

    private final String description;

    Company(String description) {
        this.description = description;
    }
}
