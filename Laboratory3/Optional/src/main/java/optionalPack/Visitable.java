package optionalPack;

import java.time.LocalTime;
import java.time.Duration;

public interface Visitable {


    default LocalTime getOpeningHour(){ return LocalTime.parse("09:30"); }
    default LocalTime getClosingHour(){ return LocalTime.parse("12:00"); }

    //imi da numarul de ore in care e deschis un obiect caruia i se stabileste ora deschiderii si inchiderii
    public static Duration getVisitingDuration(LocalTime opening, LocalTime closing){
        return Duration.between(opening, closing);
    }


}
