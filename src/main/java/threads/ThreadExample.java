package threads;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;

public class ThreadExample {

    private static final Long DEFAULT_TTL = 15000000L;

    public static void main(final String... args) throws InterruptedException {
        final Instant startedAt = Instant.now();
        final Counter counter = new Counter(DEFAULT_TTL);
        final Thread thread1 = new Thread(counter, "Isco");
        final Thread thread2 = new Thread(counter, "Modric");
        final Thread thread3 = new Thread(counter, "Kroos");
        final Thread thread4 = new Thread(counter, "Ramos");
        final Thread thread5 = new Thread(counter, "Bale");
        final Thread thread6 = new Thread(counter, "Varane");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        thread6.join();

        System.out.println();
        counter.printThreadDistribution();
        final Instant finishedAt = Instant.now();
        System.out.println("Processing time in total: " + (finishedAt.getEpochSecond() - startedAt.getEpochSecond()) + " seconds.");
    }
}
