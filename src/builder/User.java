package builder;

public class User {

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private final String userId;
    private final String userName;
    private final String emailId;
    private final String address;

    private User(UserBuilder userBuilder) {
        // initialize
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.emailId = userBuilder.emailId;
        this.address = userBuilder.address;

    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getAddress() {
        return address;
    }

    // Inner class to create object

    static class UserBuilder {
        private String userId;
        private String userName;
        private String emailId;
        private String address;

        public UserBuilder() {

        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }

}
