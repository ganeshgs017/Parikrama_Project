package com.parikrama.utils;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliUtils {
	
	
	public static void clickImage(){
		
		try
		{
			
		String imagepath = "C:\\Users\\ganes\\OneDrive\\Documents\\Learning workspace\\ParikramaProject\\SikuliIMages\\";
		
		Screen scrn = new Screen();
		
		Pattern p1 = new Pattern(imagepath +"signin-img-1280-600.png");
		scrn.find(p1);
		scrn.click(p1);
	
		Reports.reportStep("PASS","The Given Image was clicked successfully" + imagepath);
		}
		
		catch(FindFailed ex)
		{
		
			ex.printStackTrace();
		}
	
	}

	public static void clickimages1()  {
		try
		   {
		String imagepath = "C:\\Users\\ganes\\OneDrive\\Documents\\Learning workspace\\ParikramaProject\\SikuliIMages\\";
		
		Screen scrn1 = new Screen();
		
		Pattern p2 = new Pattern(imagepath +"report-img-sik-1280-600.png");
		scrn1.find(p2);
		scrn1.click(p2);
		Reports.reportStep("PASS","The Given Image was clicked successfully" + imagepath);
		}
		catch(FindFailed ex )
		{
			ex.printStackTrace();
		}
	}

	public static void clickimage2()  {
		try
		   {
		String imagepath = "C:\\Users\\ganes\\OneDrive\\Documents\\Learning workspace\\ParikramaProject\\SikuliIMages\\";
		
		Screen scrn2 = new Screen();
		
		Pattern p3 = new Pattern(imagepath +"admin-img-sik-1280-600.png");
		scrn2.find(p3);
		scrn2.click(p3);
		Reports.reportStep("PASS","The Given Image was clicked successfully" + imagepath);
		}
		catch(FindFailed ex )
		{
			ex.printStackTrace();
		}
	}

	public  static void clickimage3() {
		
		try {
			
		
        String imagepath = "C:\\Users\\ganes\\OneDrive\\Documents\\Learning workspace\\ParikramaProject\\SikuliIMages\\";
		
		Screen scrn3 = new Screen();
		
		Pattern p4 = new Pattern(imagepath +"update-img-sik-nor-res.png");
		scrn3.find(p4);
		scrn3.click(p4);
		Reports.reportStep("PASS","The Given Image was clicked successfully" + imagepath);
		}
	
		catch(FindFailed ex )
		{
			ex.printStackTrace();
		}
	}		

	public static void clickimage4() {
		
		try
		{

        String imagepath = "C:\\Users\\ganes\\OneDrive\\Documents\\Learning workspace\\ParikramaProject\\SikuliIMages\\";
		
		Screen scrn4= new Screen();
		
		Pattern p5 = new Pattern(imagepath +"category-img-sik-nor-res.png");
		scrn4.find(p5);
		scrn4.click(p5);
		Reports.reportStep("PASS","The Given Image was clicked successfully" + imagepath);
		}
	
		catch(FindFailed ex )
		{
			ex.printStackTrace();
		}
	}


















































































































}
