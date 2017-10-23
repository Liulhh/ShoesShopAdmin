package com.hpe.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hpe.pojo.Users;
import com.hpe.service.UsersService;
import com.hpe.util.Page;

@Controller
@RequestMapping("/pages/userManagement")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/users")
	public ModelAndView users(String search,Integer curPage){
		int cPage = (curPage!=null)?curPage:1;
		Page<Users> usersPage = new Page<Users>();
		ModelAndView mv = new ModelAndView();
		if(search==null){
			usersPage = usersService.getUserPageList(cPage);
		}else{
			usersPage = usersService.getUserPageListBySearch(cPage, search);
			mv.addObject("search", search);
		}
		mv.addObject("page", usersPage);
		mv.addObject("action", "users.action");
		mv.setViewName("userList.jsp");
		return mv;
	}
	
	@RequestMapping("/editUsers")
	public ModelAndView editUsers(int id){
		Users users = usersService.getUsersById(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("users", users);
		mv.setViewName("userInput.jsp");
		return mv;
	}
	@RequestMapping("/saveUsers")
	public ModelAndView saveUsers(Users users){
		int res = 0;
		if(users!=null&&users.getUid()!=0){
			res = usersService.updateUsers(users);
		}
		int cPage = 1;
		Page<Users> usersPage = usersService.getUserPageList(cPage);
		ModelAndView mv = new ModelAndView();
		mv.addObject("usersPage", usersPage);
		mv.setViewName("redirect:users.action");
		return mv;
	}
	
	@RequestMapping("/delUsers")
	public void delUsers(int delid,int del,HttpServletResponse response) throws IOException{
		int i = usersService.forbiddenUsers(del, delid);
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print("{\"res\":\"" + i + "\"}");
	}
}
