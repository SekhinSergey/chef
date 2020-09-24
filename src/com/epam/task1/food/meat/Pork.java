package com.epam.task1.food.meat;

import java.util.Objects;
import java.util.StringJoiner;

public class Pork extends Meat {

    public static final Integer UNIT_CALORIE_CONTENT = 308;

    private Boolean isNeck;

    public Pork(Integer weightInG, Integer fatContentInPercent, Boolean isNeck) {
        super(weightInG, fatContentInPercent);
        this.isNeck = isNeck;
    }

    public Boolean getNeck() {
        return isNeck;
    }

    public void setNeck(Boolean neck) {
        isNeck = neck;
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
        Pork pork = (Pork) o;
        return isNeck.equals(pork.isNeck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isNeck);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pork.class.getSimpleName() + "[", "]")
                .add("isNeck=" + isNeck)
                .toString();
    }
}
