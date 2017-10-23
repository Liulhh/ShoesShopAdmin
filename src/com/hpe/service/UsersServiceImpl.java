package com.hpe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpe.mapper.UsersMapper;
import com.hpe.pojo.Users;
import com.hpe.util.Page;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersMapper usersMapper;

	@Override
	public int updateUsers(Users users) {
		int i = usersMapper.updateUsers(users);
		return i;
	}

	@Override
	public int forbiddenUsers(int udelete,int uid) {
		int i = usersMapper.forbiddenUsers(udelete, uid);
		return i;
	}

	@Override
	public Users getUsersById(int id) {
		Users users = usersMapper.getUsersById(id);
		return users;
	}

	@Override
	public List<Users> getUsersList() {
		List<Users> usersList = usersMapper.getUsersList();
		return usersList;
	}

	@Override
	public Page getUserPageList(int curPage) {
		int count = usersMapper.getUsersCount();
		Page<Users> page = new Page<Users>();
		page.setCurPage(curPage);
		page.setRows(count);
		List<Users> usersList = usersMapper.getUserPageList((curPage-1)*5);
		page.setData(usersList);
		page.setTotalPage((count%5==0)?(count/5):(count/5+1));
		return page;
		
	}

	@Override
	public Page getUserPageListBySearch(int curPage,String search) {
		int count = usersMapper.getUsersCountBySearch(search);
		Page<Users> page = new Page<Users>();
		page.setCurPage(curPage);
		page.setRows(count);
		List<Users> usersList = usersMapper.getUserPageListBySearch((curPage-1)*5, 5, search);
		page.setData(usersList);
		page.setTotalPage((count%5==0)?(count/5):(count/5+1));
		return page;
	}

	

}
