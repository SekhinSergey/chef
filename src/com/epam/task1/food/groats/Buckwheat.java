package com.epam.task1.food.groats;

import com.epam.task1.exceptions.BuckwheatInclusionException;
import java.util.Objects;
import java.util.StringJoiner;

public class Buckwheat extends Groats {

    public static final Integer UNIT_CALORIE_CONTENT = 343;

    private Boolean isKrasnodar;

    public Buckwheat(Integer weightInG, Boolean hasInclusion, Boolean isKrasnodar) {
        super(weightInG, hasInclusion);
        this.isKrasnodar = isKrasnodar;
    }

    public Boolean getKrasnodar() {
        return isKrasnodar;
    }

    public void setKrasnodar(Boolean krasnodar) {
        isKrasnodar = krasnodar;
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
        Buckwheat buckwheat = (Buckwheat) o;
        return isKrasnodar.equals(buckwheat.isKrasnodar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isKrasnodar);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Buckwheat.class.getSimpleName() + "[", "]")
                .add("isKrasnodar=" + isKrasnodar)
                .toString();
    }

    public BuckwheatInclusionException checkRegion(Buckwheat buckwheat) {
        if (!buckwheat.isKrasnodar) {
            return new BuckwheatInclusionException("Exception");
        }
        return null;
    }
}
