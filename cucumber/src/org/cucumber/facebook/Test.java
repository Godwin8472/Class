package org.cucumber.facebook;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue="org.cucumber.facebook",monochrome=true)


public class Test {
	

}
