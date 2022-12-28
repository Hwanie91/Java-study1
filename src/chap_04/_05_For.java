package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        /*for ( 선언 ; 조건 ; 증감 ) {
            ... 수행 명령 ...
        }*/

        // 반복문 사용 for
        for (int i = 0; i < 10; i++) {
            System.out.println("어서오세요. 나코입니다. " + i);
        }

        // 짝수만 출력
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();

        //홀수만 출력 1, 3, 5, 7, 9
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();

        // 거꾸로 숫자 54321
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }
        System.out.println();

        // 1부터 10까지 수들의 합
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재까기 총합은 " + sum + "입니다.");
        }
        System.out.println("1부터 10까지 수들의 합은 " + sum + "입니다.");
    }
}
