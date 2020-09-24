package com.epam.task1.food.vegetables;

import java.util.Objects;
import java.util.StringJoiner;

public class Onoin extends Vegetable {

    public static final Integer UNIT_CALORIE_CONTENT = 40;

    private Boolean isCrumbled;

    public Onoin(Integer weightInG, Integer quantity, Boolean isCrumbled) {
        super(weightInG, quantity);
        this.isCrumbled = isCrumbled;
    }

    public Boolean getCrumbled() {
        return isCrumbled;
    }

    public void setCrumbled(Boolean crumbled) {
        isCrumbled = crumbled;
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
        Onoin onoin = (Onoin) o;
        return isCrumbled.equals(onoin.isCrumbled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isCrumbled);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Onoin.class.getSimpleName() + "[", "]")
                .add("isCrumbled=" + isCrumbled)
                .toString();
    }
}
