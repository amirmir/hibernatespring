package my.samples.hibernatespring.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import my.samples.hibernatespring.data.Stock;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class StockDaoImpl {
	private EntityManager em = null;

	/**
	 * Sets the entity manager.
	 */
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	/**
     * Find Stock.
     */
    public Stock findStockById(Integer id) {
        return em.find(Stock.class, id);
    }
}
