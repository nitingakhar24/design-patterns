package singleton;

import java.io.*;
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




        // Logic to Break Singleton pattern using de-serialization, and it's solution by implementing readResolve()

        LazySnack lazySnack3 = LazySnack.getSnackInstance();
        System.out.println("Before Serializing hashcode " + lazySnack3.hashCode());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("LazySnack.obj"));
        oos.writeObject(lazySnack3);

        System.out.println("Serialization complete");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("LazySnack.obj"));
        LazySnack deserailizedLazySnack = (LazySnack) ois.readObject();
        System.out.println("After De-Serializing hashcode " + deserailizedLazySnack.hashCode());

        // Logic to Break Singleton pattern using cloning, and it's solution by overriding clone() method
        LazySnack lazySnack4 = LazySnack.getSnackInstance();
        System.out.println("Before cloning hashcode " + lazySnack4.hashCode());
        LazySnack cloneLazySnack = (LazySnack)lazySnack4.clone();
        System.out.println("After cloning hashcode " + cloneLazySnack.hashCode());
        // Logic to Break Singleton pattern using reflection API and it's solution : If object is there, throw exception from inside constructor.

        LazySnack lazySnack1 = LazySnack.getSnackInstance();
        System.out.println(lazySnack1.hashCode());

        Constructor<LazySnack> constructor = LazySnack.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazySnack lazySnack2 = constructor.newInstance();
        System.out.println(lazySnack2.hashCode());
    }
}
