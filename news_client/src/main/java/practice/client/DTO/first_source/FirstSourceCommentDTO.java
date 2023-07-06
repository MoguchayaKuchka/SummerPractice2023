package practice.client.DTO.first_source;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FirstSourceCommentDTO {

    private String author;

    private String body;
}
