public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return getClass() + " manufacture = " + getManufacturer() + " price = " + getPrice() + " serialNumber = " + getSerialNumber() + "speed = " + getSpeed() + " mac = " + getMac();
    }
    @Override
    public boolean equals(Object o){
        if(this == o)return true;
        if(o == null || o.getClass() != getClass())return false;
        EthernetAdapter ethernetAdapter = (EthernetAdapter) o;

        if (ethernetAdapter.speed != speed)return false;
        return ethernetAdapter.mac == mac;
    }
}
