package practice.client.Service;

import org.springframework.stereotype.Service;
import practice.client.DTO.NewsDTO;
import practice.client.DTO.first_source.FirstSourceNewsResponseDTO;
import practice.client.Interfaces.NewsSource;
import practice.client.Util.RestUtil;
import practice.client.Util.mapper.FirstSourceMapper;

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

    @Override
    public String getMnemonic(){
        return "NEWS_SOURCE_ONE";
    }
}
