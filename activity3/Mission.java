import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Mission {
    // private fields
    private String missionTarget;
    private LocalDate missionDeadline;
    private int difficulty;

    // constructor
    public Mission(){
    Random random = new Random();
    String[] missionTargets = {"Retrieve stolen data", "Infiltrate enemy base", "Rescue hostage"};
    int randomMissionIndex = random.nextInt(missionTargets.length); 
    String randomMission = missionTargets[randomMissionIndex];
    missionTarget = randomMission;
    
    int randomDifficulty = 1 + (int)(Math.random() * (10)); //randomize difficulty number
    difficulty = randomDifficulty;

    int randomNumDays = 7 + (int)(Math.random() * (24)); // choose from 7 to 30
    missionDeadline = LocalDate.now().plusDays(randomNumDays);
    }

    // public methods: getters
    public String getMissionTarget(){
        return this.missionTarget;
    }

    public LocalDate getMissionDeadline(){
        return this.missionDeadline;
    }

    public int getDifficulty(){
        return this.difficulty;
    }

    public void displayMissionBriefing(){
        // Format time
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String formattedDate = missionDeadline.format(dateFormat);
        System.out.println("*** MISSION BRIEFING ***");
        System.out.println("Target: " + missionTarget );
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Deadline: " + formattedDate);
    }
}
