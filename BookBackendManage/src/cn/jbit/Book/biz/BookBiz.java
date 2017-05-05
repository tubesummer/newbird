package cn.jbit.Book.biz;

import java.util.List;

import cn.jbit.Book.bean.Book;
import cn.jbit.Book.bean.BookType;





public interface BookBiz {
	/**
	 * 添加和更新
	 * @param book
	 * @return
	 * @throws Exception
	 */
	public boolean saveUpdate(Book book) throws Exception;
	/**
	 * 删除书
	 * @param book
	 * @return
	 * @throws Exception
	 */
	public boolean book_del(Book book) throws Exception;
	/**
	 * 单个查询
	 * @param book
	 * @param bookId
	 * @return
	 * @throws Exception
	 */
	public Book getObject(Book book,Integer bookId) throws Exception;
	/**
	 * 查询所有书籍
	 * @param hql
	 * @return
	 * @throws Exception
	 */
	public List getAllData(String hql) throws Exception;
	/**
	 * 分页查询书籍
	 * @param hql
	 * @param start
	 * @param maxRec
	 * @return
	 * @throws Exception
	 */
	public List queryData(String hql,int start,int maxRec) throws Exception;
	
	public List<BookType> bookTypeQuery();
}
