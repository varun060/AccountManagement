// package for all test cases
package com.bank.account.accountmanager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Test class to run basic testing features to 
 * ensure that code doesn't break
 * after updates in classes
 * @author varun
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountmanagerApplicationTests {

	// declare Rest service related variables
	TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders headers = new HttpHeaders();


	/**
	 * Test case for checking REST service which provides account
	 * details.
	 * It executes calls REST API and validates results
	 * with expected result
	 * @throws Exception
	 */
	@Test
	public void testMarketAnalysisRESTApi() throws Exception {


		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		// calls get account rest service
		ResponseEntity<String> response = restTemplate.exchange(
				"http://localhost:8102/getAccounts", HttpMethod.GET, entity,
				String.class);
		// compares with expected result
		String expected ="[{\"accName\":\"John\",\"accType\":\"Savings\",\"balancOeDate\":\"2011-01-01T00:00:00.000+0000\",\"currencyType\":\"SGD\",\"balance\":1000},{\"accName\":\"Smith\",\"accType\":\"Savings\",\"balancOeDate\":\"2012-01-01T00:00:00.000+0000\",\"currencyType\":\"SGD\",\"balance\":2000},{\"accName\":\"Max\",\"accType\":\"Savings\",\"balancOeDate\":\"2013-01-01T00:00:00.000+0000\",\"currencyType\":\"SGD\",\"balance\":2000}]";
		// validating expected result and result from REST API
		JSONAssert.assertEquals(expected, response.getBody(), false);


	}




}
