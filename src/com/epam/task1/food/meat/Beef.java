package com.epam.task1.food.meat;

import java.util.Objects;
import java.util.StringJoiner;

public class Beef extends Meat {

    public static final Integer UNIT_CALORIE_CONTENT = 250;

    private Boolean isMarble;

    public Beef(Integer weightInG, Integer fatContentInPercent, Boolean isMarble) {
        super(weightInG, fatContentInPercent);
        this.isMarble = isMarble;
    }

    public Boolean getMarble() {
        return isMarble;
    }

    public void setMarble(Boolean marble) {
        isMarble = marble;
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
        Beef beef = (Beef) o;
        return isMarble.equals(beef.isMarble);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isMarble);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Beef.class.getSimpleName() + "[", "]")
                .add("isMarble=" + isMarble)
                .toString();
    }
}
