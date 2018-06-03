package net.study.spring.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import net.study.spring.mybatis.bean.Book;
import net.study.spring.mybatis.mapper.BookMapper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class BookTest {

	@Autowired
	private BookMapper bookmapper;
	
	@Test
	public void insetTest(){
		Book book = new Book();
		book.setBookName("张三写的书");
		book.setAuthor("张三");
		book.setPrice(666);
		bookmapper.insert(book);
	}
}
