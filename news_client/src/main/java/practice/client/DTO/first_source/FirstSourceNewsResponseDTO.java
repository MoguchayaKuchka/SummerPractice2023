package practice.client.DTO.first_source;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FirstSourceNewsResponseDTO {

    List<FirstSourceNewsDTO> news;
}
