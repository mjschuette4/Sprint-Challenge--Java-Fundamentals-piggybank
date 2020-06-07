package piggybank;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("************************Oink************************");
        System.out.println("************************Oink************************");
        System.out.println("************************Oink************************");

        ArrayList<AbstractMoney> pigBank = new ArrayList<AbstractMoney>();

        pigBank.add(new Quarter());
        pigBank.add(new Dime());
        pigBank.add(new Dollar(5));
        pigBank.add(new Nickel(3));
        pigBank.add(new Dime(7));
        pigBank.add(new Dollar());
        pigBank.add(new Penny(10));

        for(int i = 0; i < pigBank.size(); i++) {
            System.out.println(pigBank.get(i).toString());
        }

        double cashTotal = 0.0;

        for (int i = 0; i < pigBank.size(); i++) {
            cashTotal += pigBank.get(i).getCoinBalance();
        }

        System.out.println(" The cash total is $" + cashTotal);

        System.out.println("************************Oink************************");
        System.out.println("************************Oink************************");
        System.out.println("************************Oink************************");
    }
}