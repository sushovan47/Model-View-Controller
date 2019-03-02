package com.MVC;

public class LoginCredential
{
	String uname;
	String upasswd;
	public String getUname() 
	{
		return uname;
	}
	public void setUname(String uname) 
	{
		this.uname = uname;
	}
	public String getUpasswd()
	{
		return upasswd;
	}
	public void setUpasswd(String upasswd)
	{
		this.upasswd = upasswd;
	}
	public boolean checkLogin()    //Business Login.
	{
		if(uname.equals("sushovan47")&&(upasswd.equals("12345")))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
