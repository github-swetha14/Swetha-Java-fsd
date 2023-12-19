package restassuredscripts;

	import static io.restassured.RestAssured.*;

	import org.testng.annotations.Test;

	public class Script010_LoggingMethods {
		
		
		@Test
		public void LoggingRestAssured() {
			
			String PMapikey = "PMAK-65789c60bcf42275469029cb-0de376ac3acb21f15427ae4e51013dcd81";
			
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("x-api-key", PMapikey)
			.when().get()
			.then().log().all();
			//.then().log().headers();
			//.then().log().ifError();
			//.then().statusCode(200).log().cookies();
			
			
		}

	}

