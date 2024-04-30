package programmers;
import java.util.*;
public class Day0430 {
//    문제 설명
// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
// 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

// N	answer
//123	6
    public static void main(String[] args) {
        int answer = solution(123);
        System.out.println(answer);
    }

    public static int solution(int n) {
        int answer = 0;
        String a = String.valueOf(n);
        for(int i = 0; i < a.length(); i ++){
            answer += Integer.parseInt(a.substring(i,i+1));
        }
        return answer;
    }

    // 다른사람 풀이

//    public String solution(String cipher, int code) {
//       int answer = 0;
//        while(n!=0){
//            //num을 10으로 나눈 나머지를 sum에 더한다.
//            answer += n%10;
//            //num을 10으로 나눈 값을 다시 num에 저장한다.
//            n /= 10;
//        }
//
//        return answer;
//    }

}
