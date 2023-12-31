package com.amazon.qa.util;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.amazon.qa.base.TestBaseclass;


public class WebListners extends TestBaseclass implements WebDriverEventListener {
	
	@Override	
public void beforeNavigateTo(String url, WebDriver driver) {
	System.out.println("Before navigating to: '" + url + "'");
}
@Override
public void afterNavigateTo(String url, WebDriver driver) {
	System.out.println("Navigated to:'" + url + "'");
}

public void beforeChangeValueOf(WebElement element, WebDriver driver) {
	System.out.println("Value of the:" + element.toString() + " before any changes made");
}

public void afterChangeValueOf(WebElement element, WebDriver driver) {
	System.out.println("Element value changed to: " + element.toString());
}

public void beforeClickOn(WebElement element, WebDriver driver) {
	System.out.println("Trying to click on: " + element.toString());
}
@Override
public void afterClickOn(WebElement element, WebDriver driver) {
	System.out.println("Clicked on: " + element.toString());
}
@Override
public void beforeNavigateBack(WebDriver driver) {
	System.out.println("Navigating back to previous page");
}
@Override
public void afterNavigateBack(WebDriver driver) {
	System.out.println("Navigated back to previous page");
}
@Override
public void beforeNavigateForward(WebDriver driver) {
	System.out.println("Navigating forward to next page");
}
@Override
public void afterNavigateForward(WebDriver driver) {
	System.out.println("Navigated forward to next page");
}
@Override
public void onException(Throwable error, WebDriver driver) {
	System.out.println("Exception occured: " + error);
	try {
		TestUtilitys.takeScreenshotAtEndOfTest();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
@Override
public void beforeFindBy(By by, WebElement element, WebDriver driver) {
	System.out.println("Trying to find Element By : " + by.toString());
}
@Override
public void afterFindBy(By by, WebElement element, WebDriver driver) {
	System.out.println("Found Element By : " + by.toString());

	
}
@Override
public void beforeAlertAccept(WebDriver driver) {
	// TODO Auto-generated method stub
	
}
@Override
public void afterAlertAccept(WebDriver driver) {
	// TODO Auto-generated method stub
	
}
@Override
public void afterAlertDismiss(WebDriver driver) {
	// TODO Auto-generated method stub
	
}
@Override
public void beforeAlertDismiss(WebDriver driver) {
	// TODO Auto-generated method stub
	
}
@Override
public void beforeNavigateRefresh(WebDriver driver) {
	// TODO Auto-generated method stub
	
}
@Override
public void afterNavigateRefresh(WebDriver driver) {
	// TODO Auto-generated method stub
	
}
@Override
public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
	// TODO Auto-generated method stub
	
}
@Override
public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
	// TODO Auto-generated method stub
	
}
@Override
public void beforeScript(String script, WebDriver driver) {
	// TODO Auto-generated method stub
	
}
@Override
public void afterScript(String script, WebDriver driver) {
	// TODO Auto-generated method stub
	
}
@Override
public void beforeSwitchToWindow(String windowName, WebDriver driver) {
	// TODO Auto-generated method stub
	
}
@Override
public void afterSwitchToWindow(String windowName, WebDriver driver) {
	// TODO Auto-generated method stub
	
}
@Override
public <X> void beforeGetScreenshotAs(OutputType<X> target) {
	// TODO Auto-generated method stub
	
}
@Override
public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
	// TODO Auto-generated method stub
	
}
@Override
public void beforeGetText(WebElement element, WebDriver driver) {
	// TODO Auto-generated method stub
	
}
@Override
public void afterGetText(WebElement element, WebDriver driver, String text) {
	// TODO Auto-generated method stub
	
}
}