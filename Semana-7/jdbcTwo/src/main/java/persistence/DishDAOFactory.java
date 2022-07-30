package persistence;

public class DishDAOFactory {

    public DishDAO createDishDAO(){
        return new DishDAOImpl();
    }
}
