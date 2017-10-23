package com.hpe.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hpe.pojo.Admins;
import com.hpe.pojo.Percontent;
import com.hpe.service.AdminsService;
import com.hpe.service.PercontentService;

@Controller
public class AdminsController {
	
	@Autowired
	private AdminsService adminsService;
	@Autowired
	private PercontentService percontentService;
	
	@RequestMapping("/login")
	public ModelAndView login(Admins admins,HttpSession session){
		Admins ad = adminsService.login(admins);
		session.setAttribute("admins", ad);
		ModelAndView mv = new ModelAndView();
		if(ad!=null){
			List<Percontent> percontentList = percontentService.getPercontentList(ad.getA_pcid());
			session.setAttribute("percontentList", percontentList);
			mv.setViewName("redirect:pages/admin/index.jsp");
		}else{
			mv.setViewName("redirect:login.jsp");
		}
		return mv;
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session){
		session.removeAttribute("admins");
		session.removeAttribute("percontentList");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:login.jsp");
		return mv;
	}
}
