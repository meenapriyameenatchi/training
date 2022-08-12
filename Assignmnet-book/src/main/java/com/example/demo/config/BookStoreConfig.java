//package com.example.demo.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@Configuration
//public class BookStoreConfig extends WebSecurityConfigurerAdapter {
//
//@Autowired
//private BCryptPasswordEncoder encoder;
//
//@Autowired
//DataSource dataSource;
//
//
//@Override
//protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
////auth.inMemoryAuthentication().withUser("meenu").password(encoder.encode("123")).roles("ADMIN");
//	
//	auth.jdbcAuthentication().dataSource(dataSource)
//	.usersByUsernameQuery(
//			"select username,password,enabled from meena_users22 where  username=?")
//	.passwordEncoder(encoder);
//	
//
//}
//
//@Override
//protected void configure(HttpSecurity http) throws Exception {
//
//http.authorizeRequests().antMatchers("/api/v1/**").authenticated().and().httpBasic();
//}
//
//
//
//
//
//
//
//}
//
//
