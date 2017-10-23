package com.hpe.mapper;

import java.util.List;

import com.hpe.pojo.Admins;
import com.hpe.pojo.Percontent;

public interface PercontentMapper {
	//获取权限菜单列表
	public List<Percontent> getPercontentList(int pc_perid);
}
