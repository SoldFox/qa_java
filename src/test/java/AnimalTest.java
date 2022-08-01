import com.example.Animal;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void getFamilyReturnCorrectValue(){
        Animal animal = new Animal();

        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

        assertEquals(expected,actual);
    }

    @Test
    public void getFoodReturnValueOfHerbivore() throws Exception{
        Animal animal = new Animal();

        List<String> actual = animal.getFood("Травоядное");
        List<String> expected = List.of("Трава", "Различные растения");

        assertEquals(expected,actual);
    }

    @Test (expected = Exception.class)
    public void getFoodReturnExceptionWithIncorrectAnimalKindValue() throws Exception{
        Animal animal = new Animal();

        animal.getFood("asd");
    }
}