package optionalPack;
import java.util.*;

public abstract class Location implements Comparable<Location> {
    private String name;
    private Map<Location, Integer> cost = new HashMap<>();

    public Location() {}
    public Location(String name) {
        this.name = name;
    }
    public Location(Map<Location, Integer> cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Map<Location, Integer> cost) {
        this.cost = cost;
    }
    public void setCost(Location node, int value) {
        cost.put(node, value);
    }
    public String getName() {
        return name;
    }
    public Map<Location, Integer> getCost() {
        return cost;
    }


    //… toString, etc.
    @Override
    public int compareTo(Location other) {
        if(other instanceof Church && this instanceof Church){
            return ((Church) this).compareTo((Church) other);
        }
        if(this.name == null){
            return -1;
        }
        if(other.name == null){
            return -1;
        }
        return this.name.compareTo(other.name);
    }
    @Override
    public String toString(){
        return this.name;
    }
}