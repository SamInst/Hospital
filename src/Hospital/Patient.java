package Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Patient {
    public String patientName;
    public String patientAddress;
    public String patientSex;
    public  int patientNumber;
    public  int patientAge;
    public  int patientRoom;
    public void RegisterPatient(){
        int countID = 0;
        countID += 1;
        System.out.println("Patient name: ");
        Scanner sc = new Scanner(System.in);
        patientName = sc.nextLine();

        System.out.println("Phone Number: ");
        Scanner sc1 = new Scanner(System.in);
        patientNumber = sc1.nextInt();

        System.out.println("Address: ");
        Scanner sc2 = new Scanner(System.in);
        patientAddress = sc2.nextLine();

        System.out.println("Age: ");
        Scanner sc3 = new Scanner(System.in);
        patientAge = sc3.nextInt();

        System.out.println("Sex: ");
        Scanner sc4 = new Scanner(System.in);
        patientSex = sc4.nextLine();

        System.out.println("Room No: ");
        Scanner sc5 = new Scanner(System.in);
        patientRoom = sc.nextInt();


        System.out.println("Health insurances: ");
        HealthInsurances hi = new HealthInsurances("(1) PhillCare");
        HealthInsurances hi2 = new HealthInsurances("(2) Manulife");
        HealthInsurances hi3 = new HealthInsurances("(3) Medicash");
        HealthInsurances hi4 = new HealthInsurances("(4) PhilHealth");
        List<HealthInsurances> healthInsurances = new ArrayList<>();
        healthInsurances.add(hi);
        healthInsurances.add(hi2);
        healthInsurances.add(hi3);
        healthInsurances.add(hi4);
        System.out.println(healthInsurances);
        System.out.println("----------------");

        Scanner Hi = new Scanner(System.in);
        int aaa = Hi.nextInt();

        switch (aaa){
            case 1 ->{System.out.println("PhillCare HealthInsurance");}
            case 2 ->{System.out.println("ManuLife HealthInsurance");}
            case 3 ->{System.out.println("Medicash HealthInsurance");}
            case 4 ->{System.out.println(" PhilHealth HealthInsurance");}
        }
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
    public String getPatientName() {return patientName;}
    public void setPatientName(String patientName) {this.patientName = patientName;}
    public String getPatientAddress() {return patientAddress;}
    public void setPatientAddress(String patientAddress) {this.patientAddress = patientAddress;}
    public String getPatientSex() {return patientSex;}
    public void setPatientSex(String patientSex) {this.patientSex = patientSex;}
    public int getPatientNumber() {return patientNumber;}
    public void setPatientNumber(int patientNumber) {this.patientNumber = patientNumber;}
    public int getPatientAge() {return patientAge;}
    public void setPatientAge(int patientAge) {this.patientAge = patientAge;}
    public int getPatientRoom() {return patientRoom;}
    public void setPatientRoom(int patientRoom) {this.patientRoom = patientRoom;}
}
