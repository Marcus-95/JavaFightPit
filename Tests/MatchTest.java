import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MatchTest {

    @Before
    public void matchtesting(){
        Fighter fighter1 = new Fighter("","");
        Fighter fighter2 = new Fighter("","");
        m = new Match(fighter1,fighter2);

    }
        Match m;
/*

// This test "kinda works". Its running but its waiting on input.
    @Test
    public void testGetWinner(){
        Fighter actual = m.getWinner();
        assertNotNull(actual);
    }

 */
}
