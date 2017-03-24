package entity;

/**
 * Created by kowalskiy on 15.03.17.
 */
public class Venue {

    private String name;

    private String address;

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

    @Override
    public String toString() {
        return "Venue{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
