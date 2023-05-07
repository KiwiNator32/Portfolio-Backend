package com.PorfolioWeb.PortfolioBackend.config;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
@Configuration
public class WebSecurityConfig implements WebMvcConfigurer {

    @Autowired
    private UserDetailsService jwtUserDetailsService;

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source =
                new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("http://192.168.0.40:4200");
        config.addAllowedOrigin("http://localhost:4200");
        config.addAllowedHeader("");
        config.addAllowedMethod("");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.cors().disable().csrf().disable().authorizeHttpRequests()
                .requestMatchers("api/personal/get")
                .permitAll()
                .requestMatchers(HttpMethod.GET, "api/personal/get").permitAll()
                .anyRequest().authenticated()
                .and()
                .exceptionHandling().and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        ;

        return http.build();
    }



}
