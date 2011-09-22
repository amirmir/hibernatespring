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
    private Integer price;

    @SuppressWarnings("unused")
    private void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    @Id
    @GeneratedValue
    @Column(name = "STOCK_ID", unique = true, nullable = false)
    public Integer getStockId() {
        return this.stockId;
    }

    @Column
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stock [stockId=" + stockId + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((stockId == null) ? 0 : stockId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Stock other = (Stock) obj;
        if (stockId == null) {
            if (other.stockId != null)
                return false;
        } else if (!stockId.equals(other.stockId))
            return false;
        return true;
    }

}
