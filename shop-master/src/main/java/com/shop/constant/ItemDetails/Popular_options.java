package com.shop.constant.ItemDetails;

import lombok.Getter;

@Getter
public enum Popular_options {

    STABILIZATION("손떨림보정"), DustProof("방진/방적"), WaterProof("방수"), WiFi("Wi-Fi");

    private final String description;

    Popular_options(String description) {
        this.description = description;
    }
}
