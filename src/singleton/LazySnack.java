package singleton;

/**
 * 1. Private constructor.
 * 2. Create object with the help of a static method.
 * 3. Create field to store the object as private and static.
 * 4. Use synchronized block in the object creation part in case of multiple thread.
 */

public class LazySnack {
    private static LazySnack snack;

    private LazySnack() {

    }

    // Lazy initialization method
    public static LazySnack getSnackInstance() {
        // create object of this Snack class only once
        if (snack == null) {
            synchronized (LazySnack.class) {
                if (snack == null) {
                    snack = new LazySnack();
                }

            }
        }
        return snack;
    }
}


