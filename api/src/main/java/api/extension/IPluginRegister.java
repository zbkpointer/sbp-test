package api.extension;

import org.pf4j.ExtensionPoint;

import java.net.URL;
import java.util.List;

public interface IPluginRegister extends ExtensionPoint {

    String name();

    List<URL> resources();
}
