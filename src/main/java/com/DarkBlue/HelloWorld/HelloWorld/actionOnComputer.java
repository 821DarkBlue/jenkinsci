package com.DarkBlue.HelloWorld.HelloWorld;

import hudson.Extension;
import hudson.model.TransientComputerActionFactory;
import hudson.model.*;
import java.util.*;

@Extension
public class actionOnComputer extends TransientComputerActionFactory
{
	@Override
	public Collection<? extends Action> createFor(Computer target)
	{
		
	}
}
