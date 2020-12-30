package org.selenium.day9;

public class string {

	public static void main(String[] args) {
		String s = "Selenium,is,very,easy";
		String[] split = s.split(",");
		for (String x : split) {
			System.out.println(x);
		}
	}

}
