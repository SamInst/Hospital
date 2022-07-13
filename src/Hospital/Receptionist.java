package Hospital;

import java.util.Scanner;

public class Receptionist {
    public int receptionId;
    public String receptionName;

    public void CheckRoomAvailability(){}
    public void BookRoom(){}
    public void GenerateInvoice(){}
    public static void MaintainPatientDetails(){
        System.out.println("describe the Patient problems: ");
        Scanner sc1 = new Scanner(System.in);
        String report = sc1.nextLine();
    }
    public void MaintainPatientDetailsReport(){
        MaintainPatientDetails();
    }
    public void DrawWage(){}

    public Receptionist(int receptionId, String receptionName) {
        this.receptionId = receptionId;
        this.receptionName = receptionName;
    }

    @Override
    public String toString() {
        return "ReceptionId: " + receptionId + "\n"+
               "ReceptionName: " + receptionName ;
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
