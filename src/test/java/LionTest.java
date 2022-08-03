import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensReturnFelineGetKittens () throws Exception {
        Lion lion = new Lion("Самец", feline);

        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        int expected = 1;

        assertEquals(expected,actual);
    }

    @Test
    public void getFoodReturnFelineGetFood () throws Exception {
        Lion lion = new Lion("Самка", feline);

        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expected,actual);
    }

    @Test (expected = Exception.class)
    public void LionConstructorReturnExceptionWithIncorrectSexText () throws Exception {
        Lion lion = new Lion("asd", feline);
    }
}
