package threads;

public interface ThreadDistribution {
    void increment(String pThreadName);
    void printThreadDistribution();
}
