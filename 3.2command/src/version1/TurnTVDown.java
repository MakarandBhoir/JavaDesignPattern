package version1;

public class TurnTVDown implements Command {

    ElectronicDevice theDevice;

    public TurnTVDown(ElectronicDevice theDevice) {

        this.theDevice = theDevice;

    }

    @Override
    public void execute() {

        theDevice.volumeDown();

    }

    @Override
    public void undo() {
        theDevice.volumeUp();
    }
}
