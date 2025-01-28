package in.vp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		String apiurl = "http://localhost:8080/msg";
		
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth("veeresh", "veeresh@123");
		HttpEntity<Object> reqEntity = new HttpEntity<>(headers);
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<String> resEntity = rt.exchange(apiurl, HttpMethod.GET, reqEntity, String.class);
		
		System.out.println(resEntity.getBody());
		 
	}

}
	