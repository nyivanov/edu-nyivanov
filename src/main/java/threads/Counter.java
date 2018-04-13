package threads;

import java.util.concurrent.atomic.AtomicLong;

public class Counter implements Runnable {
    private static final Object LOCK = new Object();

    private final AtomicLong ttl;
    private final ThreadDistribution threadDistribution;

    Counter(final Long pTtl) {
        this(pTtl, new DefaultThreadDistribution());
    }

    Counter(final Long pTtl, final ThreadDistribution pThreadDistribution) {
        ttl = new AtomicLong(pTtl);
        threadDistribution = pThreadDistribution;
    }

    public void printThreadDistribution() {
        threadDistribution.printThreadDistribution();
    }

    @Override
    public void run() {
        processData(false);
    }

    private void processData(final Boolean pWriteToConsole) {
        final String threadName = Thread.currentThread().getName();
        while (true) {
            synchronized (LOCK) {
                if (ttl.get() <= 0L) {
                    System.out.println("Thread [" + threadName + "] exits now!");
                    return;
                }
                if (pWriteToConsole) {
                    System.out.println("Running from thread : [" + threadName + "]. TTL: " + ttl.decrementAndGet());
                } else {
                    ttl.decrementAndGet();
                }
            }
            threadDistribution.increment(threadName);
        }
    }
}
