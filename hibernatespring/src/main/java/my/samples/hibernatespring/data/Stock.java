package my.samples.hibernatespring.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "stock")
public class Stock {
	private Integer stockId;
	
	@SuppressWarnings("unused")
	private void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	private Integer price;
	
	@Column
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Id
	@GeneratedValue
	@Column(name = "STOCK_ID", unique = true, nullable = false)
	public Integer getStockId() {
		return this.stockId;
	}
}
