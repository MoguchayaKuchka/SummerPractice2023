package practice.first_source.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.first_source.DTO.NewsDTO;
import practice.first_source.Repository.NewsRepo;
import practice.first_source.Util.DateUtil;

import java.util.*;

@Service
public class NewsService {
    @Autowired
    NewsRepo newsRepo;
    public List<NewsDTO> findLastWeekNews(){
        List<NewsDTO> allNews = newsRepo.findAll();
        allNews.removeIf(news-> !DateUtil.isLastWeek(news.getDate()));
        return allNews;
    }

    public List<NewsDTO> findNewsByTopic(String topic){
        return newsRepo.findByTopic(topic);
    }

    public List<NewsDTO> findAll(){return newsRepo.findAll();}

}
