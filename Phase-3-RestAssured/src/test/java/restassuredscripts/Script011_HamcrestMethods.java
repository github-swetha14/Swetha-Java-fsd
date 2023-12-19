package restassuredscripts;

	import static io.restassured.RestAssured.given;
	import static org.hamcrest.Matchers.contains;
	import static org.hamcrest.CoreMatchers.containsString;
	import static org.hamcrest.CoreMatchers.startsWith;
	import static org.hamcrest.Matchers.empty;
	import static org.hamcrest.Matchers.*;


	import org.testng.annotations.Test;


	public class Script011_HamcrestMethods {
		
		@Test(priority='1')
		public void containMethod() {
			
			
			String PMapikey = "PMAK-65789c60bcf42275469029cb-0de376ac3acb21f15427ae4e51013dcd81";
			
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("x-api-key", PMapikey)
			.when().get()
			.then().statusCode(200)
			.body("workspaces.name", contains("Phase-3-Postman", "Workspace-1", "Workspace-1-New","Workspace-y"));
		}
		
		@Test(priority='2')
		public void emptyMethod() {
			
            String PMapikey = "PMAK-65789c60bcf42275469029cb-0de376ac3acb21f15427ae4e51013dcd81";
			
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("x-api-key", PMapikey)
			.when().get()
			.then().statusCode(200)
			.body("workspaces.name", empty());
			
		}

		@Test(priority='3')
        public void isNotemptyMethod() {
			
            String PMapikey = "PMAK-65789c60bcf42275469029cb-0de376ac3acb21f15427ae4e51013dcd81";
			
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("x-api-key", PMapikey)
			.when().get()
			.then().statusCode(200)
			.body("workspaces.name", is(not(empty())));		
		
         }
		
		@Test(priority='4')
		public void hasSizeMethod() {
			
			String PMapikey = "PMAK-65789c60bcf42275469029cb-0de376ac3acb21f15427ae4e51013dcd81";
			
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("x-api-key", PMapikey)
			.when().get()
			.then().statusCode(200)
			.body("workspaces.name", hasSize(11));
			
			
		}
		
		@Test(priority='5')
		public void everyItemStartsWithMethod() {
			
			String PMapikey = "PMAK-65789c60bcf42275469029cb-0de376ac3acb21f15427ae4e51013dcd81";
			
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("x-api-key", PMapikey)
			.when().get()
			.then().statusCode(200)
			.body("workspaces.name", everyItem(startsWith("Workspaces")) );
			
			
		}
		
		@Test(priority='6')
		public void hasKeyMethod() {
			
			String PMapikey = "PMAK-65789c60bcf42275469029cb-0de376ac3acb21f15427ae4e51013dcd81";
			
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("x-api-key", PMapikey)
			.when().get()
			.then().statusCode(200)
			.body("workspaces[0]", hasKey("visibility"));
			
			
		}
		
		@Test(priority='7')
		public void hasValueMethod() {
			
			String PMapikey = "PMAK-65789c60bcf42275469029cb-0de376ac3acb21f15427ae4e51013dcd81";
			
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("x-api-key", PMapikey)
			.when().get()
			.then().statusCode(200)
			.body("workspaces[0]", hasValue("Phase3-Postman"));
			
			
		}
		
		@Test(priority='8')
		public void hasKeyValueMethod() {
			
			String PMapikey = "PMAK-65789c60bcf42275469029cb-0de376ac3acb21f15427ae4e51013dcd81";
			
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("x-api-key", PMapikey)
			.when().get()
			.then().statusCode(200)
			.body("workspaces[0]", hasEntry("name", "Phase3-Postman"));
			
			
		}
		
		@Test(priority='9')
		public void AnyOfMethod() {
			
			String PMapikey = "PMAK-65789c60bcf42275469029cb-0de376ac3acb21f15427ae4e51013dcd81";
			
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("x-api-key", PMapikey)
			.when().get()
			.then().statusCode(200)
			.body("workspaces.name", anyOf(startsWith("Workspace"), containsString("Workspace")));
			
			
		}

	}
		
	

