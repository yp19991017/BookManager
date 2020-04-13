package service;

import java.util.List;

import pojo.Book;

public interface BookService {

	boolean saveBook(Book b);

	boolean updateBook(Book b);

	boolean deleteBookById(int id);

	List<Book> getbookList();

}
