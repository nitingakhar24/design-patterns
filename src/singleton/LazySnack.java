package singleton;

/**
 * 1. Private constructor.
 * 2. Create object with the help of a static method.
 * 3. Create field to store the object as private and static.
 */
public class LazySnack {
    private static LazySnack snack;
    private LazySnack() {

    }

    // Lazy initialization method
    public static LazySnack getSnackInstance() {
    // create object of this Snack class only once
        if(snack == null) {
            snack = new LazySnack();
        }
        return snack;
    }
}


