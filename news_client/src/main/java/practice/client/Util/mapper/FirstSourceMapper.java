package practice.client.Util.mapper;

import practice.client.DTO.NewsDTO;
import practice.client.DTO.first_source.FirstSourceNewsDTO;
import practice.client.DTO.first_source.FirstSourceNewsResponseDTO;
import practice.client.Util.DateUtil;

import java.util.ArrayList;
import java.util.List;

public class FirstSourceMapper {
    public static List<NewsDTO> mapResponse(FirstSourceNewsResponseDTO resp){
        List<NewsDTO> result = new ArrayList<>();
        List<FirstSourceNewsDTO> respList = resp.getNews();
        for(FirstSourceNewsDTO respNews: respList){
            result.add(NewsDTO.builder()
                    .heading(respNews.getHeading())
                    .body(respNews.getBody())
                    .url(respNews.getUrl())
                    .date(DateUtil.convertToLocalDate(respNews.getDate()))
                    .build());
        }
        return result;
    }
}
