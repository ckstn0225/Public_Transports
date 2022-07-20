import java.util.Random;

public abstract class PublicTransport {
//    차량번호
    int id = (int) (Math.random()*10000 +1);
//    주유량
    int Oil= 100;;
//    현재 승객 수
    int boarding;
//    요금
    int charging;
//    상태
    String State = "운행";
}


