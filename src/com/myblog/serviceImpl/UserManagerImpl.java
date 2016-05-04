package com.myblog.serviceImpl;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.myblog.bean.User;  
import com.myblog.dao.BaseDao;
import com.myblog.dao.HibernateSessionFactory;
import com.myblog.daoImpl.UserDao;
import com.myblog.from.UserFrom;
import com.myblog.service.UserManager;  

public class UserManagerImpl implements UserManager{
    private BaseDao dao;  
    private Session session;  
    public UserManagerImpl() {  
        dao = new UserDao();  
    }  
  
    @Override  
    public void regUser(UserFrom userForm) throws HibernateException {  
        session = HibernateSessionFactory.currentSession();  
        dao.setSession(session);  
        // ��ȡ����  
        Transaction ts = session.beginTransaction();  
        // ����User����  
        User user = new User();  
        user.setUsername(userForm.getUsername());  
        user.setEmail(userForm.getEmail());  
        user.setPassword(userForm.getPassword());
        user.setGender(userForm.getGender());  
        // ����User����  
        dao.saveObject(user);  
        // �ύ����  
        ts.commit();  
        // �ر�Session  
        HibernateSessionFactory.closeSession();  
    }  
	
}
