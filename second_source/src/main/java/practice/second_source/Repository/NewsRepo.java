package practice.second_source.Repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;
import practice.second_source.DTO.*;

import java.util.*;

@Repository
public interface NewsRepo extends JpaRepository<NewsDTO,Long> {
    List<NewsDTO> findByInterview(boolean interview);
    List<NewsDTO> findByCountry(String country);

    List<NewsDTO> findByVerifiedSource(boolean verifiedSource);
}
