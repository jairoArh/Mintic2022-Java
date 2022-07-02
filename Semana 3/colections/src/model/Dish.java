package model;

import java.util.Comparator;

public class Dish {
    private String idDish;
    private String name;
    private boolean isVegetarian;
    private int calories;
    private double value;

    /*public static Comparator<Dish> compId = new Comparator<Dish>() {
        @Override
        public int compare(Dish o1, Dish o2) {
            return o1.getName().compareTo( o2.getName());
        }
    };

    public static Comparator<Dish> compValue = (d1,d2) -> Double.compare( d2.getValue(),d1.getValue());*/

    public Dish(String idDish, String name, boolean isVegetarian, int calories, double value) {
        this.idDish = idDish;
        this.name = name;
        this.isVegetarian = isVegetarian;
        this.calories = calories;
        this.value = value;
    }

    public String getIdDish() {
        return idDish;
    }

    public void setIdDish(String idDish) {
        this.idDish = idDish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "idDish='" + idDish + '\'' +
                ", name='" + name + '\'' +
                ", isVegetarian=" + isVegetarian +
                ", calories=" + calories +
                ", value=" + value +
                '}';
    }

    /*
    @Override
    public int compare(Dish o1, Dish o2) {
        return o1.getIdDish().compareTo( o2.getIdDish());
    }

     */
}
