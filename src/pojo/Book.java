package pojo;

import java.util.Date;

public class Book {
	private int id;
	private String Name;//ͼ����
	private String Author;//����
	private String publish;//������
	private Date publishdate;//��������
	private int Page;//ҳ��
	private int Price;//�۸�
	private String Content;//����ժҪ
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
