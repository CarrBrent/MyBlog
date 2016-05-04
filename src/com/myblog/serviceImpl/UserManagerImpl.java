package com.myblog.serviceImpl;
import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import com.myblog.bean.User;  
import com.myblog.dao.BaseDao;
import com.myblog.from.UserFrom;
import com.myblog.service.UserManager;  

public class UserManagerImpl implements UserManager{
	private BaseDao dao;  

	public void setDao(BaseDao dao) {  
		this.dao = dao;  
	}  

	@Override  
	public void regUser(UserFrom userForm) throws HibernateException {  
		User user = new User();  
		BeanUtils.copyProperties(userForm, user);  
		dao.saveObject(user);  
	}  

}
