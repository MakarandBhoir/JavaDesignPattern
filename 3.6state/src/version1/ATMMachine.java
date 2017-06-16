package version1;

import version3.GetATMData;

public class ATMMachine implements GetATMData {

    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine() {

        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);

        atmState = noCard;

        if (cashInMachine < 0) {
            atmState = atmOutOfMoney;
        }
    }

    void setAtmState(ATMState newATMState) { atmState = newATMState; }
    public void setCashInMachine(int cashInMachine) { this.cashInMachine = cashInMachine; }

    // Implantation des différentes méthodes ATMState. Le comportement d'ATMMAchine va ainsi uniquement dépendre
    // de l'état atmState courant.
    public void insertCard() {
        atmState.insertCard();
    }
    public void ejectCard() {
        atmState.ejectCard();
    }
    public void requestCash(int cashToWithdraw) {
        atmState.requestCash(cashToWithdraw);
    }
    public void insertPin(int pinEntered) {
        atmState.insertPin(pinEntered);
    }

    public ATMState getYesCardState() { return hasCard; }
    public ATMState getNoCardState() { return noCard; }
    public ATMState getHasPin() { return hasCorrectPin; }
    public ATMState getNoCashState() { return atmOutOfMoney; }

    // Méthodes liées au pattern.proxy.GetATMData
    @Override
    public ATMState getATMData() {
        return atmState;
    }

    @Override
    public int getCashInMachine() {
        return cashInMachine;
    }
}
