package com.myblog.daoImpl;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myblog.dao.BaseDao;

public class UserDao extends HibernateDaoSupport implements BaseDao{

	@Override  
    public void saveObject(Object obj) throws HibernateException {  
        getHibernateTemplate().save(obj);  
    }  

}
