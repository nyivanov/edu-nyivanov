package threads;

import org.assertj.core.api.JUnitSoftAssertions;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class DefaultThreadDistributionTest {
    @Rule
    public final JUnitSoftAssertions softly = new JUnitSoftAssertions();

    private ThreadDistribution threadDistribution;


    @Before
    public void setUp() {
        threadDistribution = new DefaultThreadDistribution();
    }

    @Test
    public void constructor_defaultInstance_created() {
        softly.assertThat(threadDistribution).isInstanceOf(DefaultThreadDistribution.class);
    }
}