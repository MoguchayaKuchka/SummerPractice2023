package practice.second_source.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.second_source.DTO.NewsDTO;
import practice.second_source.Repository.NewsRepo;
import practice.second_source.Util.DateUtil;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    NewsRepo newsRepo;
    public List<NewsDTO> findLastWeekNews(){
        List<NewsDTO> allNews = newsRepo.findAll();
        allNews.removeIf(news-> !DateUtil.isLastWeek(news.getDate()));
        return allNews;
    }

    public List<NewsDTO> findOnlyVerifiedSources(){
        return newsRepo.findByVerifiedSource(true);
    }

    public List<NewsDTO> findAll(){
        return newsRepo.findAll();
    }
}
