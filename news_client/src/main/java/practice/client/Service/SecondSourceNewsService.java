package practice.client.Service;

import practice.client.DTO.*;
import practice.client.DTO.first_source.*;
import practice.client.DTO.second_source.*;
import practice.client.Interfaces.*;
import practice.client.Util.*;
import practice.client.Util.mapper.*;

import java.util.*;

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
}
