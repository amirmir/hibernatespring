package my.samples.hibernatespring;

import my.samples.hibernatespring.dao.StockDaoImpl;
import my.samples.hibernatespring.data.Stock;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "META-INF/springsample.xml" });
        StockDaoImpl stockDao = (StockDaoImpl) context.getBean("stockDaoImpl");

        Stock saveStock = new Stock();
        saveStock.setPrice(10);
        stockDao.save(saveStock);

        Stock newStock = stockDao.findById(Stock.class, 1);
        System.out.println(newStock);
    }
}
