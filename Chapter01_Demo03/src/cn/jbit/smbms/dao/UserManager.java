package cn.jbit.smbms.dao;

import java.util.List;

import cn.jbit.smbms.jopo.User;

public interface UserManager {
	int selectCountUser();
	List<User> selectListUser();
}
