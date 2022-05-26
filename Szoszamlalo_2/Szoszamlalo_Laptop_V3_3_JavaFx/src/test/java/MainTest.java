/*import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main underTest;
    @BeforeEach
    void setUp() {
        underTest = new Main();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
        assertEquals(134,134) ;
    }

}

*/

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;




import static org.junit.jupiter.api
        .Assertions.*;

class MainTest {

    private Main underTest;
    @BeforeEach
    void setUp() {
        underTest = new Main();
    }

    @AfterEach
    void tearDown() {
    }



   // @org.junit.jupiter.api.Test

    @Test
    void testSzokeresoNagyFile() {
        //Main underTest = new Main();
        assertEquals(134, underTest.Szokereso("src/test/java/romeo").get("love"));
    }

    @Test
    void testSzokereso2() {
        //Main underTest = new Main();
        assertEquals(1, underTest.Szokereso("src/test/java/Probaszokereso").get("egy"));
    }

    @Test
    void testSzokeresoNincsBenne() {
        //Main underTest = new Main();
        assertEquals(null, underTest.Szokereso("src/test/java/Probaszokereso").get("ey"));
    }

    @Test
    void testKisbetuNagybetu() {
        assertEquals(5,underTest.Szokereso("src/test/java/KisbetuNagybetu").get("egy"));
    }

    @Test
    void testIrasjelek() {
        assertEquals(8,underTest.Szokereso("src/test/java/Irasjelek").get("egy"));
    }




}