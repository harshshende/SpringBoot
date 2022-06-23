package com.Studentsdata.StudentsDetails.Config;

import com.Studentsdata.StudentsDetails.Security.StudentsDetailServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebMvcConfigurerAdapter {
    private StudentsDetailServices studentsDetailServices;

    protected void configure(HttpSecurity http) throws Exception{
        http.csrf().disable().authorizeHttpRequests().anyRequest().authenticated().and().httpBasic();

    }

    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(this.studentsDetailServices).passwordEncoder(passwordEncoder());
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
