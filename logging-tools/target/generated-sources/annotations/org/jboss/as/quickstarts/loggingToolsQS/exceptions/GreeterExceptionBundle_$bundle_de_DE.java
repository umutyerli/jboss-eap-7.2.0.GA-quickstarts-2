package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2019-07-16T17:04:57-0500")
public class GreeterExceptionBundle_$bundle_de_DE extends GreeterExceptionBundle_$bundle_de implements GreeterExceptionBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected GreeterExceptionBundle_$bundle_de_DE() {
        super();
    }
    public static final GreeterExceptionBundle_$bundle_de_DE INSTANCE = new GreeterExceptionBundle_$bundle_de_DE();
    @Override
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.GERMANY;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    private static final String localeNotValid = "GREETER000005: Angeforderte Gebietsschema nicht gültig: %s";
    @Override
    protected String localeNotValid$str() {
        return localeNotValid;
    }
    private static final String thrownOnPurpose = "GREETER000006: Diese Ausnahme absichtlich geworfen.";
    @Override
    protected String thrownOnPurpose$str() {
        return thrownOnPurpose;
    }
}
