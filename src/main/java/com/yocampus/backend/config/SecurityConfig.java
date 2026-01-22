package com.yocampus.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
/**
 * Security configuration for MVP / hackathon phase.
 *
 * Purpose:
 * - Disable Spring Security default login page
 * - Allow all HTTP requests without authentication
 * - Simplify local development and API testing
 *
 * Note:
 * - This configuration is TEMPORARY
 * - Authentication and authorization will be added in later phases
 */
@Configuration
public class SecurityConfig {
    /**
     * Defines a security filter chain that permits all requests.
     *
     * @param http HttpSecurity configuration
     * @return configured SecurityFilterChain
     * @throws Exception in case of configuration errors
     */
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // Disable CSRF for stateless API usage
                .csrf(csrf -> csrf.disable())
                // Allow all requests without authentication
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll()
                )
                // Disable default Spring Security login page
                .formLogin(form -> form.disable())
                .httpBasic(basic -> basic.disable());

        return http.build();
    }
}
