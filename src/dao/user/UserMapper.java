package dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.BookUser;
import pojo.User;

public interface UserMapper {
	//List<User> getuserList();
	
	//����һ���û���¼�ķ���
	int loginValidate(@Param("userid") String userId,@Param("userPsw") String userPsw );
	//����һ���û�ע��ķ���
	int saveUser(BookUser user);
}
