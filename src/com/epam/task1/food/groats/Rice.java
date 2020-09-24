package com.epam.task1.food.groats;

import java.util.Objects;
import java.util.StringJoiner;

public class Rice extends Groats {

    public static final Integer UNIT_CALORIE_CONTENT = 130;

    private Boolean isWhite;

    public Rice(Integer weightInG, Boolean hasInclusion, Boolean isWhite) {
        super(weightInG, hasInclusion);
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
        Rice rice = (Rice) o;
        return isWhite.equals(rice.isWhite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isWhite);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Rice.class.getSimpleName() + "[", "]")
                .add("isWhite=" + isWhite)
                .toString();
    }
}
