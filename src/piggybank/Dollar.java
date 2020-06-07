package piggybank;

public class Dollar extends AbstractMoney {
    private double coinValue = 1.00;
    private String coinName = "Dollar";
    private int coinQuantity;
    
    public Dollar(int coinQuantity) {
        this.coinQuantity = coinQuantity;
    }

    public Dollar() {
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