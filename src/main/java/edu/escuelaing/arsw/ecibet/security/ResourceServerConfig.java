package edu.escuelaing.arsw.ecibet.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers("/js/**").permitAll()
		.antMatchers("/css/**").permitAll()
		.antMatchers("/images/**").permitAll()
		.antMatchers("/fonts/**").permitAll()
		.antMatchers("/webjars/**").permitAll()
		.antMatchers("/stompendpoint/**").permitAll()
		.antMatchers("/").permitAll()
		.antMatchers("/login.html").permitAll()
		.antMatchers("/about.html").permitAll()
		.antMatchers("/inplay.html").permitAll()
		.antMatchers("/winlist.html").permitAll()
		.antMatchers("/contact.html").permitAll()
		.antMatchers("/upcomming.html").permitAll()
		.antMatchers("/404.html").permitAll()
		.antMatchers("/about.html").permitAll()
		.antMatchers("/register.html").permitAll()
		.antMatchers("/index.html").permitAll()
		.antMatchers("/indexLogin.html").permitAll()
		.antMatchers("/tables/bets").permitAll()
		.antMatchers("/tables/**").permitAll()
		.antMatchers("/assets/**").permitAll()
		.antMatchers("/static/**").permitAll()
				.antMatchers("/userBets.html").permitAll()
		.antMatchers(HttpMethod.POST, "/usuarios").permitAll()
		.anyRequest().authenticated();
	}

	
}
