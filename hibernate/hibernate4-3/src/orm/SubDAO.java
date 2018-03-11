package orm;

import java.util.Date;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Sub
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see orm.Sub
 * @author MyEclipse Persistence Tools
 */
public class SubDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(SubDAO.class);
	// property constants
	public static final String SUB_CONTENT = "subContent";

	public void save(Sub transientInstance) {
		log.debug("saving Sub instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Sub persistentInstance) {
		log.debug("deleting Sub instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Sub findById(java.lang.Long id) {
		log.debug("getting Sub instance with id: " + id);
		try {
			Sub instance = (Sub) getSession().get("orm.Sub", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Sub instance) {
		log.debug("finding Sub instance by example");
		try {
			List results = getSession().createCriteria("orm.Sub")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Sub instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Sub as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySubContent(Object subContent) {
		return findByProperty(SUB_CONTENT, subContent);
	}

	public List findAll() {
		log.debug("finding all Sub instances");
		try {
			String queryString = "from Sub";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Sub merge(Sub detachedInstance) {
		log.debug("merging Sub instance");
		try {
			Sub result = (Sub) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Sub instance) {
		log.debug("attaching dirty Sub instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Sub instance) {
		log.debug("attaching clean Sub instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}