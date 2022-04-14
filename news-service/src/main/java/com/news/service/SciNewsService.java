package com.news.service;

import com.news.mapper.SciNewsMapper;
import com.news.pojo.SciNews;
import com.news.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class SciNewsService {

    @Autowired
    private SciNewsMapper sciNewsMapper;

    @Autowired
    private RestTemplate restTemplate;

    public SciNews getNewsById(Integer id)
    {
        SciNews news = sciNewsMapper.getNewsById(id);

        //通过eureka服务名称进行查询
        String url = "http://userservice/user/" + news.getUserId();

        User user = restTemplate.getForObject(url, User.class);

        news.setUser(user);

        return news;
    }

    public List<SciNews> getNewsByTitle(String title)
    {
        List<SciNews> news = sciNewsMapper.getNewsByTitle(title);
        for(SciNews n : news)
        {
            //通过eureka服务名称进行查询
            String url = "http://userservice/user/" + n.getUserId();

            User user = restTemplate.getForObject(url, User.class);

            n.setUser(user);
        }

        return news;
    }

    public void insert(SciNews news)
    {
        sciNewsMapper.insert(news);
    }
}
