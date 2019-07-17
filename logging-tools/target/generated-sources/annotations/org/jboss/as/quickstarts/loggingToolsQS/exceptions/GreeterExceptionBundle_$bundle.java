package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.lang.Throwable;
import java.lang.String;
import java.util.Arrays;
import org.jboss.as.quickstarts.loggingToolsQS.exceptions.LocaleInvalidException;
import java.lang.Exception;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleImplementor", date = "2019-07-16T17:04:57-0500")
public class GreeterExceptionBundle_$bundle implements GreeterExceptionBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected GreeterExceptionBundle_$bundle() {}
    public static final GreeterExceptionBundle_$bundle INSTANCE = new GreeterExceptionBundle_$bundle();
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    private static final String localeNotValid = "GREETER000005: Requested locale not valid: %s";
    protected String localeNotValid$str() {
        return localeNotValid;
    }
    @Override
    public final org.jboss.as.quickstarts.loggingToolsQS.exceptions.LocaleInvalidException localeNotValid(final String locale) {
        final org.jboss.as.quickstarts.loggingToolsQS.exceptions.LocaleInvalidException result = new org.jboss.as.quickstarts.loggingToolsQS.exceptions.LocaleInvalidException(String.format(getLoggingLocale(), localeNotValid$str(), locale));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String thrownOnPurpose = "GREETER000006: This exception thrown on purpose.";
    protected String thrownOnPurpose$str() {
        return thrownOnPurpose;
    }
    @Override
    public final Exception thrownOnPurpose(final Throwable ex) {
        final Exception result = new Exception(String.format(getLoggingLocale(), thrownOnPurpose$str()), ex);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
}
