import java.time.format.DateTimeFormatter;

public class MissionControl {
    public static void main(String[] args) {
        // Create agent
        SecretAgent secretAgent = new SecretAgent("007", "James Bond", 5);

        // Print initial status
        System.out.println("*** INITIAL STATUS ***");
        System.out.println("Agent ID: " + secretAgent.getAgentId());
        System.out.println("Name: " + secretAgent.getCodename());
        System.out.println("Clearance Level: " + secretAgent.getClearanceLevel());

        // Create new mission
        Mission newMission = new Mission();
        newMission.displayMissionBriefing();

        // Logic for making decision
        if (secretAgent.getClearanceLevel() >= newMission.getDifficulty()) {
            secretAgent.startMission();
            System.out.println("Agent " + secretAgent.getAgentId() + " is cleared for mission.");

            // Pause for 2 seconds before printing final status
            try {
                Thread.sleep(2000); // simulate time passing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            secretAgent.completeMission();

            // Print final status if mission was cleared
            System.out.println("\n*** FINAL STATUS ***");
            System.out.println("Agent ID: " + secretAgent.getAgentId());
            System.out.println("Name: " + secretAgent.getCodename());
            System.out.println("Clearance Level: " + secretAgent.getClearanceLevel());

            if (secretAgent.getLastMissionCompletionTime() != null) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy HH:mm:ss");
                String formattedTime = secretAgent.getLastMissionCompletionTime().format(formatter);
                System.out.println("Last Mission Completion Time: " + formattedTime);
            }
        } else {
            System.out.println("Agent " + secretAgent.getAgentId() + "'s clearance is too low for this mission.");

            // Print final status if no mission is completed
            System.out.println("\n*** FINAL STATUS ***");
            System.out.println("Agent ID: " + secretAgent.getAgentId());
            System.out.println("Name: " + secretAgent.getCodename());
            System.out.println("Clearance Level: " + secretAgent.getClearanceLevel());
            System.out.println("Last Mission Completion Time: No missions completed yet.");
        }
    }
}