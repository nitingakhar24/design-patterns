package builder;

public class BuilderClient {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId("1")
                .setUserName("nitin")
                .setEmailId("nitin@gmail.com")
                .setAddress("123 St")
                .build();
        System.out.println(user);
    }
}
