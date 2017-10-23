package com.hpe.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hpe.pojo.Users;
import com.hpe.util.Page;

public interface UsersMapper {
	
	//修改用户
	public int updateUsers(Users users);
	//(反)禁用用户
	public int forbiddenUsers(@Param("udelete") int udelete,@Param("uid") int uid);
	//根据ID获取用户信息
	public Users getUsersById(int id);
	//获取用户列表
	public List<Users> getUsersList();
	//获取用户分页列表
	public List<Users> getUserPageList(int curPage);
	//获取查询搜索分页列表
	public List<Users> getUserPageListBySearch(@Param("curPage") int curPage,@Param("pageNumber") int pageNumber,@Param("search") String search);
	//获取总数量
	public int getUsersCount();
	//获取查询搜索内容的总数量
	public int getUsersCountBySearch(String search);
}
