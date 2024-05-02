package programmers;

public class Day0501 {
//    문제 설명
// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
// n	return
//12345	[5,4,3,2,1]
    public static void main(String[] args) {
        int[] answer = solution(12345);
        System.out.println(answer);
    }

    public static int[] solution(long n) {
        String a = String.valueOf(n);
        int[] answer = new int[a.length()];
        int j = a.length() - 1;
        for (int i = 0; i < a.length(); i++) {
            answer[j] += Integer.parseInt(a.substring(i, i + 1));
            j--;
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
