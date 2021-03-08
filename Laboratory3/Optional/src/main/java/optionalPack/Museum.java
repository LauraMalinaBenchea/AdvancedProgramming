package optionalPack;
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class Museum extends Location implements Visitable, Payable {
    private LocalTime openingHour, closingHour;
    private double ticketPrice;

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public void setOpeningHour(LocalTime openingTime) {
        this.openingHour = openingTime;
    }
    public void setClosingHour(LocalTime closingTime) {
        this.closingHour = closingTime;
    }


    @Override
    public LocalTime getOpeningHour() {
        return openingHour;
    }

    @Override
    public LocalTime getClosingHour() {
        return closingHour;
    }

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }




}