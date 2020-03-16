import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TournamentTest {


    Tournament ref = new Tournament();

    @BeforeAll
    static void before(){
        System.out.println("Tests: ");
    }
    @BeforeEach
    void setUp() {
        ref = new Tournament();
        System.out.println("Running test: ");
    }
    @Test
    public void testCurrentList() {
        assertEquals(8, Tournament.fighterList.size());
    }
}