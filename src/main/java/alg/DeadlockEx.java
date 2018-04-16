package alg;

import java.time.Instant;

public class DeadlockEx {
    private static final Object LOCK_1 = new Object();
    private static final Object LOCK_2 = new Object();

    public static void main(String... args) throws InterruptedException {
        final Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (LOCK_1) {
                    synchronized (LOCK_2) {
                        System.out.println("in thread 1 : " + Instant.now());
                    }
                }
            }
        });
        final Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (LOCK_2) {
                    synchronized (LOCK_1) {
                        System.out.println("in thread 2 : " + Instant.now());
                    }
                }
            }
        });

        thread1.start();
        thread2.start();

        System.out.println("Finish!");
    }
}
