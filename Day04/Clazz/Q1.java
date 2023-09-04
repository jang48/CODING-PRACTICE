package Day04.Clazz;

public class Q1 {
    // 문제 : 자동차가 3번 달리게 해주세요.
    // 출력 : 자동차가 달립니다.
    public static void main(String[] args) {
        //v1. 1개의 자동차가 3번 달리게 해주세요.
        System.out.println("자동차가 달립니다.");
        //v2. 3개의 자동차가 1번씩 달리게 해주세요.

        System.out.println("자동차가 달립니다.");
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.


        // 문제 : 자동차 객체를 담을 변수를 만들어주세요.
        // 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
        // 각 자동차가 자신의 최고속력으로 달리게 해주세요.


        Car a = new Car();
        a.Speed(220);
        a.Speed(250);
    }

}


class Car {
    public void Speed(int a) {
        System.out.printf("자동차가 최대속력 %dkm로 달립니다.\n",a);
    }
}

