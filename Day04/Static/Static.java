package Day04.Static;

public class Static {
    public static void main(String[] args) {

       Person p1 =  new Person();
       Person p2 =  new Person();

       p2.age = 30;
       p2.name = "홍길동";

       p1.age = 40;
       p1.name = "이순신";
       p1.avgAge = 50;

       p1.getLife();
       p2.getLife();
    }
}

class Person {
    // 인류 평균 나이는 모든 사람이 동일하게 공유해야 하는 값.
    // 객체들이 공유해야 하는 자원에는 static을 붙인다.
    // statice 자료형
    static int avgAge;  // 모든객체들은 class에 있는 값을 공유함
    int age;
    String name;

    // 객체들이 공유해야하는 데이터에 Static을 붙인다.
    //  static은 non-static(static이 붙지않은것)을 사용할 수 없다.
    // 함수에는 일반적으로 static을 붙이지 않는다.
    // 단, main 함수는 예외.

    public void getLife(){   // public static getLife() ->
        System.out.println("당신의 남은 수명은 약 :"+ (avgAge - age)+ "입니다.");
    }
}