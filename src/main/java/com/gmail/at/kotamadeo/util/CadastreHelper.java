package com.gmail.at.kotamadeo.util;

import com.gmail.at.kotamadeo.model.Plot;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CadastreHelper {
    private static final Random RANDOM = new Random();

    public static List<Plot> generateRandomPlot(int amount) {
        List<Plot> temp = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            temp.add(new Plot(RANDOM.nextDouble(100,1_000),
                    RANDOM.nextDouble(100,1_000),
                    RANDOM.nextInt(10_000_000)));
        }
        return temp;
    }

    public static void printRequiredPlots(List<Plot> plots, int recommendedOneMeterPrice, boolean fair) {
        if (fair) {
            System.out.println("Честные сделки:");
            plots.stream()
                    .filter(x -> x.getPrice() / (x.getHeight() * x.getWidth()) < recommendedOneMeterPrice)
                    .forEach(System.out::println);
        } else {
            System.out.println("Нечестные сделки:");
            plots.stream()
                    .filter(x -> x.getPrice() / (x.getHeight() * x.getWidth()) >= recommendedOneMeterPrice)
                    .forEach(System.out::println);
        }
    }
}
