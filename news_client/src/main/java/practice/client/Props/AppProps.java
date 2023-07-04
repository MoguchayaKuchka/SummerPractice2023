package practice.client.Props;

import lombok.*;
import org.springframework.boot.context.properties.*;
import org.springframework.stereotype.*;
import org.springframework.validation.annotation.*;

import java.util.*;

@ConfigurationProperties("app")
@Validated
@Data
@Component
public class AppProps {
    List<String> newsSources;
}
