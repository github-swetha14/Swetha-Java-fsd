package restassuredscripts;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Script007HamcrestValidateMethods {

	// Hamcrest dependency has been added to your POM file
		// This dependency provides us many validation methods that help us to validate the response code
		
		// equalTo() Hamcrest method
		
		@Test(priority='1')
		public void ValidateResponseBody() {
			
			String PMapikey="PMAK-65789c60bcf42275469029cb-0de376ac3acb21f15427ae4e51013dcd81";
			
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("x-api-key",PMapikey )
			.when().get()
			.then().statusCode(200)
			//fetch the resonse body and validate if response includes correct values or not
			
			.body("workspaces[0].id", equalTo("84c106e8-ca4f-4842-ae0c-aa1cf8d7b996"),
					"workspaces[0].name", equalTo("Phase3-Postman"),
					"workspaces[0].type", equalTo("personal"));
			
		}
		
		@Test(priority='2')
		public void ValidateResponseBody_equalTo() {
			
			
			given().baseUri("https://petstore.swagger.io")
			.basePath("/v2/user/DemoUser")
			.when().get()
			.then().statusCode(200)
			//fetch the response body and validate if response includes correct values or not
			
			.body("username", equalTo("DemoUser"),
				 ("firstName"),equalTo("Demo"),
				 ("lastName"),equalTo("User"),
				 ("email"),equalTo("demouser2001@gmail.com"),
				 ("userStatus"),equalTo(1));
				 
				 		
		}
		
		@Test(priority='3')
		public void ValidateResponseBody_hasItems() {
			
            String PMapikey="PMAK-65789c60bcf42275469029cb-0de376ac3acb21f15427ae4e51013dcd81";
			
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("x-api-key",PMapikey )
			.when().get()
			.then().statusCode(200)
			
			// fetch the response body and validate if response includes correct values or not
			
			.body("workspaces.name", hasItems("Phase3-Postman", "Workspace-1-New", "Workspace-3"),
				 "workspaces.type", hasItems("personal"));
			
			
		}
			
}
