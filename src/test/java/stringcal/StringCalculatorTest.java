package stringcal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    @DisplayName("더하기 테스트")
    void add() {
        assertEquals(5, stringCalculator.add(2,3));
    }

    @Test
    @DisplayName("뺄셈 테스트")
    void subtract() {
        assertEquals(1, stringCalculator.subtract(3,2));
    }

    @Test
    @DisplayName("곱셈 테스트")
    void multiply() {
        assertEquals(6, stringCalculator.multiply(2,3));
    }

    @Test
    @DisplayName("나눗셈 테스트")
    void divide() {
        assertEquals(3, stringCalculator.divide(6,2));
    }

    @Test
    @DisplayName("문자열 나누는 테스트")
    void splitStringTest(){
        String str = "1+2";
        String[] result = {"1", "+", "2"};
        assertThat(result).isEqualTo(stringCalculator.splitString(str));
    }

    @Test
    @DisplayName("문자열 테스트")
    void StringTest(){
        String str = "1+3+5+7+9";
        String[] result = stringCalculator.splitString(str);
        int num = 25;
        assertEquals(num, stringCalculator.calculateString(result));
    }

}