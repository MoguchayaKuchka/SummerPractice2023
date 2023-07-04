package practice.first_source.DTO;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Table(name = "news")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NewsDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @JsonIgnore
    private Long id;

    @Column(name = "heading")
    private String heading;

    @Column(name = "body")
    private String body;

    @Column(name = "url")
    private String url;

    @Column(name = "date")
    private String date;

    /**
     * Добавленное ниже
     */
    @Column(name = "topic")
    private String topic;
    @OneToMany(mappedBy = "newsId")
    private List<CommentDTO> comments;

    @Column(name = "source_url")
    private String sourceUrl;
}
