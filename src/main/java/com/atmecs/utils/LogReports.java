package com.atmecs.utils;

public class LogReports {
	Logger logger = null;

	public LogReports() {
		getlogger();
		logger = Logger.getLogger(LogReports.class.getName());
	}

	public void getlogger() {
		PropertyConfigurator.configure(ConstantPaths.LOG4J_FILE);
	}

	public void info(String message) {
		logger.info(message);
	}
}
