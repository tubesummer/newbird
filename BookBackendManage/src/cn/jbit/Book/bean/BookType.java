package cn.jbit.Book.bean;

public class BookType {
	private Integer id;
	private String typeName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public BookType(Integer id, String typeName) {
		super();
		this.id = id;
		this.typeName = typeName;
	}
	public BookType() {
		super();
	}
	
}
