package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.Book;
import service.BookService;
import service.Impl.BookServiceImpl;

/**
 * Servlet implementation class AddBook
 */
@WebServlet("/AddBook")
public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private BookService bs=new BookServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//获得页面上的数据
		String Name=request.getParameter("Name");
		String Author=request.getParameter("Author");
		String publish=request.getParameter("publish");
		int Page=Integer.parseInt(request.getParameter("Page"));
		int Price=Integer.parseInt(request.getParameter("Price"));
		String content=request.getParameter("content");
		//创建需要保存到数据库中的实体类对象
		Book b=new Book(Name,Author,publish,new Date(),Page,Price,content);
		//
		boolean isOK=bs.saveBook(b);
		if(isOK) {
			response.sendRedirect("addbook.jsp");
		}else {
			response.sendRedirect("index.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
