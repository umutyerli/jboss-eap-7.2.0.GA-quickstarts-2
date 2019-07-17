package org.jboss.as.quickstarts.loggingToolsQS.loggers;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.lang.String;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2019-07-16T17:04:57-0500")
public class DateLogger_$logger extends DelegatingBasicLogger implements DateLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = DateLogger_$logger.class.getName();
    public DateLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void logStringCouldntParseAsDate(final String dateString, final Throwable exception) {
        super.log.logf(FQCN, ERROR, exception, logStringCouldntParseAsDate$str(), dateString);
    }
    private static final String logStringCouldntParseAsDate = "GTRDATES000003: Invalid date passed as string: %s";
    protected String logStringCouldntParseAsDate$str() {
        return logStringCouldntParseAsDate;
    }
    @Override
    public final void logDaysUntilRequest(final String dateString) {
        super.log.logf(FQCN, INFO, null, logDaysUntilRequest$str(), dateString);
    }
    private static final String logDaysUntilRequest = "GTRDATES000004: Requested number of days until '%s'";
    protected String logDaysUntilRequest$str() {
        return logDaysUntilRequest;
    }
}
