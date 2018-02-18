package adapter;

public class AdapterTest {
	public static void main(String[] args) {
		EnemyAttackerRobot robot = new EnemyAttackerRobot();
		EnemyAttackerRobotAdapter robotAdapter = new EnemyAttackerRobotAdapter(robot);

		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
	}
}
