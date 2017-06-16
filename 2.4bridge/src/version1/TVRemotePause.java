package version1;

import version1.TVRemote;

public class TVRemotePause extends RemoteButton {

    public TVRemotePause(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {

        System.out.println("TV was Paused");

    }
}
