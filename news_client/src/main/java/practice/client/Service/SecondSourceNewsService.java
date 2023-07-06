package practice.client.Service;

import org.springframework.stereotype.Service;
import practice.client.DTO.NewsDTO;
import practice.client.DTO.second_source.SecondSourceNewsResponseDTO;
import practice.client.Interfaces.NewsSource;
import practice.client.Util.RestUtil;
import practice.client.Util.mapper.SecondSourceMapper;

import java.util.*;

@Service
public class SecondSourceNewsService implements NewsSource {
    private static final String ALL_NEWS_URL = "http://localhost:8082/news/all";

    private static final String LAST_WEEK_NEWS_URL = "http://localhost:8082/news/lastWeek";
    @Override
    public List<NewsDTO> getAllNews() {
        SecondSourceNewsResponseDTO resp = RestUtil.getDTO(ALL_NEWS_URL,SecondSourceNewsResponseDTO.class);

        if(Objects.isNull(resp) || Objects.isNull(resp.getNews()))
            return Collections.emptyList();

        return SecondSourceMapper.mapResponse(resp);
    }

    @Override
    public List<NewsDTO> getLastWeekNews() {
        SecondSourceNewsResponseDTO resp = RestUtil.getDTO(LAST_WEEK_NEWS_URL,SecondSourceNewsResponseDTO.class);

        if(Objects.isNull(resp) || Objects.isNull(resp.getNews()))
            return Collections.emptyList();

        return SecondSourceMapper.mapResponse(resp);
    }

    @Override
    public String getMnemonic(){
        return "NEWS_SOURCE_TWO";
    }
}
