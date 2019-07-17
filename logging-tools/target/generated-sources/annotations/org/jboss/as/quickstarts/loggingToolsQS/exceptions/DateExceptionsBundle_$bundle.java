package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import java.util.Locale;
import java.time.format.DateTimeParseException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.lang.String;
import java.util.Arrays;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleImplementor", date = "2019-07-16T17:04:57-0500")
public class DateExceptionsBundle_$bundle implements DateExceptionsBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected DateExceptionsBundle_$bundle() {}
    public static final DateExceptionsBundle_$bundle INSTANCE = new DateExceptionsBundle_$bundle();
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    private static final String targetDateStringDidntParse = "GRTDATES000007: The date you sent me isn't valid, '%s'.  Sorry.";
    protected String targetDateStringDidntParse$str() {
        return targetDateStringDidntParse;
    }
    @Override
    public final DateTimeParseException targetDateStringDidntParse(final String dateString, final String parsedData, final int errorOffset) {
        final DateTimeParseException result = new DateTimeParseException(String.format(getLoggingLocale(), targetDateStringDidntParse$str(), dateString), parsedData, errorOffset);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
}
