package service;

import org.apache.ibatis.annotations.Param;

import pojo.BookUser;

public interface UserService {
	boolean loginValidate(@Param("userid") String userId,@Param("userPsw") String userPsw );
	//����һ���û�ע��ķ���
	boolean saveUser(BookUser user);
}
