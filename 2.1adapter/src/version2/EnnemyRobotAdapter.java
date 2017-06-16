package version2;


public class EnnemyRobotAdapter implements EnnemyAttacker {

    EnnemyRobot theRobot;

    public EnnemyRobotAdapter(EnnemyRobot theRobot) {
        this.theRobot = theRobot;
    }

    @Override
    public void fireWeapon() {
        theRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        theRobot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        theRobot.reactToHuman(driverName);
    }
}
