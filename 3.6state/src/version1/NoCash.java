package version1;

public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("We Don't Have Money");
    }

    @Override
    public void ejectCard() {
        System.out.println("We Don't Have Money");
    }

    @Override
    public void insertPin(int pinEnterred) {
        System.out.println("We Don't Have Money");
    }

    @Override
    public void requestCash(int cashtoWithdraw) {
        System.out.println("We Don't Have Money");
    }
}
