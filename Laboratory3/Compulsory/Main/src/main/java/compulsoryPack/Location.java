package compulsoryPack;
import java.util.*;

public abstract class Location implements Comparable<Location>
{
    private String name;
    private Map<Location, Integer> cost = new HashMap<>();

    public Location(String name) {
        this.name = name;
    }

    public Location(Map<Location, Integer> cost) {
        this.cost = cost;
    }

    public Location() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Map<Location, Integer> cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public Map<Location, Integer> getCost() {
        return cost;
    }

    public void setCost(Location node, int value) {
        cost.put(node, value);
    }
    //… toString, etc.
    @Override
    public int compareTo(Location other) {
        return this.name.compareTo(other.name);
        //not safe, check if name is null before
    }
}