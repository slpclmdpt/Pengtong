package JavaAssignment.Assignment7;

import org.junit.Test;

import static org.junit.Assert.*;

public class RockTest {

    @Test
    public void fight() {
        Paper p = new Paper(7);
        Rock r1 = new Rock(10);
        Rock r2=new Rock(15);
        Scissors s=new Scissors(20);
        //Rock fight paper
        assertEquals("Rock1 fight paper, which equals to 10/2-7<0, should be false", false, r1.fight(p));
        //Rock fight rock
        assertEquals("Rock1 fight rock2, which equals to 10-15<0, should be false", false, r1.fight(r2));
        //Rock fight scissors
        assertEquals("Rock1 fight scissors, which equals to 10*2-20=0,should be false", false, r1.fight(s));
    }
}