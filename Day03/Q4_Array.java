package Day03;

public class Q4_Array {
    public static void main(String[] args) {
        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        // 배열을 두번 출력해주세요.
        int[] arr2 = {1,2,3,4,5};
        for(int j = 0; j <= 1; j++) {
            for (int i = 0; i < arr2.length; i++) {
                System.out.println(arr2[i]);
            }
        }

        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
        int[] arr3 = {10, 20, 30, 40, 50};
        for(int i = 4; i >=0; i--){
            System.out.println(arr3[i]);
        }

        // 배열 안의 숫자들의 합을 구해주세요.
        int[] arr4 = {10, 20, 30, 40, 50};

		/*
		// 아래 4줄은 위 1줄과 같은 의미 입니다.
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        */
        int sum = 0;
        for(int i = 0; i <arr4.length; i++){
            sum+= arr4[i];
        }
        System.out.println(sum);
    }
}
