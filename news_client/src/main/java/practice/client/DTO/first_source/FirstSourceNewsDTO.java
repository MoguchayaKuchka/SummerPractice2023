package practice.client.DTO.first_source;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FirstSourceNewsDTO {

    private String heading;

    private String body;

    private String url;

    private String date;

    /**
     * Добавленное ниже
     */

    private String topic;

    private List<FirstSourceCommentDTO> comments;

    private String sourceUrl;
}
