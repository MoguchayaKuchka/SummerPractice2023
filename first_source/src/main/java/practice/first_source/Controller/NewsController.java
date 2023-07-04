package practice.first_source.Controller;

import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import practice.first_source.DTO.*;
import practice.first_source.Service.*;

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

    @GetMapping("/byTopic")
    public NewsResponse getNewsByTheme(@RequestParam String topic) {
        return new NewsResponse(newsService.findNewsByTopic(topic));
    }

    @GetMapping("/all")
    public NewsResponse getAllNews(){
        return new NewsResponse(newsService.findAll());
    }


}
