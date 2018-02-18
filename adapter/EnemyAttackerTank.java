package adapter;

public class EnemyAttackerTank implements EnemyAttacker {

	@Override
	public void driveForward() {
		System.out.println("Driving forward...");
	}

	@Override
	public void fireWeapon() {
		System.out.println("Firing weapon...");
	}

}
