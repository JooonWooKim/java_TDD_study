package stringcal;

import java.io.IOException;
import java.util.Scanner;

public class StringCalculator {

     StringCalculator stringCalculator;

    //더하기
    public int add(int i, int j){
        return i+j;
    }

    //빼기
    public int subtract(int i, int j){
        return i-j;
    }

    //곱하기
    public int multiply(int i, int j){
        return i*j;
    }

    //나누기(몫이 0일경우 Exception)
    public int divide(int i, int j) {
        try {
            return i / j;
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        return 0;
    }

    //입력 값이 null이거나 빈 공백 문자일 경우 IllegalArgumentException throw
    public void notNull(String str){
        if(str == null || str == "")
            throw new IllegalStateException("입력값을 확인해주세요.");
    }

    //문자열 자르는 메서드
    public String[] splitString(String str){
        return str.split("");
    }

    //문자열을 숫자로 변경하는 메서드
    public int changeString(String str){
         return Integer.parseInt(str);
    }

    //문자열을 계산하는 메서드
    public int calculateString(String[] str){
        int result = changeString(str[0]);
        for(int i = 0; i < str.length - 2; i += 2){
            result = stringCalculator(result, str[i + 1].charAt(0), changeString(str[i + 2]));
        }
        return result;
    }

    private int stringCalculator(int firstValue, char operetor, int secondValue) {
        if(operetor == '+')
            return add(firstValue, secondValue);
        if(operetor == '-')
            return subtract(firstValue, secondValue);
        if(operetor == '*')
            return multiply(firstValue, secondValue);
        if(operetor == '/')
            return divide(firstValue, secondValue);
        else System.out.println("잘못된 값 입력");
            throw new RuntimeException();
    }


}
