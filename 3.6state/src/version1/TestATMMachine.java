package version1;

import version3.ATMProxy;
import version3.GetATMData;

public class TestATMMachine {

    public static void main(String[] args) {

        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard();
        atmMachine.ejectCard();

        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(2000);

        atmMachine.insertCard();
        atmMachine.insertPin(2000);

        // pattern.proxy
        GetATMData realATMMachine = new ATMMachine();
        GetATMData atmProxy = new ATMProxy();

        System.out.println("\nCurrent ATM State " + atmProxy.getATMData());
        System.out.println("\nCash in ATM Machine " + atmProxy.getCashInMachine());
        // atmProxy.setCashInMachine -> not available
        // realATMMachine.setCashInMachine -> not available too

    }

}
