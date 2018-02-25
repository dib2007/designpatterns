package adapter;

public class EnemyAttackerRobotAdapter implements EnemyAttacker {

	EnemyAttackerRobot robot = null;

	public EnemyAttackerRobotAdapter(EnemyAttackerRobot robot) {
		this.robot = robot;
	}

	@Override
	public void driveForward() {
		robot.walkForward();
	}

	@Override
	public void fireWeapon() {
		robot.smashWithHands();
	}

}
