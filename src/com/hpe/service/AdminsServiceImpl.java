package com.hpe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpe.mapper.AdminsMapper;
import com.hpe.pojo.Admins;

@Service
public class AdminsServiceImpl implements AdminsService {
	@Autowired
	private AdminsMapper adminsMapper;

	
	public AdminsMapper getAdminsMapper() {
		return adminsMapper;
	}

	public void setAdminsMapper(AdminsMapper adminsMapper) {
		this.adminsMapper = adminsMapper;
	}

	@Override
	public Admins login(Admins admins) {
		Admins ad = adminsMapper.login(admins);
		return ad;
	}

	@Override
	public int addAdmins(Admins admins) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateAdmins(Admins admins) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAdmins(Admins admins) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Admins getAdminsById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admins> getAdminsList() {
		// TODO Auto-generated method stub
		return null;
	}

}
