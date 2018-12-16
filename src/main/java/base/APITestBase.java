package base;

import listener.Listener;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reportFactory.ReportUtility;

import java.lang.reflect.Method;

import static reportFactory.ReportUtility.createReportFile;

@Listeners({Listener.class})
public class APITestBase {

    public String testNameFromXml = null;

    @BeforeSuite
    public void beforeSuite(ITestContext context) {
        createReportFile();
    }

    @BeforeClass
    public void beforeClass() {
        testNameFromXml = this.getClass().getName();
        ReportUtility.createTest(this.getClass().getName());
    }

    @BeforeMethod
    public void beforeMethod(Method method) {
        ReportUtility.createChildTest(testNameFromXml, method.getName());
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {

    }
}
