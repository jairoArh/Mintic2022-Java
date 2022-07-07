package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagementTest {
    private Management<Dish> mng;

    void setup(){
        mng = new Management<>( (o1,o2) -> o1.getIdDish().compareTo(o2.getIdDish()));

    }

    @Test
    void findObject() {
        setup();
        assertNull( mng.findObject( new Dish("3465",null,false,0,0.0)));
        assertTrue( mng.addObject( new Dish("3465","Sopa",true,80,10_000)));
        assertTrue( mng.addObject( new Dish("7567","Arroz",true,86,17_000)));
        assertNotNull( mng.findObject( new Dish("3465",null,false,0,0.0) ) );
        assertEquals("Sopa",mng.findObject(new Dish("3465",null,false,0,0.0)).getName());
        assertEquals(10000,mng.findObject(new Dish("3465",null,false,0,0.0)).getValue());
    }

    @Test
    void addObject() {
        setup();
        assertTrue( mng.addObject( new Dish("3465","Sopa",true,80,10_000)));
        assertFalse( mng.addObject( new Dish("3465","Sopa",true,80,10_000)));
        assertTrue( mng.addObject( new Dish("7567","Arroz",true,86,17_000)));
        assertFalse( mng.addObject( new Dish("7567","Arroz",true,86,17_000)));
        assertEquals(2, mng.getObjects().size());
    }

    @Test
    void deleteObject() {
        setup();
        assertNull( mng.deleteObject( new Dish("3533",null,false,0,0.0)));
        assertTrue( mng.addObject( new Dish("3465","Sopa",true,80,10_000)));
        assertTrue( mng.addObject( new Dish("7567","Arroz",true,86,17_000)));
        assertNotNull( mng.findObject( new Dish("7567",null,false,0,0.0)));
        assertEquals(2, mng.getObjects().size());
        assertNotNull( mng.deleteObject(new Dish("7567",null,false,0,0.0)));
        assertEquals(1, mng.getObjects().size());
        assertNull( mng.findObject( new Dish("7567",null,false,0,0.0)));
        assertEquals( "Sopa",mng.deleteObject(new Dish("3465",null,false,0,0.0)).getName());
        assertEquals(0, mng.getObjects().size());
    }

    @Test
    void updateObject() {
        setup();
        assertFalse (mng.updateObject( new Dish("3533",null,false,0,0.0)));
        assertTrue( mng.addObject( new Dish("3465","Sopa",true,80,10_000)));
        assertTrue( mng.addObject( new Dish("7567","Arroz",true,86,17_000)));
        assertTrue(mng.updateObject( new Dish("3465","Sopa",false,156,15_000)));
    }

    @Test
    void testOtherObject(){
        Management<Character> mngOther = new Management<>( (c1,c2)->Character.compare( c1,c2));

        assertNull( mngOther.findObject( 'J') );
        assertTrue( mngOther.addObject('J'));
        assertNotNull( mngOther.findObject( 'J') );
        assertFalse( mngOther.addObject('J'));
        assertTrue( mngOther.addObject('A'));
        assertTrue( mngOther.addObject('I'));
        assertTrue( mngOther.addObject('R'));
        assertTrue( mngOther.addObject('O'));
        assertEquals(5,mngOther.getObjects().size());
        assertNotNull( mngOther.deleteObject('R'));
        assertEquals(4,mngOther.getObjects().size());
        assertNull( mngOther.deleteObject('R'));
    }
}