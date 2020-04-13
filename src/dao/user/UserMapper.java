package dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.BookUser;
import pojo.User;

public interface UserMapper {
	//List<User> getuserList();
	
	//定义一个用户登录的方法
	int loginValidate(@Param("userid") String userId,@Param("userPsw") String userPsw );
	//定义一个用户注册的方法
	int saveUser(BookUser user);
}
