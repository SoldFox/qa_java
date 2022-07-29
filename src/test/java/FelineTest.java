import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatReturnCorrectList () throws Exception {
        Feline feline = new Feline();


        List<String> actual = feline.eatMeat();
        List<String> expected = feline.getFood("Хищник");
        System.out.println(actual);
        assertEquals(expected,actual);
    }

    @Test
    public void getFamilyReturnCorrectValue () throws Exception {
        Feline feline = new Feline();

        String actual = feline.getFamily();
        String expected = "Кошачьи";

        assertEquals(expected,actual);
    }

    @Test
    public void getKittensPureReturnCorrectValue () {
        Feline feline = new Feline();

        int actual = feline.getKittens();
        int expected = 1;
        System.out.println(actual);
        assertEquals(expected,actual);
    }

    @Test
    public void getKittensValidInt () {
        Feline feline = new Feline();

        int actual = feline.getKittens(4);
        int expected = 4;
        System.out.println(actual);
        assertEquals(expected,actual);
    } // string, double
}
