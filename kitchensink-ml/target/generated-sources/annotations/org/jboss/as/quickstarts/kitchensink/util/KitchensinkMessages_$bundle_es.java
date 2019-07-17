package org.jboss.as.quickstarts.kitchensink.util;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2019-07-16T17:04:56-0500")
public class KitchensinkMessages_$bundle_es extends KitchensinkMessages_$bundle implements KitchensinkMessages, Serializable {
    private static final long serialVersionUID = 1L;
    protected KitchensinkMessages_$bundle_es() {
        super();
    }
    public static final KitchensinkMessages_$bundle_es INSTANCE = new KitchensinkMessages_$bundle_es();
    @Override
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = new Locale("es");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    private static final String registeredMessage = "De registro!";
    @Override
    protected String registeredMessage$str() {
        return registeredMessage;
    }
    private static final String registerSuccessfulMessage = "Registrado con éxito!";
    @Override
    protected String registerSuccessfulMessage$str() {
        return registerSuccessfulMessage;
    }
    private static final String registerFailMessage = "Registro no se ha:";
    @Override
    protected String registerFailMessage$str() {
        return registerFailMessage;
    }
    private static final String defaultErrorMessage = "Error de registro. Vea el registro del servidor para obtener más información.";
    @Override
    protected String defaultErrorMessage$str() {
        return defaultErrorMessage;
    }
}
