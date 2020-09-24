package com.epam.task1.cook;

import com.epam.task1.Day;
import com.epam.task1.food.groats.Rice;
import com.epam.task1.food.meat.Chick;
import com.epam.task1.food.vegetables.Carrot;
import com.epam.task1.food.vegetables.Onoin;

public class Pilaf implements Eating {

    @Override
    public void cook(Day day) {
        if (day.equals(Day.SUPPER)) {
            Rice rice = new Rice(400, false, true);
            rice.setCalorieContent(Rice.UNIT_CALORIE_CONTENT * rice.getWeightInG() / 100);

            Chick chick = new Chick(700, 21, true);
            chick.setCalorieContent(Chick.UNIT_CALORIE_CONTENT * chick.getWeightInG() / 100);

            Onoin onoin = new Onoin(100, 2, true);
            onoin.setCalorieContent(Onoin.UNIT_CALORIE_CONTENT * onoin.getQuantity());

            Carrot carrot = new Carrot(200, 1, true);
            carrot.setCalorieContent(Carrot.UNIT_CALORIE_CONTENT * carrot.getWeightInG() / 100);

            Integer finalCalorieContent = rice.getCalorieContent()
                    + chick.getCalorieContent()
                    + onoin.getCalorieContent()
                    + carrot.getCalorieContent();

            System.out.println("Pilaf cooked with calorie content: " + finalCalorieContent);
        } else {
            System.out.println("Pilaf will be ready for supper");
        }
    }
}
