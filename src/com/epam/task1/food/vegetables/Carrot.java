package com.epam.task1.food.vegetables;

import java.util.Objects;
import java.util.StringJoiner;

public class Carrot extends Vegetable {

    public static final Integer UNIT_CALORIE_CONTENT = 35;

    private Boolean isGrated;

    public Carrot(Integer weightInG, Integer quantity, Boolean isGrated) {
        super(weightInG, quantity);
        this.isGrated = isGrated;
    }

    public Boolean getGrated() {
        return isGrated;
    }

    public void setGrated(Boolean grated) {
        isGrated = grated;
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
        Carrot carrot = (Carrot) o;
        return isGrated.equals(carrot.isGrated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isGrated);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Carrot.class.getSimpleName() + "[", "]")
                .add("isGrated=" + isGrated)
                .toString();
    }
}
