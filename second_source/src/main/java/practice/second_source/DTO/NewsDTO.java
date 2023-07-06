package practice.second_source.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "news")
@Getter
@Setter
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
    @Column(name = "country")
    private String country;

    @Column(name = "interview")
    private boolean interview;

    @Column(name ="verified_source")
    private boolean verifiedSource;
}
