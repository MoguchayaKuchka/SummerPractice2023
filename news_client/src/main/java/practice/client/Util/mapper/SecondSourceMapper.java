package practice.client.Util.mapper;

import practice.client.DTO.*;
import practice.client.DTO.second_source.*;
import practice.client.Util.*;

import java.util.*;

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
