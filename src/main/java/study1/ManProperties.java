package study1;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("man")
public class ManProperties {

    private String name;
    private int age;
}
