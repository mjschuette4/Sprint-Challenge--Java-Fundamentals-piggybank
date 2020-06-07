package piggybank;

public class Nickel extends AbstractMoney {
    private double coinValue = 0.05;
    private String coinName = "Nickel";
    private int coinQuantity;
    private double coinBalance;

    public Nickel(int coinQuantity) {
        this.coinQuantity = coinQuantity;
    }

    public Nickel() {
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
        return "$" + coinQuantity;
    }
}