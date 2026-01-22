package com.yocampus.backend.domain.input;

public class UserInput {
    /**
     * Input the origin test
     * For example: email, announcement and description of assignment
     */
    private String rawText;
    /**
     * the user's feeling of these days right now
     */
    private String stressLevel;
    public UserInput(){
    }
    public UserInput(String rawText,String stressLevel){
        this.rawText = rawText;
        this.stressLevel = stressLevel;
    }

    public String getRawText() {
        return rawText;
    }

    public void setRawText(String rawText) {
        this.rawText = rawText;
    }

    public String getStressLevel() {
        return stressLevel;
    }

    public void setStressLevel(String stressLevel) {
        this.stressLevel = stressLevel;
    }
}
