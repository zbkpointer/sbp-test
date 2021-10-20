package fr.trouillet.devportal.app;

import org.laxture.sbp.SpringBootPluginManager;
import org.laxture.spring.util.ApplicationContextProvider;
import org.pf4j.DefaultPluginManager;
import org.pf4j.JarPluginManager;
import org.pf4j.PluginManager;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DevportalApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder();
		builder.sources(DevportalApplication.class);
		builder.build().run();
	}

	@Bean
	public ApplicationContextAware multiApplicationContextProviderRegister() {
		return ApplicationContextProvider::registerApplicationContext;
	}

	//TODO: 手动安装插件，运行



//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/**").allowedMethods("*").allowedOrigins("http://localhost:3000");
//			}
//		};
//	}

//	@Bean
//	public PluginManager pluginManager(){
//		return new DefaultPluginManager();
//	}



}
