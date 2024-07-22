package com.mt.webapp.stepdef;

import com.mt.webapp.utility.Common;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks
{	
   @Before
   public void startScenario()
   {
	   Common.log.info("Start-Scenario..!");
   }
   
   @After
   public void finishScenario()
   {
	   Common.log.info("Finish-Scenario..!");
   } 
}
