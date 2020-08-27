//package com.jayanti.demo.configs;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//public class AuthConfig extends WebSecurityConfigurerAdapter {
//
//  /*  @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.authorizeRequests()
//                .antMatchers("/v3/api-docs/**", "/swagger-ui.html", "/swagger-ui/**","/item/**","/items/**","*.css").permitAll()
//                .antMatchers("/admin/**").authenticated();
//
//    }*/
//
// /*   @Bean
//    @Override
//    public UserDetailsService userDetailsServiceBean() throws Exception {
//
//        // add users in List
//        List<UserDetails> users = new ArrayList<UserDetails>();
//
//        users.add(User.withDefaultPasswordEncoder()
//                .username("admin")
//                .password("admin").roles("ADMIN").build());
//
//        return new InMemoryUserDetailsManager(users);
//    }
//
//*/
//}
