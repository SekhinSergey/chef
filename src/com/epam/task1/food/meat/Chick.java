package com.epam.task1.food.meat;

import java.util.Objects;
import java.util.StringJoiner;

public class Chick extends Meat {

    public static final Integer UNIT_CALORIE_CONTENT = 170;

    private Boolean isSoft;

    public Chick(Integer weightInG, Integer fatContentInPercent, Boolean isSoft) {
        super(weightInG, fatContentInPercent);
        this.isSoft = isSoft;
    }


    public Boolean getSoft() {
        return isSoft;
    }

    public void setSoft(Boolean soft) {
        isSoft = soft;
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
        Chick chick = (Chick) o;
        return isSoft.equals(chick.isSoft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isSoft);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Chick.class.getSimpleName() + "[", "]")
                .add("isSoft=" + isSoft)
                .toString();
    }
}
