package Day01;

public class Exam_02 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // 여기서 부터
        int c = a;
        a = b;
        b = c;

        // 여기까지 수정 가능

        System.out.println("a : " + a);
        // 출력 : a : 10
        System.out.println("b : " + b);
        // 출력 :  b : 5
    }
}
