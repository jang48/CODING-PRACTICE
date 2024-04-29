package programmers;

public class Day0429 {
//    문제 설명
//  문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
//  제한 조건
//  s의 길이는 1 이상 5이하입니다.
//  s의 맨앞에는 부호(+, -)가 올 수 있습니다.
//  s는 부호와 숫자로만 이루어져있습니다.
//  s는 "0"으로 시작하지 않습니다.

// 예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
    public static void main(String[] args) {
        int answer = solution("1234");
        System.out.println(answer);
    }

    public static int solution(String s) {
        return Integer.parseInt(s);
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
