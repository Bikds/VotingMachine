
/*
 * Bikrant Das Sharma and Elizabeth Ngyuen
 * This class tests the toString and the threevote methods
 */
public class PollDisplayPanelTest {

	public static void main(String[] args) {
		PollDisplayPanel votingMachine = new PollDisplayPanel("PRob", "BTho", "KMoni");
		votingMachine.vote1();
		votingMachine.vote2();
		votingMachine.vote3();
		votingMachine.vote1();
		votingMachine.vote2();
		votingMachine.vote3();
		votingMachine.vote1();
		votingMachine.vote1();
		votingMachine.vote3();
		//PRob should have 4, BTho should have 2, and KMoni should have 3
		System.out.println(votingMachine);
	}

}
