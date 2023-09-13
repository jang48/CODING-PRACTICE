package Day08.Array;

import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        사람 사람1 = new 사람(24, "홍길동");
        사람 사람2 = new 사람(30, "이순신");
        사람 사람3 = new 사람(41, "을지문덕");
        사람 사람4 = new 사람(32, "황진이");

        // 1. 네 사람을 ArrayList에 저장
        ArrayList<사람> 저장소6 = new ArrayList<>();
        저장소6.add(사람1);
        저장소6.add(사람2);
        저장소6.add(사람3);
        저장소6.add(사람4);

        // 2. 네 사람에게 자기소개 시키기
        for( 사람 a사람들 : 저장소6){
            a사람들.introduce();
        }
        // 3. 30대인 사람에게만 자기소개 시키기
        for ( 사람 a사람들 : 저장소6){
            if(a사람들.getAge() >= 30 && a사람들.getAge() < 40 ){
                a사람들.introduce();
            }
        }


    }
}


class 사람 {
    private int age;
    private String name;

    사람(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.printf("%d살 %s입니다.\n", age, name);
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }
}