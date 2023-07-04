package practice.second_source.Controller;

import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import practice.second_source.DTO.*;
import practice.second_source.Service.*;

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
