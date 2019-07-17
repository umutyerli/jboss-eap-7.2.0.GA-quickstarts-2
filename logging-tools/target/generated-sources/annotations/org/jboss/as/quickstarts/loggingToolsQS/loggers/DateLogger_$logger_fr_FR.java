package org.jboss.as.quickstarts.loggingToolsQS.loggers;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2019-07-16T17:04:57-0500")
public class DateLogger_$logger_fr_FR extends DateLogger_$logger_fr implements DateLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DateLogger_$logger_fr_FR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRANCE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    private static final String logStringCouldntParseAsDate = "GTRDATES000003: La chaîne de caractères fournie n'est pas une date valide: %s";
    @Override
    protected String logStringCouldntParseAsDate$str() {
        return logStringCouldntParseAsDate;
    }
    private static final String logDaysUntilRequest = "GTRDATES000004: Nombre requis de jours jusqu'à ce que '%s'";
    @Override
    protected String logDaysUntilRequest$str() {
        return logDaysUntilRequest;
    }
}
