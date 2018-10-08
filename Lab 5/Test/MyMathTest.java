import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @org.junit.jupiter.api.Test
    void myPowIterative() {
        assertEquals(256, MyMath.myPowIterative(2,8));
    }

    @org.junit.jupiter.api.Test
    void myPowRecursion() {
        assertEquals(1953125, MyMath.myPowRecursion(5,9));
    }
}