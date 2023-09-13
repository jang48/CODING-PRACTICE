package Day08.Array;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {

        Integer[] iarr = new Integer[10]; // 왜 배열 안쓰고?? 0 10개
        // 정답 : 배열이 불편해서

//        iarr[10] = 20;

        // 배열 삭제, 추가 -> 귀찮습니다.
        int[] arr = {1,2,3,4,5};

        for(int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        // 1,2,3,4,5
        // 1,2,4,5

        // 몇개 저장했는지 알기 힘듦.
        int[] arr2 = new int[10];

        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;



        // 저장소가 꽉 차면 알아서 늘어나고,
        // 추가, 삭제도 되고,
        // 내가 몇개 저장했는지 세주기도 하고
        // 그런 애가 있으면 좋겠네


        // arr2.length -> 배열 길이를 반환
        System.out.println(arr2.length);
        System.out.println("---------- ArrayList 사용 ------------");

        // 자바가 제공하는 저장소 클래스 -> ArrayList
        // 데이터 저장에 관하여 다양한 메서드를 제공
        // java.util 패키지에 존재.
        ArrayList<Integer> a저장소 = new ArrayList<>();

        // 아래 5개의 메서드가 기본

        // 추가 - add()
        // 삭제 - remove()
        // 수정 - set()
        // 조회 - get()
        // 사이즈 - size()


        // 추가 - ArrayList에 value값을 저장. 앞에서 부터 순차적으로 저장됨
        System.out.println("=== 추가 : add(value) ===");
        a저장소.add(10);
        a저장소.add(20);
        a저장소.add(30);


        // 조회 - ArrayList가 저장하고 있는 데이터 중 index의 위치값을 반환
        System.out.println("=== 조회 : get(index) ===");
        int num = a저장소.get(1);
        System.out.println(num);
        num = a저장소.get(0);
        System.out.println(num);

        // 수정 -> ArrayList가 저장하고 있는 데이터 중 index의 값을 target으로 수정
        // 1번째 값이 20, 10으로 수정
        System.out.println("=== 수정 : set(index, target) ===");
        a저장소.set(1, 10);
        num = a저장소.get(1);
        System.out.println(num);

        // 삭제 -> ArrayList가 저장하고 있는 데이터중 index에 해당하는 데이터 삭제
        // 10, 10, 30
        System.out.println("=== 삭제 : remove(index) ===");
        a저장소.remove(1);
        num = a저장소.get(1);
        System.out.println(num);

        // 사이즈 -> ArrayList가 저장하고 있는 데이터의 개수
        System.out.println("=== 사이즈 : size() ===");
        int size = a저장소.size();
        System.out.println(size);

    }
}

class 저장소<T> {
    private Object[] datas;
    int lastIdx;

    저장소() {
        datas = new Object[3];
        lastIdx = 0;
    }

    public void setData(T data) {
        this.datas[lastIdx] = data;
        lastIdx++;
    }

    public T getData(int idx) {
        return (T)datas[idx];
    }
}