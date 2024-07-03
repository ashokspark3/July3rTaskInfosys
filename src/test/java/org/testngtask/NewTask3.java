package org.testngtask;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTask3 {
	@Parameters({"a","b"})
	@Test	

	private void m1(int a,int b) {
		// TODO Auto-generated method stub
		int c=a+b;	

		System.out.println(c);
	}}

