package practice.client.DTO.second_source;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SecondSourceNewsResponseDTO {

    List<SecondSourceNewsDTO> news;
}
