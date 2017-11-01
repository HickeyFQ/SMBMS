package cn.jbit.smbms.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.jbit.smbms.dao.UserManager;
import cn.jbit.smbms.jopo.User;
import cn.jbit.smbms.util.MyBatisUtil;

public class UserManagerTest {
	public static void main(String[] args) {
		
		Integer count = MyBatisUtil.createSqlSession().getMapper(UserManager.class).selectCountUser();
		List<User> userList = new ArrayList<User>();
		//userList=MyBatisUtil.createSqlSession().getMapper(UserManager.class).selectListUser();
		System.out.println(count);
		int i=1;
		for(User user:userList){
			//System.out.println(i+"---"+user.getUserName());
			i++;
		}
		
	}
	
}
