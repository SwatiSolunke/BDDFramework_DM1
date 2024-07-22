package com.mt.loginstefdef;

import org.junit.After;
import org.junit.Before;

public class Hooks
{	
   @Before
   public void start()
   {
	   System.out.println("Start-Scenario");
   }
   
   @After
   public void finish()
   {
	   System.out.println("Finish-Scenario");
   }
   
}
