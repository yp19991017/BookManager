package commons;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 获得执行对象的工具类
 * @author Administrator
 *
 */
public class MybatisUtils {
	private static SqlSessionFactory fac;
	//书写一个静态代码块，加载配置文件
	static {
		//读取核心配置文件
		InputStream is;
		try {
			is=Resources.getResourceAsStream("mybatis-config.xml");
			fac=new SqlSessionFactoryBuilder().build(is);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	//创建一个获得SqlSession对象的方法
	public static SqlSession createSqlSession() {
		
			// openSession方法中的参数
			// 如果不给默认是true，它表示事务开启
			// false 它表示事务关闭
			SqlSession sqlSession = fac.openSession(false);
			return sqlSession;
		}
		
	
	//创建一个关闭SqlSession对象的方法
	public static void close(SqlSession sqlSession) {
		if(sqlSession!=null) {
			sqlSession.close();
		}
		
	}
}
