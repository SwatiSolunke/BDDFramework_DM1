package com.dws.webapp.runnerfile;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src//test//resources//Feature//DW.feature"}, glue = {"com.dws.webapp.stepdef"}, 
tags = "@abc1 or @abc2 or @abc3 or @abc4 or @abc5" , plugin = { "pretty","html: target//destination.html" },
monochrome = true)
public class Runner 
{

}
