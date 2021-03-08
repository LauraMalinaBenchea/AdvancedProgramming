package optionalPack;
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class Church extends Location implements Visitable {

    private LocalTime openingHour, closingHour;

    public void setOpeningHour(LocalTime opening) {
        this.openingHour = opening;
    }
    public void setClosingHour(LocalTime closing) {
        this.closingHour = closing;
    }


    @Override
    public LocalTime getOpeningHour() {
        return openingHour;
    }

    @Override
    public LocalTime getClosingHour() {
        return closingHour;
    }


    //comparing two objects of type church by their opening Hour
    public int compareTo(Church other) {
        if(this.openingHour== null){
            return -1;
        }
        if(other.openingHour == null){
            return -1;
        }
        return this.openingHour.compareTo(other.openingHour);
    }


}

