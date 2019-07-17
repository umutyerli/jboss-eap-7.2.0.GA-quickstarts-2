package org.jboss.as.quickstarts.kitchensink.util;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.Generated;
import java.lang.String;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleImplementor", date = "2019-07-16T17:04:56-0500")
public class KitchensinkMessages_$bundle implements KitchensinkMessages, Serializable {
    private static final long serialVersionUID = 1L;
    protected KitchensinkMessages_$bundle() {}
    public static final KitchensinkMessages_$bundle INSTANCE = new KitchensinkMessages_$bundle();
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    private static final String registeredMessage = "Registered!";
    protected String registeredMessage$str() {
        return registeredMessage;
    }
    @Override
    public final String registeredMessage() {
        return String.format(getLoggingLocale(), registeredMessage$str());
    }
    private static final String registerSuccessfulMessage = "Successfully registered!";
    protected String registerSuccessfulMessage$str() {
        return registerSuccessfulMessage;
    }
    @Override
    public final String registerSuccessfulMessage() {
        return String.format(getLoggingLocale(), registerSuccessfulMessage$str());
    }
    private static final String registerFailMessage = "Registration failed:";
    protected String registerFailMessage$str() {
        return registerFailMessage;
    }
    @Override
    public final String registerFailMessage() {
        return String.format(getLoggingLocale(), registerFailMessage$str());
    }
    private static final String defaultErrorMessage = "Registration failed. See server log for more information.";
    protected String defaultErrorMessage$str() {
        return defaultErrorMessage;
    }
    @Override
    public final String defaultErrorMessage() {
        return String.format(getLoggingLocale(), defaultErrorMessage$str());
    }
}
