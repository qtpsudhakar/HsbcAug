package com.cuc.steps;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features/OhrmAddEmployee.feature", 
tags = "@ddt", 
glue = { "com.cuc.steps" })
public class OhrmRunner extends AbstractTestNGCucumberTests {

}
