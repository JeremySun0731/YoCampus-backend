package com.yocampus.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YocampusBackendApplication {
    /**
     * Health check controller.
     *
     * Provides a simple endpoint to verify that the backend service
     * is up and running. This endpoint is typically used by:
     */
    public static void main(String[] args) {
        SpringApplication.run(YocampusBackendApplication.class, args);
    }

}
