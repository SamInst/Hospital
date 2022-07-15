package Hospital;

import java.util.Scanner;

public class Payment {
public void EspecialPayment(){
    System.out.println("""
    Selected Especial...
    Select the form of payment...
    (1) Money
    (2) Credit Card""");

    Scanner pay2 = new Scanner(System.in);
    int pay3 = pay2.nextInt();
    switch (pay3) {
        case 1 -> {

            System.out.println("Selected Money... ");}
        case 2 -> {System.out.println(" Selected Credit Card...");
        float creditCardInterest = 0.01F;
        }
    }
}

public void HealthInsurancePayment() throws InterruptedException {
    System.out.println("Waiting the Token...");
    wait(3000);
    System.out.println("Payment done!");
}
}
