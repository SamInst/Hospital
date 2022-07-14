package Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient {
    public void RegisterPatient(){
        int countID = 0;
        countID += 1;
        System.out.println("Patient name: ");
        Scanner sc = new Scanner(System.in);
        String patientName = sc.nextLine();
        System.out.println("");

        System.out.println("Phone Number: ");
        Scanner sc1 = new Scanner(System.in);
        String patientNumber = sc1.nextLine();

        System.out.println("Address: ");
        Scanner sc2 = new Scanner(System.in);
        String patientAddress = sc2.nextLine();

        System.out.println("Age: ");
        Scanner sc3 = new Scanner(System.in);
        String patientAge = sc3.nextLine();

        System.out.println("Sex: ");
        Scanner sc4 = new Scanner(System.in);
        String patientSex = sc4.nextLine();

        System.out.println("Room No: ");
        Scanner sc5 = new Scanner(System.in);
        String patientRoom = sc.nextLine();



        System.out.println("Health insurances: ");
        HealthInsurances hi = new HealthInsurances("PhillCare");
        HealthInsurances hi2 = new HealthInsurances("Manulife");
        HealthInsurances hi3 = new HealthInsurances("Medicash");
        HealthInsurances hi4 = new HealthInsurances("PhilHealth");
        List<HealthInsurances> healthInsurances = new ArrayList<>();
        healthInsurances.add(hi);
        healthInsurances.add(hi2);
        healthInsurances.add(hi3);
        healthInsurances.add(hi4);
        System.out.println(healthInsurances);
        System.out.println("----------------");

        

    }

    public void PatientPayment() throws InterruptedException {
        System.out.println(
                "# Payment Type #" +
                "(1)Especial" +
                "(2)Health insurance");
        Scanner pay = new Scanner(System.in);
        int pay1 = pay.nextInt();
        switch (pay1) {
            case 1 -> {
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
            case 2 -> {System.out.println(" Selected Credit Card...");}
        }
    }
        case 2 ->{
            System.out.println("Waiting the Token...");
            wait(3000);
            System.out.println("Payment done!");
            }
        }
    }
}
