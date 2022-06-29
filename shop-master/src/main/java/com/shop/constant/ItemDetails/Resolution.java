package com.shop.constant.ItemDetails;

import lombok.Getter;

@Getter
public enum Resolution {
    FourKUHD("4k UHD"), FHD("FHD"), HD("HD");

    private final String description;

    Resolution(String description) {
        this.description = description;
    }
}
