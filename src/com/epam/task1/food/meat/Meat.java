package com.epam.task1.food.meat;

import com.epam.task1.food.Food;
import java.util.Objects;
import java.util.StringJoiner;

public class Meat extends Food {

    private Integer fatContentInPercent;

    public Meat(Integer weightInG, Integer fatContentInPercent) {
        super(weightInG);
        this.fatContentInPercent = fatContentInPercent;
    }

    public Integer getFatContentInPercent() {
        return fatContentInPercent;
    }

    public void setFatContentInPercent(Integer fatContentInPercent) {
        this.fatContentInPercent = fatContentInPercent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Meat meat = (Meat) o;
        return fatContentInPercent.equals(meat.fatContentInPercent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fatContentInPercent);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Meat.class.getSimpleName() + "[", "]")
                .add("fatContentInPercent=" + fatContentInPercent)
                .toString();
    }
}
