package com.wdxxl.common.impl;

import com.wdxxl.common.ICommonService;

public class ILogServiceImpl extends ICommonService implements ILogService{

	@Override
	public void log(String msg, Exception exception) {
	}

	@Override
	public void log(String msg) {
	}

	@Override
	public void log(Exception exception) {
	}

	@Override
	public void error(String msg, Exception t) {
	}

	@Override
	public void error(String msg) {
	}

	@Override
	public void error(Exception t) {
	}

}
