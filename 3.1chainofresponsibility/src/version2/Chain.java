package version2;


public interface Chain {

    public void setNextChain(Chain nextChain);
    public void calculate(Numbers request);

}
