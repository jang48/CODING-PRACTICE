package Day04.Static;

public class Scope {
   /*
    1) 클래스 변수  : 프로그램 실행 -> 종료될때까지

    2) 인스턴스변수 : 인스턴스 생성 -> 인스턴스 소멸
    인스턴스에 저장하는 변수 (non - static)

    3)  지역 변수 : 메서드 시작 -> 메서드 종료
    함수(메서드)에 저장하는 변수(함수 안에서 만들어진 변수
     */

   public static void main(String[] args) {
       System.out.println(Person.avgAge);
      // System.out.println(Person.age); // 객체가 만들지 않았기 때문

       Person2 p1 = new Person2();
       System.out.println(p1.age);
       // Person2.hi(); // class자체로 연결하려고하면 Static이 없기 때문에 안됨

       // plus가 Calculator클래스 내부로 들어가서 객체를 만들어줘야  plus(1,2); 작동 가능
       Calculator cd = new Calculator();
       cd.plus(1,2);
       cd.test();

   }

   /*
    public static void plus(int num1, int num2){   // 저장공간  num1, num2 , result 가 필요 -> 메서드 다 사용하고 나면 저장공간을 차지하던 애들이 다 사라짐
        int result = num1 + num2;
        System.out.println(result);
    }

    public static void test(){
        System.out.println(result);  // plus에서 사용하고 메서드가 끝낫기 때문에 result 변수값을 사용할 수 없음
                                    // plus가 만든 result는 다른함수인 test가 사용 x


    }
    */

}


// 그럼에도 사용하고 싶은경우
class Calculator{

    int result; // 인스턴스 변수 -> 두 메서드가 공유

    // 클래스 변수 -> 모든 인스턴스가 공유
    // 인스턴스 변수 -> 모든 함수(메서드)가 공유
    // 지역변수 -> 함수(메서드)가 단독으로 사용하는 변수(다른 함수 사용 X)

    public void plus(int num1, int num2){
        result = num1 + num2;

        System.out.println(result);
    }

    public void test(){
       System.out.println(result);
    }
}


class Person2{
    static int avgAge = 100; //클래스 변수

    int age = 30; //인스턴스 변수

    public  void  hi(){
        System.out.println("안녕");
    }
}
