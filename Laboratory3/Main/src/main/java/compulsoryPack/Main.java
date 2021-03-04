package compulsoryPack;
import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void compulsory(){
        Hotel v1 = new Hotel();
        v1.setName("Hotel");
        Museum v2 = new Museum();
        v2.setName("Museum A");
        Museum v3 = new Museum();
        v3.setName("Museum B");
        Church v4 = new Church();
        v4.setName("Church A");
        Church v5  = new Church();
        v5.setName("Church B");
        Restaurant v6 = new Restaurant();
        v6.setName("Restaurant");
    }
    public static void main(String arggs[]) {
        compulsory();
    }
}
