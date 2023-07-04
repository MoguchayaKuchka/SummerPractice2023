package practice.first_source.Repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;
import practice.first_source.DTO.*;

import java.util.*;

@Repository
public interface NewsRepo extends JpaRepository<NewsDTO,Long> {
    List<NewsDTO> findByTopic (String topic);
}
