package chap_04;

public class _Quiz_04 {
    /*
    실행 결과
    일반 차량 5시간 주차 시 20000원
     - 주차 요금은 20000 원입니다.
    경차 5시간 주차 시 10000원
     - 주차 요금은 10000 원입니다.
    장애인 차량 10시간 주차 시 15000원
     - 주차 요금은 15000 원입니다.
     조건
     주차요금은 시간당 4000원 (일일 쵀대 요금은 30000원)
     경차 또는 장애인 챠랑은 최종 요금에서 50% 할인
    */
    public static void main(String[] args) {
        int hour = 10; // 주차시간
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabledPerson = true; // 장애인 차량 여부

        int fee = hour * 4000; // (주차 정상 요금)시간당 4000원 곱하기

        // 30000 원 초과 시 일일 쵀대 요금으로 수정
        if(fee > 30000) {
            fee = 30000;
        }
        
        //경차 또는 장애인 챠랑은 최종 요금에서 50% 할인
        if(isSmallCar || withDisabledPerson) {
            fee = fee / 2; // 50%할인 적용
        }

        // 실행결과 출력
        System.out.println("주차 요금은 "+fee+" 원 입니다.");
    }
}
