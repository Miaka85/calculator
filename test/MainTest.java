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
    void addition_additionWithZeroTest() {
        double A = 33;
        double B = 0;
        Double testResult = Main.addition(A, B);
        assertEquals(33, testResult);
    }

    @Test
    void addition_additionUnexpectedValueTest() {
        double A = 33;
        double B = 22;
        Double testResult = Main.addition(A, B);
        assertNotEquals(99, testResult);
    }

    @Test
    void addition_additionNegativeValueTest() {
        double A = -33;
        double B = 44;
        Double testResult = Main.addition(A, B);
        assertEquals(11, testResult);
    }

    //Testa med noll som value//

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

    @Test
    void addition_subtraktionWithZeroTest() {
        double A = 33;
        double B = 0;
        Double testResult = Main.subtraktion(A, B);
        assertEquals(33, testResult);
    }

    @Test
    void subtraktion_subtraktionUnexpectedValueTest() {
        double A = 33;
        double B = 22;
        Double testResult = Main.subtraktion(A, B);
        assertNotEquals(99, testResult);

    }

    @Test
    void subtraktion_subtraktionNegativeValueTest() {
        double A = -33;
        double B = 44;
        Double testResult = Main.subtraktion(A, B);
        assertEquals(-77, testResult);
    }


    @Test
    void multiplikaton_multipikationTest() {
        double A = 33;
        double B = 22;
        Double testResult = Main.multiplikation(A, B);
        assertEquals(726, testResult);
    }

    @Test
    void multiplikation_multiplikationWithZeroTest() {
        double A = 33;
        double B = 0;
        Double testResult = Main.multiplikation(A, B);
        assertEquals(0, testResult);
    }

    @Test
    void multiplikation_multiplikationUnexpectedValueTest() {
        double A = 33;
        double B = 22;
        Double testResult = Main.multiplikation(A, B);
        assertNotEquals(99, testResult);
    }

    @Test
    void multiplikation_multiplikationNegativeValueTest() {
        double A = -33;
        double B = 44;
        Double testResult = Main.multiplikation(A, B);
        assertEquals(-1452, testResult);
    }

    @org.junit.jupiter.api.Test
    void division() {
    }

    @Test
    void division_divisionTest() {
        double A = 33;
        double B = 22;
        Double testResult = Main.division(A, B);
        assertEquals(1.5, testResult);
    }

  /*  @Test
    void division_divisionWithZeroTest() {
        double A = 33;
        double B = 0;
        Double testResult = Main.division(A, B);

        assertEquals (, testResult);
    }*/

    @Test
    void division_divisionUnexpectedValueTest() {
        double A = 33;
        double B = 22;
        Double testResult = Main.division(A, B);
        assertNotEquals(99, testResult);
    }

    @Test
    void division_divisionNegativeValueTest() {
        double A = -33;
        double B = 44;
        Double testResult = Main.division(A, B);
        assertEquals(-0.75, testResult);
    }
}
 /*   @Test
    void main_styrFunktionTest() {
        double A = 33;
        double B = 44;
         Main mainObject = new Main();
        String raknesatt == 1;
        Double raknesatt = Main.main(A, B);
        assertEquals(77, raknesatt);

        //räkna ut expected på alla räknesätten. kolla att de har adderats
    }  //Valet via textfil
    //om raknesatt 1 är lika med ett så ska A och B adderas*/
