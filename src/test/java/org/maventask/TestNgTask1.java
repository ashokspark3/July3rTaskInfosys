package org.maventask;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgTask1 {
@BeforeSuite	
private void m1() {
System.out.println("1");
	
}
@BeforeTest
private void m2() {
	
	System.out.println("2");
}
@BeforeClass
private void m3() {
	
	System.out.println("3");
}
@BeforeMethod
private void m4() {
	
	System.out.println("4");
}
@Test
private void m5() {
	System.out.println("5");
}
@AfterMethod
private void m6() {
	System.out.println("6");
}
@AfterClass
private void m7() {
	System.out.println("7");
}
@AfterTest
private void m8() {
	System.out.println("8");
}
@AfterSuite
private void m9() {
	System.out.println("9");
}


}


