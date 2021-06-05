import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class MathUtilTestCase {

    MathUtil mathUtil;

    @BeforeEach
    void init(){
        mathUtil = new MathUtil();
    }

    @Test
    @DisplayName("Add two int numbers, should return the correct  sum")
     public void addTwoNumberstest() {
        Box<Integer> exp = new Box<>(6);
        Box<Integer> act = new Box<>(mathUtil.addTwoNumbers(2,4));

        assertEquals(exp.getValue(),act.getValue(),"Add two int numbers, should return the correct  sum");
    }

    @Test
    @DisplayName("Given is a circle radius, should calculate the area of a circle")
    public void circleAreatest() {
        Box<Double> exp = new Box<>(314.1592653589793);
        Box<Double> act = new Box<>(mathUtil.circleArea(10));

        assertEquals(exp.getValue(),act.getValue(),"Given is a circle radius, should calculsate the area of a circle");
    }

}