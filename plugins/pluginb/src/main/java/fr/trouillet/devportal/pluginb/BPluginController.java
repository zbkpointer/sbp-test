package fr.trouillet.devportal.pluginb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 张博康
 * @Description:
 * @Date: 2021/10/20 14:55
 * @Version: 1.0.0
 */
@RestController
@RequestMapping(value = "/bplugin")
public class BPluginController {

    @RequestMapping(value = "/name")
    public String name() {
        return "bplugin";
    }

}
