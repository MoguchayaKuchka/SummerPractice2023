package practice.client.DTO;

import lombok.Builder;
import lombok.Data;;

import java.time.LocalDate;

@Data
@Builder
public class NewsDTO implements Comparable<NewsDTO>{

    private final String heading;

    private String body;

    private String url;

    private LocalDate date;

    @Override
    public int compareTo(NewsDTO o) {
        return o.getDate().compareTo(date);
    }
}
