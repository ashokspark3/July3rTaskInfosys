package org.testngtask;

import org.testng.annotations.Test;

public class NewTask4 {
	@Test(groups="red")
	private void a1() {
		// TODO Auto-generated method stub
	System.out.println("ashok1");
	}
	@Test(groups= {"red","blue"})
	private void a2() {
		// TODO Auto-generated method stub
		System.out.println("dhoni2");
	}
	@Test(groups="red")
	private void a3() {
		// TODO Auto-generated method stub
		System.out.println("kavya3");
	}
}
