package programmers;

public class Day0324 {
//    문제 설명
//    군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
//    암호화된 문자열 cipher를 주고받습니다.
//    그 문자열에서 code의 배수번째 글자만 진짜 암호입니다.
//    문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.

//    cipher	                code	result
//"dfjardstddetckdaccccdegk"	4	    "attack"
    public static void main(String[] args) {
        String answer = solution("dfjardstddetckdaccccdegk",4);
        System.out.println(answer);
    }

    public static String solution(String cipher, int code) {
        String answer = "";

        for(int i = 1; i <= cipher.length(); i++){
            if(i%code == 0){
                answer += cipher.charAt(i-1);
            }
        }

        return answer;
    }

// 다른사람 풀이

//    public String solution(String cipher, int code) {
//        String answer = "";
//
//        for (int i = code; i <= cipher.length(); i = i + code) {
//            answer += cipher.substring(i - 1, i);
//        }
//
//        return answer;
//    }
}
