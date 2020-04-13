package service;

import org.apache.ibatis.annotations.Param;

import pojo.BookUser;

public interface UserService {
	boolean loginValidate(@Param("userid") String userId,@Param("userPsw") String userPsw );
	//定义一个用户注册的方法
	boolean saveUser(BookUser user);
}
