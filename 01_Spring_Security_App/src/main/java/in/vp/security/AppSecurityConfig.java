package in.vp.security;

import java.beans.Customizer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	
	@Bean
	
	public InMemoryUserDetailsManager inMemoryUsers() {
		UserDetails u1 = User.withDefaultPasswordEncoder()
			.username("veeresh")
			.password("veeresh@123")
			.build();
		
		UserDetails u2 = User.withDefaultPasswordEncoder()
				.username("ramesh")
				.password("ramesh@123")
				.build();
		
		UserDetails u3 = User.withDefaultPasswordEncoder()
				.username("suresh")
				.password("suresh@123")
				.build();
		
		return new InMemoryUserDetailsManager(u1, u2, u3);
	}
	
	@Bean
	public SecurityFilterChain security(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(auth -> auth
				.requestMatchers("/contact").permitAll()
				.anyRequest().authenticated()
		)
		.httpBasic(withDefaults())
		.formLogin(withDefaults());

		return http.build();
	}
}

