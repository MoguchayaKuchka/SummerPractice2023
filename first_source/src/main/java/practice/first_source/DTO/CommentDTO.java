package practice.first_source.DTO;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "comments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @JsonIgnore
    private Long id;

    @Column(name = "author")
    private String author;

    @Column(name = "body")
    private String body;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "news_id",referencedColumnName = "id")
    private NewsDTO newsId;

}
