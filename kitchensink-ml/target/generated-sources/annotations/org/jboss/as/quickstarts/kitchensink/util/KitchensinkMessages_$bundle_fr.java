package org.jboss.as.quickstarts.kitchensink.util;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2019-07-16T17:04:56-0500")
public class KitchensinkMessages_$bundle_fr extends KitchensinkMessages_$bundle implements KitchensinkMessages, Serializable {
    private static final long serialVersionUID = 1L;
    protected KitchensinkMessages_$bundle_fr() {
        super();
    }
    public static final KitchensinkMessages_$bundle_fr INSTANCE = new KitchensinkMessages_$bundle_fr();
    @Override
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    private static final String registeredMessage = "Enregistré!";
    @Override
    protected String registeredMessage$str() {
        return registeredMessage;
    }
    private static final String registerSuccessfulMessage = "enregistré avec succès!";
    @Override
    protected String registerSuccessfulMessage$str() {
        return registerSuccessfulMessage;
    }
    private static final String registerFailMessage = "Echec de l'enregistrement:";
    @Override
    protected String registerFailMessage$str() {
        return registerFailMessage;
    }
    private static final String defaultErrorMessage = "Echec de l'enregistrement. Voir journal du serveur pour plus d'informations.";
    @Override
    protected String defaultErrorMessage$str() {
        return defaultErrorMessage;
    }
}
