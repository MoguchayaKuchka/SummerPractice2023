package practice.client.Props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@ConfigurationProperties("app")
@Validated
@Data
@Component
public class AppProps {
    List<String> newsSources;
}
