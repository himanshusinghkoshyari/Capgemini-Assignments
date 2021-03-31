package io.assignment.question2;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@SuppressWarnings({ "deprecation" })
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("user123")
			.password("user123")
			.roles("USER")
			.and()
			.withUser("admin123")
			.password("admin123")
			.roles("ADMIN");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/admin").hasRole("ADMIN")
			.antMatchers("/user").hasAnyRole("USER","ADMIN")
			.antMatchers("/").permitAll()
			.and()
			.formLogin()
			.loginPage("/login")
			.permitAll()
			.and()
			.logout()  
		    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		    .and()
		    .rememberMe();
			
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
