import org.junit.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TournamentTest {
    Tournament ref = new Tournament();
    Fighter fighterRef = new Fighter("name","winshout");

    @Test
    public void testCurrentList() {
        int expected = 8;
        int actual = ref.fighterList.size();

        assertEquals(expected, actual);
    }

    @Test
    public void testNotNullList(){
        List<Fighter> actual = ref.fighterList;

        assertNotNull(actual);
    }

    @Test
    public void testHealth(){
       int expected = 50;
       int actual = fighterRef.health;

       assertEquals(expected,actual);
    }
}