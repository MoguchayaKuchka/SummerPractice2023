package practice.client.DTO.second_source;

import lombok.*;

import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SecondSourceNewsResponseDTO {

    List<SecondSourceNewsDTO> news;
}
