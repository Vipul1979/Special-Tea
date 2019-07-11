package com.cucumberdemo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resource",tags = "@regression")//for filter feature file
//@CucumberOptions(features = "src\\test\\resource",tags = "@smoke")//for search feature file
public class RunCukeTest {
}
