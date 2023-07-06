package practice.client.Interfaces;

import practice.client.DTO.NewsDTO;

import java.util.List;

public interface NewsSource {
    public List<NewsDTO> getAllNews();

    public List<NewsDTO> getLastWeekNews();

    public String getMnemonic();
}
