package threads;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CounterTest {

    private static final Long DEFAULT_TTL = 3L;
    private Counter counter;

    @Mock
    private ThreadDistribution threadDistribution;

    @Before
    public void setUp() {
        counter = new Counter(DEFAULT_TTL, threadDistribution);
    }

    @Test
    public void run_calledExactlyExpectedTimes_true() {
        String threadName = Thread.currentThread().getName();

        counter.run();

        Mockito.verify(threadDistribution, Mockito.times(DEFAULT_TTL.intValue())).increment(threadName);
    }

    @Test
    public void printThreadDistribution_delegate_correct() {
        counter.printThreadDistribution();

        Mockito.verify(threadDistribution).printThreadDistribution();
    }
}