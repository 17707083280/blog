package com.blog.servcer.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.blog.server.model.Article;
import com.lzl.base.mapper.BaseMapper;
/**
 * 文章数据访问mapper
 * @author admin
 *
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article, Integer>
{

}