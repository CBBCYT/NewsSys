package com.news.controller;


import com.news.pojo.SciNews;
import com.news.mapper.SciNewsMapper;
import com.news.service.SciNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class SciNewsController {

    @Autowired
    private SciNewsService sciNewsService;


    //模糊查询,通过标题查询新闻
    @GetMapping("{title}")
    public List<SciNews> getUserByTitle(@PathVariable String title)
    {
        title = "%"+title+"%";
        return sciNewsService.getNewsByTitle(title);
    }


    //插入
    @PostMapping
    public void insert(@RequestBody SciNews sciNews)
    {

        sciNewsService.insert(sciNews);
    }
}