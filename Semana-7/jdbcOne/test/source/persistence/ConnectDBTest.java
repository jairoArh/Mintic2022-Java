package persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectDBTest {

    @Test
    void setConnect() {
        ConnectDB connectDB = new ConnectDB();

        assertTrue( connectDB.setConnect());
    }
}