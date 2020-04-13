package commons;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * ���ִ�ж���Ĺ�����
 * @author Administrator
 *
 */
public class MybatisUtils {
	private static SqlSessionFactory fac;
	//��дһ����̬����飬���������ļ�
	static {
		//��ȡ���������ļ�
		InputStream is;
		try {
			is=Resources.getResourceAsStream("mybatis-config.xml");
			fac=new SqlSessionFactoryBuilder().build(is);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	//����һ�����SqlSession����ķ���
	public static SqlSession createSqlSession() {
		
			// openSession�����еĲ���
			// �������Ĭ����true������ʾ������
			// false ����ʾ����ر�
			SqlSession sqlSession = fac.openSession(false);
			return sqlSession;
		}
		
	
	//����һ���ر�SqlSession����ķ���
	public static void close(SqlSession sqlSession) {
		if(sqlSession!=null) {
			sqlSession.close();
		}
		
	}
}
