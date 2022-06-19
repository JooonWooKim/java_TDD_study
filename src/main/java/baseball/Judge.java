package baseball;

import java.util.List;

public class Judge {
    CompareNumber compareNumber = new CompareNumber();

    public String Judgement(List<Integer>computer, List<Integer>user){
        int total = compareNumber.equalsMany(computer, user);
        int strike = compareNumber.strike(computer, user);
        int ball = total - strike;

        if(total == 0){
            return "nothing";
        }else if(strike == 0){
            return ball + "ball";
        } else if (ball == 0) {
            return strike + "스트라이크";
        }
        return ball + "ball" + strike +"strike";
    }
}
