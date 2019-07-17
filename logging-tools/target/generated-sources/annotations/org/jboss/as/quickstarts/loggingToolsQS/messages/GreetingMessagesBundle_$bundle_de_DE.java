package org.jboss.as.quickstarts.loggingToolsQS.messages;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2019-07-16T17:04:57-0500")
public class GreetingMessagesBundle_$bundle_de_DE extends GreetingMessagesBundle_$bundle_de implements GreetingMessagesBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected GreetingMessagesBundle_$bundle_de_DE() {
        super();
    }
    public static final GreetingMessagesBundle_$bundle_de_DE INSTANCE = new GreetingMessagesBundle_$bundle_de_DE();
    @Override
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.GERMANY;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    private static final String helloToYou = "Hallo %s.";
    @Override
    protected String helloToYou$str() {
        return helloToYou;
    }
}
