package run;

import logic.Dish;
import persistence.DishDAOFactory;
import persistence.DishDAOImpl;

public class Runner {
    DishDAOImpl dao = (DishDAOImpl) new DishDAOFactory().createDishDAO();

    public static void main(String[] args) {
        //new Runner().add();
        //new Runner().update();
        //new Runner().delete();
        new Runner().findById();
        new Runner().findAll();
    }

    private void findAll() {
        System.out.println("****************Todos los Platos***************");
        dao.getAllDishes().forEach( System.out::println);

        System.out.println("****************Fin Consulta***************");
    }

    private void findById() {
        System.out.println( dao.findById( 4 ) );
    }

    private void delete() {
        System.out.println( dao.deleteDish( 1 ) );
    }

    private void update() {
        System.out.println( dao.updateDish( new Dish(4,"Pollo a la Cazadora",(short)250,false,38000)));
    }

    private void add() {

        System.out.println( dao.addDish( new Dish(0,"Cazuela de Mariscos",(short)430,false,60000)));
    }
}
