public class Taxi extends PublicTransport {
    int maxboarding = 4;
    int chargingplus = 1000;
    int distants = 0;
    String WhereGo;
    int defaltcharge = 3000;
    int Wallet;
    String State = "일반";

    public void boarding(int x, String where, int dis) {
        if (x > maxboarding) {
            System.out.println("최대 승객수 초과");
        } else if (State == "운행중" || State == "운행 중지") {
            System.out.println("탑승 할 수 없어요!");
        } else if (Oil < 10) {
            System.out.println("경고 : 주유 필요");
        } else {
        State = "운행중";
        boarding += x;
        chargingplus = 3000 + (dis - 1) * 1000;
        distants = dis;
        WhereGo = where;
        System.out.println("탑승 승객 수 = " + boarding);
        System.out.println("잔여 승객 수 = " + (maxboarding - boarding));
        System.out.println("기본 요금 확인 = " + defaltcharge);
        System.out.println("목적지 = " + WhereGo);
        System.out.println("목적지까지 거리 = " + distants);
        System.out.println("지불할 요금 = " + chargingplus);
        System.out.println("상태 = " + State);
        }
    }

    public void purchase() {
        Wallet += chargingplus;
        chargingplus = 0;
        State = "일반";
        System.out.println("주유량 = " + Oil);
        System.out.println("누적 요금 = " + Wallet);
    }

    public void filloil(int x) {
        if (State == "운행중") {
            System.out.println("승객이 탑승중입니다!");
        } else {
            Oil += x;
            System.out.println("주유량 = " + Oil);
        }
    }

    public void useoil (int x){
        if (Oil - x < 0) {
            System.out.println("현재 기름양보다 많은양을 사용했습니다.");
        } else if (Oil - x < 10) {
            State = "운행 중지";
            Oil -= x;
            System.out.println("주유량 = "+Oil);
            System.out.println("상태 = "+State);
            System.out.println("경고 : 주유 필요");
        } else {
            Oil -= x;
            System.out.println("주유량 = "+Oil);
        }
    }
}
