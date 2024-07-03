package org.testngtask;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TaskParameterOptional {
	@Test
	@Parameters({"a","b"})
private void a(@Optional(" 45") int a,int b)
{
	
int c=a+b;
System.out.println(c);




}

}
