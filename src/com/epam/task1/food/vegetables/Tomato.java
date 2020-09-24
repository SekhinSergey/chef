package com.epam.task1.food.vegetables;

import java.util.Objects;
import java.util.StringJoiner;

public class Tomato extends Vegetable {

    public static final Integer UNIT_CALORIE_CONTENT = 20;

    private Boolean isRipe;

    public Tomato(Integer weightInG, Integer quantity, Boolean isRipe) {
        super(weightInG, quantity);
        this.isRipe = isRipe;
    }

    public Boolean getIsRipe() {
        return isRipe;
    }

    public void setIsRipe(Boolean isRipe) {
        this.isRipe = isRipe;
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
        Tomato tomato = (Tomato) o;
        return Objects.equals(isRipe, tomato.isRipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isRipe);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Tomato.class.getSimpleName() + "[", "]")
                .add("isRipe=" + isRipe)
                .toString();
    }
}
