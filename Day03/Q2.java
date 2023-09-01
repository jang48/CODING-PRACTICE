package Day03;

public class Q2 {

    public static void introduce(){
        int i = 1;
        while(i<= 10){
        System.out.println("안녕하세요. 저는 20살 홍길동입니다.!");
        i++;
        }
    }

    public static void introduce1(int num){
        int i = 1;
        while(i<= num){
            System.out.println("안녕하세요. 저는 20살 홍길동입니다.!");
            i++;
        }
    }
    public static void greeting1(int num1){
        if(num1 == 2){
            System.out.println("하이~");
        }else if(num1 == 3){
            System.out.println("봉쥬");
        }else if(num1 == 1){
            System.out.println("안녕하세요");
        }
    }
    public static void greeting2(int num1, int num2){
        int i = 1;

        if(num1 == 2){
            while(i<= num2){
                System.out.println("하이~");
                i++;
            }
        }else if(num1 == 3){
            while(i<= num2){
                System.out.println("봉쥬");
                i++;
            }
        }else if(num1 == 1){
            while(i<= num2){
                System.out.println("안녕하세요");
                i++;
            }
        }
    }
    public static void main(String[] args) {
        introduce();

        introduce1(3);

        introduce1(5);

        introduce1(10);


        // 매개변수는 인사말 언어를 의미
        // 1은 한국어, 2는 영어, 3은 프랑스어

        greeting1(2);
        // 하이~

        greeting1(3);
        // 봉쥬

        greeting1(1);
        // 안녕하세요


        // 첫번째는 언어, 두번째는 횟수를 의미

        greeting2(1, 3);
        // 안녕하세요
        // 안녕하세요
        // 안녕하세요

        greeting2(2, 5);
        // 하이~
        // 하이~
        // 하이~
        // 하이~
        // 하이~

        greeting2(3, 7);
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬

    }
}
