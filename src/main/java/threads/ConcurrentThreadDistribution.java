package threads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentThreadDistribution extends AbstractThreadDistribution {

    protected ConcurrentThreadDistribution() {
        threadDistribution = new ConcurrentHashMap<>();
    }

    @Override
    public void increment(final String pThreadName) {
        threadDistribution.putIfAbsent(pThreadName, new LongAdder());
        threadDistribution.get(pThreadName).increment();
    }

    @Override
    public void printThreadDistribution() {
        threadDistribution.forEach((key, value) -> System.out.println("Thread [" + key + "] has " + value + " hits."));
    }
}
