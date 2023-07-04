package practice.client.Service;

import org.springframework.stereotype.*;
import practice.client.DTO.*;
import practice.client.DTO.first_source.*;
import practice.client.Interfaces.*;
import practice.client.Util.*;
import practice.client.Util.mapper.*;

import java.util.*;

@Service
public class FirstSourceNewsService implements NewsSource {
    private static final String ALL_NEWS_URL = "http://localhost:8081/news/all";

    private static final String LAST_WEEK_NEWS_URL = "http://localhost:8081/news/lastWeek";
    @Override
    public List<NewsDTO> getAllNews() {
        FirstSourceNewsResponseDTO resp = RestUtil.getDTO(ALL_NEWS_URL,FirstSourceNewsResponseDTO.class);

        if(Objects.isNull(resp) || Objects.isNull(resp.getNews()))
            return Collections.emptyList();

        return FirstSourceMapper.mapResponse(resp);
    }

    @Override
    public List<NewsDTO> getLastWeekNews() {
        FirstSourceNewsResponseDTO resp = RestUtil.getDTO(LAST_WEEK_NEWS_URL,FirstSourceNewsResponseDTO.class);

        if(Objects.isNull(resp) || Objects.isNull(resp.getNews()))
            return Collections.emptyList();

        return FirstSourceMapper.mapResponse(resp);
    }
}
