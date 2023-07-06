package practice.first_source.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
