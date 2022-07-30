package persistence;

import logic.Dish;

import java.util.ArrayList;

public interface DishDAO extends AutoCloseable{
    public int addDish(Dish dish);

    public int updateDish(Dish dish);

    public int deleteDish( int id );

    public Dish findById( int id );

    public ArrayList<Dish> getAllDishes();
}
