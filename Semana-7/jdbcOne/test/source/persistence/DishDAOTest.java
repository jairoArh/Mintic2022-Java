package persistence;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class DishDAOTest {

    @Test
    void getDishes() {
        DishDAO dao = new DishDAO();
        ResultSet rs = dao.getDishes();
        assertNotNull( rs );
        try {
            rs.next();
            assertEquals(1, rs.getInt( 1 ) );
            assertEquals("Pasta",rs.getString( "name" ) );
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            dao.close();
        }
    }

    @Test
    void getDish() {
        DishDAO dao = new DishDAO();
        ResultSet rs = dao.getDish( 2 );
        try {
            rs.next();
            assertEquals("Pizza",rs.getString("name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            dao.close();
        }
    }

    @Test
    void addDish() {
        DishDAO dao = new DishDAO();
        String[] data = {"0","Caldo de P","300","F","12000"};
        assertEquals(1,dao.addDish( data ) );

        dao.close();
    }

    @Test
    void deleteDish() {
        DishDAO dao = new DishDAO();

        assertEquals(1,dao.deleteDish( 8 ) );

        dao.close();
    }

    @Test
    void updateDish() {
    }
}