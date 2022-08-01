import com.example.LionAlex;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class LionAlexTest {

    @Test
    public void getKittensReturnCorrectValue() throws Exception{
        LionAlex Alex = new LionAlex();

        int actual = Alex.getKittens();
        int expected = 0;

        assertEquals(expected,actual);
    }

    @Test
    public void getFriendsReturnCorrectValue() throws Exception{
        LionAlex Alex = new LionAlex();

        List<String> actual = Alex.getFriends();
        List<String> expected = List.of("Марти", "Глория", "Мелман");

        assertEquals(expected,actual);
    }

    @Test
    public void getPlaceOfLivingReturnCorrectValue() throws Exception{
        LionAlex Alex = new LionAlex();

        String actual = Alex.getPlaceOfLiving();
        String expected = "Нью-Йоркский зоопарк";

        assertEquals(expected,actual);
    }
}
