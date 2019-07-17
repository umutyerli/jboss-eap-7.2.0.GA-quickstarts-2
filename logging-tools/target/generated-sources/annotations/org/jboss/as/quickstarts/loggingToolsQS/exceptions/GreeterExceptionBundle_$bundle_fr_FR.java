package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2019-07-16T17:04:57-0500")
public class GreeterExceptionBundle_$bundle_fr_FR extends GreeterExceptionBundle_$bundle_fr implements GreeterExceptionBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected GreeterExceptionBundle_$bundle_fr_FR() {
        super();
    }
    public static final GreeterExceptionBundle_$bundle_fr_FR INSTANCE = new GreeterExceptionBundle_$bundle_fr_FR();
    @Override
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.FRANCE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    private static final String localeNotValid = "GREETER000005: La locale demandée n'est pas valide: %s";
    @Override
    protected String localeNotValid$str() {
        return localeNotValid;
    }
    private static final String thrownOnPurpose = "GREETER000006: Cette Exception est levée volotairement.";
    @Override
    protected String thrownOnPurpose$str() {
        return thrownOnPurpose;
    }
}
