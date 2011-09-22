package my.samples.hibernatespring;

import my.samples.hibernatespring.dao.PersonDaoImpl;
import my.samples.hibernatespring.dao.StockDaoImpl;
import my.samples.hibernatespring.data.Person;
import my.samples.hibernatespring.data.Stock;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "META-INF/springsample.xml" });
        PersonDaoImpl personDao = (PersonDaoImpl) context.getBean("personDaoImpl");

        Person person = new Person();
        person.setName("Ahmad Mirzaei");
        person.addStock(new Stock(10));
        person.addStock(new Stock(20));
        personDao.save(person);

        Person newPerson = personDao.findById(Person.class, 1);
        System.out.println(newPerson);
    }
}
