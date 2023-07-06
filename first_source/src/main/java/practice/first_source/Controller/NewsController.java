package practice.first_source.Controller;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import practice.first_source.DTO.NewsResponse;
import practice.first_source.Service.NewsService;

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
