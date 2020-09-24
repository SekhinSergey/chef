package com.epam.task1.food.vegetables;

import java.util.Objects;
import java.util.StringJoiner;

public class Cabbage extends Vegetable {

    public static final Integer UNIT_CALORIE_CONTENT = 25;

    private Boolean isWhite;

    public Cabbage(Integer weightInG, Integer quantity, Boolean isWhite) {
        super(weightInG, quantity);
        this.isWhite = isWhite;
    }

    public Boolean getWhite() {
        return isWhite;
    }

    public void setWhite(Boolean white) {
        isWhite = white;
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
        Cabbage cabbage = (Cabbage) o;
        return isWhite.equals(cabbage.isWhite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isWhite);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cabbage.class.getSimpleName() + "[", "]")
                .add("isWhite=" + isWhite)
                .toString();
    }
}
