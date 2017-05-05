package cn.jbit.Book.bean;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
	private Integer bookId;
	private String bookCde;
	private String bookName;
	private Integer bookType;
	private String bookAuthor;
	private String publishPress;
	private Integer borrowed;
	private String createdBy;
	private Date creationTime;
	private Date lastUpdatetime;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookCde() {
		return bookCde;
	}
	public void setBookCde(String bookCde) {
		this.bookCde = bookCde;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Integer getBookType() {
		return bookType;
	}
	public void setBookType(Integer bookType) {
		this.bookType = bookType;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getPublishPress() {
		return publishPress;
	}
	public void setPublishPress(String publishPress) {
		this.publishPress = publishPress;
	}

	public Integer getBorrowed() {
		return borrowed;
	}
	public void setBorrowed(Integer borrowed) {
		this.borrowed = borrowed;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	public Date getLastUpdatetime() {
		return lastUpdatetime;
	}
	public void setLastUpdatetime(Date lastUpdatetime) {
		this.lastUpdatetime = lastUpdatetime;
	}
	public Book(Integer bookId, String bookCde, String bookName,
			Integer bookType, String bookAuthor, String publishPress,
			 Integer borrowed, String createdBy,
			Date creationTime, Date lastUpdatetime) {
		super();
		this.bookId = bookId;
		this.bookCde = bookCde;
		this.bookName = bookName;
		this.bookType = bookType;
		this.bookAuthor = bookAuthor;
		this.publishPress = publishPress;
		this.borrowed = borrowed;
		this.createdBy = createdBy;
		this.creationTime = creationTime;
		this.lastUpdatetime = lastUpdatetime;
	}
	public Book() {
		super();
	}
	
}
