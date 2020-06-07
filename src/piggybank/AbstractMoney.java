package piggybank;

public abstract class AbstractMoney {
    
    int coinQuantity;
    double coinValue;
    String coinName;
    double coinBalance;

    public AbstractMoney(int coinQuantity) {
        this.coinQuantity = coinQuantity;
    }

    public AbstractMoney() {
        coinQuantity = 1;
    }

    public int getCoinQuantity() {
        return coinQuantity;
    }

    public double getCoinValue() {
        return coinValue;
    }

    public String getCoinName() {
        return coinName;
    }

    public double getCoinBalance() {
        return coinValue * coinQuantity;
    }
}