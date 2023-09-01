package Day02;

public class Condition {
    public static void main(String[] args) {
        // 조건문 : 실행이 될 수도 있고 안될 수도 있는 코드
        System.out.println("창문 닫기");

        //비가 올 때만 창문을 닫기
        boolean isRain = true;

        if(isRain){
            System.out.println("창문 닫기2");
        }

        int cash = 2000;
        // 야식
        if(cash >= 20000) {
            System.out.println("포카칩");
        }else {
            System.out.println("치킨집");
        }

        // 할인대상 -> 19세 이하, 60세 이상 할인 대상
        int age = 20;
        if(age <= 19 || age >= 60){
            System.out.println("할인대상자 입니다. ");
        }

        // 논리 연산

        // 곱연산(and) - &&
        // 모두 참이면 참, 그외 거짓
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(true && true && false);

        // 합연산(or) - ||
        // 모두 거짓이면 거짓, 그외 참
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(true || true || false);


        // 조건문 -> 택일구조

        // 양자택일
        boolean isMale = true;
        if(isMale){
            System.out.println("남자");
        }
        if(!isMale) {
            System.out.println("여자");
        }

        // 삼자택일
        int age2 =15;
        if(age2 >= 8 && age2 <= 13){
            System.out.println("초등학교");
        }else if(age2 <= 16){
            System.out.println("중학교");
        }else{
            System.out.println("고등학교");
        }


        // 사자택일
        int score = 85;
        if(score >= 90){
            System.out.println("A학점입니다.");
        }else if (score >= 80){ // else if(score >= 80 && score <= 89)라고 작성할 필요가없음
                                // if문에서 이미 90점 이상인 조건문에서 false이기 때문에 굳이 score <= 89라고 작성할 필요 없음
            System.out.println("B학점입니다.");
        }else if (score >= 70){
            System.out.println("C학점입니다.");
        }else if (score >= 60){
            System.out.println("D학점입니다.");
        }else{
            System.out.println("F학점입니다.");
        }


    }
}
