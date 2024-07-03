package org.maventask;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTask {
@Before	
public void jm1() {
	System.out.println("a");
}
@BeforeClass
public static void jm2() {
	System.out.println("b");
}
@Test
public void jm3() {
	System.out.println("c");
}
@AfterClass
public static void jm5() {
	System.out.println("d");
}
@After
public void jm4() {
	System.out.println("e");
	
}
@Test
public void jm6() {
	System.out.println("5");

}}
