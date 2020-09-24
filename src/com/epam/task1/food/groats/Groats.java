package com.epam.task1.food.groats;

import com.epam.task1.food.Food;
import java.util.Objects;
import java.util.StringJoiner;

public class Groats extends Food {

    private Boolean hasInclusion;

    public Groats(Integer weightInG, Boolean hasInclusion) {
        super(weightInG);
        this.hasInclusion = hasInclusion;
    }

    public Boolean getClean() {
        return hasInclusion;
    }

    public void setClean(Boolean clean) {
        hasInclusion = clean;
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
        Groats groats = (Groats) o;
        return hasInclusion.equals(groats.hasInclusion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasInclusion);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Groats.class.getSimpleName() + "[", "]")
                .add("isClean=" + hasInclusion)
                .toString();
    }
}
