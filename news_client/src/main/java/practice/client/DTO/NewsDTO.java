package practice.client.DTO;

import lombok.*;
import org.springframework.cglib.core.*;

import java.time.*;

@Data
@Builder
public class NewsDTO {

    private final String heading;

    private String body;

    private String url;

    private LocalDate date;
}
