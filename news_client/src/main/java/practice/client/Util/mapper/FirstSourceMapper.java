package practice.client.Util.mapper;

import practice.client.DTO.*;
import practice.client.DTO.first_source.*;
import practice.client.Interfaces.*;
import practice.client.Util.*;

import java.util.*;

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
