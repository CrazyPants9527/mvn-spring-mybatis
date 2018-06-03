package net.study.spring.mybatis.mapper;

import org.springframework.stereotype.Repository;

import net.study.spring.mybatis.bean.Book;
@Repository
public interface BookMapper {

	public void insert(Book book);
}
