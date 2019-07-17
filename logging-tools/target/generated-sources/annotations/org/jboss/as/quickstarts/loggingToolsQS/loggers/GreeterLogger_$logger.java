package org.jboss.as.quickstarts.loggingToolsQS.loggers;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.INFO;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2019-07-16T17:04:57-0500")
public class GreeterLogger_$logger extends DelegatingBasicLogger implements GreeterLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = GreeterLogger_$logger.class.getName();
    public GreeterLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void logHelloMessageSent() {
        super.log.logf(FQCN, INFO, null, logHelloMessageSent$str());
    }
    private static final String logHelloMessageSent = "GREETER000001: Hello message sent.";
    protected String logHelloMessageSent$str() {
        return logHelloMessageSent;
    }
    @Override
    public final void logHelloMessageSentForLocale(final String locale) {
        super.log.logf(FQCN, INFO, null, logHelloMessageSentForLocale$str(), locale);
    }
    private static final String logHelloMessageSentForLocale = "GREETER000002: Hello message sent for locale: %s.";
    protected String logHelloMessageSentForLocale$str() {
        return logHelloMessageSentForLocale;
    }
}
