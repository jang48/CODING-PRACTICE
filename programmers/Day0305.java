package programmers;

import java.util.ArrayList;

public class Day0305 {

    // n의 배수 고르기
    // 정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
    // numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.


    // n	        numlist	                  result
    // 3	[4, 5, 6, 7, 8, 9, 10, 11, 12]	[6, 9, 12]
    public static void main(String[] args)  {
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] answer = test1(3,numlist);

        for (int value : answer) {
            System.out.print(value + " ");
        }
    }

    public static int[] test1(int n, int[] numlist){
        ArrayList<Integer> answerList = new ArrayList<>();

        for(int num : numlist){
            if(num % n == 0){
                answerList.add(num);
            }
        }

        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }

}
