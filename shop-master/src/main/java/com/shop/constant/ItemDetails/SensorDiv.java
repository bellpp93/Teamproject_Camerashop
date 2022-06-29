package com.shop.constant.ItemDetails;

import lombok.Getter;

@Getter
public enum SensorDiv {
    FullFrame("풀프레임"), CropSensor("크롭센서"), MicroFTSensor("마이크로포서드센서"), TypeOneSensor("1형이상센서");

    private final String description;

    SensorDiv(String description) {
        this.description = description;
    }
}
