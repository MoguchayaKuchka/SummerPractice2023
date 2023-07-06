package practice.first_source.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practice.first_source.DTO.NewsDTO;

import java.util.List;

@Repository
public interface NewsRepo extends JpaRepository<NewsDTO,Long> {
    List<NewsDTO> findByTopic (String topic);
}
