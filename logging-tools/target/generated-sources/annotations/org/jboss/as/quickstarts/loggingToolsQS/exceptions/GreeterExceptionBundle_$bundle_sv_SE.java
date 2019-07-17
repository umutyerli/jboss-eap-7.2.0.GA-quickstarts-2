package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2019-07-16T17:04:57-0500")
public class GreeterExceptionBundle_$bundle_sv_SE extends GreeterExceptionBundle_$bundle_sv implements GreeterExceptionBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected GreeterExceptionBundle_$bundle_sv_SE() {
        super();
    }
    public static final GreeterExceptionBundle_$bundle_sv_SE INSTANCE = new GreeterExceptionBundle_$bundle_sv_SE();
    @Override
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = new Locale("sv", "SE");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    private static final String localeNotValid = "GREETER000005: Begärd språk inte giltigt: %s.";
    @Override
    protected String localeNotValid$str() {
        return localeNotValid;
    }
    private static final String thrownOnPurpose = "GREETER000006: Detta undantag kastas med flit.";
    @Override
    protected String thrownOnPurpose$str() {
        return thrownOnPurpose;
    }
}
