package entity;

import java.util.List;

/**
 * Created by admin on 15.03.2017.
 */
public class Area {

    private String name;

    private String address;

    private Integer numOfPlaces;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumOfPlaces() {
        return numOfPlaces;
    }
    public void setNumOfPlaces(Integer numOfPlaces) {
        this.numOfPlaces = numOfPlaces;
    }

    @Override
    public String toString() {
        return "Area{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", number of places=" + numOfPlaces +
                '}';
    }
}
