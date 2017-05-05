package cn.jbit.Book.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.jbit.Book.bean.Book;
import cn.jbit.Book.bean.BookType;
import cn.jbit.Book.dao.BookDao;

public class BookDaoImpl extends HibernateDaoSupport implements BookDao {

	public void saveOrUpdate(Book book) throws Exception {
		this.getHibernateTemplate().saveOrUpdate(book);
		
	}

	public void remove(Book book) throws Exception {
		this.getHibernateTemplate().delete(book);
		
	}

	public Object getIdQuery(Object obj, Integer bookId) throws Exception {
		
		return this.getHibernateTemplate().get(obj.getClass(), bookId);
	}

	public List findAll(String hql) throws Exception {
		return this.getHibernateTemplate().find(hql);
	}

	@SuppressWarnings("unchecked")
	public List queryData(final String hql, final int start, final int maxRecord)
			throws Exception {
		return this.getHibernateTemplate().executeWithNativeSession(new HibernateCallback(){
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
			
				Query query = session.createQuery(hql);
				
				query.setFirstResult(start);
				
				query.setMaxResults(maxRecord);
				
				return query.list();
			}
		});
	}

	public List<BookType> bookTypeQuery(String sql) {
		return this.getHibernateTemplate().find(sql);
	}

}
