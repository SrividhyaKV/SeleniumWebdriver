package com.stta.TestSuiteBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.stta.utility.Read_XLS;

public class SuiteBase {	
	public static Read_XLS TestSuiteListExcel=null;
	public static Read_XLS TestCaseListExcelOne=null;
	public static Read_XLS TestCaseListExcelTwo=null;
	
	public WebDriver webDriver;

	final String LoginbuttonElement = "/html/body/app-root/app-home/div/section[1]/header/div/div[2]/ul/li[2]/a";
	final String userName_element = "logonIdentifier", password_element = "password",
			signIn_element = "//*[@id=\"next\"]";
	final String userName_value = "vapdemouser+Srivi@gmail.com", password_value = "Yokogawa1";
	final String baseUrl = "https://staging-partner.amnimo.com/";
	final String LogoutElement = "//*[@id=\"cdk-overlay-0\"]/div/div/div/button[3]";
	final String Profileimage = "//img[contains(@src,'../../assets/icon_member.svg')]";
	
	public void init() throws IOException{
		//Please change file's path strings bellow If you have stored them at location other than bellow.
		//Initializing Test Suite List(TestSuiteList.xls) File Path Using Constructor Of Read_XLS Utility Class.
		TestSuiteListExcel = new Read_XLS(System.getProperty("user.dir")+"\\src\\com\\stta\\ExcelFiles\\TestSuiteList.xls");
		//TestCaseListExcelTwo = new Read_XLS(System.getProperty("user.dir")+"\\src\\com\\stta\\ExcelFiles\\SuiteTwo.xls");
		//Initializing Test Suite One(SuiteOne.xls) File Path Using Constructor Of Read_XLS Utility Class.
		TestCaseListExcelOne = new Read_XLS(System.getProperty("user.dir")+"\\src\\com\\stta\\ExcelFiles\\SuiteOne.xls");
		//TestCaseListExcelTwo = new Read_XLS(System.getProperty("user.dir")+"\\src\\com\\stta\\ExcelFiles\\SuiteTwo.xls");
		//Initializing Test Suite Two(SuiteTwo.xls) File Path Using Constructor Of Read_XLS Utility Class.
		TestCaseListExcelTwo = new Read_XLS(System.getProperty("user.dir")+"\\src\\com\\stta\\ExcelFiles\\SuiteTwo.xls");	
		//  D:\workspace\sttaphase2\src\com\stta\ExcelFiles
		
		
	}	
}
