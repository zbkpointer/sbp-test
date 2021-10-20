package fr.trouillet.devportal.pluginb;

import org.laxture.sbp.SpringBootPlugin;
import org.laxture.sbp.spring.boot.SpringBootstrap;
import org.pf4j.PluginWrapper;

/**
 * @Author: 张博康
 * @Description:
 * @Date: 2021/10/20 14:49
 * @Version: 1.0.0
 */
public class BPlugin extends SpringBootPlugin {

    public static BPlugin INSTANCE;

    public BPlugin(PluginWrapper wrapper) {
        super(wrapper);
        INSTANCE = this;
    }

    @Override
    protected SpringBootstrap createSpringBootstrap() {
        return new SpringBootstrap(this,BPluginStarter.class);
    }
}
