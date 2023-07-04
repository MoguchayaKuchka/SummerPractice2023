package practice.client.DTO.second_source;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SecondSourceNewsDTO {

    private String heading;

    private String body;

    private String url;

    private String date;

    /**
     * Добавленное ниже
     */
    private String country;

    private boolean interview;

    private boolean verifiedSource;
}
