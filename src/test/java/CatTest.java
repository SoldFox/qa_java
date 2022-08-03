import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundReturnCorrectValue () {
        Cat cat = new Cat(feline);

        String actual = cat.getSound();
        String expected = "Мяу";

        assertEquals("Метод должен возвращать: Мяу",expected, actual);
    }

    @Test
    public void getFoodReturnCorrectList () throws Exception {
        Cat cat = new Cat(feline);

        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        assertEquals("Метод должен возвращать данные метода: predator.eatMeat()",expected,actual);
    }
}
