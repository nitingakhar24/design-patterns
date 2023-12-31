package singleton;

public class Example {
    public static void main(String[] args) {
        
        LazySnack snack1 = LazySnack.getSnackInstance();
        System.out.println(snack1.hashCode());
        LazySnack snack2 = LazySnack.getSnackInstance();
        System.out.println(snack2.hashCode());

        EagerRefreshment eagerRefreshment1 = EagerRefreshment.getRefreshmentInstance();
        System.out.println(eagerRefreshment1.hashCode());
        EagerRefreshment eagerRefreshment2 = EagerRefreshment.getRefreshmentInstance();
        System.out.println(eagerRefreshment2.hashCode());
    }
}
