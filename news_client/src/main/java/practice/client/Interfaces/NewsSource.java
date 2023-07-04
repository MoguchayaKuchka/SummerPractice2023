package practice.client.Interfaces;

import practice.client.DTO.*;

import java.util.*;

public interface NewsSource {
    public List<NewsDTO> getAllNews();


    public List<NewsDTO> getLastWeekNews();
}
