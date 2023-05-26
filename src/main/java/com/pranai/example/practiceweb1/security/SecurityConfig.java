package com.pranai.example.practiceweb1.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;
@Configuration
public class SecurityConfig {

	@Bean
	public InMemoryUserDetailsManager manager() {
		
		UserDetails userdetails=User.builder().passwordEncoder(input->password().encode(input)).username("Pranai").password("reddy").build();
				                
		return new InMemoryUserDetailsManager(userdetails);
	}
	
	@Bean
	public PasswordEncoder password() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain security(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(auth->auth.anyRequest().authenticated());
		http.formLogin(withDefaults());
		http.csrf().disable();
		http.headers().frameOptions().disable();
		return http.build();
		
	}
}
