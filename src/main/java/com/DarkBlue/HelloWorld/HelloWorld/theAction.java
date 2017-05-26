package com.DarkBlue.HelloWorld.HelloWorld;

import hudson.model.*;

public class theAction implements Action
{
	@Override
	public String getIconFileName()
	{
		return "/plugin/HelloWorld/images/zhizunbao.PNG";
	}
	
	@Override
	public String getDisplayName()
	{
		return "zhizunbao";
	}
	
	@Override
	public String getUrlName()
	{
		return "http://10.180.43.250:8080/jenkins";
	}
}
