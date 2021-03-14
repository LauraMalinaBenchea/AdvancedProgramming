package optionalPack;

import java.util.ArrayList;
import java.util.*;

public class TravelPlan {
    //City city;
    List<String> toVisit = new ArrayList<String>();
    //List <ArrayList<String>> preferences = new ArrayList<>();

    TravelPlan(City city, Location ... loc){
        for(int iterator = 0; iterator < loc.length; iterator++) {
                toVisit.add((loc[iterator]).getName());
        }
    }
    public List<String> getToVisit(){
        return toVisit;
    }




}
