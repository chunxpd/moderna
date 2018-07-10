package com.example.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.common.CommandMap;
import com.example.dto.MemberVO;
import com.example.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private MemberService service;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception{

		logger.info("index");
		
	//	List<MemberVO> memberList = service.selectMember();
		
//		model.addAttribute("memberList", memberList);

		return "/Moderna/index";
		/*return "home";*/
	}
	@RequestMapping(value = "/index.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String moderna(Locale locale, Model model) throws Exception{

		logger.info("home");
		
	//	List<MemberVO> memberList = service.selectMember();
		
//		model.addAttribute("memberList", memberList);

	/*	return "/Moderna/index";*/
		return "/Moderna/index";
	}
	@RequestMapping(value = "/typography.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String typography(Locale locale, Model model) throws Exception{

		logger.info("typography");
 
		return "/Moderna/typography";
	}
	@RequestMapping(value = "/components.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String components(Locale locale, Model model) throws Exception{

		logger.info("components");
 
		return "/Moderna/components";
	}
	@RequestMapping(value = "/pricingbox.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String pricingbox(Locale locale, Model model) throws Exception{

		logger.info("pricingbox");
 
		return "/Moderna/pricingbox";
	}
	@RequestMapping(value = "/portfolio.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String portfolio(Locale locale, Model model) throws Exception{

		logger.info("portfolio");
 
		return "/Moderna/portfolio";
	}
	@RequestMapping(value = "/blog.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String blog(Locale locale, Model model) throws Exception{

		logger.info("blog");
 
		return "/Moderna/blog";
	}
	@RequestMapping(value = "/contact.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String contact(Locale locale, Model model) throws Exception{

		logger.info("contact");
 
		return "/Moderna/contact";
	}
	
	
	@RequestMapping(value = "/btn01.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String btn01(Locale locale, Model model, HttpServletRequest httpServletRequest) throws Exception{

		logger.info("btn01");
		String id = httpServletRequest.getParameter("id");
        System.out.println("id : " + id);

		List<MemberVO> memberList = service.selectMember2();
		
		model.addAttribute("memberList", memberList);

		return "btn01";
	}
 
}
