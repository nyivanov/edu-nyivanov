package threads;

import java.util.HashMap;
import java.util.concurrent.atomic.LongAdder;

public class DefaultThreadDistribution extends AbstractThreadDistribution {
    private static final Object LOCK = new Object();

    protected DefaultThreadDistribution() {
        threadDistribution = new HashMap<>();
    }

    @Override
    public void increment(String pThreadName) {
        synchronized (LOCK) {
            threadDistribution.putIfAbsent(pThreadName, new LongAdder());
        }
        threadDistribution.get(pThreadName).increment();
    }

    @Override
    public void printThreadDistribution() {
        threadDistribution.forEach((key, value) -> System.out.println("Thread [" + key + "] has " + value + " hits."));
    }
}
