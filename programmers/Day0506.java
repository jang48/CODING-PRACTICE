package programmers;

import java.util.Arrays;

public class Day0506 {
//    문제 설명
// 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
// 예를들어 n이 118372면 873211을 리턴하면 됩니다.
// n	return
//118372	873211
    public static void main(String[] args) {
        long answer = solution(118372);
        System.out.println(answer);
    }

    public static long solution(long n) {
        String numStr = String.valueOf(n);
        char[] digits = numStr.toCharArray();   // sort 함수에 넣기 위해 String 값 chat배열로 변경
        Arrays.sort(digits);
        String result = new StringBuilder((new String(digits))).reverse().toString();  // 내림차순으로 정렬된 문자열(digits) 거꾸로 뒤집기
        long answer = Long.parseLong(result); // String 값 Long값으로 형 변환
        return answer;
    }


    // 다른사람 풀이

//    public long solution(long n) {
//        String[] list = String.valueOf(n).split("");   // split으로 String 값 배열로 넣기
//        Arrays.sort(list);
//
//        StringBuilder sb = new StringBuilder();
//        for (String aList : list) sb.append(aList);   // 배열 값 append로 연결하기
//
//        return Long.parseLong(sb.reverse().toString()); // StringBuilder을 String으로 변환하려면 toString() 필수
//  }

}
