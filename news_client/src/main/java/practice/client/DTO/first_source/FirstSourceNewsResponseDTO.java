package practice.client.DTO.first_source;

import lombok.*;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FirstSourceNewsResponseDTO {

    List<FirstSourceNewsDTO> news;
}
