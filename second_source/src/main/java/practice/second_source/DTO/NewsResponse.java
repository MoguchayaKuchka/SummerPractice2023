package practice.second_source.DTO;

import lombok.*;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsResponse {
    private List<NewsDTO> news;
}
