package Hospital;

import java.util.Scanner;

public class Receptionist {
    public int receptionId;
    public String receptionName;

    public String report;

    public void CheckRoomAvailability(){}
    public void BookRoom(){
        System.out.println("# Receptionist Registration #\n Name: " );
        Scanner name = new Scanner(System.in);
        String name1 = name.nextLine();
        int countID = 100;
        countID += 1;
        System.out.println("Receptionist: " + name1 + ", ID: "+countID);
    }
    public void GenerateInvoice(){


    }
    public void MaintainPatientDetails(){
        System.out.println("describe the Patient problems: ");
        Receptionist receptionist = new Receptionist();
        receptionist.getReport();
    }
    public void DrawWage(){

    }

    public Receptionist() {
        this.receptionId = receptionId;
        this.receptionName = receptionName;
    }

    public Receptionist(String report) {
        this.report = report;
    }

    @Override
    public String toString() {
        return report;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public int getReceptionId() {
        return receptionId;
    }

    public void setReceptionId(int receptionId) {
        this.receptionId = receptionId;
    }

    public String getReceptionName() {
        return receptionName;
    }

    public void setReceptionName(String receptionName) {
        this.receptionName = receptionName;
    }
}
