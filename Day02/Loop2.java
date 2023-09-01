package Day02;

public class Loop2 {
    public static void main(String[] args) {
        // 2중 반복문

        // 1. 1 ~ 5까지 3번 출력
        for(int j = 1; j < 4; j ++) {
            System.out.printf("=== %d회차 ===\n",j);
            for (int i = 1; i < 6; i++) {
                System.out.println(i);
            }
        }

        // 2. 직사각형 만들기
        // *
        for(int i = 1; i < 4; i++){
            for (int j = 1; j < 6; j++){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
