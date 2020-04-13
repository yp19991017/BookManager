package pojo;

import java.util.Date;

public class BookOrders {
	private String oid;
	private Integer bid;
	private Double count;
	private Double curPrice;
	private Date date;
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Double getCount() {
		return count;
	}
	public void setCount(Double count) {
		this.count = count;
	}
	public Double getCurPrice() {
		return curPrice;
	}
	public void setCurPrice(Double curPrice) {
		this.curPrice = curPrice;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public BookOrders(String oid, Integer bid, Double count, Double curPrice, Date date) {
		super();
		this.oid = oid;
		this.bid = bid;
		this.count = count;
		this.curPrice = curPrice;
		this.date = date;
	}
	public BookOrders() {
		super();
	}
}
