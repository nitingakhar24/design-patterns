package singleton;

import java.lang.reflect.Constructor;

public class Example {
    public static void main(String[] args) throws Exception {

        LazySnack snack1 = LazySnack.getSnackInstance();
        System.out.println(snack1.hashCode());
        LazySnack snack2 = LazySnack.getSnackInstance();
        System.out.println(snack2.hashCode());

        EagerRefreshment eagerRefreshment1 = EagerRefreshment.getRefreshmentInstance();
        System.out.println(eagerRefreshment1.hashCode());
        EagerRefreshment eagerRefreshment2 = EagerRefreshment.getRefreshmentInstance();
        System.out.println(eagerRefreshment2.hashCode());


        // Logic to Break Singleton pattern

        LazySnack lazySnack1 = LazySnack.getSnackInstance();
        System.out.println(lazySnack1.hashCode());

        Constructor<LazySnack> constructor = LazySnack.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazySnack lazySnack2 = constructor.newInstance();
        System.out.println(lazySnack2.hashCode());
    }
}
