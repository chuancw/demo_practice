package dao;
//实际使用时，Object换成对应的实体类。
public class ObjDAOImpl extends BaseHibernateDAO implements ObjDAO{

	@Override
	public Object get(int id) {
		// TODO Auto-generated method stub
		return (Object)super.get(Object.class, id);
	}
	public void add(Object obj){
		super.add(obj);
	}
	public void delete(Object obj){
		super.delete(obj);
	}
	public void update(Object obj){
		 super.update(obj);
	}

}
