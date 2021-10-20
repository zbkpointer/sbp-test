package fr.trouillet.devportal.plugina;

import api.extension.IPluginRegister;
import org.pf4j.Extension;
import org.pf4j.PluginWrapper;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Extension
public class APluginExtension implements IPluginRegister {

    @Override
    public String name() {
        return "Bananas";
    }

    @Override
    public List<URL> resources() {
        List<URL> resources = new ArrayList<>();
        try {
            PluginWrapper wrapper = APlugin.INSTANCE.getWrapper();
            URL images = wrapper.getPluginClassLoader().getResource("public/bananas");
            for (String file : new File(images.getPath()).list()) {
                resources.add(new File(images.getPath().concat(File.separator + file)).toURI().toURL());
            }
        } finally {
            return resources;
        }
    }
}
