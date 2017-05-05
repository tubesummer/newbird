package cn.jbit.Book.dao;

import java.util.List;

import cn.jbit.Book.bean.Book;
import cn.jbit.Book.bean.BookType;



public interface BookDao {
	public void saveOrUpdate(Book book) throws Exception;
	public void remove(Book book) throws Exception;
	public Object getIdQuery(Object obj,Integer bookId) throws Exception;
	public List findAll(String hql) throws Exception;
	public List queryData(final String hql,final int start,final int maxRecord) throws Exception;
	public List<BookType> bookTypeQuery(String sql);
}
