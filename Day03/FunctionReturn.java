package Day03;

public class FunctionReturn {
    public static double circle(int num){  // >> public static void circle(int num)에서 return값을 위해 double 로 변경
        /*
        if(num2 == 1){
            System.out.println((num * num * 3.14)/2);
        }else if(num2 == 2){
            System.out.println((num * num * 3.14)*2);
        }else{
            System.out.println(num * num * 3.14);
        }
        */

        double result = num * num * 3.14;

        return result;

    }
    public static void main(String[] args) {
        // 1. 반지름으로 원의 넓이를 구하는 함수 만들기.(정의)
        // 반지름 * 반지름 * 3.14
        double num = circle(5);

        // 함수에서 리턴할때 값을 하나 가지고 올 수 있다. -> 리턴값
        // 2. 반지름이 5인 원의 넓이를 구해서 출력
        //circle(5,0);  >> 나의 풀이
        System.out.println(num);

        // 모든 값은 '자료형' 을 가지고 있음

        // 3. 반지름이 5인 원의 넓이를 2로 나눈 값
        //circle(5,1);
        System.out.println(num/2);


        // 4. 반지름이 5인 원의 넓이를 2로 곱한 값
        //circle(5,2);
        System.out.println(num*2);

        // 리턴 -> 함수가 작업한 결과를 직접 받을 수 있음
        // 함수의 결과를 2차 가공할 수 있음
    }
}
