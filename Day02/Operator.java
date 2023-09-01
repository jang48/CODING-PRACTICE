package Day02;
public class Operator {
    public static void main(String[] args) {

        // 나누기 할 때 -> 정수 / 정수 = 정수
        // 컴퓨터는 정수끼리, 실수끼리 계산 가능(1, 1.0은 완전 다른 수)
        // 정수 - int. 실수 -double
        System.out.println(1.0/2.0);

        // 나머지 구하기
        // 배수, 짝수 구할 때 사용, 주기 표현
        System.out.println(2 % 1);

        // 비교 연산자
        System.out.println( 51 > 10);
        System.out.println( 5 < 10);
        System.out.println( 51 >= 10);
        System.out.println( 5 <= 10);
        System.out.println( 51 == 10);
        System.out.println( 5 != 10);

        // 비교연산자의 결과는 논리값(맞다/틀리다)
        // 논리값 -> boolean

        //증감연산자
        System.out.println("===증감연산자===");
        int num = 10;
        System.out.println(num+10);

        // num의 값을 5 감소
        System.out.println(num-5);

        num -= 5;
        System.out.println(num);

        // num의 값을 2배 증가
        num *= 2;
        System.out.println(num);

        // num의 값을 절반으로 감소
        num /= 2;
        System.out.println(num);

        // 1증가
        num += 1;
        num ++;


    }

}
