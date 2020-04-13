package service.Impl;

import org.apache.ibatis.session.SqlSession;

import commons.MybatisUtils;
import dao.user.UserMapper;
import pojo.BookUser;
import service.UserService;

public class UserServiceImpl implements UserService {
	private SqlSession sqlSession;
	@Override
	public boolean loginValidate(String userId, String userPsw) {
		sqlSession=MybatisUtils.createSqlSession();
		UserMapper mapper=sqlSession.getMapper(UserMapper.class);
		int result=mapper.loginValidate(userId, userPsw);
		if(result>0) {
			MybatisUtils.close(sqlSession);
			return true;
		}else {
			MybatisUtils.close(sqlSession);
			return false;
		}
	}

	@Override
	public boolean saveUser(BookUser user) {
		sqlSession=MybatisUtils.createSqlSession();
		UserMapper mapper=sqlSession.getMapper(UserMapper.class);
		int result=mapper.saveUser(user);
		if(result>0) {
			//事务的提交
			sqlSession.commit();
			MybatisUtils.close(sqlSession);
			return true;
		}else {
			sqlSession.rollback();
			MybatisUtils.close(sqlSession);
			return false;
		}
		
	}

}
