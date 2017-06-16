package version1;
public class TurnTVOff implements Command {

    ElectronicDevice theDevice;

    public TurnTVOff(ElectronicDevice theDevice) {

        this.theDevice = theDevice;

    }

    @Override
    public void execute() {

        theDevice.off();

    }

    @Override
    public void undo() {
        theDevice.on();
    }
}