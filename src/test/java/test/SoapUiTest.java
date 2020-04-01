package test;

import org.junit.Test;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestCaseRunner;
import com.eviware.soapui.model.testsuite.TestSuite;
import com.eviware.soapui.settings.HttpSettings;

public class SoapUiTest {

	@Test
	public void test1() throws Exception{
		SoapUI.getSettings().setBoolean(HttpSettings.RESPONSE_COMPRESSION, false);
		WsdlProject project = new WsdlProject("GETE2.xml");
		TestSuite testSuite = project.getTestSuiteByName( "TestSuite 1" );
		TestCase testCase = testSuite.getTestCaseByName( "TestCase 1" );
		TestCaseRunner runner = testCase.run(new PropertiesMap(), false);
		System.out.println(runner.getStatus().toString());
		}
}
