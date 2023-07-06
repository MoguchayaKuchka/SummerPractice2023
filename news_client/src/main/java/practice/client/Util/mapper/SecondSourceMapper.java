package practice.client.Util.mapper;

import practice.client.DTO.NewsDTO;
import practice.client.DTO.second_source.SecondSourceNewsDTO;
import practice.client.DTO.second_source.SecondSourceNewsResponseDTO;
import practice.client.Util.DateUtil;

import java.util.ArrayList;
import java.util.List;

public class SecondSourceMapper {
    public static List<NewsDTO> mapResponse(SecondSourceNewsResponseDTO resp){
        List<NewsDTO> result = new ArrayList<>();
        List<SecondSourceNewsDTO> respList = resp.getNews();
        for(SecondSourceNewsDTO respNews: respList){
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
