package baseball;

import java.util.List;

public class CompareNumber {

    //스트라이크를 세는 메소드
    public int strike(List<Integer> computer, List<Integer> user){
        int strike = 0;
        for(int i=0; i<user.size(); i++){
            if(computer.get(i) == user.get(i)){
                strike += 1;
            }
        }
        return strike;
    }
}
