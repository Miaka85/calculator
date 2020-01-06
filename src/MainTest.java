import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void addition_additionTest() {
        double A = 33;
        double B = 22;
        Double testResult = Main.addition(A, B);
        assertEquals(55, testResult);
    }
    @Test
    void addition_additionBadValueTest() {
        double C = 33;
        double B = 22;
        Double testResult = Main.addition(C, B);
        assertNotEquals(99, testResult);
        }
    @Test
    void addition_additionNegativeValueTest() {
        double A = -33;
        double B = 44;
        Double testResult = Main.addition(A, B);
        assertEquals(11, testResult);
    }

      /*  CustomerRegistration customerRegistration = new CustomerRegistration();
        int start = customerRegistration.customers.size();
        customerRegistration.customers.add(new Customer("Joel", "Ljungskile"));
        assertEquals(start + 1, customerRegistration.customers.size());*/


       /* String testInput = "mia";              //Tests that the first letter changes to upperCase
        String testResult = Main.firstLetterToUpperCase(testInput);
        assertEquals("Mia", testResult);*/


    @Test
        void main() {
    }

    @Test
    void subtraktion_subtraktionTest() {
            double A = 33;
            double B = 22;
            Double testResult = Main.subtraktion(A, B);
            assertEquals(11, testResult);
    }

    @org.junit.jupiter.api.Test
    void multiplikation() {
    }

    @org.junit.jupiter.api.Test
    void division() {
    }
}