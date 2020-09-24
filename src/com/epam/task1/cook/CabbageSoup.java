package com.epam.task1.cook;

import com.epam.task1.Day;
import com.epam.task1.food.meat.Pork;
import com.epam.task1.food.vegetables.BellPepper;
import com.epam.task1.food.vegetables.Cabbage;
import com.epam.task1.food.vegetables.Carrot;
import com.epam.task1.food.vegetables.Garlic;
import com.epam.task1.food.vegetables.Onoin;
import com.epam.task1.food.vegetables.Potato;
import com.epam.task1.food.vegetables.Tomato;

public class CabbageSoup implements Eating {

    @Override
    public void cook(Day day) {
        if (day.equals(Day.DINNER)) {
            Pork pork = new Pork(500, 39, true);
            pork.setCalorieContent(Pork.UNIT_CALORIE_CONTENT * pork.getWeightInG() / 100);

            Potato potato = new Potato(300, 1, true);
            potato.setCalorieContent(Potato.UNIT_CALORIE_CONTENT * potato.getWeightInG() / 100);

            Cabbage cabbage = new Cabbage(300, 1, true);
            cabbage.setCalorieContent(Cabbage.UNIT_CALORIE_CONTENT * cabbage.getWeightInG() / 100);

            Tomato tomato = new Tomato(100, 1, true);
            tomato.setCalorieContent(Tomato.UNIT_CALORIE_CONTENT);

            BellPepper bellPepper = new BellPepper(200, 1, false);
            bellPepper.setCalorieContent(BellPepper.UNIT_CALORIE_CONTENT
                    * bellPepper.getWeightInG() / 100);

            Onoin onoin = new Onoin(100, 2, true);
            onoin.setCalorieContent(Onoin.UNIT_CALORIE_CONTENT * onoin.getQuantity());

            Carrot carrot = new Carrot(200, 1, true);
            carrot.setCalorieContent(Carrot.UNIT_CALORIE_CONTENT * carrot.getWeightInG() / 100);

            Garlic garlic = new Garlic(7, 1, true);
            garlic.setCalorieContent(Garlic.UNIT_CALORIE_CONTENT * garlic.getWeightInG() / 100);

            Integer finalCalorieContent = pork.getCalorieContent()
                    + potato.getCalorieContent()
                    + cabbage.getCalorieContent()
                    + tomato.getCalorieContent()
                    + bellPepper.getCalorieContent()
                    + onoin.getCalorieContent()
                    + carrot.getCalorieContent()
                    + garlic.getCalorieContent();

            System.out.println("Cabbage soup cooked with calorie content: " + finalCalorieContent);
        } else System.out.println("Cabbage soup will be ready for supper");
    }
}
