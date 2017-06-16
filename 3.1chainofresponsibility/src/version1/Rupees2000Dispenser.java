package version1;
 
public class Rupees2000Dispenser implements DispenseChain {
 
    private DispenseChain chain;
     
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }
 
    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 2000){
            int num = cur.getAmount()/2000;
            int remainder = cur.getAmount() % 2000;
            System.out.println("Dispensing "+num+" Rs.2000 note");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }
 
}