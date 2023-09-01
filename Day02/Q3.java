package Day02;

public class Q3 {
    public static void main(String[] args) {
        // 문제 : 구구단 작성
        // 조건 : 짝수번째만 곱하기
        /* 출력예시 :

          2 * 2 = 4
          2 * 4 = 8
          2 * 6 = 12
          2 * 8 = 16

          ...

          9단까지 이런식으로 나오면 됩니다.

        */
        for(int i = 2; i <10; i++){
            System.out.printf("=== %d단 ===\n", i);
            for(int j = 2; j < 10; j++){
                if( j % 2 == 0 ){
                    System.out.printf("%d * %d = %d\n" , i, j , i*j );
                }
            }
        }

        // 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.
        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        /*  입출력 예시
        n은 4, m은 20, limit는 10

        5 * 2 = 10
        5 * 4 = 20
        5 * 6 = 30
        5 * 8 = 40
        5 * 10 = 50
        */
        for(int s = 2; s < 21; s++){
            if(s % 2 != 0){
                System.out.printf("=== %d단 ===\n", s);
                for(int c = 2; c < 11; c++){
                    if(c % 2 == 0){
                        System.out.printf("%d * %d = %d\n", s, c, s*c);
                    }
                }
            }
        }


        // 출력
        /*
        높이 : [3]

        *
        **
        ***


        */
        for(int x = 0; x < 4; x++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


        /*

        높이 : [5]

        *
        **
        ***
        ****
        *****

        */

        for(int x = 0; x < 6; x++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        /*

        높이 : [7]

        *
        **
        ***
        ****
        *****
        ******
        *******

        */

        for(int x = 0; x < 8; x++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


        // 출력
        /*

        높이 : [3]

          *
         **
        ***

        */

        for(int i=1;i<4;i++){
            for(int j=3;j>0;j--){
                if(i<j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }

        /*

        높이 : [5]

            *
           **
          ***
         ****
        *****

        */
        for(int i=1;i<6 ;i++){
            for(int j=5;j>0;j--){
                if(i<j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
        /*

        높이 : [7]

              *
             **
            ***
           ****
          *****
         ******
        *******

        */

        for(int i=1;i<8 ;i++){
            for(int j=7;j>0;j--){
                if(i<j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }


        int y = 3;
        // 출력
        /*
        1부터 시작해서 2씩 증가

         *     System.out.print("*"); >> for(int i = 0 ;i <1; i++)  System.out.println(" ");
         ***    System.out.print("*"); / System.out.print("*"); / System.out.print("*");  >> for(int i = 0 ;i <3; i++)  System.out.println(" ");
         *****   System.out.print("*"); /  System.out.print("*"); / System.out.print("*"); / System.out.print("*"); / System.out.print("*");  >> for(int i = 0 ;i <4; i++)  System.out.println(" ");

         //공백의 개수 -> 높이 - line번호
           *     3 - 1라인
          ***    3 - 2라인
         *****   3 - 3라인

         */

        int lineNum = 1;

        for(int j = 1; j < y*2; j += 2){
            //공백그리기
            for(int i = 0; i < y-lineNum; i++){
                System.out.print(" ");}

            //별그리기
            for(int i = 0; i < j; i++){
                System.out.print("*");}

            System.out.println(); // 줄바꿈
            lineNum++;
        }



        y = 5;
        // 출력
        /*


         *
         ***
         *****
         *******
         *********


         */

        y = 7;
        // 출력
        /*


         *
         ***
         *****
         *******
         *********
         ***********
         *************


         */
    }

}
