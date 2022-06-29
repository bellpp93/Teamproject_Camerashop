package com.shop.constant.ItemDetails;

import lombok.Getter;

@Getter
public enum CameraDiv {
    DSLR("DSLR"), DSLT("DSLT"), MIRRORIESS("미러리스"), HighEnd("하이엔드"), COMPACT("콤팩트");

    private final String description;

    CameraDiv(String description) {
        this.description = description;
    }
}
