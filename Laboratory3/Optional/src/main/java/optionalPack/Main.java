package optionalPack;
import java.time.LocalTime;
import java.util.*;
import java.time.Duration;

public class Main {
    public static void compulsory(){
        List<Location> elements  = new ArrayList<>();
        Hotel v1 = new Hotel();
        v1.setName("Hotel");
        elements.add(v1);
        Museum v2 = new Museum();
        v2.setOpeningHour(LocalTime.parse("12:00"));
        v2.setName("Museum A");
        elements.add(v2);
        Museum v3 = new Museum();
        v3.setName("Museum B");
        elements.add(v3);
        Church v4 = new Church();
        v4.setName("Church C");
        v4.setOpeningHour(LocalTime.parse("09:00"));
        v4.setClosingHour(LocalTime.parse("13:00"));
        System.out.println(Visitable.getVisitingDuration(v4.getOpeningHour(), v4.getClosingHour()));
        elements.add(v4);
        Church v5  = new Church();
        v5.setOpeningHour(LocalTime.parse("12:00"));
        v5.setClosingHour(LocalTime.parse("13:00"));
        v5.setName("Church B");
        elements.add(v5);
        Restaurant v6 = new Restaurant();
        v6.setName("Restaurant");
        elements.add(v6);
        City cityList = new City(elements);
        cityList.displayVisitableButNotPayabple();
    }
    public static void main(String arggs[]) {
        compulsory();
    }
}
