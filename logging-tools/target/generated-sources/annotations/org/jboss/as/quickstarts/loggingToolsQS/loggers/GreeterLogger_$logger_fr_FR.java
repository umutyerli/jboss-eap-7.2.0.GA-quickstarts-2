package org.jboss.as.quickstarts.loggingToolsQS.loggers;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2019-07-16T17:04:57-0500")
public class GreeterLogger_$logger_fr_FR extends GreeterLogger_$logger_fr implements GreeterLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public GreeterLogger_$logger_fr_FR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRANCE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    private static final String logHelloMessageSent = "GREETER000001: Bonjour message envoyé.";
    @Override
    protected String logHelloMessageSent$str() {
        return logHelloMessageSent;
    }
    private static final String logHelloMessageSentForLocale = "GREETER000002: Bonjour message envoyé pour la localisation de: %s.";
    @Override
    protected String logHelloMessageSentForLocale$str() {
        return logHelloMessageSentForLocale;
    }
}
