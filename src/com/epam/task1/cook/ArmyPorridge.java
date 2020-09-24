package com.epam.task1.cook;

import com.epam.task1.Day;
import com.epam.task1.food.groats.Buckwheat;
import com.epam.task1.food.meat.Beef;

public class ArmyPorridge implements Eating {

    @Override
    public void cook(Day day) {
        if (day.equals(Day.BREAKFAST)) {
            Buckwheat buckwheat = new Buckwheat(200, false, true);
            buckwheat.setCalorieContent(Buckwheat.UNIT_CALORIE_CONTENT * buckwheat.getWeightInG()
                    / 100);

            Beef beef = new Beef(800, 15, true);
            beef.setCalorieContent(Beef.UNIT_CALORIE_CONTENT * beef.getWeightInG() / 100);

            Integer finalCalorieContent = buckwheat.getCalorieContent() + beef.getCalorieContent();

            System.out.println("Army porridge cooked with calorie content: " + finalCalorieContent);
        } else {
            System.out.println("Army porridge was at the breakfast");
        }
    }
}
