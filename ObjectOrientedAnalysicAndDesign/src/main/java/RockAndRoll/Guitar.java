package RockAndRoll;

public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpec guitarSpec;

    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }

    public void setGuitarSpec(GuitarSpec guitarSpec) {
        this.guitarSpec = guitarSpec;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
