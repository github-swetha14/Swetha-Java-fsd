package restassuredscripts;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Script006PostmanAPIKey {

	@Test(priority='1')
	public void postmangetReq() {
		
		String PMapikey="PMAK-65789c60bcf42275469029cb-0de376ac3acb21f15427ae4e51013dcd81";
		
		given().baseUri("https://api.postman.com").basePath("/workspaces")
		.header("x-api-key",PMapikey ).when().get()
		.then().statusCode(200).log().all();
			
	}

	@Test(priority='2')
	public void extract_value_response() {
		
		String PMapikey="PMAK-65789c60bcf42275469029cb-0de376ac3acb21f15427ae4e51013dcd81";
		String responseoutput=given().baseUri("https://api.postman.com").basePath("/workspaces")
		.header("x-api-key",PMapikey ).when().get()
		.then()
		.extract().path("workspaces[1].name"); // extracting the name and save it in a string
		
		System.out.println("The name of the workspace extracted is : " + responseoutput );
	
	}
	
	@Test(priority='3')
	public void extract_response_JSONPath() {
		
		String PMapikey="PMAK-65789c60bcf42275469029cb-0de376ac3acb21f15427ae4e51013dcd81";
		
		Response res = given().baseUri("https://api.postman.com").basePath("/workspaces")
				.header("x-api-key",PMapikey ).when().get()
				.then()
				.extract().response(); // extracting the response and save it in a Response object
		
		
			JsonPath json = new JsonPath(res.asString());
			
			System.out.println(json.getString("workspaces[0]"));
	}
	
}
