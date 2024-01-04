package prototype;

public class NetworkConnection implements Cloneable {
    private String ipAddress;
    private String data;
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void loadData() {
        try {
            // Simulate network call or a resource intensive call for Object creation
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.data = "Loaded heavy data.....";
    }

    @Override
    public String toString() {
        return this.ipAddress + " : " + this.data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
