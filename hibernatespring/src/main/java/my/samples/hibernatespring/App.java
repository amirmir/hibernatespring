package my.samples.hibernatespring;

import my.samples.hibernatespring.dao.StockDaoImpl;

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
        stockDao.findStockById(1);
    }
}
