package Day01;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Variable {
    public static void main(String[] args) {
        // 홍길동의 나이를 저장했다가 필요할 때 사용

        // 값을 저장하는 상자(그릇) - 변수
        // 변수를 만들때는 크기와 모양 결정
        // 변수를 만들때는 변수의 이름이 필요

        // 값 -> 숫자(int), 문자(String)

        /*/
        int age; // 그릇을 만들고
        age = 25; // 그릇에 저장
         */

        int age = 25; // 그릇을 만듦과 동시에 값 저장.

        // 변수 사용시 주의할 점
        // 1. 같은 이름으로 두개 이상 변수 만들지 않기
        // 2. 숫자나 특수문자로 시작하는 이름은 안됨. 공백도 안됨.


        // 홍길동의 나이를 한번만 사용해서 자기소개 5번 출력

        age = 26;
        System.out.println("안녕하세요 저는 " + age + "살 홍길동입니다.");

        //변수 사용법 2
        // 변수 재활용 가능(단, 하나의 값만 저장 가능)
        int num = 10; // int를 저장하는 num이라는 이름의 변수 생성하고 10 저장

        System.out.println(num);  // 10출력

        num = 20; // num이라는 이름의 변수를 가져와서 기존의 10 버리고, 20을 저장

        Solution a = new Solution();


    }
}

class Solution {
    //정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
    //정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
    public double solution(int[] numbers) {
        double sum = 0;
        double count = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            count++;
        }
        double answer = sum / count;
        return answer;
    }
}