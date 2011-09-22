package my.samples.hibernatespring.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class GeneralDao {
    private EntityManager entityManager = null;

    /**
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.entityManager = em;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public <T> T findById(Class<T> clazz, Object id) {
        return getEntityManager().find(clazz, id);
    }

    public Object save(Object obj) {
        return getEntityManager().merge(obj);
    }

}
