import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class App {
    public static void main(String[] args) throws Exception {
        String result;
        result = signCheck(10,5);
        System.out.println(result);
    }

    static String signCheck(int number1, int number2){
        int number3;
        String result;
        number3 = number1 - number2;
        if (number3 > 0) {
            result = "POSITIVE";
        }
        else if (number3 == 0) {
            result = "EQUAL";
        }
        else {
            result = "NEGATIVE";
        }
        return result;
    }

    @Test
    public void testSignCheck(){
        assertEquals("POSITIVE",signCheck(10,5));
        assertEquals("NEGATIVE",signCheck(2,5));
        assertEquals("EQUAL",signCheck(-2,-2));
    }
}



















