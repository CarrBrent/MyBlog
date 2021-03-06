package com.myblog.action;
import com.opensymphony.xwork2.ActionSupport;  
import com.myblog.from.UserFrom;
import com.myblog.service.UserManager;  

public class RegisterAction extends ActionSupport{
	private static final long serialVersionUID = 1L;  

	private UserFrom user;  

	private UserManager userManager;  

	public UserFrom getUser() {  
		return user;  
	}  

	public void setUser(UserFrom user) {  
		this.user = user;  
	}  

	public void setUserManager(UserManager userManager) {  
		this.userManager = userManager;  
	}  

	public String execute() {  
		try {  
			userManager.regUser(user);  
			return SUCCESS;  

		} catch (Exception e) {  
			e.printStackTrace();  
			return ERROR;  
		}  
	}   

}
