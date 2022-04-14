package com.news.mapper;


import com.news.pojo.SciNews;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SciNewsMapper {

    List<SciNews> getNewsByTitle(String title);

    SciNews getNewsById(Integer id);

    void insert(@Param("sciNews") SciNews sciNews);
}
