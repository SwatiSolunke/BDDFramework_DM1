package com.mt.webapp.runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Feature//Mt.feature", glue = "com.mt.webapp.stepdef", tags = "@abc1 or @abc2",
plugin = { "pretty","html: target//destination.html" },monochrome = true )

public class Runner
{

}
