package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateRandomNumber {

    //임의의 수를 생성하는 메소드
    public int randomNumber(){
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

    //컴퓨터 숫자를 생성하는 메소드
    public List<Integer> create(){
        List<Integer> computerNumber = new ArrayList<>();
        while(computerNumber.size() < 3){
            int randomNumber = randomNumber();
            if(computerNumber.contains(randomNumber)){
                continue;
            }else{
                computerNumber.add(randomNumber);
            }
        }
        return computerNumber;
    }
}
