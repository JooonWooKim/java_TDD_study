package baseball;

import java.util.List;

public class MainGame {
    public static void main(String[] args){
        CreateRandomNumber randomNumber = new CreateRandomNumber();
        Input input = new Input();
        Judge judge = new Judge();
        Playagain playagain = new Playagain();
        boolean again = true;

        while(again){
            List<Integer> computer = randomNumber.create();
            String result = "";
            while(!result.equals("3스트라이크")){
                result = judge.Judgement(computer, input.userNumber());
                System.out.println("result");
            }
            again = playagain.playagain();
        }
    }
}
