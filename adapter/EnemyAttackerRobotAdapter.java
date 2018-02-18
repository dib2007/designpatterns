package adapter;

public class EnemyAttackerRobotAdapter implements EnemyAttacker {

	EnemyAttackerRobot robot = null;

	public EnemyAttackerRobotAdapter(EnemyAttackerRobot robot) {
		this.robot = robot;
	}

	@Override
	public void driveForward() {
		// TODO Auto-generated method stub
		robot.walkForward();
	}

	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub
		robot.smashWithHands();
	}

}
