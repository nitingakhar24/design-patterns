package singleton;

public class EagerRefreshment {
    private static EagerRefreshment eagerRefreshment = new EagerRefreshment();

    // Eager initialization method
    public static EagerRefreshment getRefreshmentInstance() {
        return eagerRefreshment;
    }
}
