package practice.client.Controller;


import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import practice.client.DTO.NewsDTO;
import practice.client.DTO.NewsResponseDTO;
import practice.client.Interfaces.NewsSource;
import practice.client.Props.AppProps;
import practice.client.Service.FirstSourceNewsService;
import practice.client.Service.SecondSourceNewsService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/news")
@NoArgsConstructor
public class NewsController {

    @Autowired
    List<NewsSource> sources = List.of(new FirstSourceNewsService(),new SecondSourceNewsService());
    @Autowired
    AppProps appProps;

    @GetMapping("/lastWeek")
    public NewsResponseDTO getLastWeekNews(){
        List<NewsDTO> result = new ArrayList<>();
        for (String mnemonic: appProps.getNewsSources()) {
            for (NewsSource source: sources){
                if(source.getMnemonic().equals(mnemonic)){
                    result.addAll(source.getLastWeekNews());
                }
            }
        }
        Collections.sort(result);
        return new NewsResponseDTO(result);
    }

    @GetMapping("/all")
    public NewsResponseDTO getAllNews(){
        List<NewsDTO> result = new ArrayList<>();
        for (String mnemonic: appProps.getNewsSources()) {
            for (NewsSource source: sources){
                if(source.getMnemonic().equals(mnemonic)){
                    result.addAll(source.getAllNews());
                }
            }
        }
        Collections.sort(result);
        return new NewsResponseDTO(result);
    }

}
