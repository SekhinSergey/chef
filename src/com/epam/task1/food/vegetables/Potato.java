package com.epam.task1.food.vegetables;

import java.util.Objects;
import java.util.StringJoiner;

public class Potato extends Vegetable {

    public static final Integer UNIT_CALORIE_CONTENT = 77;

    private Boolean isYellow;

    public Potato(Integer weightInG, Integer quantity, Boolean isYellow) {
        super(weightInG, quantity);
        this.isYellow = isYellow;
    }

    public Boolean getIsYellow() {
        return isYellow;
    }

    public void setIsYellow(Boolean isYellow) {
        this.isYellow = isYellow;
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
        Potato potato = (Potato) o;
        return isYellow.equals(potato.isYellow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isYellow);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Potato.class.getSimpleName() + "[", "]")
                .add("isYellow=" + isYellow)
                .toString();
    }
}
