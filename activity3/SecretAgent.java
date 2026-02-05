import java.time.LocalDateTime;

public class SecretAgent {
    // private fields
    private String agentId;
    private String codename;
    private int clearanceLevel;
    private boolean onMission;
    private LocalDateTime lastMissionCompletionTime;

    // public constructor
    public SecretAgent (String agentId, String codename, int clearanceLevel){
        this.agentId = agentId;
        this.codename = codename;
        this.clearanceLevel = clearanceLevel;

        onMission = false;
        lastMissionCompletionTime = null;
    }

    // public methods: getters
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
        return this.lastMissionCompletionTime;
    }

    // public methods: setters
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

    // behavioral methods
    public void startMission(){
        this.onMission = true;
    }

    public void completeMission(){
        this.onMission = false;
        this.lastMissionCompletionTime = LocalDateTime.now();
    }
}
