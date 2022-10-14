package com.gmail.at.kotamadeo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
@Getter
public class Plot {
    @NonNull
    private double height;
    @NonNull
    private double width;
    @NonNull
    private int price;

    @Override
    public String toString() {
        return String.format("Земельный участок: длина - %.2f, ширина - %.2f. Цена: %d руб.", height, width, price);
    }
}
