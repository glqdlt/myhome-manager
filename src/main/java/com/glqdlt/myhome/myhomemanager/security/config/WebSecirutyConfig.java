package com.glqdlt.myhome.myhomemanager.security.config;
//
//import com.glqdlt.myhome.myhomemanager.security.CustomPasswordEncoder;
//import com.glqdlt.myhome.myhomemanager.security.LoginUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
////@Configuration
//public class WebSecirutyConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    LoginUserService loginUserService;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/","/assets/**").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception{
//        authenticationManagerBuilder.userDetailsService(loginUserService).passwordEncoder(new CustomPasswordEncoder());
//    }
//}
