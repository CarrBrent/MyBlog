package com.myblog.action;
import com.opensymphony.xwork2.ActionSupport;  
import com.myblog.bean.User;  
import com.myblog.service.UserManager;  
import com.myblog.serviceImpl.UserManagerImpl;  

public class RegisterAction extends ActionSupport{
	private static final long serialVersionUID = 1L;  

	private User user;  

	private UserManager userManager;  
	public User getUser() {  
		return user;  
	}  

	public void setUser(User user) {  
		this.user = user;  
	}  

	public UserManager getUserManager() {  
		return userManager;  
	}  

	public void setUserManager(UserManager userManager) {  
		this.userManager = userManager;  
	}
	
	public String execute() {  
        try {  
            this.setUserManager(new UserManagerImpl());  
            userManager.regUser(user);  
            return SUCCESS;  
  
        } catch (Exception e) {  
            e.printStackTrace();  
            return ERROR;  
        }  
    }  

}
