package com.wzy.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wzy.api.IMessage.IMessage;



@Controller 
public class MessageController {
	@Resource
	private IMessage message;
	
	/*测试请求如下： http://localhost:8080/Dubbo-Web/echo?msg=123 */
	
	@RequestMapping("/echo")
	public ModelAndView echo(String msg) {
		System.out.println("----------------------------------------111111111");
		ModelAndView mav = new ModelAndView("messages/show") ;
		mav.addObject("info", this.message.echo(msg)) ;
		return mav ; 
	}
}
