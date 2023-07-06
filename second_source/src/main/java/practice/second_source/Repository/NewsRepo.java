package practice.second_source.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practice.second_source.DTO.NewsDTO;

import java.util.List;

@Repository
public interface NewsRepo extends JpaRepository<NewsDTO,Long> {
    List<NewsDTO> findByInterview(boolean interview);
    List<NewsDTO> findByCountry(String country);

    List<NewsDTO> findByVerifiedSource(boolean verifiedSource);
}
