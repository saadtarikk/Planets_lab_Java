import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetsTest {

    Planets planets;

    @Before
    public void before(){
        planets = new Planets("Mars", 22000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Mars", planets.getName());
    }

    @Test
    public void hasSize() {
        assertEquals(22000.00, planets.getSize(), 0.0);
    }

    @Test
    public void checkInterpolation() {
        assertEquals("Boom!! Mars has exploded", planets.explode());
    }



}


//import org.junit.Before;
//        import org.junit.Test;
//
//        import static org.junit.Assert.*;
//
//public class BearTest {
//
//    Bear bear;
//    @Before
//    public void before(){
//        bear = new Bear("Baloo", 25, 95.62);
//    }
//
//    @Test
//    public void hasName(){
////        Bear bear = new Bear( "Baloo", 25, 95.62);
//        assertEquals("Baloo", bear.getName());
//    }
//
//    @Test
//    public void hasAge() {
////        Bear bear = new Bear("Baloo", 25, 95.62);
//        assertEquals(25, bear.getAge());
//    }
//
//    @Test
//    public void hasWeight() {
////        Bear bear = new Bear("Baloo", 25, 95.62);
//        assertEquals((95.62), bear.getWeight(), 0.0);
//    }