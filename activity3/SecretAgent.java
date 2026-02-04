import java.time.LocalDateTime;

public class SecretAgent {
    private String agentId;
    private String codename;
    private int clearanceLevel;
    private boolean onMission;
    private LocalDateTime lastMissionCompletionTime;

    public SecretAgent (String agentId, String codename, int clearanceLevel){
        onMission = false;
        lastMissionCompletionTime = null;
    }

    public String getAgentId(){
        return this.agentId;
    }

    public String getCodename(){
        return this.codename;
    }
    
    public int getClearanceLevel(){
        return this.clearanceLevel;
    }

    public boolean isOnMission(){
        return this.onMission;
    }

    public LocalDateTime getLastMissionCompletionTime(){
        return this.getLastMissionCompletionTime();
    }

    public void setCodename(String newCodename){
        if (newCodename != null)
        this.codename = newCodename;
    }

    public void setClearanceLevel(int level){
        if (level >= 1 && level <= 5)
            this.clearanceLevel = level;
        else
            System.out.println("Invalid clearance level");
    }

    public void startMission(){
        this.onMission = true;
    }

    public void completeMission(){
        this.onMission = false;
        this.lastMissionCompletionTime = LocalDateTime.now();
    }
}
