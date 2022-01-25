package com.studentapp.cucumber;

import com.studentapp.testbase.TestBase;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author Vimal Vithalpura
 * @project StudentApp-Serenity-Cucumber
 * @created 23/01/2022
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/resources/feature/")
public class StudentRunner extends TestBase {
}
