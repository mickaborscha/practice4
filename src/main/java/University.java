/**
 * Created by Oleg on 2/14/2017.
 */
public class University {

    private String name;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("Setting address to University");
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting name to University");
        this.name = name;
    }
}
