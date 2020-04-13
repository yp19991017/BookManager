package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.book.pojo.BookInfo;

import pojo.Book;

public interface BookMapper {
	// 获得图书信息的方法
	int getcount(@Param("bookName") String bookName);
	
	List<BookInfo> getBookList(@Param("bookName") String bookName,@Param("from") int from,@Param("pageSize") int pageSize);
	
	int deleteBook(@Param("id")int id);

	int saveBook(Book b);

	int updateBook(Book b);

	int deteleBook(int id);

	List<Book> getbookList();
}
