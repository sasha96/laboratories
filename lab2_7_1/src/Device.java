public class Device {
    private String manufacturer ;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public float getPrice(){
        return price;
    }
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    public String getSerialNumber(){
        return serialNumber;
    }
}
