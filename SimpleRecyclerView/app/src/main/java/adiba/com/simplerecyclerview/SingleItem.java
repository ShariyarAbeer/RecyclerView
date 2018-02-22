package adiba.com.simplerecyclerview;

/**
 * Created by HP on 2/21/2018.
 */

public class SingleItem {

    String name;
    String vName;
    String address;

    public SingleItem(String name, String vName, String address) {
        this.name = name;
        this.vName = vName;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
