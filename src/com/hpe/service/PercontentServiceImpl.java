package com.hpe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpe.mapper.AdminsMapper;
import com.hpe.mapper.PercontentMapper;
import com.hpe.pojo.Admins;
import com.hpe.pojo.Percontent;

@Service
public class PercontentServiceImpl implements PercontentService {
	
	@Autowired
	private PercontentMapper percontentMapper;
	@Override
	public List<Percontent> getPercontentList(int pc_perid) {
		return percontentMapper.getPercontentList(pc_perid);
	}
	

}
