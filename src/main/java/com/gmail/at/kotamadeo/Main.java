package com.gmail.at.kotamadeo;

import java.util.Scanner;

import static com.gmail.at.kotamadeo.util.CadastreHelper.generateRandomPlot;
import static com.gmail.at.kotamadeo.util.CadastreHelper.printRequiredPlots;

public class Main {
    private static final int PLOT_AMOUNT = 10;

    public static void main(String[] args) {
        startCadastreHelper();
    }

    private static void startCadastreHelper() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите рекомендованную стоимость и честность сделки (true\\false) через пробел:");
            printRequiredPlots(generateRandomPlot(PLOT_AMOUNT), scanner.nextInt(), scanner.nextBoolean());
            System.out.println("Желаете выйти? Да\\Нет:");
            if (scanner.next().equalsIgnoreCase("Да")) {
                break;
            }
        }
    }
}