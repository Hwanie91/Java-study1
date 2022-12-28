package chap_04;

public class _04_SwitchSase {
    public static void main(String[] args) {
        // Switch Case
        /*switch (expression) {
            case A: ... 수행할 명령 ...
                break;
            case B: ... 수행할 명령 ...
                break;
            case C: ... 수행할 명령 ...
                break;
                ...
            default: ... 수행할 명령...
        }*/

        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // if else문 이용 : 여러 조건 또는 범의에 해당하는 조건
        int ranking = 1;
        if(ranking ==1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        }  else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료#1");

        // Switch Case 문 이용 : 명확한 케이스가 있는 경우
        ranking = 2;
        switch (ranking) {
            case 1: System.out.println("전액 장학금");
                break;
            case 2: System.out.println("반액 장학금");
                break;
            case 3: System.out.println("반액 장학금");
                break;
            default: System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료#2");
        // 2와 3을 통합가능
        ranking = 3;
        switch (ranking) {
            case 1: System.out.println("전액 장학금");
                break;
            case 2:
            case 3: System.out.println("반액 장학금");
                break;
            default: System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료#3");

        // 중고상품의 등급에 따른 가겨을 책정 (1등급 : 최상, 4급 : 최하)
        int grade = 1;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격" + price + "원");
    }
}
