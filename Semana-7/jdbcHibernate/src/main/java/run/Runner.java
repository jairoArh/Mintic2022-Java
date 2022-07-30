package run;

import logic.Dish;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class Runner {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        SessionFactory factory = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();

        //addDish( factory );
        showDishes( factory );
        updateDish(factory);
        showDishes( factory );
        deleteDish( factory );
        showDishes( factory );

        System.out.println("************FIN DEL PROGRAMA**********");
    }


    private static void deleteDish(SessionFactory factory) {
        try(Session session = factory.openSession()){
            Transaction transaction = session.beginTransaction();

            Dish dish = session.get(Dish.class,9 );
            session.delete( dish );

            dish = session.get(Dish.class,8 );
            session.delete( dish );

            dish = session.get(Dish.class,7 );
            session.delete( dish );

            transaction.commit();
        }catch(Exception e){
            System.out.println("ERRORR - el Id del Objeto no Existe");
        }
    }

    private static void updateDish(SessionFactory factory) {
        try(Session session = factory.openSession()){
            Transaction transaction = session.beginTransaction();

            Dish tmh = session.get( Dish.class, 4 );
            tmh.setName("Tomahowk");
            tmh.setPrice(76000);
            tmh.setCalories( 600 );

            session.update( tmh );

            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void showDishes(SessionFactory factory) {
        try(Session session = factory.openSession()){
            Query query = session.createQuery("from Dish");

            query.list().forEach( System.out::println );


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void addDish(SessionFactory factory) {
        try(Session session = factory.openSession()){
            Transaction transaction = session.beginTransaction();

            Dish bisteck = new Dish(0,"Bisteck a Caballo",420,false,24000);
            Dish fruit = new Dish(0,"Ensalada de Frutas",50,true,17500);
            Dish pargo = new Dish(0,"Pargo Rojo",360,false,56000);

            session.save( bisteck );
            session.save( fruit );
            session.save( pargo );

            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
