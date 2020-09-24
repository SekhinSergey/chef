package com.epam.task1;

import com.epam.task1.cook.ArmyPorridge;
import com.epam.task1.cook.CabbageSoup;
import com.epam.task1.cook.Pilaf;

public class Main {

    public static void main(String[] args) {
        Pilaf pilaf = new Pilaf();
        pilaf.cook(Day.SUPPER);

        ArmyPorridge armyPorridge = new ArmyPorridge();
        armyPorridge.cook(Day.BREAKFAST);

        CabbageSoup cabbageSoup = new CabbageSoup();
        cabbageSoup.cook(Day.DINNER);
    }
}
