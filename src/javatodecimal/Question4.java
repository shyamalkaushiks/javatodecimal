package javatodecimal;
import java.util.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        String url = "http://127.0.0.1:8999/test?value=p";

		      
		        RestTemplate restTemplate = new RestTemplate();

		        
		        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

		    
		        String responseBody = responseEntity.getBody();


		        System.out.println("Response from the URL:");
		        System.out.println(responseBody);
		    }
		

	}


