package optionalPack;
import java.time.LocalTime;
import java.util.*;
import java.time.Duration;

public class Main {

    public static void optional(){
        List<Location> elements  = new ArrayList<>();
        Hotel v1 = new Hotel();
        Museum v2 = new Museum();
        Museum v3 = new Museum();
        Church v4 = new Church();
        Church v5  = new Church();
        Restaurant v6 = new Restaurant();
        //adding all the locations in the previously declared list
        elements.add(v1);
        elements.add(v2);
        elements.add(v3);
        elements.add(v4);
        elements.add(v5);
        elements.add(v6);
        //setting the names
        v1.setName("Hotel");
        v2.setName("Museum A");
        v3.setName("Museum B");
        v4.setName("Church C");
        v5.setName("Church B");
        v6.setName("Restaurant");
        //opening/closing hours
        v2.setOpeningHour(LocalTime.parse("12:00"));
        v2.setClosingHour(LocalTime.parse("18:00"));
        v4.setOpeningHour(LocalTime.parse("09:00"));
        v4.setClosingHour(LocalTime.parse("19:00"));
        v5.setOpeningHour(LocalTime.parse("08:00"));
        v5.setClosingHour(LocalTime.parse("13:00"));

        v1.setCost(v2, 10);
        v1.setCost(v3, 50);
        v2.setCost(v3, 20);
        v2.setCost(v4, 20);
        v2.setCost(v5, 10);
        v3.setCost(v2, 20);
        v3.setCost(v4, 20);
        v4.setCost(v5, 30);
        v4.setCost(v6, 10);
        v5.setCost(v4, 30);
        v5.setCost(v6, 20);
        for(int iterator = 0; iterator < elements.size(); iterator++) {
            System.out.println("From " + (elements.get(iterator)).getName() + " to");
            System.out.println((elements.get(iterator)).getCost());
        }

        City Chicago = new City(elements);
        Chicago.displayVisitableButNotPayabple();
        System.out.println(Chicago.getNodes());

        TravelPlan wantToGo = new TravelPlan(Chicago, v1, v2, v3);
        System.out.println(wantToGo.getToVisit());

    }
    public static void main(String arggs[]) {
        optional();
    }
}
