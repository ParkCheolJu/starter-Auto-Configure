package study1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ManProperties.class)
public class ManConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Man Man(ManProperties properties){
        return Man.builder()
                .name(properties.getName())
                .age(properties.getAge())
                .build();
    }
}
