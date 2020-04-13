package pojo;

import java.util.Date;

public class Book {
	private int id;
	private String Name;//图书名
	private String Author;//作者
	private String publish;//出版社
	private Date publishdate;//出版日期
	private int Page;//页数
	private int Price;//价格
	private String Content;//内容摘要
	public int getId() {
		return id;
	}
	public String getName() {
		return Name;
	}
	public String getAuthor() {
		return Author;
	}
	public String getPublish() {
		return publish;
	}
	public Date getPublishdate() {
		return publishdate;
	}
	public int getPage() {
		return Page;
	}
	public int getPrice() {
		return Price;
	}
	public String getContent() {
		return Content;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public void setPublishdate(Date publishdate) {
		this.publishdate = publishdate;
	}
	public void setPage(int page) {
		Page = page;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public void setContent(String content) {
		Content = content;
	}
	public Book(String name, String author, String publish, Date publishdate, int page, int price, String content) {
		super();
		Name = name;
		Author = author;
		this.publish = publish;
		this.publishdate = publishdate;
		Page = page;
		Price = price;
		Content = content;
	}
	public Book() {
		super();
	}
	
}
