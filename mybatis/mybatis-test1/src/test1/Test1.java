package test1;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test1 {
       public static void main(String[] args) {
		    try{
		    	 String resource="mybatis-config.xml";
		    	 InputStream inputStream=Resources.getResourceAsStream(resource);
		    	 SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		    	 System.out.println(sqlSessionFactory);
		    }
		    catch(Exception e){
		    	 e.printStackTrace();
		    }
	}
}
