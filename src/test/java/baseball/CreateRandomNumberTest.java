package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CreateRandomNumberTest {
    CreateRandomNumber createRandomNumber;
    @Test
    @DisplayName("임의의 수 생성 테스트")
    void RandomNumberTest(){
        CreateRandomNumber createrandomNumber = new CreateRandomNumber();
        List<Integer>test = createrandomNumber.create();
        assertEquals(3, test.size());
    }
}