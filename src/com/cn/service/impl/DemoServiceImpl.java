package com.cn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.dao.DemoDao;
import com.cn.service.DemoService;

@Service(value="demoService")
public class DemoServiceImpl implements DemoService {

	@Resource
	private DemoDao demoDao;
	
	@Override
	public void saveDemo() {
		System.out.println("I am service");
//		testDao.saveUser();
		demoDao.listDemo();
	}

}
