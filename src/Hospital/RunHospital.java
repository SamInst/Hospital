package Hospital;

import java.util.ArrayList;
import java.util.List;

public class RunHospital {
    public static void main(String[] args) {
        Patient patient = new Patient();
        Receptionist receptionist = new Receptionist();
//        receptionist.BookRoom(); // Registration of Receptionist
//        patient.RegisterPatient(); // Registration of Patient

        //

        //Registration of Doctors
        Doctors doctor01 = new Doctors(001, "Sam Helson", 123456789, "Pediatrician", "São Luís");
        Doctors doctor03 = new Doctors(003, "Sam Helson 03", 100000000, "Pediatrician", "São Luís");
        Doctors doctor04 = new Doctors(004, "Sam Helson 04", 199999999, "Pediatrician", "São Luís");
        Doctors doctor02 = new Doctors(002, "Sam 2", 123456789, "gynecologist", "São Paulo");

        List<Doctors>doctorsList=new ArrayList<>();
        doctorsList.add(doctor01);
        doctorsList.add(doctor02);
        doctorsList.add(doctor03);
        doctorsList.add(doctor04);
//        doctorsList.forEach(doctor-> System.out.println(doctor) );
        doctorsList.get(1);




//        System.out.println(doctor01);
//        doctor01.PrescribeMeds();
        //Registration of Patients




//        System.out.println(", reports the following problems: ");
//        Receptionist report = new Receptionist("the patient related pain in stomach");
//        System.out.print("# " + report + " #");


    }
}
