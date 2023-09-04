package Day04.Clazz;

public class Clazz {
    public static void main(String[] args) {
        // 1. 클래스가 함수를 모아놓는 느낌
        // 2. 변수를 모아놓는 느낌

        // 변수
        // 사람 표현 -> 이름, 나이, 거주지

        String name = "홍길동";
        String home ="대전";
        int age = 20;

        System.out.printf("%d살 %s사는 %s입니다.\n", age, home, name);

        String name2 ="이순신";
        String home2 = "서울";
        int age2 = 40;

        System.out.printf("%d살 %s사는 %s입니다.\n", age2, home2, name2);

        // 배열
        // 키, 몸무게, 나이`
        // 175, 60, 22

        int[] person1 = {175, 60, 22};
        int[] person2 = {185, 70, 22};

        System.out.printf("키 : %d, 몸무게 : %d, 나이 : %d \n", person1[0], person1[1], person1[2]);

        // 배열을 사용하면 -> 같은 자료형 만 표현 가능. 0번째, 1번빼.. 각각 무엇을 가리키는지 알기가 어렵다.

        // 객체 -> 관련된 데이터를 묶는다.
        // int 크기 - 4
        // String 크기 - 8


        Person arr = new Person();// >  int[] arr = new int[3];

        arr.age = 20;
        arr.home = "대전";
        arr.name = "홍길동";

        Person arr2 = new Person(); // new < 인스턴스(객체)

        arr2.age = 30;
        arr2.home = "서울";
        arr2.name = "이순신";

        // 중복 해결방안 -> 함수 생성
        System.out.printf("%d살 %s사는 %s입니다.\n", arr.age, arr.home, arr.name);
        System.out.printf("%d살 %s사는 %s입니다.\n", arr2.age, arr2.home, arr2.name);
        introduce(arr.age, arr.name, arr.home);
        introduce(arr2.age, arr2.name, arr2.home);
        /*introduce2(arr); // introduce2를 갖고있는 class 인 Person 에게 부탁하기
        introduce2(arr2);*/
        arr.introduce2();
        arr2.introduce2();

    }

    // 함수
    public static void introduce(int age, String name, String home ){
        System.out.printf("%d살 %s사는 %s입니다.\n", age, home, name);
    }

    // 함수 -> 같은 클래슨 내의 함수끼리는 서로 호출(사용) 가능
   /* public static void introduce2(Person arr){
        System.out.printf("%d살 %s사는 %s입니다.\n", arr.age, arr.home, arr.name);
    }*/
}


// 컴퓨터한테 내가 생각한 어떤 개념 -> 컴퓨터한테 알려줘야 함.

// 클래스는 기본적으로 클래스 밖에서 만든다.
// 클래스의 본질 -> 관련된 데이터의 묶음 + 해당 데이터를 사용하는 함수
// 인스턴스(복사본,객체)를 사용하려면 static이 있으면 안된다.
// 클래스는 현실세계의 개념 및 사물과 1:1 맵핑



// static >> 공유
// 객체 -> 개성을 표현하기 위함
// 모든 객체가 공유하는 개념 -> 인류평균나이, 인류평균수명

class Person {
/*    static int age;
    static String name;
    static String home;
    */
    int age;
    String name;
    String home;

    public  void introduce2(){
        System.out.printf("%d살 %s사는 %s입니다.\n", age, home, name);
    }

}
