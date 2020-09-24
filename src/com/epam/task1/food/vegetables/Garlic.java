package com.epam.task1.food.vegetables;

import java.util.Objects;
import java.util.StringJoiner;

public class Garlic extends Vegetable {

    public static final Integer UNIT_CALORIE_CONTENT = 149;

    private Boolean isHome;

    public Garlic(Integer weightInG, Integer quantity, Boolean isHome) {
        super(weightInG, quantity);
        this.isHome = isHome;
    }

    public Boolean getHome() {
        return isHome;
    }

    public void setHome(Boolean home) {
        isHome = home;
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
        Garlic garlic = (Garlic) o;
        return isHome.equals(garlic.isHome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isHome);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Garlic.class.getSimpleName() + "[", "]")
                .add("isHome=" + isHome)
                .toString();
    }
}
