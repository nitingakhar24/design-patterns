package prototype;

public class PrototypeClient {
    public static void main(String[] args) {
        System.out.println("Creating object using prototype design pattern");
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIpAddress("192.168.4.1");
        networkConnection.loadData();
        System.out.println(networkConnection);

        // In case we need new object of NetworkConnection
        try {
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
