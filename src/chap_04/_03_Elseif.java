package chap_04;

public class _03_Elseif {
    public static void main(String[] args) {
        // 조건문 ElseIf 
        /*
        한라봉 에이드가 있으면 +1
        또는 망고 즈스가 있으면 +1
        또는 아이스 아메리카노 +1
        */
        boolean hallabongAde = true;
        boolean mangoJuice = true;
        
        if(hallabongAde) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("주문 완료#1");

        // else if 는 여러번 사용가능
        hallabongAde = false;
        mangoJuice = false;
        boolean orangJuice = true;

        if(hallabongAde) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else if (orangJuice) {
            System.out.println("오렌지 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("주문 완료#2");
    }
}
