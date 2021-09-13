package localhost.tybie.waifuesp;

import dev.rootnet.addons.api.addon.Addon;
import dev.rootnet.addons.api.annotations.RootnetAddon;
import org.apache.logging.log4j.Level;

import java.io.IOException;

/**
 * Waifu ESP addon class
 */
@SuppressWarnings("unused")
@RootnetAddon(name = "WaifuESP", author = "Tybie", version = "1.2.0")
public final class WaifuEspAddon extends Addon {

    static final String WAIFU_URL = "https://imgur.com/7lSYRHE.png";

    /**
     * Will be called by the addon loader
     */
    public WaifuEspAddon() {
    }

    @Override
    public void init() {
        super.init();
        log(Level.INFO, "Initializing WaifuESP Addon...");
        try {
            getRootnet().registerModule(this, new WaifuEspModule());
        } catch (IOException ex) {
            log(Level.ERROR, "Failed to initialize WaifuESP");
            ex.printStackTrace();
        }
    }

}