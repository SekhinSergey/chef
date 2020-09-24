package com.epam.task1.food.vegetables;

import com.epam.task1.food.Food;
import java.util.Objects;
import java.util.StringJoiner;

public class Vegetable extends Food {

    private Integer quantity;

    public Vegetable(Integer weightInG, Integer quantity) {
        super(weightInG);
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
        Vegetable vegetable = (Vegetable) o;
        return quantity.equals(vegetable.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantity);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Vegetable.class.getSimpleName() + "[", "]")
                .add("quantity=" + quantity)
                .toString();
    }
}
