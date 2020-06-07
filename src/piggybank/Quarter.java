package piggybank;

public class Quarter extends AbstractMoney {
    private double coinValue = 0.25;
    private String coinName = "Quarter";
    private int coinQuantity;

    public Quarter(int coinQuantity) {
        this.coinQuantity = coinQuantity;
    }

    public Quarter() {
        this.coinQuantity = 1;
    }

    public void setName(String coinName) {
        this.coinName = coinName;
    }

    public void setQuantity(int coinQuantity) {
        this.coinQuantity = coinQuantity;
    }

    public void setBalance( int coinQuantity) {
        this.coinBalance = this.coinQuantity * this.coinValue;
    }

    @Override
    public String getCoinName() {
        return coinName;
    }

    public int getcoinQuantity() {
        return coinQuantity;
    }

    public double getCoinBalance() {
        return coinQuantity * coinValue;
    }

    @Override
    public String toString() {
        return coinQuantity + " " + coinName;
    }
}