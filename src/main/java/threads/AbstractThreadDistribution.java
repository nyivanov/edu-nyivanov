package threads;

import java.util.Map;
import java.util.concurrent.atomic.LongAdder;

abstract class AbstractThreadDistribution implements ThreadDistribution {
    protected Map<String, LongAdder> threadDistribution;
}
