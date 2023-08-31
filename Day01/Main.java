package Day01;

class Main {
    public static void main(String[] args) {
        //숫자 출력
        System.out.println(100);

        //문자 출력
        System.out.println("Hello");

        // 문자, 숫자 처럼 값의 유형이 다르면 기능도 다르다.
        // 자료형이라고 부른다.

        //숫자 -> int
        //문자 -> String

        //문자의 경우 \n을 넣으면 줄이 바뀐다.
        //\n -> 줄바꿈 문자!! 문자형!!

        System.out.println("안녕하세요\n반갑습니다.");

        //문자 포맷을 이용한 출력
        System.out.printf("%d살 홍길동입니다.\n", 100);

        //안녕하세요 저는 23살 홍길동입니다. 5번 출력
        System.out.println("안녕하세요 저는 23살 홍길동입니다.");
        System.out.printf("안녕하세요 저는 %d살 %s입니다.\n",23,"홍길동");
        int a = 23;
        String b = "홍길동";
        System.out.printf("안녕하세요 저는" + a + "살" + b + "입니다.");

    }

}
