package JavaAssignment.Assignment7;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaperTest {

    @Test
    public void fight() {
        Paper p1 = new Paper(7);
        Paper p2 = new Paper(6);
        Rock r = new Rock(10);
        Scissors s = new Scissors(20);
        //paper fight paper
        assertEquals("Paper1 fight paper2, which equals to 7-6>0, should be true", true, p1.fight(p2));
        //paper fight rock
        assertEquals("Paper1 fight rock, which equals to 7*2-10>0, should be true", true, p1.fight(r));
        //paper fight scissors
        assertEquals("Paper1 fight scissors, which equals to 7/2-20<0,should be false", false, p1.fight(s));
    }
}