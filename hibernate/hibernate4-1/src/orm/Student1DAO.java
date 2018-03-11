package orm;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Student1 entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see orm.Student1
 * @author MyEclipse Persistence Tools
 */
public class Student1DAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(Student1DAO.class);
	// property constants
	public static final String STUNAME = "stuname";
	public static final String AGE = "age";

	public void save(Student1 transientInstance) {
		log.debug("saving Student1 instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Student1 persistentInstance) {
		log.debug("deleting Student1 instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Student1 findById(java.lang.Integer id) {
		log.debug("getting Student1 instance with id: " + id);
		try {
			Student1 instance = (Student1) getSession().get("orm.Student1", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Student1 instance) {
		log.debug("finding Student1 instance by example");
		try {
			List results = getSession().createCriteria("orm.Student1")
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
		log.debug("finding Student1 instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Student1 as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByStuname(Object stuname) {
		return findByProperty(STUNAME, stuname);
	}

	public List findByAge(Object age) {
		return findByProperty(AGE, age);
	}

	public List findAll() {
		log.debug("finding all Student1 instances");
		try {
			String queryString = "from Student1";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Student1 merge(Student1 detachedInstance) {
		log.debug("merging Student1 instance");
		try {
			Student1 result = (Student1) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Student1 instance) {
		log.debug("attaching dirty Student1 instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Student1 instance) {
		log.debug("attaching clean Student1 instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}