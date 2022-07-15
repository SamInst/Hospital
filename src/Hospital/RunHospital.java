package Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RunHospital {
    public static void main(String[] args) throws InterruptedException {
        Payment py = new Payment();
        Receptionist receptionist = new Receptionist();
        Patient patient = new Patient();
        Hospital hp = new Hospital();
        int abc;
        int st1;

//      receptionist.BookRoom(); // Registration of Receptionist (colocar o recepcionista que resgistrou o paciente na "nota fiscal" )

        //Registration of Doctors

//      doctorsList.forEach(doctor-> System.out.println(doctor) );


//      patient.RegisterPatient(); // Registration of Patient

        System.out.println("""
                 # Service Type # 
                 (1) Especial 
                 (2) Health insurance
                 (0) Cancel...
                """);
        Scanner St = new Scanner(System.in);
        st1 = St.nextInt();
        switch (st1) {

            case 1 -> {
                hp.Something();


            }
            case 2 -> {hp.Something();

            }


//        System.out.println(doctor01);
//        doctor01.PrescribeMeds();
                // Registration of Patients


//        System.out.println(", reports the following problems: ");
//        Receptionist report = new Receptionist("the patient related pain in stomach");
//        System.out.print("# " + report + " #");



        }
    }
}

