package JavaAssignment.Assignment7;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScissorsTest {

    @Test
    public void fight() {
        Paper p = new Paper(7);
        Rock r = new Rock(10);
        Scissors s1 = new Scissors(20);
        Scissors s2=new Scissors(15);
        //Scissors fight paper
        assertEquals("Scissors1 fight paper, which equals to 20*2-7>0, should be true", true, s1.fight(p));
        //Scissors fight rock
        assertEquals("Scissors1 fight rock, which equals to 20/2-10=0, should be false", false, s1.fight(r));
        //Scissors fight scissors
        assertEquals("Scissors1 fight scissors2, which equals to 20-15<0,should be true", true, s1.fight(s2));
    }
    
}