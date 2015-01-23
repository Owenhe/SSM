package com.dkry.common;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url ="http://v.youku.com/v_show/id_XODc2MzMwNzI0.html";
		System.out.println(url.indexOf("id_"));
		System.out.println(url.indexOf(".html"));
		url=url.substring(url.indexOf("id_")+3,url.indexOf(".html"));
		System.out.println(url);
	}

}
