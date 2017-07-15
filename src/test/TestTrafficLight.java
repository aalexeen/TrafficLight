/**
 * 
 */
package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import lights.*;
import service.LightTraffic;

/**
 * @author alex_jd
 *
 */
public class TestTrafficLight {
	public static void main(String[] args) throws InterruptedException{
		String duration = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
	    System.out.print("Please enter user the GREEN light duration : ");
	    try {
	    	duration = reader.readLine();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		LightTraffic green = new GreenLight(Integer.valueOf(duration));
		
		System.out.print("Please enter user the YELLOW light duration : ");
	    try {
	    	duration = reader.readLine();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		LightTraffic yellow = new YellowLight(Integer.valueOf(duration));
		
		System.out.print("Please enter user the YELLOW light duration : ");
	    try {
	    	duration = reader.readLine();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		LightTraffic red = new RedLight(Integer.valueOf(duration));
		
		green.myStatus();
		yellow.myStatus();
		red.myStatus();
		
		System.out.println("The test is over");
		
	}

}
