package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    public List<Integer> userNumber() {
        System.out.println("숫자를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        List<Integer> userNumber = new ArrayList<>();
        String input = scanner.next();

        for (String number : input.split("")) {
            userNumber.add(Integer.parseInt(number));
        }
        return userNumber;
    }
}
