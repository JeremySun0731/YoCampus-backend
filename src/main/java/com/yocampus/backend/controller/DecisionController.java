package com.yocampus.backend.controller;

import com.yocampus.backend.domain.decision.CampusDecisionResult;
import com.yocampus.backend.domain.input.UserInput;
import com.yocampus.backend.pipeline.decision.DecisionPipeline;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for AI decision endpoint.
 */
@RestController
@RequestMapping("/api")
@CrossOrigin
public class DecisionController {

    private final DecisionPipeline pipeline;

    /**
     * Constructor-based dependency injection.
     */
    public DecisionController(DecisionPipeline pipeline) {
        this.pipeline = pipeline;
    }

    /**
     * Main AI decision endpoint.
     *
     * @param input user input payload
     * @return AI decision result
     */
    @PostMapping("/decide")
    public CampusDecisionResult decide(@RequestBody UserInput input) {
        return pipeline.decide(input, List.of(), List.of(), List.of());
    }
}
