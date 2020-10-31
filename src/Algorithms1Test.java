import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Algorithms1Test {

    @Test
    void randomBoyName() {
        Algorithms1 a = new Algorithms1();
        a.rand.setSeed(5);
        assertEquals("Klausbjerke", a.randomBoyName());
    }
    @Test
    void randomGirlName() {
        Algorithms1 a = new Algorithms1();
        a.rand.setSeed(5);
        assertEquals("Gin", a.randomGirlName());
    }
    @Test
    void randomLetters() {
        Algorithms1 a = new Algorithms1();
        a.rand.setSeed(5);
        assertEquals("y", a.randomLetters());
    }
    @Test
    void randomCoinFlip() {
        Algorithms1 a = new Algorithms1();
        a.rand.setSeed(1);
        assertEquals("Plat", a.randomCoinFlip());
    }

}