package logic;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="dish")
public class Dish implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false)
    private int calories;

    @Column(nullable = false, name = "is_vegetarian")
    private boolean isVegetarian;

    @Column(nullable = false)
    private double price;

    public Dish() {
    }

    public Dish(int id, String name, int calories, boolean isVegetarian, double price) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", isVegetarian=" + isVegetarian +
                ", price=" + price +
                '}';
    }
}
