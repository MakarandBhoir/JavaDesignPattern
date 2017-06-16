package version1;

public interface ATMState {

    void insertCard();
    void ejectCard();
    void insertPin(int pinEnterred);
    void requestCash(int cashtoWithdraw);

}
