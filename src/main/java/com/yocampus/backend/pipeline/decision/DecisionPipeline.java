package com.yocampus.backend.pipeline.decision;

import com.yocampus.backend.domain.context.Course;
import com.yocampus.backend.domain.context.Deadline;
import com.yocampus.backend.domain.context.ScheduleItem;
import com.yocampus.backend.domain.decision.CampusDecisionResult;
import com.yocampus.backend.domain.decision.DecisionIntent;
import com.yocampus.backend.domain.input.UserInput;
import java.util.List;
public class DecisionPipeline {
    public CampusDecisionResult decide(
            UserInput input,
            List<Deadline> deadlines,
            List<ScheduleItem> scheduleItems,
            List<Course> courses
    ){
        CampusDecisionResult result = new CampusDecisionResult();
        result.setSummary("You have an upcoming academic task.");
        result.setIntent(DecisionIntent.CREATE_TASK);
        result.setConfidence(0.5);
        return result;
    }
}
