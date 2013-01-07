package com.cn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.cn.base.dao.SupportDao;
import com.cn.dao.DemoDao;
import com.cn.model.Demo;

@Repository(value="demoDao")
public class DemoDaoImpl extends SupportDao implements DemoDao{

	public void saveDemo(){
		System.out.println("I am dao");
	}

	@Override
	public void listDemo() {
		Session s = this.getSession();
		Criteria c = s.createCriteria(Demo.class);  
		c.setCacheable(true);//这句必须要有  
		System.out.println("第一次读取");  
		List<Demo> users = c.list();  
		System.out.println(users.size());
	}
}
