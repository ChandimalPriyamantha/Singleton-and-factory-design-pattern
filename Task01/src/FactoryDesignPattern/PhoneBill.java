package FactoryDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneBill {

    public static void main(String[] args) throws IOException {

        SelectNetworkFactory planFact = new SelectNetworkFactory();

        System.out.println("Enter the name of the network");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String networkName = br.readLine();

        System.out.println("Enter the number of minutes: ");
        int minutes = Integer.parseInt(br.readLine());

        CellularPlan celPlan = planFact.getPlan(networkName);
        System.out.println("Bill amount for: " + networkName + " of " + minutes + " unit ");
        celPlan.getRate();
        celPlan.processBill(minutes);

    }
}
