package ocp;

import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Zoo {
    private static final String RES_BUNDLE_NAME = "Zoo";

    public static void main(final String... pArgs) {
        Map<String, Object> props = getProps(Locale.FRANCE);
        return;
    }

    private static Map<String, Object> getProps(final Locale pLocale) {
        final ResourceBundle resourceBundle = ResourceBundle.getBundle(RES_BUNDLE_NAME, pLocale);
        return resourceBundle.keySet().stream().collect(Collectors.toMap(Function.identity(), resourceBundle::getObject));
    }

    private static Map<String, Object> getProps() {
        return getProps(Locale.getDefault());
    }
}
