package net.javaguides.springannotations.propertysource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;

@Configuration

@PropertySources({
        @PropertySource("classpath:gmail.properties"),
        @PropertySource("classpath:messages.properties")
})
public class SpringConfig {

}
