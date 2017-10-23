package com.hpe.service;

import java.util.List;

import com.hpe.pojo.Admins;
import com.hpe.pojo.Users;
import com.hpe.util.Page;

public interface UsersService {
	//修改用户
		public int updateUsers(Users users);
		//禁用用户
		public int forbiddenUsers(int udelete,int uid);
		//根据ID获取用户信息
		public Users getUsersById(int id);
		//获取用户列表
		public List<Users> getUsersList();
		//获取用户分页列表
		public Page getUserPageList(int curPage);
		//获取查询搜索分页列表
		public Page getUserPageListBySearch(int curPage,String search);
}
