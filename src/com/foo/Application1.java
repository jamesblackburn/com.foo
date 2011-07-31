package com.foo;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class Application1 implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("HelloWorld!");
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
