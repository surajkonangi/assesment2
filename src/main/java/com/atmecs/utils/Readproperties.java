package com.atmecs.utils;

public class Readproperties {

	public static String readPropertiesFile(String elements, String path) throws IOException {

		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(path);
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;

	}

}
