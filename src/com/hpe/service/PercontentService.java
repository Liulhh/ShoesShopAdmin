package com.hpe.service;

import java.util.List;

import com.hpe.pojo.Admins;
import com.hpe.pojo.Percontent;

public interface PercontentService {
	//获取权限菜单列表
	public List<Percontent> getPercontentList(int pc_perid);
}
