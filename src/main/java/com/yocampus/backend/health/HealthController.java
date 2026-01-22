package com.yocampus.backend.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Health check controller.
 *
 * Purpose:
 * - Verify application startup
 * - Confirm backend is reachable
 * - Used for local testing, Docker checks, and monitoring
 */
@RestController
public class HealthController {
    /**
     * Health check endpoint.
     *
     * @return simple OK message if service is running
     */
    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
