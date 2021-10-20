package fr.trouillet.devportal.plugina;

import api.plugin.ICustomPlugin;
import org.laxture.sbp.SpringBootPlugin;
import org.laxture.sbp.spring.boot.SpringBootstrap;
import org.pf4j.PluginWrapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class APlugin extends SpringBootPlugin implements ICustomPlugin {

    public static APlugin INSTANCE;

    public APlugin(PluginWrapper wrapper) {
        super(wrapper);
        INSTANCE = this;
    }

    @Override
    protected SpringBootstrap createSpringBootstrap() {
        return new SpringBootstrap(this, APluginStarter.class);
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }



    @Override
    public String getName() {
        return "A";
    }

    @Override
    public String getLogo() {
        return "/bananas/banana.png";
    }
}
