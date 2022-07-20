public class Bus extends PublicTransport {

    int maxboarding = 30;

    Bus (){
    }
    public void run(String where){
        if (where == "차고지행"){
            State = "차고지행";
            System.out.println("상태 = "+State);
        } else if (where != "운행"){
            System.out.printf("거긴 못가요!");
        } else {
            State = "운행";
            System.out.println("상태 = "+State);
        }


    }

    public void FillOil(int x){

        State = "차고지행";
        Oil += x;
        boarding = 0;
        charging = 0;
        System.out.println("상태 = "+State);
        System.out.println("주유량 = "+Oil);
        if (Oil < 10) {
            System.out.printf("주유 필요");
        }
    }
    public void boarding(int x) {
        if (boarding + x >30) {
            System.out.println("경고 : 최대 승객 수 초과!");
        } else if (State == "차고지행"){
            System.out.println("운행중이 아닙니다!!");
        } else {
            boarding += x;
            charging += x*1000;
            System.out.printf("탑승 승객 수 = " + boarding + System.lineSeparator());
            System.out.println("잔여 승객 수 = " + (maxboarding - boarding));
            System.out.println("요금 = " + charging);
        }
    }

    public void useoil (int x){
        if (Oil - x < 0) {
            System.out.println("현재 기름양보다 많은양을 사용했습니다.");
        } else if (Oil - x < 10) {
            State = "차고지행";
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
