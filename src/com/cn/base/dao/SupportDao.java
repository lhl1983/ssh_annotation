package com.cn.base.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class SupportDao extends HibernateDaoSupport {
	
	@Autowired
	@Resource
    public void sessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
    }
	
}
