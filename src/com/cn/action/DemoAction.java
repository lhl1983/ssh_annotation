package com.cn.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.cn.base.action.BaseAction;
import com.cn.service.DemoService;

public class DemoAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	@Resource
	private DemoService demoService;

	@Action(value = "demo", results = { @Result(name = "success", location = "/index.jsp") })
	public String test() {
		System.out.println("I am action");
		demoService.saveDemo();
		return SUCCESS;
	}

}
