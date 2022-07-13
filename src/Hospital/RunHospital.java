package Hospital;

public class RunHospital {
    public static void main(String[] args) {
Receptionist receptionist = new Receptionist(123,"Clores");
receptionist.MaintainPatientDetails();

        Doctors doctor01 = new Doctors(001,"Sam Helson",123456789,"Pediatrician","São Luís");
        Doctors doctor02 = new Doctors(002,"Sam 2",123456789,"gynecologist","São Paulo");
        Patient p1 = new Patient(1000,"SamPatient",20204040,"Street avenue 001",22,"M",01);
        doctor01.PrescribeMeds();
        System.out.println(p1.getPatientName()+", Id: "+ p1.getPatientId()+", reports the following problems: ");
        receptionist.MaintainPatientDetails();


    }
}
