package practice.second_source.Controller;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import practice.second_source.DTO.NewsResponse;
import practice.second_source.Service.NewsService;

@RestController
@RequestMapping("/news")
@NoArgsConstructor
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping("/lastWeek")
    public NewsResponse getLastWeekNews(){
        return new NewsResponse(newsService.findLastWeekNews());
    }

    @GetMapping("/all")
    public NewsResponse findAllNews(){
        return new NewsResponse(newsService.findAll());
    }

    @GetMapping("/verified")
    public NewsResponse findVerifiedSources(){
        return new NewsResponse(newsService.findOnlyVerifiedSources());
    }



}
