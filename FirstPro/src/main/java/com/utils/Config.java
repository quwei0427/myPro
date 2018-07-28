package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
	public Properties pro=new Properties();//实例化Properties类
	public Config(String fileName) {
		String path=this.getClass().getClassLoader().getResource(fileName).getPath();//获取properties文件的路径 
		try {
			pro.load(new FileInputStream(path));//加载properties文件 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * 
	 * 通过key获取value
	 */
	public String getConfig(String key) {
		return pro.getProperty(key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Config config=new Config("config.properties");
		String  fireDriverPath=config.getConfig("fireDriver");
		System.out.println(fireDriverPath);

	}

}
