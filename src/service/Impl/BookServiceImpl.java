package service.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import commons.MybatisUtils;
import dao.BookMapper;
import pojo.Book;
import service.BookService;

public class BookServiceImpl implements BookService {
	private BookMapper mapper;
	private SqlSession sqlSession;
	@Override
	public boolean saveBook(Book b) {
		sqlSession = MybatisUtils.createSqlSession();
		mapper = sqlSession.getMapper(BookMapper.class);
		int result = mapper.saveBook(b);
		if(result > 0) {
			sqlSession.commit();
			return true;
		}
		MybatisUtils.close(sqlSession);
		return false;
	}
	@Override
	public boolean updateBook(Book b) {
		sqlSession = MybatisUtils.createSqlSession();
		mapper = sqlSession.getMapper(BookMapper.class);
		int result = mapper.updateBook(b);
		if(result > 0) {
			sqlSession.commit();
			return true;
		}
		MybatisUtils.close(sqlSession);
		return false;
	}
	@Override
	public boolean deleteBookById(int id) {
		sqlSession = MybatisUtils.createSqlSession();
		mapper = sqlSession.getMapper(BookMapper.class);
		int result = mapper.deteleBook(id);
		if(result > 0) {
			sqlSession.commit();
			return true;
		}else {
			sqlSession.rollback();
		}
		MybatisUtils.close(sqlSession);
		return false;
	}
	@Override
	public List<Book> getbookList() {
		sqlSession=MybatisUtils.createSqlSession();
		List<Book> list=sqlSession.getMapper(BookMapper.class).getbookList();
		return list;
	}
	
}
