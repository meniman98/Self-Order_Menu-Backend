package com.cts.SelfOrderMenu.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table(name = "meal_deal")
public class MealDeal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(fetch = FetchType.EAGER)
    Set<Item> itemSet;

    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MealDeal mealDeal = (MealDeal) o;
        return id == mealDeal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
