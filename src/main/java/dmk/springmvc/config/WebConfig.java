package dmk.springmvc.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.AbstractView;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;
 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="dmk.springmvc")
public class WebConfig {
 
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver =
                    new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/view/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
    
    @Bean
    public ContentNegotiatingViewResolver contentViewResolver(){
    	ContentNegotiatingViewResolver vr = new ContentNegotiatingViewResolver();
    	
    	Map<String, String> medias = new HashMap<>();
    	medias.put("htm", "text/html");
    	medias.put("json", "application/json");
    	vr.setMediaTypes(medias);
    	
    	View jview = new MappingJacksonJsonView();
    	List<View> defaultViews = Arrays.asList(jview);
    	vr.setDefaultViews(defaultViews);
    	return vr;
    }
     
}