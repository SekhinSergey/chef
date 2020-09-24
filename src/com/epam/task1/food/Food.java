package com.epam.task1.food;

import java.util.Objects;
import java.util.StringJoiner;

public class Food {

    private Integer calorieContent;

    private Integer weightInG;

    public Food(Integer weightInG) {
        this.weightInG = weightInG;
    }

    public Integer getCalorieContent() {
        return calorieContent;
    }

    public void setCalorieContent(Integer calorieContent) {
        this.calorieContent = calorieContent;
    }

    public Integer getWeightInG() {
        return weightInG;
    }

    public void setWeightInG(Integer weightInG) {
        this.weightInG = weightInG;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Food food = (Food) o;
        return calorieContent.equals(food.calorieContent) &&
                weightInG.equals(food.weightInG);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calorieContent, weightInG);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Food.class.getSimpleName() + "[", "]")
                .add("calorieContent=" + calorieContent)
                .add("weightInG=" + weightInG)
                .toString();
    }
}
