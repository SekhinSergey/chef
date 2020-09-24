package com.epam.task1.food.vegetables;

import java.util.Objects;
import java.util.StringJoiner;

public class BellPepper extends Vegetable {

    public static final Integer UNIT_CALORIE_CONTENT = 27;

    private Boolean hasSeeds;

    public BellPepper(Integer weightInG, Integer quantity, Boolean hasSeeds) {
        super(weightInG, quantity);
        this.hasSeeds = hasSeeds;
    }

    public Boolean getHasSeeds() {
        return hasSeeds;
    }

    public void setHasSeeds(Boolean hasSeeds) {
        this.hasSeeds = hasSeeds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BellPepper that = (BellPepper) o;
        return hasSeeds.equals(that.hasSeeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasSeeds);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BellPepper.class.getSimpleName() + "[", "]")
                .add("hasSeeds=" + hasSeeds)
                .toString();
    }
}
