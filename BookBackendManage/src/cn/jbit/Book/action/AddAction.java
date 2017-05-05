package cn.jbit.Book.action;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import cn.jbit.Book.bean.Book;
import cn.jbit.Book.bean.BookType;
import cn.jbit.Book.biz.BookBiz;

public class AddAction extends ActionSupport implements SessionAware {
	private BookBiz bbiz;
	private Book book;
	private Map<String,Object> session;
	//入库时间
	private String creationTime1;
	//文档类型及语言解析
	private String contentType = "text/html;charset=utf-8";
	
	public void setBbiz(BookBiz bbiz) {
		this.bbiz = bbiz;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public String getCreationTime1() {
		return creationTime1;
	}
	public void setCreationTime1(String creationTime1) {
		this.creationTime1 = creationTime1;
	}
	/**
	 * ����鼮
	 * @return
	 * @throws Exception
	 */
	public String book_add() throws Exception{
		//���
		String res = null;
		
		try {
			//��׼
			boolean bl = false;
			//写流
			//指定输出内容类型和编码  
	        ServletActionContext.getResponse().setContentType(contentType);  
	        //输出流的类型(写入流)
			PrintWriter out = ServletActionContext.getResponse().getWriter();
	
			
			//日期格式化
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			book.setCreationTime(sdf.parse(creationTime1));
			bl = bbiz.saveUpdate(book);
			if(bl){
				out.print("新增成功");
				System.out.println("aaa");
				res = "success";
			}
			else{
				out.print("新增失败");
				res = "error";
			}
			
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	public String bookTypeQuery() throws Exception{
			String res = null;
		try {boolean bl = false;
			List<BookType> list=bbiz.bookTypeQuery();
			session.put("bookType",list);
			bl=true;
			if(bl){
				res = "success";
			}
			else{
				res = "error";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
		
	}
	
	public String bookAllQuery() throws Exception{
		String res = null;
		try {boolean bl = false;
		String hql="from Book b";
		int start=1;
		int maxRec=3;
		List<BookType> list=bbiz.queryData(hql, start, maxRec);
		session.put("book",list);
		bl=true;
		if(bl){
			res = "success";
		}
		else{
			res = "error";
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
		
		return res;
		
	}
}
