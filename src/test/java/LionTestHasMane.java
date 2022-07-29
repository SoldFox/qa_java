import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestHasMane {
    private final String sex;
    private static Feline feline;
    boolean expected;

    public LionTestHasMane (String sex, Feline feline, boolean expected) {
        this.sex = sex;
        this.feline = feline;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getMane() {
        return new Object[][] {
            {"Самец", feline, true},
            {"Самка", feline, false}
        };
    }

    @Test
    public void doesHaveManeReturnTrue () throws Exception {
        Lion lion = new Lion(sex, feline);

        boolean actual = lion.doesHaveMane();

        System.out.println(actual);
        System.out.println(expected);
        assertEquals(expected,actual);
    }


}
