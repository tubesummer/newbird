package cn.jbit.Book.biz.impl;

import java.util.List;

import cn.jbit.Book.bean.Book;
import cn.jbit.Book.bean.BookType;
import cn.jbit.Book.biz.BookBiz;
import cn.jbit.Book.dao.BookDao;

public class BookBizImpl implements BookBiz {
	private BookDao bdao;
	
	
	public void setBdao(BookDao bdao) {
		this.bdao = bdao;
	}
	/**
	 * 添加修改书籍
	 */
	public boolean saveUpdate(Book book) throws Exception {
		boolean bl = false;
		try {
			bdao.saveOrUpdate(book);
			bl=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bl;
	}
	/**
	 * 删除书籍
	 */
	public boolean book_del(Book book) throws Exception {
		boolean bl = false;
		try {
			bdao.remove(book);
			bl=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bl;
	}
	/**
	 * 单个查询数据
	 */
	public Book getObject(Book book, Integer bookId) throws Exception {
		return (Book) bdao.getIdQuery(book, bookId);
	}

	public List getAllData(String hql) throws Exception {
		return bdao.findAll(hql);
	}

	public List queryData(String hql, int start, int maxRec) throws Exception {
		return bdao.queryData(hql, start, maxRec);
	}
	public List<BookType> bookTypeQuery() {
		String sql="from BookType";
		return bdao.bookTypeQuery(sql);
	}

}
